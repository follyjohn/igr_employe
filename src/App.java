import igr.IgrMaroc;

public class App {
    public static void main(String[] args) throws Exception {
        Employe employe1 = new Employe("5874", 50000);
        Employe employe2 = new Employe("6987", 45000);
        Employe employe3 = new Employe("4786", 28000);

        employe1.setCalculIgr(new IgrMaroc());
        employe2.setCalculIgr(new IgrMaroc());0
        employe3.setCalculIgr(new IgrMaroc());
        System.out.println("\nLe Salaire Net Mensuel de l'employe 1 est : "+employe1.getSalaireNetMensuel()+ "\n");
        System.out.println("Le Salaire Net Mensuel de l'employe 2 est : "+employe2.getSalaireNetMensuel()+ "\n");
        System.out.println("Le Salaire Net Mensuel de l'employe 3 est : "+employe3.getSalaireNetMensuel()+ "\n");
    }
}
