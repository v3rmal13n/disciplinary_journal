package org.aikana.college.disciplinary_journal.service;

import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.aikana.college.disciplinary_journal.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @PersistenceContext
    private EntityManager em;

    public List<StudentsEntity> findAll () {
        return studentRepository.findAll();
    }

//    public List<StudentsEntity> findAllByGroupId (StudentsEntity studentsEntity) {
//        Integer groupId = studentsEntity.getGroupId();
//
//    }
}
