
public class ArrayChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();

			}
		
		public static void challengeOne()
		{
			String[] iceCream = new String[5];
			iceCream[0] = "vanilla";
			iceCream[1] = "chocolate";
			iceCream[2] = "strawberry";
			iceCream[3] = "cookie dough";
			iceCream[4] = "pistachio";
			
			System.out.println(iceCream[2]);
		}
		
		public static void challengeTwo()
		{
			int numbers[ ] = new int[5];
				for(int i = 0; i < numbers.length; i++)
					{
						numbers[i] = i;
					}
				
			System.out.println(numbers[numbers.length-1]);

		}
		
		public static void challengeThree()
		{
			int numbers[ ] = new int[5];
			for(int i = 0; i < numbers.length; i++)
				{
					numbers[i] = i;
				}

			
			for(int i = 0; i<numbers.length; i++)
				{
					System.out.println(numbers[i]);
				}
		}
		
		public static void challengeFour()
		{
			double numbers[ ] = new double[10];
			for(int i = 0; i < numbers.length; i++)
				{
					numbers[i] = i;
				}
			
			double sum=0;
			for(int i = 0; i<numbers.length; i++)
				{
					sum = sum + numbers[i];
				}
			
			System.out.println(sum/numbers.length);
		}

	}
