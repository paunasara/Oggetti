public class DipendenteA extends Dipendente {
    
    private int malattia;

    
    public DipendenteA(String matricola, double stipendio, double straordinario) {
        super(matricola, stipendio, straordinario);
        this.malattia = 0; 
    }

    
    public void prendiMalattia(int giorni) {
        malattia += giorni;
    }

    
    @Override
    public double paga(int oreStraordinario) {
        double p = super.paga(oreStraordinario);
        if (malattia == 0) {
            return p;
        } else {
            return p - (malattia * 15.0);
        }
    }

    
    public void stampaMalattia() {
        System.out.println("Giorni di malattia: " + malattia);
    }
}
