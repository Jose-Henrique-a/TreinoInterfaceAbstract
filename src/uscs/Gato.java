package uscs;
public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("O gato " + nome + " de " +idade +" anos de idade, está miando.");
    }
}
