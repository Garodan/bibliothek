//Ein Ausweis ist 1 Jahr gültig. Er wird automatisch gesperrt, wenn der maximal erlaubte Gebührenstand überschritten ist oder die Laufzeit beendet ist.
//Die Verlüngerung des Ausweises oder das Entsperren wird in der Anwedung nicht implementiert.
package Model;
import java.time.LocalDate;

public class Ausweis {
	
	static int NumberCount = 1000;
    private int Number;
    private Boolean locked;
    private LocalDate ExpiryDate;
    
    
    public Ausweis() {
    	this.Number = this.getNumberCount() + 1;
        this.setNumberCount();
        this.unlock();
        this.ExpiryDate = LocalDate.now().plusYears(1);
        
    }
    //Ausweis Nummer Vergabe
    
    private int getNumberCount() {
        return NumberCount;
    }

    private void setNumberCount() {
        this.NumberCount = this.Number;
    }
    
    public int getNumber() {
        return this.Number;
    }

    //Ausweis Haltbarkeit
    public LocalDate getExpiryDate() {
        return this.ExpiryDate;
    }

    public void setAExpiryDate(LocalDate ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }
    
    //Ausweis Sperren/Entsperren
    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean isLocked() {
        return this.locked;
    }

    
}

