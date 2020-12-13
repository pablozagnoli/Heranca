
package herança;

public class Herança {

   
    public static void main(String[] args) {
       
        //ClienteCC Pablo=new ClienteCC("Pablo",2 ,2 , 2);
        //System.out.println(requisitaSaldo());
        
               ClienteCC c1=new ClienteCC("Severino", 2, 5, 1000);
       c1.realizaSaque(500);
       System.out.println("O saldo da ContaCliente c1 é: "+c1.saldo);

        
       ClientePoupança c2=new ClientePoupança("Israel", 3, 5, 5);
       c2.realizaSaque(500);
       System.out.println("O saldo da ContaCliente c2 é: "+c2.saldo);

       
       
       
    }
    
}
