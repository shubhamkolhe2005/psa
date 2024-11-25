package com.app.service;

import com.app.exceptions.LoginException;
import com.app.exceptions.feedbackException;
import com.app.model.Feedback;

import java.util.List;

public interface FeedBackService {
   public Feedback	addFeedBack(Feedback feedback,Integer busId,String key)throws feedbackException,LoginException ; 
   public Feedback	updateFeedBack(Feedback feedback,String key)throws feedbackException,LoginException; 
   public Feedback	viewFeedBack(int feedbackld)throws feedbackException; 
   public List<Feedback> viewAllFeedBack()throws feedbackException;
}
