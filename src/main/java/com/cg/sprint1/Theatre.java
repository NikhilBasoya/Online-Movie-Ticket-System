package com.cg.sprint1;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private int theaterId;

	private String theaterName;
	private String theaterCity;
	private List<Movie> movies;
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;

	// Parameterized constructor for Theatre class
	public Theatre(int theaterId, String theaterName, String theaterCity, List<Movie> movies,
			List<Screen> listOfScreens, String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	/*
	 * searchMovie(String) method is used to search for a movie in a particular
	 * theater.If the user requested movie is present in that theater then the
	 * details of the movie will be shown to the user. It returns a movie type
	 * object
	 */
	public Movie searchMovie(String movieName) {
		for (Movie m : movies) {
			if (m.getMovieName().equals(movieName)) {
				System.out.println("Movie ID         :   " + m.getMovieId());
				System.out.println("Movie Name       :   " + m.getMovieName());
				System.out.println("Movie Duration   :   " + m.getMovieLength());
				System.out.print("Languages        :   ");
				for (String l : m.getLanguages())
					System.out.print(l + "  ");
				System.out.println();
				System.out.println("Release Date     :   " + m.getMovieReleaseDate());
				return m;
			}
		}
		System.out.println("Movie not available");
		return null;
	}

	/*
	 * This method is used to search for a screen in a particular theater. If the
	 * requested screen is present in the theater then the details of the screen
	 * will be shown. It returns a Screen Type object
	 */
	public Screen searchScreen(String screenName) {
		for (Screen s : listOfScreens) {
			if (s.getScreenName().equals(screenName)) {
				System.out.println("Screen ID         : " + s.getScreenId());
				System.out.println("Screen Name       : " + s.getScreenName());
				System.out.println("Theatre ID        : " + s.getTheatreId());
				System.out.println("Movie Ends on     : " + s.getMovieEndDate());
				System.out.println("Rows x Columns    : " + s.getRows() + "x" + s.getColumns());
				for (Show show : s.getShow())
					System.out.println("ShowID : " + show.getShowId() + "\t" + "ShowName : " + show.getShowName());
				return s;
			}
		}
		System.out.println("Screen not available");
		return null;
	}

}
