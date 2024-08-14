public abstract class Vehiculo {
    protected String motor;
    protected String numRuedas;
    protected String color;


    
    public Vehiculo() {
    }
    public Vehiculo(String motor, String numRuedas, String color) {
        this.motor = motor;
        this.numRuedas = numRuedas;
        this.color = color;
    }
    public void arrancar(){
        System.out.println("el vehículo ha arrancado");
    }
    public void mover(){
        System.out.println("el vehículo esta en movimiento");
    }

    public abstract void detener();

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(String numRuedas) {
        this.numRuedas = numRuedas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
