package com.greenicon.challenge.services.challengelist;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeList;

public interface ChallengeListServices {
	
	void CreateChallengeList(ChallengeList challengeList) throws Exception;
	void AddChallengeToChallengeList(String challengeId,String challengeListId)throws Exception;
	void RomoveChallengeFromChallengeList(String challengeId,String challengeListId)throws Exception;
	void DeleteChallengeList(String challengeListId)throws Exception;
	ChallengeList getChallengeListById(String id)throws Exception;
	List<ChallengeList> getAllChallengeListOfAUser(String UserId) throws Exception;
	List<ChallengeList> getAllChallengeListByName(String name) throws Exception;
	List<ChallengeList> getAllChallengeListOfAUserByName(String UserId,String name) throws Exception;	
	
}
