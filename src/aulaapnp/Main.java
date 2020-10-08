package aulaapnp;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String marca, placa;
        int marcha, porta, veiculo;
        double vel, tamanho;
        boolean ar;
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        System.out.println("Informe a marca do veiculo: ");
        marca = sc.nextLine();
        System.out.println("Informe a placa do veiculo: ");
        placa = sc.nextLine();
        System.out.println("Informe quantas marchas o veiculo tem: ");
        marcha = sc.nextInt();
        System.out.println("Informe a velocidade máxima que o veiculo pode chegar: ");
        vel = sc.nextDouble();
        
        System.out.println("Digite 1 se o veiculo é um carro ou 2 se é moto: ");
        veiculo = sc.nextInt();
        
        if(veiculo == 1){
            
            System.out.println("Informe quantas portas tem: ");
            porta = sc.nextInt();
            System.out.println("Se tiver ar condicionado digite 1 e se não tiver digite 2");
            int n = sc.nextInt();
            
            if (n == 1){
                ar = true;
                carro.temAr(ar);
            } if (n == 2){
                ar = false;
                carro.temAr(ar);
            } else {
                System.out.println("Opção inválida.");
            }
            
            carro.defineMarca(marca);
            carro.defineMarcha(marcha);
            carro.definePlaca(placa);
            carro.defineVelocidade(vel);
            carro.quantPortas(porta);
                    
            System.out.println("Especificações do Carro:");
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Marcha: " + carro.getMarcha());
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Velocidade máxima: " + carro.getVelocidade());
            System.out.println("Quantidade de portas: " + carro.getPorta());
            System.out.println("Tem ar: " + carro.getAr());
        
        } if (veiculo == 2){
            
            System.out.println("Informe o tamanho da moto:");
            tamanho = sc.nextDouble();
            
            moto.defineMarca(marca);
            moto.defineMarcha(marcha);
            moto.definePlaca(placa);
            moto.defineVelocidade(vel);
            moto.defineTamanho(tamanho);
                    
            System.out.println("Especificações da moto:");
            System.out.println("Marca: " + moto.getMarca());
            System.out.println("Marcha: " + moto.getMarcha());
            System.out.println("Placa: " + moto.getPlaca());
            System.out.println("Velocidade máxima: " + moto.getVelocidade());
            System.out.println("Tamanho da moto: " + moto.getTamanho());
            
        } if (veiculo != 1 && veiculo != 2) {
            System.out.println("Inválido.");
        }
        
    }
    
}
