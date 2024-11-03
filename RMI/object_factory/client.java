
import java.rmi.*;
public class client{
    public static void main(String[]args){
        try {
            Banque b=(Banque)Naming.lookup("rmi://:2001/object");
            Compte c=b.compteClient(1);
            //solde du client
            System.out.println(c.solde());
             //depot sur le compte du client
             System.out.println(c.depot(55));
               //retrait sur le compte du client
               System.out.println(c.retrait(70));
                //retrait sur le compte du client
                System.out.println(c.retrait(20));
                //solde du client
            System.out.println(c.solde());
                

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}
