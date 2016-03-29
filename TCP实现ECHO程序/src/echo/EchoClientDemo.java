package echo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientDemo
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Socket s= new Socket("10.101.242.34",8000);
		Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		PrintStream ps= new PrintStream(
				new BufferedOutputStream(s.getOutputStream()));
		boolean flag = true;
		while(flag)
		{
			System.out.println("«Î ‰»Î£∫");
			String info = input.next();
			if("".equals(info) || "bye".equals(info))
			{
				flag = false;
			}
			else 
			{
				ps.println(info);
				ps.flush();
				System.out.println(br.readLine());
			}
		}
		ps.close();
		br.close();
	}

}
