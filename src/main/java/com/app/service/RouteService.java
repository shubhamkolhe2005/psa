package com.app.service;

import com.app.exceptions.LoginException;
import com.app.exceptions.RouteException;
import com.app.model.Route;

import java.util.List;

public interface RouteService {
	   public Route addRoute(Route route,String key)throws RouteException,LoginException;
	   public Route updateRoute(Route route,String key)throws RouteException,LoginException; 
	   public Route deleteRoute(int routeId,String key)throws RouteException,LoginException;
	   public Route viewRoute(int routeId)throws RouteException;
	   List<Route> viewAllRoute()throws RouteException;
}
