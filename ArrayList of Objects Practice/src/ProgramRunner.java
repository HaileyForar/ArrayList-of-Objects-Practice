import java.util.ArrayList;

public class ProgramRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Program> channelGuide = new ArrayList<Program>();
				
				channelGuide.add(new Program("Game of Thrones", 8, "Fantasy"));
				channelGuide.add(new Program("Shark Tank", 11 , "Business Reality"));
				channelGuide.add(new Program("Outlander", 4 , "Historical Fiction/Romance"));
				channelGuide.add(new Program("The Walking Dead", 10 , "Horror"));
				channelGuide.add(new Program("The Big Bank Theory", 12 , "Comedy"));
				
				
//				System.out.println(nursery.get(0).getName());
//				nursery.get(0).setGender("female");
//				System.out.println(nursery.get(0).getGender());
//				
//				for(Baby b : nursery)
//					{
//						System.out.println(b.getName());
//					}

			}


	}
