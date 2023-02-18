package org.aikana.college.disciplinary_journal.repository;

import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentsEntity, Integer> {

    public List<StudentsEntity> findAllByGroupId (Integer groupId);
}
