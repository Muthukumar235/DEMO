package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager PropFileReader;
	private static ConfigFileReader configFileReaderAdrenalin;

	  //Client cannot instantiate FileReaderManager class 
	  private FileReaderManager() {
	  
	  }
	 
	public static FileReaderManager getInstance() {
		PropFileReader = new FileReaderManager();
		return PropFileReader;
	}

	//To fetch the ConfigFileReader class using getConfigReader method
	public ConfigFileReader getConfigReader() {
		configFileReaderAdrenalin=new ConfigFileReader();
		return  configFileReaderAdrenalin;
	}
}