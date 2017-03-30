package jpl.beerchallenge.converter;

import javax.persistence.AttributeConverter;

import com.google.gson.Gson;

public class JSONConverter implements AttributeConverter<int[], String> {

	private Gson gson = new Gson();
	
	@Override
	public String convertToDatabaseColumn(int[] arg0) {
		return gson.toJson(arg0);
	}

	@Override
	public int[] convertToEntityAttribute(String arg0) {
		return gson.fromJson(arg0, int[].class); 
	}

}