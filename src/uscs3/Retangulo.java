package uscs3;

public class Retangulo implements AreaCalculavel{
    private double base;
    private double altura;

    public Retangulo(double ladoM, double ladom){
        this.base = ladoM;
        this.altura = ladom;
    }
    @Override
    public double calculaArea(){
        return base * altura;
    }
    @Override
    public double calculaComprimento(){
        return 2* (base + altura);
    }
}
