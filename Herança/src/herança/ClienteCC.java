
package herança;


public class ClienteCC extends ClienteConta {
    
    
    float  especial;
    public ClienteCC(String nome, int conta, float taxaCpmf, float especial){
        super (nome, conta, taxaCpmf);
        this.especial=especial;
	
    }
    
    public void realizaSaque(float valor){
        if(valor<=saldo+especial)
            this.saldo=this.saldo-valor;
	else
            System.out.println("Valor inválido!!!!");
    } 

    
}
