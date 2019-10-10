/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.util.xml.impl.Input;

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
                    InputStreamReader isr = new InputStreamReader(s.getInputStream());
                    BufferedReader b = new BufferedReader(isr);
                    System.out.println("Il server ha ricevuto: " + b.readLine());
                    ss.close();
                }    
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    

