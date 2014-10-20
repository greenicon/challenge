package com.greenicon.challenge.services.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.greenicon.challenge.services.common.constants.CommonConstants;

/**
 * 
 * @createdDate Oct 20, 2014
 */
public class ConfigurationManager {
	
	private static Logger logger = Logger.getLogger(ConfigurationManager.class);
	
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
	 * Gets Property Configured in {@link CommonConstants.DEFAULT_PROPERTY_FILE} file (default:config) as integer
	 * </strong>
	 * @param key
	 * @param defValue
	 * @return int
	 */
	public int getIntValue(String key, int defValue){
		return getIntValue(CommonConstants.DEFAULT_PROPERTY_FILE, key, defValue);
	}
	
	/**
	 * <strong>
	 * Gets Property Configured in File as Integer
	 * </strong>
	 * @param fileName
	 * @param key
	 * @param defValue
	 * @return int
	 */
	public int getIntValue(String fileName, String key, int defValue){
		if(logger.isDebugEnabled()){
			logger.debug("Getting value for property:"+key+"from file:"+fileName+" default value:"+defValue);
		}
		int value = 0;
		try {
			ResourceBundle bundle = getResourceBundle(fileName);
			value = Integer.parseInt(bundle.getString(key));
		} catch (Exception e) {
			logger.error("Error trying to getProperty "+key+" from file: "+fileName+". Returning default:"+defValue);
			value = defValue;
		}
		return value;
	}
	
	
}
