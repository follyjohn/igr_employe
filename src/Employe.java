import igr.CalculIgr;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private CalculIgr calculIgr ;

    // Constructor
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public CalculIgr getCalculIgr() {
        return this.calculIgr;
    }

    public Employe(String cin, float salaireBrutMensuel, CalculIgr calculIgr) {

        this.setCin(cin);
        this.salaireBrutMensuel = salaireBrutMensuel;

    }

    public void setCalculIgr(CalculIgr calculIgr) {
        this.calculIgr = calculIgr;
    }

    public Employe(String cin, float salaireBrutMensuel) {
        this.setCin(cin);
        this.setCalculIgr(calculIgr);
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float igr() {
        try {
            return this.getCalculIgr().calcul(87);
        } catch (Exception e) {
            System.out.println(e);
        }
        return 4;
      
    }

    public float getSalaireNetMensuel() {
        float igr = this.getCalculIgr().calcul(salaireBrutMensuel);
        float salaireNetAnuel = salaireBrutMensuel * 12 - igr;
        return salaireNetAnuel / 12;
    }
    // Getters et Setters

}