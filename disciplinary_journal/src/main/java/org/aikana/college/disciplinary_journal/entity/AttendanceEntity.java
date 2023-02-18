package org.aikana.college.disciplinary_journal.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "attendance", schema = "disciplinary_diary", catalog = "")
public class AttendanceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "groupID")
    private int groupId;
    @Basic
    @Column(name = "studentID")
    private int studentId;
    @Basic
    @Column(name = "subjectID")
    private int subjectId;
    @Basic
    @Column(name = "absence")
    private byte absence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public byte getAbsence() {
        return absence;
    }

    public void setAbsence(byte absence) {
        this.absence = absence;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendanceEntity that = (AttendanceEntity) o;

        if (id != that.id) return false;
        if (groupId != that.groupId) return false;
        if (studentId != that.studentId) return false;
        if (studentId != that.studentId) return false;
        if (absence != that.absence) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + studentId;
        result = 31 * result + studentId;
        result = 31 * result + (int) absence;
        return result;
    }
}
