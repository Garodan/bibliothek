//Für ein Bibliotheksprogramm sollen die Funktionen
//Vorbestellen,
//Ausleihen (Verlüngern),
//Rückgabe
//implementiert werden.
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die GUI soll mit JavaFX und die Datenbankanbindung mit JPA implementiert werden. 
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die Implementierung einer Anwendungsschicht unabhüngig von der GUI ist fakultativ.

//Für das Ausleihen wird die Ausweisnummer eines gültigen Bibliotheksausweises und die
//Buchnummer eines ausleihbaren Buchs benötigt. Es knnen bis zu 10 Bcher an einen
//Nutzer ausgeliehen werden. Ausleihdauer nach Bibliotheksordnung. Die Verlngerung ist
//mglich, wenn es keinen Vorbesteller gibt. Es darf nur 3 mal verlngert werden.
//Ein vorbestelltes Buch kann nur vom Vorbesteller ausgeliehen werden.

//Ausgeliehene Bcher knnen vorbestellt werden. Voraussetzung ist ein gltiger Ausweis,
//auerdem darf das Buch noch nicht vorbestellt sein. Jeder Nutzer kann nur drei Vorbestellungen anmelden. Er darf nicht Bcher vorbestellen, die er selbst ausgeliehen hat.
//Zum Vorbestellen wird die Ausweisnummer und die Buchnummer bentigt.
//Es fllt eine Gebhr entsprechend Gebhrenordnung an.

//Wird ein Buch versptet zurckgegeben, wird pro angefangene Woche eine Gebr laut
//Gebhrenordnung fllig. Ist das zurckgegebene Buch vorbestellt, wird es 1 Woche
//zur Abholung bereitgestellt. Danach erlischt die Vorbestellung.

//Ausgaben 
//Ausleihe: erfolgreich? Warum nicht? / Rckgabedatum
//R�ckgabe: Gebhren? Gebhrenstand
//Vorbestellen: erfolgreich? Wann wird das Buch erwartet?
//Verlngern: erfolgreich? Neues Rckgabedatum.

public class Main {
	public static void main (String[] args) {
		
	}
}
