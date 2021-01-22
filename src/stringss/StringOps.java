package stringss;

public class StringOps {

	public static void main(String[] args) {
		
		String str = "Success";
		//StringBuilder sbr = new StringBuilder(str);
		StringBuffer sbu = new StringBuffer(str);
		sbu.reverse();
		System.out.println(sbu);

	}

}
