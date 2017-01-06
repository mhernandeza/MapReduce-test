package com.base22;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by margaritahernandez on 1/6/17.
 */

public class VoteCountMapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable( 1 );
	private Text candidate = new Text();

	public void map( Object key, Text value, Context context ) throws IOException, InterruptedException {
		StringTokenizer words = new StringTokenizer( value.toString() );
		while ( words.hasMoreTokens() ) {
			candidate.set( words.nextToken() );
			context.write( candidate, one );
		}
	}

}
