package org.aikana.college.disciplinary_journal.repository;

import org.aikana.college.disciplinary_journal.entity.SubjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectsEntity, Integer> {
}
