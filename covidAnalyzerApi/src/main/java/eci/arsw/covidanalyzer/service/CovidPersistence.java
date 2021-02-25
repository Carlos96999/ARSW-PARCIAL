package eci.arsw.covidanalyzer.service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;

@Service
public class CovidPersistence implements ICovidAggregateService
{
	private final List<Result> lista = new CopyOnWriteArrayList<>();

	public CovidPersistence()
	{
		Result data1 = new Result("Carlos", "01", ResultType.TRUE_POSITIVE);
		Result data2 = new Result("Andres", "02", ResultType.TRUE_NEGATIVE);
		Result data3 = new Result("Old", "03", ResultType.FALSE_POSITIVE);
		Result data4 = new Result("John", "04", ResultType.FALSE_NEGATIVE);
		lista.add(data1);
		lista.add(data2);
		lista.add(data3);
		lista.add(data4);
	}
	
	@Override
	public boolean aggregateResult(Result result, ResultType type) {
		boolean flag = false;
		for(int i=0; i<lista.size(); i++)
		{
			if(lista.get(i).getId() != result.getId())
			{
				flag = true;
			}
		}
		if(flag) lista.add(result);
		return flag;
	}

	@Override
	public List<Result> getResult(ResultType type) {
		List<Result> lista = new CopyOnWriteArrayList<>();
		System.out.println("Tamaño lista: "+lista.size());
		System.out.println("Tamaño lista 1 "+this.lista.size());
		
		for(int i = 0; i<this.lista.size(); i++)
		{
			System.out.println(this.lista.get(i).getName());
			if(this.lista.get(i).getResultType() == type)
			{
				lista.add(this.lista.get(i));
			}
		}
		System.out.println("Tamaño lista: "+lista.size());
		return lista;
	}

	@Override
	public void upsertPersonWithMultipleTests(UUID id, ResultType type) {
		// TODO Auto-generated method stub
		
	}
	
	
}
