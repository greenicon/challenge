package com.greenicon.challenge.services.challenge.impl;

import java.sql.Timestamp;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;
import com.greenicon.challenge.services.challenge.ChallengeService;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.common.exceptions.InvalidInputException;

@Service
public class ChallengeServiceImpl implements ChallengeService{

	@Resource
	RepositoryServiceProvider rsp;
	
	public Challenge getChallengeById(String challengeId)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().find(challengeId);
	}

	public Collection<Challenge> getChallengesByCategory(String category)
			throws DataNotFoundException {
		return rsp.getChallengeDbService().findByByCategory(category);
	}

	public Collection<Challenge> getChallengesByTag(String tag)
			throws DataNotFoundException {
		return null;//	TODO
	}

	public Collection<Challenge> getChallengesByTags(Collection<String> tags)
			throws DataNotFoundException {
		return null;//	TODO
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
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Challenge> getAccomplishedChallengesForUser(String userId)
			throws DataNotFoundException {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
