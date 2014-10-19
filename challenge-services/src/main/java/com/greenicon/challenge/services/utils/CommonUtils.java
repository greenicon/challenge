package com.greenicon.challenge.services.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.greenicon.challenge.services.constants.CommonConstants;

/**
 * 
 * Common Util Functions 
 * @createdDate Oct 19, 2014
 */
public class CommonUtils {

		private static Logger logger = Logger.getLogger(CommonUtils.class);
		
		private static Object rLock = new Object();
		private static HashMap<String, ResourceBundle> resourceBundleMap = new HashMap<String, ResourceBundle>();
		
		/**
		 * <strong>
		 * Gets Resource Bundle from cacheMap. Or loads and keeps in cacheMap
		 * </strong>
		 * @param fileName
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 */
		private static ResourceBundle getResourceBundle(String fileName) throws FileNotFoundException, IOException{
			logger.debug("Getting resource bundle for file:"+fileName);
			
			if(resourceBundleMap.containsKey(fileName)){
				return resourceBundleMap.get(fileName);
			}
			ResourceBundle resourceBundle = null;
			
			synchronized (rLock) {
				if(resourceBundleMap.containsKey(fileName)){
					return getResourceBundle(fileName);
				}
				resourceBundle = new PropertyResourceBundle(new FileInputStream(CommonConstants.CHALLENGE_CONF_PATH+File.separator+fileName+".properties"));
				resourceBundleMap.put(fileName, resourceBundle);
			}
			return resourceBundle;
		}
		
		/**
		 * <strong>
		 * Gets Property Configured in {@link CommonConstants.DEFAULT_PROPERTY_FILE} file (default:config)
		 * </strong>
		 * @param key
		 * @param defValue
		 * @return
		 */
		public String getValue(String key, String defValue){
			return getValue(CommonConstants.DEFAULT_PROPERTY_FILE, key, defValue);
		}
		
		/**
		 * <strong>
		 * Gets Property Configured in File
		 * </strong>
		 * @param fileName
		 * @param key
		 * @param defValue
		 * @return
		 */
		public String getValue(String fileName, String key, String defValue){
			if(logger.isDebugEnabled()){
				logger.debug("Getting value for property:"+key+"from file:"+fileName+" default value:"+defValue);
			}
			String value = null;
			try {
				ResourceBundle bundle = getResourceBundle(fileName);
				value = bundle.getString(key);
				
				if(value == null){
					value = defValue;
				}
			} catch (Exception e) {
				logger.error("Error trying to getProperty "+key+" from file: "+fileName+". Returning default:"+defValue);
				value = defValue;
			}
			return value;
		}
		
		
		/**
		 * <strong>
		 * Checks if String is null or empty
		 * </strong>
		 * @param str
		 * @return
		 */
		public static boolean isNullLength(String str){
			if(null == str || str.trim().length()<1){
				return true;
			}return false;	
		}
}
