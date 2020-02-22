package com.cg.sprint1;

import java.time.LocalDate;
import java.util.List;

public class Screen {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columns;
		result = prime * result + ((movieEndDate == null) ? 0 : movieEndDate.hashCode());
		result = prime * result + rows;
		result = prime * result + screenId;
		result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
		result = prime * result + ((show == null) ? 0 : show.hashCode());
		result = prime * result + theatreId;
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
		Screen other = (Screen) obj;
		if (columns != other.columns)
			return false;
		if (movieEndDate == null) {
			if (other.movieEndDate != null)
				return false;
		} else if (!movieEndDate.equals(other.movieEndDate))
			return false;
		if (rows != other.rows)
			return false;
		if (screenId != other.screenId)
			return false;
		if (screenName == null) {
			if (other.screenName != null)
				return false;
		} else if (!screenName.equals(other.screenName))
			return false;
		if (show == null) {
			if (other.show != null)
				return false;
		} else if (!show.equals(other.show))
			return false;
		if (theatreId != other.theatreId)
			return false;
		return true;
	}

	private int screenId;
	private int theatreId;
	private String screenName;
	private LocalDate movieEndDate; 
	private List<Show> show;
	private int rows;
	private int columns;
	
	//parameterized constructor for Screen class
	public Screen(int screenId, int theatreId, String screenName, LocalDate movieEndDate,List<Show> show, int rows, int columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.movieEndDate = movieEndDate;
		this.show = show;
		this.rows = rows;
		this.columns = columns;
	}
	
	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public List<Show> getShow() {
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}

	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

}
