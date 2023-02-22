package org.aikana.college.disciplinary_journal.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.SubjectsEntity;
import org.aikana.college.disciplinary_journal.repository.SubjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/subject")
public class SubjectsController {

    private final SubjectRepository subjectRepository;

    @GetMapping("/getAll")
    public List<SubjectsEntity> findAll (HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return subjectRepository.findAll();
    }
}
