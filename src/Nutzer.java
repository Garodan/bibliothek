//Ein Nutzer hat einen Namen, Geburtstagdatum, Nummer.
//Anmeldename ist Geburtsdatum im Format ddmmyyyyy. DONE
//Das Passwort ist die Ausweisnummer.   DONE
//TODO Anmeldung, um zu Zugang zum Account zu bekommen.
//TODO Der Account beinhaltet Gebuehrenstand und die Daten von Vorbestellungen, Ausleihen, Ausweis. (DONE)
//TODO Der Nutzer kann die Daten sehen, dazu muss er sich anmelden.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Nutzer {
	String Vorname;
	String Nachname;
	Date bday;
	int pw;
	double kontostand;
	DateFormat formatter;
	String date;
	Ausweis ausweis;  //Getter und Setter?
	Buch[] ausleihen; //Getter und Setter?
	Buch[] vorbestellen; //Getter und Setter?

	public Nutzer(){
		date = bday.toString();
		this.pw = ausweis.getNumber();
		ausleihen = new Buch[9];
		vorbestellen = new Buch[2];
	}

	public String dateformatter() {
		formatter = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(formatter.format(date));
		return date;
	}



	//Getter & Setter
	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public Date getBday() {
		return bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}


}

