package uscs3;

public class Circulo implements AreaCalculavel {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    public double calculaArea(){
        return Circulo.PI*raio*raio;
    }
    public double calculaComprimento(){
        return 2*Circulo.PI*raio;
    }
}


