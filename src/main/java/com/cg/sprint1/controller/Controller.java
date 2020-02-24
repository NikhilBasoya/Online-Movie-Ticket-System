package com.cg.sprint1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.sprint1.beans.*;
import com.cg.sprint1.dao.DataHandler;
import com.cg.sprint1.services.Theatre;

public class Controller {
	static List<Movie> listOfMovies = new ArrayList<Movie>() ;
	static List<Screen> listOfScreens= new ArrayList<Screen>(); 
	static List<Theatre> listOfTheatres= new ArrayList<Theatre>();
	
	public void control()
	{
		listOfMovies = DataHandler.getMovies();
		listOfScreens = DataHandler.getListOfScreens();
		listOfTheatres = DataHandler.getListOfTheatres(listOfMovies, listOfScreens);
		int loopController;
		Scanner scanner = new Scanner(System.in);
		do 
		{
		
			System.out.println("Press:\n\tPVR Cinemas\n\tCinepolis Cinemas\n\tINOX Cinemas");
			String theatreName = scanner .next();
		    for(Theatre theatre: listOfTheatres)
			{	
				if(theatre.getTheaterName().equals(theatreName))
				{
					System.out.println();
					System.out.println("Press:\n\t1 to search movie\n\t2 to search screen");
					int choice = scanner.nextInt();
					switch(choice)
					{
						case 1 :{
									System.out.println("Enter the name of movie : ");
									String movie = scanner.next();
									theatre.searchMovie(movie);
									break;
									
								}
									
						case 2 :{
									System.out.println("Enter the Screen"); 
									String screen = scanner.next();
									theatre.searchScreen(screen);
									break;
								}
						default : System.out.println("Invalid Option");
									break;
						
					}
					break;
					
				}
			}
			System.out.println("\n\nPress 1 to perform more or any other key to exit");
			loopController = scanner.nextInt();
		
		}while(loopController==1);
		scanner.close();
	}
}
