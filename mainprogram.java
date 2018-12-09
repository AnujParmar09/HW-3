package program;

import java.io.*;

import java.io.FileWriter;
import java.util.Scanner;

import program.sort_finding;

public class mainprogram {
	public static void main(String[] args) throws Exception
	{
		
		int count=0;
		File file1=new File("C:\\Users\\parmar\\Desktop\\new.txt"); //reading keyword file
        Scanner sc1=new Scanner(file1); 
        String xyz="";
       
//to count number of keywords
		while(sc1.hasNextLine())
		{
			
			xyz=sc1.nextLine();
			if(xyz.length()>0)
			count++;
		}
		
	
		
		File file2=new File("C:\\Users\\parmar\\Downloads\\csx-351-hw3-AnujParmar09-master\\HW3-input-code.txt");  //reading code file
		Scanner sc2=new Scanner(file2);
		
		File file3=new File("C:\\Users\\parmar\\Desktop\\new.txt");  //reading keyword file
		Scanner sc3=new Scanner(file3);
		
		
		
		FileWriter fw=new FileWriter("C:\\Users\\parmar\\Desktop\\Output2.txt"); //creating output file
		
		

		int l=0,i=0;
		int f=0,temp;
		int q=0;
		String p="";
		String r="";
		String str="";
		
		sort_finding ob=new sort_finding();  
		//object creation of sort_finding class
		
		String keywords[]=new String[count];
		
		 while(sc3.hasNextLine())
	     {p=sc3.nextLine();
	     if(p.length()>0)
	     { keywords[q++]=p;}}      //making array of keywords
		 
		 
		 ob.sort(keywords,count);
		 
		 
		 while(sc2.hasNextLine())
		 { r=sc2.nextLine();                  //reading input code line by line
		 l++;
		 temp=0;
		 i=0;
		 int flag=0;
		 int len=r.length();
		 while(i<len)
		 {
			 
		 if((r.charAt(i)>=97 && r.charAt(i)<=122)||(r.charAt(i)>=48 && r.charAt(i)<=57)||(r.charAt(i)=='_'))  //checking for keyword

		   str=str+r.charAt(i); 
			  
		 
		 else if(r.charAt(i)=='/' && r.charAt(i+1)=='/')        //checking for comment
					 
					 
				 { if(ob.search(keywords,0,count-1,str)==1)                             
					{
					 temp++;
					 if(temp==1)
					 {
						 flag=1;
						 fw.write("Line "+l+": ");
					 }
						 fw.write(str+"("+r.indexOf(str)+") ");        //writing output file
			         f++;
			         }
		                str="";
		                break;
          
		           }
			      			      
			  else { 
		 
		              if(ob.search(keywords,0,count-1,str)==1)                             
		                { temp++;
			              if(temp==1)
			             {
				            flag=1;
				            fw.write("Line "+l+": ");
			             }
				            fw.write(str+"("+r.indexOf(str)+") ");        //writing output file
			                f++;
			            }
		                     str="";
				
		            }
			
		                  i++;
		         }
		                if(flag==1)
				     fw.write("\r\n");
		        }
		 
			
		 
		  
		 fw.write("No of Keywords found are : "+f);
		 
		 
		 
		 sc1.close();
		 sc2.close();
		 sc3.close();
		 fw.close();
		 System.out.println("FILE CREATED");
		 }	
	}

	






