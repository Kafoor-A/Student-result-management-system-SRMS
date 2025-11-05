package com.student.result.service;

import com.student.result.model.Student;
import com.student.result.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setMarks(updatedStudent.getMarks());
                    student.setResult(updatedStudent.getResult());
                    return studentRepository.save(student);
                })
                .orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

