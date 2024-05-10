package uscs3;

public class Quadrado implements AreaCalculavel{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double calculaArea(){
        return lado * lado;
    }
    public double calculaComprimento(){
        return 4 * lado;
    }

}
