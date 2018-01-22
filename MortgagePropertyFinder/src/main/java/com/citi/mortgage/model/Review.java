package com.citi.mortgage.model;

import java.util.List;

public class Review {

	private List<Comment> comments;
    private List<Rating> ratings;
   
	@Override
	public String toString() {
		return "Review [comments=" + comments + ", ratings=" + ratings + "]";
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
