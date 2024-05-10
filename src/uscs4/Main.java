package uscs4;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        DiaDosNamorados d1 = new DiaDosNamorados("José Henrique");
        Natal n1 = new Natal("José Henrique");
        Aniversario a1 = new Aniversario("José Henrique");

        d1.showMessage();
        n1.showMessage();
        a1.showMessage();
    }
}
