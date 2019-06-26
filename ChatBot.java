import java.util.*;
import java.io.*;

public  class ChatBot
{
  String request;
  String read()
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String temp=br.readLine();
    return temp;
  }
  void getRequest()
  {
    System.out.println("\nHi ,"+userName+"\nHow can i help you?\n");
    request=read();
  }
  public static void main(String[] args)
  {
    System.out.println("\nHi ,I am IRIS What is your name?\n");
    String userName=read();
    System.out.println("\nHi ,"+userName+"\nHow can i help you?\n");
    While(true)
    {
      getRequest();
      if(request.equals("exit"))
      {
        System.out.println("\nBye for now.........");
        break;
      }
      
    }
    return 0;
  }
}
