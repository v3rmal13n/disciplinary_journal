package org.aikana.college.disciplinary_journal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tokens", schema = "disciplinary_diary", catalog = "")
public class TokensEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "studentID")
    private int studentId;
    @Basic
    @Column(name = "token")
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TokensEntity that = (TokensEntity) o;

        if (id != that.id) return false;
        if (studentId != that.studentId) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + studentId;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }
}
