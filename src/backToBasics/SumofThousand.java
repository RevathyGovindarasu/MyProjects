package backToBasics;

public class SumofThousand {

	public static void main(String[] args) {
		
		for(int a = 1; a<=1000;a++)
		{
			for(int b = 1; b<=1000;b++)
			{
				for(int c = 1; c<=1000;c++)
				{
					for(double d = 1; d<=1000;d++)
					{
						//if(d=Math.pow(((a*a*a)+(b*b*b)-(c*c*c)),1/3))
						{
						if((a*a*a)+(b*b*b) == (c*c*c)+(d*d*d))
						{
							System.out.println(a+ " " + b+ " "+ " "+ c+" "+ d);
							break;
						}
						}
					}
				}
			}
		}

	}

}
