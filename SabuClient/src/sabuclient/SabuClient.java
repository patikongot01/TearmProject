/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabuclient;

/**
 *
 * @author Capellix
 */
public class SabuClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(hello("John"));
    }

    private static String hello(java.lang.String name) {
        sabuclient.SabuService_Service service = new sabuclient.SabuService_Service();
        sabuclient.SabuService port = service.getSabuServicePort();
        return port.hello(name);
    }
    
}
