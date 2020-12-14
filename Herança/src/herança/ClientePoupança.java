
package herança;


public class ClientePoupança extends ClienteConta {
   
    
    float taxaJuros;
    public ClientePoupança(String nome, int conta, float taxaCpmf, float taxa){
        super (nome, conta, taxaCpmf);
        this.taxaJuros=taxa;
	
    }
    
    public void realizaSaque(float valor){
        if(valor<=saldo)
            this.saldo=this.saldo-valor;
	 else
            System.out.println("Valor inválido!!!!");
    }

    
    
}
