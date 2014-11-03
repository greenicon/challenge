package com.greenicon.challenge.services.common.utils;

import java.util.Collection;


/**
 * 
 * Common Util Functions 
 * @createdDate Oct 19, 2014
 */
public class Utils {

		//private static Logger logger = Logger.getLogger(CommonUtils.class);
		
		/**
		 * <strong>
		 * Checks if String is null or empty
		 * </strong>
		 * @param str
		 * @return
		 */
		public static boolean isEmpty(String str){
			if(str == null || str.trim().length()<1){
				return true;
			}
			return false;	
		}
		
		/**
		 * 
		 * Checks if a collection is null or empty
		 * 
		 * @param collection
		 * @return
		 */
		public static boolean isEmpty(Collection collection){
			if(collection == null || collection.isEmpty()){
				return true;
			}
			return false;
		}
}
