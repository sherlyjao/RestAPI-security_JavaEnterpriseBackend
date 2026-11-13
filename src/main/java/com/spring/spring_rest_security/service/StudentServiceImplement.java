package com.spring.spring_rest_security.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.spring.spring_rest_security.dto.StudentDto;
import com.spring.spring_rest_security.entity.Student;
import com.spring.spring_rest_security.exception.StudentNotFoundException;
import com.spring.spring_rest_security.mapper.StudentMapper;
import com.spring.spring_rest_security.repository.StudentRepository;

/**
 * Service implementation class for {@link StudentService}.
 * Handles business logic and data mapping.
 */
@Service 
public class StudentServiceImplement implements StudentService {

    //==========
    // Fields
    //==========
    private StudentRepository studentRepo;


    //==========
    // Constructor
    //==========
    public StudentServiceImplement(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    //==========
    // Methods
    //==========
    @Override
    public StudentDto createStudent(StudentDto theStudentDto) {
        Student theStudent = StudentMapper.mapToStudent(theStudentDto);
        Student saved = studentRepo.save(theStudent);

        return StudentMapper.mapToStudentDto(saved);
    }
    
    @Override 
    public StudentDto getStudentById(Long theId) {
        Student student = studentRepo
            .findById(theId)
            .orElseThrow(
                () -> new StudentNotFoundException(
                    "Student id " + theId + " not found!"
                )
            );

        return StudentMapper.mapToStudentDto(student);
    }

    @Override 
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepo.findAll();

        return students
            .stream()
            .map((student)-> StudentMapper.mapToStudentDto(student))
            .collect(Collectors.toList());
    }

    @Override 
    public StudentDto updateStudent(Long theId, StudentDto theStudentDto) {
        Student student = StudentMapper.mapToStudent(getStudentById(theId));

        student.setFirstName(theStudentDto.getFirstName());
        student.setLastName(theStudentDto.getLastName());
        student.setEmail(theStudentDto.getEmail());

        Student saved = studentRepo.save(student);
        return StudentMapper.mapToStudentDto(saved);
    }

    @Override 
    public StudentDto patchStudent(Long theId, StudentDto theStudentDto) {
        Student student = StudentMapper.mapToStudent(getStudentById(theId));

        if (theStudentDto.getFirstName() != null) {
            student.setFirstName(theStudentDto.getFirstName());
        }

        if (theStudentDto.getLastName() != null) {
            student.setLastName(theStudentDto.getLastName());
        }

        if (theStudentDto.getEmail() != null) {
            student.setEmail(theStudentDto.getEmail());
        }

        Student saved = studentRepo.save(student);
        return StudentMapper.mapToStudentDto(saved);
    }

    @Override 
    public void deleteStudentById(Long theId) {
        getStudentById(theId);
        studentRepo.deleteById(theId);
    }
}
