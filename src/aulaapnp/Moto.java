package aulaapnp;

public class Moto extends Veiculo{
    
    Double tamanho;
    
    void defineTamanho (Double tamanho){
        this.tamanho = tamanho;
    }
    
    Double getTamanho(){
        return this.tamanho;
    }
    
}
