package uscs;
public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Cachorro("Rex", 3);
        Animal animal2 = new Gato("Whiskers", 5);
        
        animal1.emitirSom();
        animal2.emitirSom();
    }
}
