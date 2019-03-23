package twitterspammerdetection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class network 
{
		
		
		public static void Unique_ip_Ratio() throws IOException,InterruptedException
	    	{
			//Provide the path of the file having the user-id
			Scanner inputfile = new Scanner(System.in);
			BufferedReader br, br1;
			PrintWriter pw;
			while(true)
			{	
				try
				{
					//Provide the path of file that has users' id
					System.out.println("Enter the path of the file that has users ids in csv format");
					String uid_file=inputfile.nextLine();
					br=new BufferedReader(new FileReader(uid_file));
					break;
				}
				catch(FileNotFoundException fe)
				{
					System.out.println("Please enter a valid file path");
					continue;
				}
			}
			while(true)
			{	
				try
				{
					//Provide the path of the file to save the unique ip ratio of users
					System.out.println("Enter the path of the file to save the Unique ip ratio in csv format");
					String ip_outfile=inputfile.nextLine();
					pw=new PrintWriter(new FileWriter(ip_outfile, true));
					break;
				}
				catch(FileNotFoundException fe)
				{
					System.out.println("Please enter a valid file path");
					continue;
				}
			}
			String ip, userid;
			String iptokens[] = null, useridtokens[];
			
			//Loop to calculate unique ip count for every user using their user-id
			while((userid=br.readLine())!=null)
			{
				int uniqueipcount=0, ipcount=0;
				useridtokens=userid.split(",");
				
				while(true)
				{	
					try
					{
						//Provide the path of file that has users' ip informations
						System.out.println("Enter the path of the file that has users' ip information");
						String ip_file=inputfile.nextLine();
						br1=new BufferedReader(new FileReader(ip_file));
						break;
					}
					catch(FileNotFoundException fe)
					{
						System.out.println("Please enter a valid file path");
						continue;
					}
				}
				
				//Loop to check the  unique ip from user ip information
				
				while((ip=br1.readLine())!=null)
				{
					iptokens=ip.split(",");
					//Condition to equality of unique id
					while(useridtokens[0].trim().equalsIgnoreCase(iptokens[0].trim()))
					{
						ipcount++;
						if(iptokens[1].trim().startsWith("")||iptokens[1].trim().startsWith("")||iptokens[1].trim().startsWith(""))			
						pw.println(useridtokens[0]+" ,  "+((float)uniqueipcount/ipcount));
						System.out.println("ip count for user ip "+iptokens[0]+"	is:	"+uniqueipcount+"	ip count is:	"+ipcount+"	and unique ip ratio is:	"+((float)uniqueipcount/ipcount));
						uniqueipcount++;
						continue;
					}
				}
				br1.close();
				//For the users who do not have tweets
				if(ipcount==0)
					pw.println(useridtokens[0]+","+0);
				else
					pw.println(useridtokens[0]+","+((float)uniqueipcount/ipcount));
				System.out.println("ip count for user ip "+iptokens[0]+"	is:	"+uniqueipcount+"	ip count is:	"+ipcount+"	and unique ip ratio is:	"+((float)uniqueipcount/ipcount));
				continue;
			}
			inputfile.close(); pw.close();br.close();
	    	}
}
