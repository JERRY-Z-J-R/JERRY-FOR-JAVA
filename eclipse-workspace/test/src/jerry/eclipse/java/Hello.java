package jerry.eclipse.java;

public class Hello {
	public static void main(String[] args) {
		{
			String s1 = "string";
			String s2 = new String("string");
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		}
		
		System.out.println();
		
		{
			String s1 = "string";
			String s2 = "string";
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		}
		
		System.out.println();
		
		{
			String s1 = new String("string");
			String s2 = new String("string");
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		}
		
		System.out.println();
		
		{
			String s1 = "string";
			String s2 = "string";
			System.out.println(s1 == s2);
			s2 = "String";	//	or s2 += "zjr";
			System.out.println(s1 == s2);
		}
		
		System.out.println();
		
		{
			String s1 = "Hello";
			s1 += "World";
			System.out.println(s1);
			s1 = "string";
			s1 = new String("string");
			s1 = "hello";
			String s2 = "hello";
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
			String s3 = new String("string");
			s3 = "hello";
			System.out.println(s1 == s3);
			System.out.println(s1.equals(s3));
			System.out.println(s2 == s3);
			System.out.println(s2.equals(s3));
		}
		
		System.out.println();
		
		{
			String s1 = "Hello";
			String s2 = "World";
			String s3 = "HelloWorld";
			System.out.println(s3 == s1 + s2);
			System.out.println(s3 == s1 + "World");
			System.out.println(s3.equals(s1 + s2));
			System.out.println(s3 == "Hello" + "World");
			System.out.println(s3.equals("Hello" + "World"));
		}
		
		System.out.println();
		
		{
			String s1 = new String("Hello");
			String s2 = new String("World");
			String s3 = new String("HelloWorld");
			System.out.println(s3 == s1 + s2);
			System.out.println(s3 == s1 + "World");
			System.out.println(s3.equals(s1 + s2));
			System.out.println(s3 == "Hello" + "World");
			System.out.println(s3.equals("Hello" + "World"));
			s3 = "HelloWorld";
			System.out.println(s3 == "Hello" + "World");
			s3 = new String("HelloWorld");
			System.out.println(s3 == "Hello" + "World");
		}
		
		System.out.println();
		
		{
			String s1 = new String("String");
			String s2 = s1;
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
			s1 = new String("String");
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		}
		
	}

}
