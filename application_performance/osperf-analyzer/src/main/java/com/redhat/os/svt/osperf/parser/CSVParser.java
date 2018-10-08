package com.redhat.os.svt.osperf.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSVParser {
	
	public Iterable<CSVRecord> parse(String pathToFile) throws FileNotFoundException, IOException{
		Reader in = new FileReader(pathToFile);
		return CSVFormat.DEFAULT.withHeader().parse(in);
	}
}