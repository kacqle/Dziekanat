package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Baza {

	private ArrayList<Student> studenci = new ArrayList<>();
	private ArrayList<Kurs> kursy = new ArrayList<>();
	private ArrayList<Ocena> oceny = new ArrayList<>();
	private ArrayList<KursStudent> kursyStudenci = new ArrayList<>();

	public Baza()
	{
		studenci.add(new Student("Zosia","Gnuch", createID(studenci)));
		studenci.add(new Student("Marcin","Kluch", createID(studenci)));
		studenci.add(new Student("Karol","Kowalski", createID(studenci)));
		studenci.add(new Student("Michał","Żebrowski", createID(studenci)));

		kursy.add(new Kurs("Technika Analogowa" , 20, createID(kursy)));
		kursy.add(new Kurs("Zawansowane Algorytmy" , 60, createID(kursy)));
		kursy.add(new Kurs("Analiza Matematyczna" , 15, createID(kursy)));
	}

	void pokazStudentow()
	{
		for(Student student : studenci) {
			System.out.println(student.toString());
		}
	}

	public void dodajStudenta() throws ParseException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imie Studenta ");
		String imie = scanner.nextLine();
		System.out.println("Podaj nazwisko Studenta ");
		String nazwisko = scanner.nextLine();
		System.out.println("Podaj date urodzenie Studenta dzien/miesiac/rok ");
		String dataUrodzeniaString = scanner.nextLine();
		Date dataUrodzenia = new SimpleDateFormat("dd/MM/yyyy").parse(dataUrodzeniaString);
		studenci.add(new Student(imie,nazwisko,dataUrodzenia, createID(studenci)));
	}

	public void usunStudenta()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id studenta:");
		int studentId = Integer.parseInt(scanner.nextLine());
		studenci.removeIf(student -> student.getStudentId() == studentId);
	}

	public void pokazKursy()
	{
		for(Kurs kurs : kursy) {
			System.out.println(kurs.toString());
		}
	}

	public void dodajKurs() // dlaczego tu nie chciał wyjątku jak w dodaniu studenta?
	{
		int maxUczestnikow;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj nazwę kursu");
		String nazwaKursu = scanner.nextLine();
		System.out.println("Podaj maksymalna ilosc uczestników");
		maxUczestnikow = Integer.parseInt(scanner.nextLine());
		kursy.add(new Kurs(nazwaKursu, maxUczestnikow, createID(kursy)));
	}

	public void usunKurs()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id kursu:");
		int kursId = Integer.parseInt(scanner.nextLine());
		kursy.removeIf(kurs -> kurs.getIdKursu() == kursId);
	}

	public void pokazStudentowZapisanychNaKurs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id kursu:");
		int idKursu = Integer.parseInt(scanner.nextLine());
		Kurs kurs = null;
		//znajdz wsrod kursow, kurs ktory nas interesuje
		for(Kurs szukanyKurs: kursy) {
			if(szukanyKurs.getIdKursu() == idKursu) kurs = szukanyKurs;
		}
		System.out.println("Kurs: " + kurs.toString());
		System.out.println("Zapisani studenci:");


		for(KursStudent studentNaKursie : kursyStudenci)
		{
			if(studentNaKursie.getKursId() == idKursu)
			{
				for(Student student : studenci)
				{
					if(student.getStudentId() == studentNaKursie.getStudentId())
					{
						System.out.println(student.toString());
					}
				}
			}
		}
	}

	public void dopiszDoKursu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id studenta:");
		int student = Integer.parseInt(scanner.nextLine());
		System.out.println("Podaj id kursu:");
		int kurs = Integer.parseInt(scanner.nextLine());
		kursyStudenci.add(new KursStudent(kurs, student));
	}

	public void wypiszZKursu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id studenta:");
		int student = Integer.parseInt(scanner.nextLine());
		System.out.println("Podaj id kursu:");
		int kurs = Integer.parseInt(scanner.nextLine());
		for(KursStudent ks : kursyStudenci) {
			if (ks.getKursId() == kurs && ks.getStudentId() == student) kursyStudenci.remove(ks);
		}
	} // ta lamda tutaj leci po studentach

	public void wstawOcene()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id studenta:");
		int student = Integer.parseInt(scanner.nextLine());
		System.out.println("Podaj id kursu:");
		int kurs = Integer.parseInt(scanner.nextLine());
		System.out.println("Podaj ocenę:");
		short ocena = Short.parseShort(scanner.nextLine());
		oceny.add(new Ocena(kurs, student, ocena));
	}

	public void anulujOcene() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj id studenta:");
		int student = Integer.parseInt(scanner.nextLine());
		System.out.println("Podaj id kursu:");
		int kurs = Integer.parseInt(scanner.nextLine());
		for(Ocena ocena : oceny) {
			if (ocena.getKursID() == kurs && ocena.getStudentID() == student) oceny.remove(ocena);
		}
	}

	public static synchronized Integer createID(ArrayList<?> lista)
	{
		return lista.size() + 1;
	}

}
