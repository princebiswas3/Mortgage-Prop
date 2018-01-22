package com.citi.mortgage.model;

public class Rating {
private int ratings;
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}
private String ratedBy;
public String getRatedBy() {
	return ratedBy;
}
public void setRatedBy(String ratedBy) {
	this.ratedBy = ratedBy;
}
@Override
public String toString() {
	return "Rating [ratings=" + ratings + ", ratedBy=" + ratedBy + "]";
}
}
