# MapReduce example

Basic MapReduce implementation for Hadoop data processing. 

I tested this implementation using the[Hortonworks Sandbox][1]
VirtualBox VM. You can familiarize yourself with it using [this][2] tutorial.

Follow the Wiki created for this repository to learn more about Hadoop, MapReduce and working with the Hortonworks Sandbox. 

## Requirements

- Single node Hadoop setup   
- Apache Maven (3.3.9)

## Expected output

- Generate a jar file using `mvn package` in the project's root directory.
- To run the MapReduce job use `hadoop jar yourJarFile.jar [input file path]
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

[1]:http://hortonworks.com/products/sandbox/
[2]:http://hortonworks.com/hadoop-tutorial/learning-the-ropes-of-the-hortonworks-sandbox/
