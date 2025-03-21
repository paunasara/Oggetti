public class Dipendente {
    
    private String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendente(String matricola, double stipendio, double straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }


    public double getStipendio() {
        return stipendio;
    }

    public double paga(int oreStraordinario) {
        return stipendio + (oreStraordinario * straordinario);
    }

   
    public void stampa() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Straordinario: " + straordinario);
    }
}
