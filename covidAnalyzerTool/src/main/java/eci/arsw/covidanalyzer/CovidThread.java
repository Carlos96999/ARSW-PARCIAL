package eci.arsw.covidanalyzer;

import java.io.File;
import java.util.List;

public class CovidThread
{
	private List<File> resultFiles;
	private TestReader testReader;
	
	public CovidThread(List<File> subList)
	{
		resultFiles = subList;
		testReader = new TestReader();
	}
	
	public void run()
	{
		
	}

}
