package uscs;
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("O cachorro "+nome+ " de " +idade+ " anos de idade, está latindo. ");
    }
}
