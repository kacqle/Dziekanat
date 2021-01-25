package com.company;

public class KursStudent { // laczy obiekt typu kurs z obiektem typu Student po id
    private int kursId;
    private int studentId;

    public KursStudent(int kursId, int studentId)
    {
        this.kursId = kursId;
        this.studentId = studentId;
    }

    public int getKursId()
    {
        return kursId;
    }

    public void setKursId(int kursId)
    {
        this.kursId = kursId;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
}
