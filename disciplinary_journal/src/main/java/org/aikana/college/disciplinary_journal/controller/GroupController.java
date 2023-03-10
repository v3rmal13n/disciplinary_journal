package org.aikana.college.disciplinary_journal.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.GroupNamesEntity;
import org.aikana.college.disciplinary_journal.repository.GroupRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/group")
public class GroupController {

    private final GroupRepository groupRepository;

    @GetMapping("/getAll")
    public List<GroupNamesEntity> findAll (HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return groupRepository.findAll();
    }

    @DeleteMapping("/deleteGroup/{id}")
    public boolean deleteGroup (Integer id,
                                HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        groupRepository.deleteById(id);
        return true;
    }

}
