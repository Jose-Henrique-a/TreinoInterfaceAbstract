package uscs4;

public class Natal extends CartaoWeb{
    
    public Natal (String destinatario){
        super(destinatario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz natalino senhor(a): " + destinatario);
    }

}