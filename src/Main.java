//Für ein Bibliotheksprogramm sollen die Funktionen
//Vorbestellen,
//Ausleihen (Verlängern),
//Rückgabe
//implementiert werden.
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die GUI soll mit JavaFX und die Datenbankanbindung mit JPA implementiert werden. 
//Es soll drei Schichten geben: GUI, Fachklassen, Datenbankanbindung.
//Die Implementierung einer Anwendungsschicht unabhängig von der GUI ist fakultativ.

//Für das Ausleihen wird die Ausweisnummer eines gültigen Bibliotheksausweises und die
//Buchnummer eines ausleihbaren Buchs benötigt. Es können bis zu 10 Bücher an einen 
//Nutzer ausgeliehen werden. Ausleihdauer nach Bibliotheksordnung. Die Verlängerung ist 
//möglich, wenn es keinen Vorbesteller gibt. Es darf nur 3 mal verlängert werden.
//Ein vorbestelltes Buch kann nur vom Vorbesteller ausgeliehen werden.

//Ausgeliehene Bücher können vorbestellt werden. Voraussetzung ist ein gültiger Ausweis,
//außerdem darf das Buch noch nicht vorbestellt sein. Jeder Nutzer kann nur drei Vorbestellungen anmelden. Er darf nicht Bücher vorbestellen, die er selbst ausgeliehen hat.
//Zum Vorbestellen wird die Ausweisnummer und die Buchnummer benötigt.
//Es fällt eine Gebühr entsprechend Gebührenordnung an.

//Wird ein Buch verspätet zurückgegeben, wird pro angefangene Woche eine Gebühr laut
//Gebührenordnung fällig. Ist das zurückgegebene Buch vorbestellt, wird es 1 Woche 
//zur Abholung bereitgestellt. Danach erlischt die Vorbestellung.

//Ausgaben 
//Ausleihe: erfolgreich? Warum nicht? / Rückgabedatum
//Rückgabe: Gebühren? Gebührenstand
//Vorbestellen: erfolgreich? Wann wird das Buch erwartet?
//Verlängern: erfolgreich? Neues Rückgabedatum.

public class Main {
	public static void main (String[] args) {
		
	}
}
