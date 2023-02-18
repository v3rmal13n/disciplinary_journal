package org.aikana.college.disciplinary_journal.controller;

import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.aikana.college.disciplinary_journal.repository.StudentRepository;
import org.aikana.college.disciplinary_journal.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

//    private final StudentService studentService;
private final StudentRepository studentRepository;

    @GetMapping("/getAll")
    public List<StudentsEntity> findAll (HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findAll();
    }

    @GetMapping("/getAllByGroupId/{groupId}")
    public List<StudentsEntity> findAllByGroupId (@PathVariable Integer groupId,
                                                  HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findAllByGroupId(groupId);
    }

}
