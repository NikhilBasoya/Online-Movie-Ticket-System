package com.cg.sprint1.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.cg.sprint1.*;

import org.junit.Test;

public class TheatreTest {
	@Test
	public void searchMovietest() 
	{

		List<Movie> listOfMovies = new ArrayList<Movie>();
		List<Screen> listOfScreens = new ArrayList<Screen>();
		List<Theatre> listOfTheatres = new ArrayList<Theatre>();
		listOfMovies = DataHandler.getMovies();
		listOfScreens = DataHandler.getListOfScreens();
		listOfTheatres = DataHandler.getListOfTheatres(listOfMovies, listOfScreens);

		Theatre t = listOfTheatres.get(0);

		assertEquals(listOfMovies.get(0), t.searchMovie("Chhichhore"));
	}
	
	@Test
	public void searchScreentest()
	{
		List<Movie> listOfMovies = new ArrayList<Movie>();
		List<Screen> listOfScreens = new ArrayList<Screen>();
		List<Theatre> listOfTheatres = new ArrayList<Theatre>();
		listOfMovies = DataHandler.getMovies();
		listOfScreens = DataHandler.getListOfScreens();
		listOfTheatres = DataHandler.getListOfTheatres(listOfMovies, listOfScreens);

		Theatre t = listOfTheatres.get(0);
		
		assertEquals(listOfScreens.get(0), t.searchScreen("Screen1"));

	}
	
	
	

}
