//Ein Ausweis ist 1 Jahr gültig. Er wird automatisch gesperrt, wenn der maximal erlaubte Gebührenstand überschritten ist oder die Laufzeit beendet ist.
//Die Verlängerung des Ausweises oder das Entsperren wird in der Anwedung nicht implementiert.

import java.time.LocalDate;

public class Ausweis {
	
	static int aNumberCount = 1000;
    private int aNumber;
    private Boolean locked;
    private LocalDate aExpiryDate;
    
    
    public Ausweis() {
    	this.aNumber = this.getANumberCount() + 1;
        this.setANumberCount();
        this.unlock();
        this.aExpiryDate = LocalDate.now().plusYears(1);
        
    }
    //Ausweis Nummer Vergabe
    
    private int getANumberCount() {
        return aNumberCount;
    }

    private void setANumberCount() {
        this.aNumberCount = this.aNumber;
    }
    
    public int getANumber() {
        return this.aNumber;
    }

    //Ausweis Haltbarkeit
    public LocalDate getAExpiryDate() {
        return this.aExpiryDate;
    }

    public void setAExpiryDate(LocalDate aExpiryDate) {
        this.aExpiryDate = aExpiryDate;
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

