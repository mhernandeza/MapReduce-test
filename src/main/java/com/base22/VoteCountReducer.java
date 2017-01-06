package com.base22;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by margaritahernandez on 1/6/17.
 */

public class VoteCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	private IntWritable result = new IntWritable();

	public void reduce( Text key, Iterable<IntWritable> values, Context context ) throws IOException, InterruptedException {
		int count = 0;

		for ( IntWritable value : values ) {
			count += value.get();
		}
		result.set( count );
		context.write( key, result );
	}
}
