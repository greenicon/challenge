package com.greenicon.challenge.services.challengelist.impl;

import java.util.List;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.data.models.ChallengeList;
import com.greenicon.challenge.services.challengelist.ChallengeListServices;
import com.greenicon.challenge.services.common.exceptions.ChallengeException;

public class ChallengeListServiceImpl implements ChallengeListServices{

	@Override
	public void CreateChallengeList(ChallengeList challengeList)
			throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddChallengeIdToChallengeList(String challengeId,
			String challengeListId) throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddListOfChallengeIdsToChallengeList(
			List<String> challengeIdList, String challengeListId)
			throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddChallengeToChallengeList(Challenge challenge,
			String challengeListId) throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddListOfChallengesToChallengeList(
			List<Challenge> challengeList, String challengeListId)
			throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RomoveChallengeFromChallengeList(String challengeId,
			String challengeListId) throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteChallengeList(String challengeListId)
			throws ChallengeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChallengeList getChallengeListById(String id)
			throws ChallengeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChallengeList> getAllChallengeListOfAUser(String UserId)
			throws ChallengeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChallengeList> getAllChallengeListByName(String name)
			throws ChallengeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChallengeList> getAllChallengeListOfAUserByName(String UserId,
			String name) throws ChallengeException {
		// TODO Auto-generated method stub
		return null;
	}

}
