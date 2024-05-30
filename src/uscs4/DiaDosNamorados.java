package uscs4;

public class DiaDosNamorados extends CartaoWeb{
   
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz dia no namoro senhor(a): " + destinatario);
    }
}
