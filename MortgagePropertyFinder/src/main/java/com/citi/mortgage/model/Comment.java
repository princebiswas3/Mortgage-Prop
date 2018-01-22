package com.citi.mortgage.model;

public class Comment {
private String comment;
private String commentBy;
private boolean verified;
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
@Override
public String toString() {
	return "Comment [comment=" + comment + ", commentBy=" + commentBy + ", verified=" + verified + "]";
}
public String getCommentBy() {
	return commentBy;
}
public void setCommentBy(String commentBy) {
	this.commentBy = commentBy;
}
public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
}
