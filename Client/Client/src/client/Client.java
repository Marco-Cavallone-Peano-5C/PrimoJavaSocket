/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class Client 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {      
        try 
        {
            Socket s = new Socket("127.0.0.1",1050);
            s.getOutputStream().write(35);
            s.close();  
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
