package eci.arsw.covidanalyzer.model;
import eci.arsw.covidanalyzer.model.ResultType;

public class Result 
{
	private String name;
	private String id;
	private ResultType resultType;
	
	public Result(String name, String id, ResultType resultType)
	{
		this.name = name;
		this.id = id;
		this.resultType = resultType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ResultType getResultType() {
		return resultType;
	}

	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}
}
