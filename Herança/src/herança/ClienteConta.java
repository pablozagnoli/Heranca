
package herança;


public class ClienteConta {
  
    
    String nome;
    int conta;
    float saldo, taxaCpmf;
    public ClienteConta(String nome, int conta, float taxaCpmf){
        this.nome=nome;
        this.conta=conta;
        this.taxaCpmf=taxaCpmf;
        this.saldo=0;
    }
    public float requisitaSaldo(){
        return this.saldo;
    }

    
    
}
