/**
 * 
 */
package com.greenicon.challenge.services.common.constants;

/**
 *
 *	States for the challenger for user
 *	These values will be mapped against the column 'state' in table 'challenge_user__gang_map'
 *
 */
public interface UserChallengeStateConstants {
	
	final String CHALLENGED = "1";
	final String CHALLENGE_ACCEPTED = "2";
	final String CHALLENGE_ACCOMPLISHED = "3";
	final String CHALLENGE_DECLINED = "0";
}
