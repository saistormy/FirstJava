package myPackage;

public class Strings1 {

	public static void main(String[] args) {
		
		int price=100;
		String priceStr= String.valueOf(price);
		System.out.println(price);
		
		String s1="sai";
		String s2=("sai");
		
		
		String s3=new String("hello");
		String s4=new String ("hello");
		
		
		String str =" hello world      ghhh jdhfj             gh  ";
		System.out.println(s1==s2);
		System.out.println(str.length());
		System.out.println(str.indexOf('l'));
		System.out.println(str.toUpperCase());
		System.out.println(str.trim()+"ghhh");
		
		
		}

	}

