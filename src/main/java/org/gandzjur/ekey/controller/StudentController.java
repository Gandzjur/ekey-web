package org.gandzjur.ekey.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.gandzjur.ekey.domain.Student;
import org.gandzjur.ekey.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
        
    @RequestMapping("/students/auth")
    @ResponseBody
    public Student findStudentByRfid(@RequestParam(value = "rfidTocken") Integer rfidTocken) {
        Student student = studentRepository.findByRfidTocken(rfidTocken);
        Logger.getLogger(StudentController.class.getName()).log(Level.INFO, student.toString());
        return student;
    }
    
    @RequestMapping("students/register")
    @ResponseBody
    public String registerStudent(@RequestParam(value = "studentId") String studentId,
                                  @RequestParam(value = "rfidTocken") Integer rfidTocken,
                                  @RequestParam(value = "firstName") String firstName,
                                  @RequestParam(value = "lastName") String lastName) {
        Student student = new Student();
        student.setStudentID(studentId);
        student.setRfidTocken(rfidTocken);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        try {
            studentRepository.save(student);
        }
        catch (Exception ex) {
            return "Error: user cannot be created";
        }
        return "User succesfully created!";
    }
}
