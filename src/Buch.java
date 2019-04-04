//Ein Buch hat einen Autor, Titel und Nummer. DONE
//Ausserdem hat es die Eigenschaft, ob es ausleihbar ist. DONE
//TODO implementieren boolen false ...
//(Einige Buecher duerfen nur in der Bibliothek genutzt werden.)
//Die Ausleihe kann verlngert werden.
//Beim Ausleihen wird ein Ausleihobjekt erzeugt(Buch, Nutzer, Rckgabedatum).
//Die Daten des Buches knnen ausgegeben werden, dazu ist die Buchnummer erforderlich.

import java.util.Date;

public class Buch {
	String autor;
	String titel;
	int nummer;
	boolean verfuegbar;
	boolean ausleihbar;
	Date ExpireDate;

	public Buch(){


	}

	public void datenAussage() {
		System.out.println("Autor:" +autor);
		System.out.println("Titel:" +titel );
		System.out.println("Verfügbar:" +verfuegbar);
		System.out.println("Ausleihbar:" +ausleihbar);

	}
}



//Methode zum verlaengern



