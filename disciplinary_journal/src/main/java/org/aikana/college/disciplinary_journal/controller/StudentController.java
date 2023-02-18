package org.aikana.college.disciplinary_journal.controller;

import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.aikana.college.disciplinary_journal.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/getAllByName/{name}")
    public List<StudentsEntity> findAllByName (@PathVariable String name,
                                               HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findAllByName(name);
    }

    @GetMapping("/getAllBySurname/{surname}")
    public List<StudentsEntity> findAllBySurname (@PathVariable String surname,
                                                  HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findAllBySurname(surname);
    }

    @GetMapping("/getAllByNameAndSurname/{name}/{surname}")
    public List<StudentsEntity> findAllByNameAndSurname (@PathVariable String name,
                                                         @PathVariable String surname,
                                                         HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findAllByNameAndSurname(name,surname);
    }

    @GetMapping("/getById/{id}")
    public Optional<StudentsEntity> getById (@PathVariable Integer id,
                                             HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return studentRepository.findById(id);
    }

    @PostMapping("/postStudent")
    public StudentsEntity postStudent (@RequestBody StudentsEntity studentsEntity,
                                       HttpServletResponse response) {
        return studentRepository.save(studentsEntity);
    }

    @PutMapping("/updateStudent")
    public StudentsEntity putStudent (@RequestBody StudentsEntity studentsEntity,
                                      HttpServletResponse response) {
        return studentRepository.save(studentsEntity);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public boolean deleteId (@PathVariable Integer id) {

        studentRepository.deleteById(id);
        return true;
    }

    @DeleteMapping("/deleteAllStudentByGroupId/{groupId}")
    public boolean deleteAllByGroupId (@PathVariable Integer groupId) {
        studentRepository.deleteAllByGroupId(groupId);
        return true;
    }
}
