package org.aikana.college.disciplinary_journal.repository;

import org.aikana.college.disciplinary_journal.entity.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Integer> {
    public List<AttendanceEntity> findAllByGroupId (Integer groupId);
//    public List<AttendanceEntity> findAllByGroupIdAndDateAfterAndDateBefore (Integer groupId, Date afterDate, Date beforeDate);

    public List<AttendanceEntity> findAllByGroupIdAndDate(Integer groupId, Date date);

    @Query(value = " select * from attendance where groupID = :groupId and date >= :from and date <= :to",
            nativeQuery = true)
    public List<AttendanceEntity> findAllByGroupIdAndDateAfterAndDateBefore (Integer groupId, Date from, Date to);

    @Query(value = "select distinct date from AttendanceEntity  WHERE groupId = :groupId")
//    @Query(value = "select date FROM attendance WHERE groupID = :groupId", nativeQuery = true)
    public List<Date> findAllDateByGroupId (Integer groupId);
}
