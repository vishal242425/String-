package com.supreme;

public class Demo {

	public static void main(String[] args) {
		String str1 = "Hellow";
		String str2 = new String ("Hellow");
		String str3 = str2.intern();
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str3.hashCode());
		System.out.println(str3.equals(str1));
		
		
	}

}
