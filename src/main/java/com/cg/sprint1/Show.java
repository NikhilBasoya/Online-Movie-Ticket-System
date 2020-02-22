package com.cg.sprint1;

import java.time.LocalTime;
import java.util.List;

public class Show {
	
	private int showId;
	private LocalTime showStartTime;
	private LocalTime showEndTime;
	private List<Integer> seats;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((seats == null) ? 0 : seats.hashCode());
		result = prime * result + ((showEndTime == null) ? 0 : showEndTime.hashCode());
		result = prime * result + showId;
		result = prime * result + ((showName == null) ? 0 : showName.hashCode());
		result = prime * result + ((showStartTime == null) ? 0 : showStartTime.hashCode());
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
		Show other = (Show) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		if (showEndTime == null) {
			if (other.showEndTime != null)
				return false;
		} else if (!showEndTime.equals(other.showEndTime))
			return false;
		if (showId != other.showId)
			return false;
		if (showName == null) {
			if (other.showName != null)
				return false;
		} else if (!showName.equals(other.showName))
			return false;
		if (showStartTime == null) {
			if (other.showStartTime != null)
				return false;
		} else if (!showStartTime.equals(other.showStartTime))
			return false;
		return true;
	}
	private String showName;
	private String movieName;
	
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public List<Integer> getSeats() {
		return seats;
	}
	public void setSeats(List<Integer> seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Show(int showId, LocalTime showStartTime, LocalTime showEndTime, List<Integer> seats, String showName,
			String movieName) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seats = seats;
		this.showName = showName;
		this.movieName = movieName;
	}
	
}