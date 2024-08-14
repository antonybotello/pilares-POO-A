public class Moto extends Vehiculo {
    private String tipoManillar;
    private String cilindraje;
    public Moto() {
    }
   
    public Moto(String motor, String numRuedas, String color, String tipoManillar, String cilindraje) {
        super(motor, numRuedas, color);
        this.tipoManillar = tipoManillar;
        this.cilindraje = cilindraje;
    }

    public void arrancar(){
        System.out.println("La moto ha arrancado");

    }
    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
        
        
    }
    public void hacerCaballito(){
        System.out.println("La moto esta haciendo Caballito");
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "La Moto tiene: \ntipoManillar= " + tipoManillar + 
        "\nCilindraje= " + cilindraje + 
        "\nMotor= " + motor+ 
        "\nNúmero Ruedas= " + numRuedas + 
        "\nColor= "+ color ;
    }

    
    
}
