package org.aikana.college.disciplinary_journal.repository;

import org.aikana.college.disciplinary_journal.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentsEntity, Integer> {

    public List<StudentsEntity> findAllByGroupId (Integer groupId);
    public List<StudentsEntity> findAllByName (String name);
    public List<StudentsEntity> findAllBySurname (String surname);
    public List<StudentsEntity> findAllByNameAndSurname (String name, String surname);
    public StudentsEntity deleteAllByGroupId (Integer groupId);
}
