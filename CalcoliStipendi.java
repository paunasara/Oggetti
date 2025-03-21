public class CalcoliStipendi {
    public static void main(String[] args) {
        
        Dipendente dip1 = new Dipendente("00309", 1000.00, 7.50);
        
        double paga1 = dip1.paga(10);
        System.out.println("Paga dipendente 1: " + paga1);
        
        System.out.println("Stipendio dipendente 1: " + dip1.getStipendio());

    
        DipendenteA dip2 = new DipendenteA("00201", 1500.0, 8.50);
        
        dip2.prendiMalattia(5);
    
        double paga2 = dip2.paga(3);
        System.out.println("Paga dipendente 2: " + paga2);
        
        dip2.stampaMalattia();
    }
}
