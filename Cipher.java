import java.util.*;

public class Cipher{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int j=0;
		String s;
		int count=0;
		int a[]=new int[26];
		int decry[]=new int[50];
		for(int i=65;i<91;i++){
			//i=j;
			a[j]=i;			
			//System.out.println((char)i+"="+j);
			j++;
		}
		System.out.println("Enter key number:");
		int k=sc.nextInt();
		System.out.println("Enter a message");
		String m=sc.next();
		System.out.println("Encryption of Given message is:");
		for(int i=0;i<m.length();i++){
			int x=m.charAt(i);
			for(int temp=0;temp<26;temp++){
				if(a[temp]==x){
					int ans=(temp+k)%26;
					System.out.print((char)a[ans]);
					decry[count]=ans;
					count++;
					break;
				}
			}
		}
		count=0;
		System.out.println();
		System.out.println("Again Enter key for Decryption purpose:");
		int k1=sc.nextInt();
		if(k1==k){
			System.out.println("Decryption message is:");
			for(count=0;count<m.length();count++){
				int ans1=(decry[count]-k)%26;
				if(ans1<0){
				    int ans2=26+ans1;
				    System.out.print((char)a[ans2]);
				}
				else{
				System.out.print((char)a[ans1]);}
			}
		}
		else{
			System.out.println("Encrption key and Decryption are different");
		}
		
	}
}