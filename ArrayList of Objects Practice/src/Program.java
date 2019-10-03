
public class Program
	{
		
		private String title;
		private int numberOfSeasonsAired;
		private String genre;
		

		public Program(String t, int n, String g)
			{
				title = t;
				numberOfSeasonsAired = n;
				genre = g;
			}

		public String getTitle()
			{
				return title;
			}

		public void setTitle(String title)
			{
				this.title = title;
			}

		public double getNumberOfSeasonsAired()
			{
				return numberOfSeasonsAired;
			}

		public void setNumberOfSeasonsAired(int numberOfSeasonsAired)
			{
				this.numberOfSeasonsAired = numberOfSeasonsAired;
			}

		public String getGenre()
			{
				return genre;
			}

		public void setGenre(String genre)
			{
				this.genre = genre;
			}
		
		


	}
