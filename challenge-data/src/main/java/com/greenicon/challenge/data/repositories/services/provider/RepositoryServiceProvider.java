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
	CategoryCategorychallengeMapDbService categoryCategorychallengeMapDbService;
	
	@Resource
	CategoryDbService categoryDbService;
	
	@Resource
	ChallengeDataDbService challengeDataDbService;
	
	@Resource
	ChallengeGroupMapDbService challengeGroupMapDbService;
	
	@Resource
	ChallengeListPropDbService challengeListPropDbService;
	
	@Resource
	ChallengeListDbService challengeListService;
	
	@Resource
	ChallengeListUserGangMapDbService challengeListUserGangMapDbService;
	
	@Resource
	ChallengeDbService challengeDbService;

	@Resource
	ChallengeUserGangMapDbService challengeUserGangMapDbService;
	
	@Resource
	FriendsMapDbService friendsMapDbService;
	
	@Resource
	GangDbService gangDbService;
	
	@Resource
	GangUserMapDbService gangUserMapDbService;
	
	@Resource
	LocationDbService locationDbService;
	
	@Resource
	MediaDbService mediaDbService;
	
	@Resource
	UserDataDbService userDataDbService;
	
	@Resource
	UserLoginDbService userLoginDbService;
	
	@Resource
	UserDbService userDbService;

	public CategoryCategorychallengeMapDbService getCategoryCategorychallengeMapDbService() {
		return categoryCategorychallengeMapDbService;
	}

	public CategoryDbService getCategoryDbService() {
		return categoryDbService;
	}

	public ChallengeDataDbService getChallengeDataDbService() {
		return challengeDataDbService;
	}

	public ChallengeGroupMapDbService getChallengeGroupMapDbService() {
		return challengeGroupMapDbService;
	}

	public ChallengeListPropDbService getChallengeListPropDbService() {
		return challengeListPropDbService;
	}

	public ChallengeListDbService getChallengeListService() {
		return challengeListService;
	}

	public ChallengeListUserGangMapDbService getChallengeListUserGangMapDbService() {
		return challengeListUserGangMapDbService;
	}

	public ChallengeDbService getChallengeDbService() {
		return challengeDbService;
	}

	public ChallengeUserGangMapDbService getChallengeUserGangMapDbService() {
		return challengeUserGangMapDbService;
	}

	public FriendsMapDbService getFriendsMapDbService() {
		return friendsMapDbService;
	}

	public GangDbService getGangDbService() {
		return gangDbService;
	}

	public GangUserMapDbService getGangUserMapDbService() {
		return gangUserMapDbService;
	}

	public LocationDbService getLocationDbService() {
		return locationDbService;
	}

	public MediaDbService getMediaDbService() {
		return mediaDbService;
	}

	public UserDataDbService getUserDataDbService() {
		return userDataDbService;
	}

	public UserLoginDbService getUserLoginDbService() {
		return userLoginDbService;
	}

	public UserDbService getUserDbService() {
		return userDbService;
	}
}
