
public class Netflix {
	
	public static void main(String[] args) {
		//1. Instantiate some Movie objects (at least 5).
		Movie m1 = new Movie("Moana", 4);
		Movie m2 = new Movie("You Again", 3);
		Movie m3 = new Movie("Bad Moms", 3);
		Movie m4 = new Movie("Step Up 3D", 3);
		Movie m5 = new Movie("The Boss Baby", 3);
		//2. Use the Movie class to get the ticket price of one of your movies.
		m1.getTicketPrice();
		//3. Instantiate a NetflixQueue.
		NetflixQueue nq1 = new NetflixQueue();
		//4. Add your movies to the Netflix queue.
		nq1.addMovie(m1);
		nq1.addMovie(m2);
		nq1.addMovie(m3);
		nq1.addMovie(m4);
		nq1.addMovie(m5);
		//5. Print all the movies in your queue.
		nq1.printMovies();
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		System.out.println("the best movie is ..." + nq1.getBestMovie());
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...."
		System.out.println("the second best movie is..." + nq1.getMovie(3));
		
	}

}
