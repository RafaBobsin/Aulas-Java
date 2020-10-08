package aulaapnp;

public class Veiculo {
    
    String marca, placa;
    double vel;
    int marcha;
    
    void defineMarca(String marca){
        this.marca = marca;
    }
    
    String getMarca(){
        return marca;
    }
    
    void definePlaca(String placa){
        this.placa = placa;
    }
    
    String getPlaca(){
        return this.placa;
    }
    
    void defineVelocidade(double vel){
        this.vel = vel;
    }
    
    double getVelocidade(){
        return this.vel;
    }
    
    void defineMarcha(int marcha){
        this.marcha = marcha;
    }
    
    int getMarcha(){
        return marcha;
    }
    
}
