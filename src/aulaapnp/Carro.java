package aulaapnp;

public class Carro extends Veiculo{
    
    int porta;
    boolean ar;
    
    void quantPortas(int porta){
        this.porta = porta;
    }
    
    int getPorta(){
        return porta;
    }
    
    void temAr(boolean ar){
        this.ar = ar;
    }
    
    boolean getAr(){
        return ar;
    }
    
}
