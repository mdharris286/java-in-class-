package main;
public class Movie {
	String title;
	String director;
	String genre;
	int rating;
	Movie(String title, String director, String genre, int rating)
	{
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.rating = rating;
	}
	void displayDetails()
	{
		System.out.println("Title: "+title);
		System.out.println("Director: "+director);
		System.out.println("Genre: "+genre);
		System.out.println("Rating: "+rating);
	}
	void updateRating(int rating)
	{
		this.rating = rating;
	}
}
