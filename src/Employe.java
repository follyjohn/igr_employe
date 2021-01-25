public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    // Constructor

    public Employe(String cin, float salaireBrutMensuel) {

        this.setCin(cin);
        this.salaireBrutMensuel = salaireBrutMensuel;

    }

    public float calculerIGR() {
    float salaireBrutAnuel=salaireBrutMensuel*12;
    float taux=42;
    return salaireBrutAnuel*taux/100;
    }
    
    public float getSalaireNetMensuel(){
    float igr=calculerIGR();
    float salaireNetAnuel=salaireBrutMensuel*12-igr;
    return salaireNetAnuel/12;
    }
    // Getters et Setters

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
 }