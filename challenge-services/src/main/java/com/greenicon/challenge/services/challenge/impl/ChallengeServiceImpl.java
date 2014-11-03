package com.greenicon.challenge.services.challenge.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import antlr.collections.List;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;
import com.greenicon.challenge.services.challenge.ChallengeService;
import com.greenicon.challenge.services.common.constants.UserChallengeStateConstants;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.common.exceptions.InvalidInputException;
import com.greenicon.challenge.services.common.utils.Utils;

@Service
public class ChallengeServiceImpl implements ChallengeService{

	private static Logger logger = Logger.getLogger(ChallengeServiceImpl.class);

	@Resource
	RepositoryServiceProvider rsp;

	public Challenge getChallengeById(String challengeId)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().find(challengeId);
	}

	public Collection<Challenge> getChallengesByCategory(String category)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().findByCategory(category);
	}

	public Collection<Challenge> getChallengesByTag(String tag)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().findByTags(tag);
	}

	public Collection<Challenge> getChallengesByTags(Collection<String> tags)
			throws DataNotFoundException {
		ArrayList<Challenge> challengeList = null;
		challengeList = new ArrayList<Challenge>();
		for(String tag:tags){
			ArrayList<Challenge> challengesForTag = (ArrayList<Challenge>) rsp.getChallengeDbService().findByTags(tag);
			if(!Utils.isEmpty(challengesForTag)){
				challengeList.addAll(challengesForTag);
			}
			logger.info("getting challenges for tag : "+challengesForTag.size());
		}
		return challengeList;
	}

	public Collection<Challenge> getChallengesByLocation(String locationId)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().findByLocationId(locationId);
	}

	public Collection<Challenge> getTrendingChallenges()
			throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Challenge> getAcceptedChallengesForUser(String userId)
			throws DataNotFoundException {
		ArrayList<String> challengeIdList = (ArrayList<String>) rsp.getChallengeUserGangMapDbService().findByChallengeeIdAndState(userId, UserChallengeStateConstants.CHALLENGE_ACCEPTED);
		if(!Utils.isEmpty(challengeIdList)){
			return rsp.getChallengeDbService().findByIds(challengeIdList);
		}
		return null;
	}

	public Collection<Challenge> getAccomplishedChallengesForUser(String userId)
			throws DataNotFoundException {
		ArrayList<String> challengeIdList = (ArrayList<String>) rsp.getChallengeUserGangMapDbService().findByChallengeeIdAndState(userId, UserChallengeStateConstants.CHALLENGE_ACCOMPLISHED);
		if(!Utils.isEmpty(challengeIdList)){
			return rsp.getChallengeDbService().findByIds(challengeIdList);
		}
		return null;
	}

	public Collection<Challenge> getChallengesCreatedAfter(Timestamp timestamp)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().findByCreatedtsAfter(timestamp);
	}

	public Collection<Challenge> getChallengeWishlistForUser(String userId)
			throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Challenge> getChallengesForGang(String gangId)
			throws DataNotFoundException {
		ArrayList<String> challengeIdList = (ArrayList<String>) rsp.getChallengeUserGangMapDbService().findByChallengeeIdAndState(gangId, UserChallengeStateConstants.CHALLENGE_ACCOMPLISHED);
		if(!Utils.isEmpty(challengeIdList)){
			return rsp.getChallengeDbService().findByIds(challengeIdList);
		}
		return null;
	}

	public Collection<Challenge> getRelatedChallenges(String challengeId)
			throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addChallenge(Challenge challenge) throws InvalidInputException {
		rsp.getChallengeDbService().create(challenge);
	}

	public void updateChallenge(Challenge challenge)
			throws InvalidInputException {
		rsp.getChallengeDbService().update(challenge);
	}

	public void removeChallenge(String id) throws InvalidInputException {
		rsp.getChallengeDbService().delete(id);
	}

}
