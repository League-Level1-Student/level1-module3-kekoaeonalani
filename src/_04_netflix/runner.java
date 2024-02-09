package _04_netflix;

public class runner {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie("Home Alone", 5);
		Movie movie2 = new Movie("Red Dawn", 4);
		Movie movie3 = new Movie("Sunshine", 3);
		Movie movie4 = new Movie("Cruella", 3);
		Movie movie5 = new Movie("A Christmas Carol", 5);
		
		NetflixQueue queue = new NetflixQueue();
		
		 String price1 = movie1.getTicketPrice();
		 String price2 = movie2.getTicketPrice();
		 String price3 = movie3.getTicketPrice();
		 String price4 = movie4.getTicketPrice();
		 String price5 = movie5.getTicketPrice();

		 queue.addMovie(movie1);
		 queue.addMovie(movie2);
		 queue.addMovie(movie3);
		 queue.addMovie(movie4);
		 queue.addMovie(movie5);

		  




	}
	
	
	

}
