public class Carro extends Vehiculo {
    private String numEjes;
    private boolean picoYPlaca;
    private String capacidadBaul;

    

    public Carro(){
        
    }
    public Carro(String motor, String numRuedas, String color, String numEjes, boolean picoYPlaca,
            String capacidadBaul) {
        super(motor, numRuedas, color);
        this.numEjes = numEjes;
        this.picoYPlaca = picoYPlaca;
        this.capacidadBaul = capacidadBaul;
    }


    @Override
    public void detener() {
        System.out.println("El carro se ha detenido");
        
        
    }
    public void reversa(){
        System.out.println("Este carro esta retrocediendo");
    }


    public String getNumEjes() {
        return numEjes;
    }


    public void setNumEjes(String numEjes) {
        this.numEjes = numEjes;
    }


    public boolean isPicoYPlaca() {
        return picoYPlaca;
    }


    public void setPicoYPlaca(boolean picoYPlaca) {
        this.picoYPlaca = picoYPlaca;
    }


    public String getCapacidadBaul() {
        return capacidadBaul;
    }


    public void setCapacidadBaul(String capacidadBaul) {
        this.capacidadBaul = capacidadBaul;
    }
    
}
