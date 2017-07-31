package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SampleServer {

    private static Socket socket;


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter maximum no of threads in thread pool");
        int noOfThreads = scanner.nextInt();
        System.out.println("Please Enter maximum no of task handle by queue");
        int maxNoOfTaskInQueue = scanner.nextInt();

        ThreadPool threadPool = new ThreadPool(noOfThreads, maxNoOfTaskInQueue);

        try
        {

            int port = 25007;

            System.out.println("Server Started and listening to the port" + port);
            ServerSocket serverSocket = new ServerSocket(port);
            //int thivya = 1;
            //Server is running always. This is done using this while(true) loop
            threadPool.execute(new Runnable() {
                @Override
                public void run()
                {
                    int thivya = 0;
                 String message=null;
                 Object ob=null;
                    while (true)

                    {
                        //int thivya = 0; //Reading the message from the client
                        try
                        {


                                socket = serverSocket.accept();
                                System.out.println("Server is connected" + port);
                                InputStream is = socket.getInputStream();
                                InputStreamReader isr = new InputStreamReader(is);
                                BufferedReader br = new BufferedReader(isr);

                                message = br.readLine();
                                ob= message;
                                System.out.println("Serveris connected : " + message);

                                thivya = thivya + 1;

                          // int max=thivya+1;

                           //System.out.println("size of client request : " + thivya);
                        //    System.out.println("mmmmmmmmmmmmmmmmmmmmmmmaaaaaaaaaaaaaaaxxxxxxxxxxx : " + max);

                        /*  else { int max=thivya+1;


                                for(int i=0;i< (max-noOfThreads);i++) {
                                    Queue q = new Queue(maxNoOfTaskInQueue);
                                    q.enqueue(ob);
                                }
                            }*/



                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                    }


                }
            });


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}