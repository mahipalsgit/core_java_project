package BANKING;

import java.util.Random;
public class Otp 
{
	public static int otpGenerator()
	{
		String str="0123456789";
		int length=4;
		char[] ch=new char[length];
		Random r=new Random();
		for(int i=0;i<ch.length;i++)
		{
			int index=r.nextInt(str.length());
			ch[i]=str.charAt(index);
		}
		String s=new String(ch);
		int otp=Integer.parseInt(s);
		
		return otp;
	}
	

}