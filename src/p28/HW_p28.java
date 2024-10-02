package p28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HW_p28 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入一個整數:");
		
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		
		String s1=b1.readLine();
		
		int num=Integer.parseInt(s1);
		
		System.out.println("您輸入的數字是:"+num);
		
		System.out.println("請輸入字串");
		
		BufferedReader b2=new BufferedReader(new InputStreamReader(System.in));
		
		String s2=b2.readLine();
		
		System.out.println("您輸入的字串是:"+s2);
	}

}
