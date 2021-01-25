package com.company;
import java.lang.String;
// TODO : DODAĆ W WOLNEJ CHWILI
public class Ocena extends Object{

  private short ocena;
  private int kursID;
  private int studentID;

  public Ocena() {}
  public Ocena(int idKursu, int idStudenta, short ocena)
  {
    this.kursID = idKursu;
    this.studentID = idStudenta;
    this.ocena = ocena;
  }

  public short getOcena() {
    return ocena;
  }

  public void setOcena(short ocena) {
    this.ocena = ocena;
  }

  public int getKursID() {
    return kursID;
  }

  public int getStudentID() {
    return studentID;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }
}