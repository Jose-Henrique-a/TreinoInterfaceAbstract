package uscs4;
public class Aniversario extends CartaoWeb{
   
    public Aniversario(String destinatario ){
        super(destinatario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz Aniversário senhor(a): " + destinatario);
    }
}