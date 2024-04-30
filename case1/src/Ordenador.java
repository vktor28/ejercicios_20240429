public class Ordenador {
    private String marca;
    private int ram;
    private int capacidad;
    private double precio;



//metodo contruct
public Ordenador(String marca, int memoriaRam, int SSD, double precio) {

    this.marca=marca;
    this.ram=memoriaRam;
    this.capacidad=SSD;
    this.precio=precio;

}

//gettters
public String getMarca(){
    return this.marca; //devuelce el que encuentra aquí
}
public int getRam(){
    return this.ram; //devuelce el que encuentra aquí
}
public int getCapacidad(){
    return this.capacidad; //devuelce el que encuentra aquí
}
public double getPrecio(){
    return this.precio; //devuelce el que encuentra aquí
}



//setters

public void setMarca(String marca){
    this.marca = marca;
}
public void setRam(int ram){
    this.ram = ram;
}
public void setCapacidad(int capacidad){
    this.capacidad = capacidad;
}
public void setPrecio(int precio){
    this.precio = precio;
}

@Override
public String toString(){
    return "Ordenador de la marca " + getMarca() + " con " + getRam()+"Gb de RAM y " + getCapacidad() + "Gb de SSD. Su precio es de " + getPrecio() + "€";
}
} 