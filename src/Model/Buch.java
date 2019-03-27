//Ein Buch hat einen Autor, Titel und Nummer. DONE
//Ausserdem hat es die Eigenschaft, ob es ausleihbar ist. DONE
//TODO implementieren boolen false ...
//(Einige Buecher duerfen nur in der Bibliothek genutzt werden.)
//Die Ausleihe kann verlngert werden.
//Beim Ausleihen wird ein Ausleihobjekt erzeugt(Buch, Nutzer, Rckgabedatum).
//Die Daten des Buches knnen ausgegeben werden, dazu ist die Buchnummer erforderlich.
package Model;
import java.util.Date;

public class Buch {
	String autor;
	String titel;
	int nummer;
	boolean ausleihbar;
	boolean toGO;
	Date ExpireDate;

	public Buch(){


	}

	public void datenAussage() {
		System.out.println(autor);
		System.out.println(titel );
		System.out.println(ausleihbar);
		System.out.println(toGO);

	}
}



//Methode zum verlaengern



