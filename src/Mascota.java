public class Mascota {
    private String nombre;
    private String tipoAnimal;
    private int edad;
    Mascota[]mascota = new Mascota[100];
    Mascota[] inventario;
    public  Mascota (String nombre, int edad,String tipoAnimal){
        this.nombre=nombre;
        this.tipoAnimal=tipoAnimal;
        this.edad=edad;
        }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }
}

