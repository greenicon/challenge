package com.greenicon.challenge.data.repositories.services.provider;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.repositories.services.CategoryCategorychallengeMapService;
import com.greenicon.challenge.data.repositories.services.CategoryService;
import com.greenicon.challenge.data.repositories.services.ChallengeDataService;
import com.greenicon.challenge.data.repositories.services.ChallengeGroupMapService;
import com.greenicon.challenge.data.repositories.services.ChallengeListPropService;
import com.greenicon.challenge.data.repositories.services.ChallengeListService;
import com.greenicon.challenge.data.repositories.services.ChallengeListUserGangMapService;
import com.greenicon.challenge.data.repositories.services.ChallengeService;
import com.greenicon.challenge.data.repositories.services.ChallengeUserGangMapService;
import com.greenicon.challenge.data.repositories.services.FriendsMapService;
import com.greenicon.challenge.data.repositories.services.GangService;
import com.greenicon.challenge.data.repositories.services.GangUserMapService;
import com.greenicon.challenge.data.repositories.services.LocationService;
import com.greenicon.challenge.data.repositories.services.MediaService;
import com.greenicon.challenge.data.repositories.services.UserDataService;
import com.greenicon.challenge.data.repositories.services.UserLoginService;
import com.greenicon.challenge.data.repositories.services.UserService;

@Service
public class RepositoryServiceProvider {

	@Resource
	CategoryCategorychallengeMapService categoryCategorychallengeMapService;
	
	@Resource
	CategoryService categoryService;
	
	@Resource
	ChallengeDataService challengeDataService;
	
	@Resource
	ChallengeGroupMapService challengeGroupMapService;
	
	@Resource
	ChallengeListPropService challengeListPropService;
	
	@Resource
	ChallengeListService challengeListService;
	
	@Resource
	ChallengeListUserGangMapService challengeListUserGangMapService;
	
	@Resource
	ChallengeService challengeService;

	@Resource
	ChallengeUserGangMapService challengeUserGangMapService;
	
	@Resource
	FriendsMapService friendsMapService;
	
	@Resource
	GangService gangService;
	
	@Resource
	GangUserMapService gangUserMapService;
	
	@Resource
	LocationService locationService;
	
	@Resource
	MediaService mediaService;
	
	@Resource
	UserDataService userDataService;
	
	@Resource
	UserLoginService userLoginService;
	
	@Resource
	UserService userService;
	
	public CategoryService getCategoryService() {
		return categoryService;
	}

	public CategoryCategorychallengeMapService getCategoryCategorychallengeMapService() {
		return categoryCategorychallengeMapService;
	}

	public ChallengeDataService getChallengeDataService() {
		return challengeDataService;
	}

	public ChallengeGroupMapService getChallengeGroupMapService() {
		return challengeGroupMapService;
	}

	public ChallengeListPropService getChallengeListPropService() {
		return challengeListPropService;
	}

	public ChallengeListService getChallengeListService() {
		return challengeListService;
	}

	public ChallengeListUserGangMapService getChallengeListUserGangMapService() {
		return challengeListUserGangMapService;
	}

	public ChallengeService getChallengeService() {
		return challengeService;
	}

	public ChallengeUserGangMapService getChallengeUserGangMapService() {
		return challengeUserGangMapService;
	}

	public FriendsMapService getFriendsMapService() {
		return friendsMapService;
	}

	public GangService getGangService() {
		return gangService;
	}

	public GangUserMapService getGangUserMapService() {
		return gangUserMapService;
	}

	public LocationService getLocationService() {
		return locationService;
	}

	public MediaService getMediaService() {
		return mediaService;
	}

	public UserDataService getUserDataService() {
		return userDataService;
	}

	public UserLoginService getUserLoginService() {
		return userLoginService;
	}

	public UserService getUserService() {
		return userService;
	}
}
