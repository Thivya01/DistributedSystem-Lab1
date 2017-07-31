/*
package com.company;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;


public class SampleClient
{

    private static Socket socket;

    public static void main(String args[])
    {
        try
        {
            String host = "localhost";
            int port =25003 ;
            InetAddress address = InetAddress.getByName(host);
            socket = new Socket(address, port);

            //Send the message to the server

            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);



            bufferedWriter.write("Hello");
            bufferedWriter.flush();
            System.out.println("Message Sent");




        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            //Closing the socket
            try
            {
                socket.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}*/
