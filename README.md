# MapReduce example

Basic MapReduce implementation for Hadoop data processing. Uses the input provided by
a text file and outputs the words found in that file with the ammount of times they
are repeated on the file.

I tested this implementation using the [Hortonworks Sandbox][1]
VirtualBox VM. If you decide to use it you can familiarize yourself with it using 
[this][2] tutorial. 

Follow the [wiki][3] created for this repository to learn more about Hadoop, MapReduce and working with the Hortonworks Sandbox. 

## Requirements

- Single node Hadoop setup   
- Apache Maven (3.3.9)

## Expected output

- Generate a jar file using `mvn package` in the project's root directory.
- Run the MapReduce job using `hadoop jar yourJarFile.jar [input file path]
 [output directory path]` For example:
```
hadoop jar /path/to/jar/file/test-1.0-SNAPSHOT.jar		\
/path/to/input/file/votecount-in.txt		\
/path/to/output/directory/      
```

Using the *votecount-in.txt* file as input, you should find a file with the 
following content in your output directory: 
```
one    1
same   1
second 3
third  2
winner 5
```

You can also use multiple input files, to do so simply add the path to the directory 
containing the input files and Haddop will take care of it in the end. Run:

```
hadoop jar /path/to/jar/file/test-1.0-SNAPSHOT.jar \
/path/to/input/directory/
/path/to/output/directory/
```

Using both the *votecount-in.txt* and the *additional-in.txt* files, you should find 
the following in your output directory:
```
four	4
one		1
same	1
second	3
third	2
two		2
winner	6
```
[1]:http://hortonworks.com/products/sandbox/
[2]:http://hortonworks.com/hadoop-tutorial/learning-the-ropes-of-the-hortonworks-sandbox/
[3]:https://github.com/mhernandeza/MapReduce-test/wiki

