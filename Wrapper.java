class Wrapper{
	public static void main (String [] args){
		String number ="20";
		int num=Integer.parseInt(number);
		System.out.println(number+10);//string 20+10//
		System.out.println(num+10);//converted to int//
		
		String no ="78";
		byte n=Byte.parseByte(no);
		System.out.println("String to bye"+"\t"+n);
		
		
		String st ="Ashta";
		short s=Short.parseShort(st);
		System.out.println("String to short"+"\t"+s);
		
			
		
		String lo ="67";
		long l=Long.parseLong(lo);
		System.out.println("String to Long"+"\t"+l);
		
		String a ="89";
		float f=Float.parseFloat(a);
		System.out.println("String to float"+"\t"+f);
		
		String b ="9098";
		double d=Double.parseDouble(b);
		System.out.println("String to double"+"\t"+d);
		
		
		String c ="67";
		boolean g=Boolean.parseBoolean(c);
		System.out.println("String to boolean"+"\t"+g);
		
		
		String h ="ga";
		for(int index=0;index<h.length();index++)
		{
		char R=h.charAt(index);
		System.out.println("String to char"+"\t"+R);
		}
		}
}
		
		