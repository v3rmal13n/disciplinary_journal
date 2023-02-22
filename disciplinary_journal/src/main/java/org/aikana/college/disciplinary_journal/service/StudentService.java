package org.aikana.college.disciplinary_journal.service;

import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.AttendanceEntity;
import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.aikana.college.disciplinary_journal.repository.StudentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

//    private final StudentRepository studentRepository;
//
//    @PersistenceContext
//    private EntityManager em;
//
//    public List<StudentsEntity> findAll () {
//        return studentRepository.findAll();
//    }
//
//
//
//    public List<AttendanceEntity> test (Integer groupId, Date from, Date to) {
//        Query query = em.createQuery("select * from `attendance` where `groupID` = :groupId and `date` >=:from and `date` <=:to", AttendanceEntity.class);
//        query.setParameter("groupId", groupId);
//        query.setParameter("from", from);
//        query.setParameter("to", to);
//        List<AttendanceEntity> list = query.getResultList();
//        return list;
//    }
//



}

