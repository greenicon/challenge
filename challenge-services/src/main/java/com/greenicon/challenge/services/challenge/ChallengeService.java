package com.greenicon.challenge.services.challenge;

import java.util.Collection;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.services.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.exceptions.InvalidInputException;

public interface ChallengeService {

	/**
	 * 
	 * Returns the Challenge for the challengeId
	 * 
	 * @param challengeId
	 * @return Challenge
	 * @throws DataNotFoundException 
	 */
	Challenge getChallengeById(String challengeId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges for the particular category
	 * 
	 * @param category
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengesByCategory(String category) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges for the particular tag
	 * 
	 * @param tag
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengesByTag(String tag) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges for all the tags present in the collection 'tags'
	 * 
	 * @param tags
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengesByTags(Collection<String> tags) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of challenges by the locationId
	 * 
	 * @param challengeId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengesByLocation(String locationId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are trending currently
	 * Calculated by the number of upvotes, likes, challenge takes and all
	 * 
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getTrendingChallenges() throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are accepted by the user and not yet accomplished
	 * 
	 * @param userId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getAcceptedChallengesForUser(String userId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are accepted and accomplished by the user
	 * 
	 * @param userId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getAccomplishedChallengesForUser(String userId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are in the whish-list for the user
	 * 
	 * @param userId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengeWishlistForUser(String userId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are accepted by the gang
	 * 
	 * @param gangId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getChallengesForGang(String gangId) throws DataNotFoundException;
	/**
	 * 
	 * Returns a collection of Challenges which are related to the given challenge
	 * Relationship can be similar category, sub-category, tags etc
	 * 
	 * @param challengeId
	 * @return
	 * @throws DataNotFoundException
	 */
	Collection<Challenge> getRelatedChallenges(String challengeId) throws DataNotFoundException;	

	void addChallenge(Challenge challenge) throws InvalidInputException;
	void updateChallenge(Challenge challenge) throws InvalidInputException;
	void removeChallenge(String id) throws InvalidInputException;

}
