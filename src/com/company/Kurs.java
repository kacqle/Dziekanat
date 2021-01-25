package com.company;
import java.util.*;

public class Kurs {
	private int maxStudentow;
	private String nazwaKursu;
	private int idKursu;

	public Kurs(String nazwaKursu, int maxStudentow, int id)
	{
		this.nazwaKursu = nazwaKursu;
		this.maxStudentow = maxStudentow;
		this.idKursu = id;
	}

	public String getNazwa()
	{
		return nazwaKursu;
	}

	public void setNazwa()
	{
		this.nazwaKursu = nazwaKursu;
	}

	public void setMaxStudentow(short maxStudentow)
	{
		this.maxStudentow = maxStudentow;
	}

	public int getMaxStudentow()
	{
		return maxStudentow;
	}

	public int getIdKursu() {
		return idKursu;
	}

	public void setIdKursu(int idKursu) {
		this.idKursu = idKursu;
	}

	@Override
	public String toString()
	{
		return "Id kursu: " + this.getIdKursu() + " Nazwa Kursu : " + this.getNazwa()
				+ " Max Ilosc Osob : " + this.getMaxStudentow();

	}
}
