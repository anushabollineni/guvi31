import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void count(String str)
	{
	 char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
            String s = "";
            while (i < ch.length && ch[i] != ' ') 
            {
                s = s + ch[i];
                i++;
            }
 
            if (s.length() > 0) 
                System.out.println(s + "->" + s.length());            
        }
    }
    public static void main(String[] args)
    {
        String str = "Laptop is Good";
        count(str);
    }
}	
