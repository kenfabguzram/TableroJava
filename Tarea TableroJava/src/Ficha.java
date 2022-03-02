public class Ficha {
    private String color;
    private int posicion;
    private int pasos;
    private Dado dado=new Dado(6);
    
    public Ficha(String color) {
        setColor(color);
        setPosicion(0);
    }
    public void avanzar(){
        setPasos(dado.lanzar());
        setPosicion(getPosicion()+getPasos());
        System.out.print("+");
        System.out.print(getPasos());
        System.out.print(" pasos para la ficha ");
        System.out.println(getColor());
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public int getPasos() {
        return pasos;
    }
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
    

}