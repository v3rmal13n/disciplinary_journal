package org.aikana.college.disciplinary_journal.controller;

import lombok.AllArgsConstructor;
import org.aikana.college.disciplinary_journal.entity.AttendanceEntity;
import org.aikana.college.disciplinary_journal.repository.AttendanceRepository;
import org.aikana.college.disciplinary_journal.service.StudentService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final AttendanceRepository attendanceRepository;

    @GetMapping("/getAllByGroupId/{groupId}")
    public List<AttendanceEntity> findAllByGroupId (@PathVariable Integer groupId,
                                                    HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return attendanceRepository.findAllByGroupId(groupId);
    }

    @GetMapping("/getAllByGroupIdAndDate/{groupId}/{date}")
    public List<AttendanceEntity> findAllByDate (@PathVariable Integer groupId,
                                                 @PathVariable("date") Date date,
                                                 HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return attendanceRepository.findAllByGroupIdAndDate(groupId, date);
    }

    @GetMapping("/getAllByGroupIdAndDateRange/{groupId}/{from}/{to}")
    public List<AttendanceEntity> test (@PathVariable Integer groupId,
                                        @PathVariable java.sql.Date from,
                                        @PathVariable java.sql.Date to,
                                        HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return attendanceRepository.findAllByGroupIdAndDateAfterAndDateBefore(groupId, from, to);
    }

    @PostMapping("/postAttendance")
    public AttendanceEntity postAttendance (@RequestBody AttendanceEntity attendanceEntity,
                                            HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return attendanceRepository.save(attendanceEntity);
    }

    @PutMapping("/updateAttendance")
    public AttendanceEntity updateAttendance (@RequestBody AttendanceEntity attendanceEntity,
                                              HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        return attendanceRepository.save(attendanceEntity);
    }
}
