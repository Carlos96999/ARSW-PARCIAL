package eci.arsw.covidanalyzer;

import java.io.File;
import java.util.List;

public class CovidThread extends Thread
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
		for(int i=0; i<resultFiles.size(); i++)
		{
			List<Result> data = testReader.readResultsFromFile(resultFiles.get(i));
			
			for(int j=0; j<data.size(); j++)
			{
				CovidAnalyzerTool.resultAnalyzer.addResult(data.get(i));
			}
			CovidAnalyzerTool.amountOfFilesProcessed.incrementAndGet();
		}
	}

}
