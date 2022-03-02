public class Dado {
    private int caras;
    
    public Dado(int caras) {
        setCaras(caras);
    }
    
    public int lanzar() {
        return (int) (Math.random()*(getCaras()-1)) + 1;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }
    


}
