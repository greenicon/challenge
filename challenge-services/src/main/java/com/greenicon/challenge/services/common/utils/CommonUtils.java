package com.greenicon.challenge.services.common.utils;

import org.apache.log4j.Logger;

/**
 * 
 * Common Util Functions 
 * @createdDate Oct 19, 2014
 */
public class CommonUtils {

		private static Logger logger = Logger.getLogger(CommonUtils.class);
		
		/**
		 * <strong>
		 * Checks if String is null or empty
		 * </strong>
		 * @param str
		 * @return
		 */
		public static boolean isEmptyString(String str){
			if(null == str || str.trim().length()<1){
				return true;
			}
			return false;	
		}
}
