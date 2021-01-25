package com.company;
import java.util.*;
	
public class Student {
	private String imie = "";
	private String nazwisko = "";
	private Date dataUr = new java.util.Date();
	private int studentId;

	public Student()
	{

	}

	public Student(String imie, String nazwisko, int id)
	{
		this();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUr = null;
		this.studentId = id;
	}

	public Student(String imie, String nazwisko, Date dataur, int id)
	{
		this();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUr = dataur;
		this.studentId = id;
	}

	public String getImie()
	{
		return imie;
	}

	public String getNazwisko()
	{
		return nazwisko;
	}

	public Date getDataUr()
	{
		return dataUr;
	}

	public void setNazwisko(String nazwisko)
	{
		this.nazwisko = nazwisko;
	}

	public void setImie(String imie)
	{
		this.imie = imie;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() // przeciazona klasa toString
	{
		return "ID: " + this.getStudentId() + " Imie Studenta : " + this.getImie()
				+ " Nazwisko Studenta : " + this.getNazwisko() + " Data Urodzin : " + this.getDataUr();

	}


}
