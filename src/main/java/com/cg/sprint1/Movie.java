package com.cg.sprint1;

import java.time.LocalDate;
import java.util.Arrays;

public class Movie {
	int movieId;
	
	private String movieName;
	private String movieDirector;
	private int movieLength;
	private String[] languages; 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(languages);
		result = prime * result + ((movieDirector == null) ? 0 : movieDirector.hashCode());
		result = prime * result + movieId;
		result = prime * result + movieLength;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((movieReleaseDate == null) ? 0 : movieReleaseDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (!Arrays.equals(languages, other.languages))
			return false;
		if (movieDirector == null) {
			if (other.movieDirector != null)
				return false;
		} else if (!movieDirector.equals(other.movieDirector))
			return false;
		if (movieId != other.movieId)
			return false;
		if (movieLength != other.movieLength)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (movieReleaseDate == null) {
			if (other.movieReleaseDate != null)
				return false;
		} else if (!movieReleaseDate.equals(other.movieReleaseDate))
			return false;
		return true;
	}

	private LocalDate movieReleaseDate;

	//parameterized constructor for Movie class
	public Movie(int movieId, String movieName, String movieDirector, int movieLength, String[] languages,
			LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	
}
