package com.greenicon.challenge.data.repositories.services.provider;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.repositories.services.CategoryCategorychallengeMapDbService;
import com.greenicon.challenge.data.repositories.services.CategoryDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeDataDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeGroupMapDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeListPropDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeListDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeListUserGangMapDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeDbService;
import com.greenicon.challenge.data.repositories.services.ChallengeUserGangMapDbService;
import com.greenicon.challenge.data.repositories.services.FriendsMapDbService;
import com.greenicon.challenge.data.repositories.services.GangDbService;
import com.greenicon.challenge.data.repositories.services.GangUserMapDbService;
import com.greenicon.challenge.data.repositories.services.LocationDbService;
import com.greenicon.challenge.data.repositories.services.MediaDbService;
import com.greenicon.challenge.data.repositories.services.UserDataDbService;
import com.greenicon.challenge.data.repositories.services.UserLoginDbService;
import com.greenicon.challenge.data.repositories.services.UserDbService;

@Service
public class RepositoryServiceProvider {

	@Resource
	CategoryCategorychallengeMapDbService categoryCategorychallengeMapService;
	
	@Resource
	CategoryDbService categoryService;
	
	@Resource
	ChallengeDataDbService challengeDataService;
	
	@Resource
	ChallengeGroupMapDbService challengeGroupMapService;
	
	@Resource
	ChallengeListPropDbService challengeListPropService;
	
	@Resource
	ChallengeListDbService challengeListService;
	
	@Resource
	ChallengeListUserGangMapDbService challengeListUserGangMapService;
	
	@Resource
	ChallengeDbService challengeService;

	@Resource
	ChallengeUserGangMapDbService challengeUserGangMapService;
	
	@Resource
	FriendsMapDbService friendsMapService;
	
	@Resource
	GangDbService gangService;
	
	@Resource
	GangUserMapDbService gangUserMapService;
	
	@Resource
	LocationDbService locationService;
	
	@Resource
	MediaDbService mediaService;
	
	@Resource
	UserDataDbService userDataService;
	
	@Resource
	UserLoginDbService userLoginService;
	
	@Resource
	UserDbService userService;
	
	public CategoryDbService getCategoryService() {
		return categoryService;
	}

	public CategoryCategorychallengeMapDbService getCategoryCategorychallengeMapService() {
		return categoryCategorychallengeMapService;
	}

	public ChallengeDataDbService getChallengeDataService() {
		return challengeDataService;
	}

	public ChallengeGroupMapDbService getChallengeGroupMapService() {
		return challengeGroupMapService;
	}

	public ChallengeListPropDbService getChallengeListPropService() {
		return challengeListPropService;
	}

	public ChallengeListDbService getChallengeListService() {
		return challengeListService;
	}

	public ChallengeListUserGangMapDbService getChallengeListUserGangMapService() {
		return challengeListUserGangMapService;
	}

	public ChallengeDbService getChallengeService() {
		return challengeService;
	}

	public ChallengeUserGangMapDbService getChallengeUserGangMapService() {
		return challengeUserGangMapService;
	}

	public FriendsMapDbService getFriendsMapService() {
		return friendsMapService;
	}

	public GangDbService getGangService() {
		return gangService;
	}

	public GangUserMapDbService getGangUserMapService() {
		return gangUserMapService;
	}

	public LocationDbService getLocationService() {
		return locationService;
	}

	public MediaDbService getMediaService() {
		return mediaService;
	}

	public UserDataDbService getUserDataService() {
		return userDataService;
	}

	public UserLoginDbService getUserLoginService() {
		return userLoginService;
	}

	public UserDbService getUserService() {
		return userService;
	}
}
