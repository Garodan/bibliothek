//F�r ein Bibliotheksprogramm sollen die Funktionen
//Vorbestellen,
//Ausleihen (Verl�ngern),
//R�ckgabe
//implementiert werden.
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die GUI soll mit JavaFX und die Datenbankanbindung mit JPA implementiert werden. 
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die Implementierung einer Anwendungsschicht unabh�ngig von der GUI ist fakultativ.

//F�r das Ausleihen wird die Ausweisnummer eines g�ltigen Bibliotheksausweises und die
//Buchnummer eines ausleihbaren Buchs ben�tigt. Es k�nnen bis zu 10 B�cher an einen 
//Nutzer ausgeliehen werden. Ausleihdauer nach Bibliotheksordnung. Die Verl�ngerung ist 
//m�glich, wenn es keinen Vorbesteller gibt. Es darf nur 3 mal verl�ngert werden.
//Ein vorbestelltes Buch kann nur vom Vorbesteller ausgeliehen werden.

//Ausgeliehene B�cher k�nnen vorbestellt werden. Voraussetzung ist ein g�ltiger Ausweis,
//au�erdem darf das Buch noch nicht vorbestellt sein. Jeder Nutzer kann nur drei Vorbestellungen anmelden. Er darf nicht B�cher vorbestellen, die er selbst ausgeliehen hat.
//Zum Vorbestellen wird die Ausweisnummer und die Buchnummer ben�tigt.
//Es f�llt eine Geb�hr entsprechend Geb�hrenordnung an.

//Wird ein Buch versp�tet zur�ckgegeben, wird pro angefangene Woche eine Geb�hr laut
//Geb�hrenordnung f�llig. Ist das zur�ckgegebene Buch vorbestellt, wird es 1 Woche 
//zur Abholung bereitgestellt. Danach erlischt die Vorbestellung.

//Ausgaben 
//Ausleihe: erfolgreich? Warum nicht? / R�ckgabedatum
//R�ckgabe: Geb�hren? Geb�hrenstand
//Vorbestellen: erfolgreich? Wann wird das Buch erwartet?
//Verl�ngern: erfolgreich? Neues R�ckgabedatum.

public class Main {
	public static void main (String[] args) {
		
	}
}
