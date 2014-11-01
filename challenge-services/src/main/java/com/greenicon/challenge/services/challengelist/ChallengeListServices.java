package com.greenicon.challenge.services.challengelist;

import java.util.List;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.data.models.ChallengeList;
import com.greenicon.challenge.services.common.exceptions.ChallengeException;

public interface ChallengeListServices {
	
	void CreateChallengeList(ChallengeList challengeList) throws ChallengeException;
	void AddChallengeIdToChallengeList(String challengeId,String challengeListId)throws ChallengeException;
	void AddListOfChallengeIdsToChallengeList(List<String> challengeIdList,String challengeListId)throws ChallengeException;
	void AddChallengeToChallengeList(Challenge challenge,String challengeListId)throws ChallengeException;
	void AddListOfChallengesToChallengeList(List<Challenge> challengeList,String challengeListId)throws ChallengeException;
	void RomoveChallengeFromChallengeList(String challengeId,String challengeListId)throws ChallengeException;
	void DeleteChallengeList(String challengeListId)throws ChallengeException;
	ChallengeList getChallengeListById(String id)throws ChallengeException;
	List<ChallengeList> getAllChallengeListOfAUser(String UserId) throws ChallengeException;
	List<ChallengeList> getAllChallengeListByName(String name) throws ChallengeException;
	List<ChallengeList> getAllChallengeListOfAUserByName(String UserId,String name) throws ChallengeException;	
	
}
