/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class Server 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        try {
                for(;;)
                {
                    ServerSocket ss = new ServerSocket(1050);
                    Socket s = ss.accept();
                    int i = s.getInputStream().read();
                    System.out.println("Il server ha ricevuto: " + i);       
                    ss.close();
                }    
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    

