import java.util.ArrayList;
import java.util.Collections;
public class Tablero {
    private int espacios;
    private ArrayList<Ficha> fichas;
    private int numeroTurno;
    private boolean jugando;
    public Tablero(int espacios){
        setEspacios(espacios);
        setFichas(new ArrayList<>());
        this.fichas.add(new Ficha("verde"));
        this.fichas.add(new Ficha("amarilla"));
        this.fichas.add(new Ficha("azul"));
        this.fichas.add(new Ficha("roja"));
        Collections.shuffle(fichas);
    }
    public void turno(){
        setNumeroTurno(numeroTurno+1);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Turno #");
        System.out.println(getNumeroTurno());
        for(int i=0;i<this.fichas.size();i++){
            this.fichas.get(i).avanzar();
            if(this.fichas.get(i).getPosicion()>=this.getEspacios()){
                setJugando(false);
                System.out.print("La ficha ");
                System.out.print(this.fichas.get(i).getColor());
                System.out.println(" es la ganadora");
                System.out.println("----------------------------------------------------------------------------------");
                break;

            }
        }
    }
    public void partida(){
        setJugando(true);
        while(this.jugando){
            setNumeroTurno(numeroTurno+1);
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("Turno #");
            System.out.println(this.getNumeroTurno());
            for(int i=0;i<this.fichas.size();i++){
                this.fichas.get(i).avanzar();
                if(this.fichas.get(i).getPosicion()>=this.getEspacios()){
                    setJugando(false);
                    System.out.print("La ficha ");
                    System.out.print(this.fichas.get(i).getColor());
                    System.out.println(" es la ganadora");
                    System.out.println("----------------------------------------------------------------------------------");
                    break;
                }
                if (!jugando){
                    break;
                }
            }
        }
    }


    public int getEspacios() {
        return espacios;
    }
    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }
    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }
    public boolean isJugando() {
        return jugando;
    }
    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }
    
}