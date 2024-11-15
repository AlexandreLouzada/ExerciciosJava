package fase05.L05Exercicio07.dominio;

public class Triangulo implements FiguraGeometrica {

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC){
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoA = ladoB;
        this.ladoA = ladoC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }

    @Override
    public int getArea() {
        int area = 0;
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = ladoA + ladoB + ladoC;

        return perimetro;
    }
}
