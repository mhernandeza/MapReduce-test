# MapReduce example

Basic MapReduce implementation for Hadoop data processing. I tested this 
implementation using the[Hortonworks Sandbox](http://hortonworks.com/products/sandbox/)
VirtualBox VM. You can connect to it through **ssh** and it lets you manage your files 
via the command line and a dashboard accessible from any browser through 
*http://127.0.0.1:8080/* implemented using Ambari. You can familiarize yourself with 
it using [this](http://hortonworks.com/hadoop-tutorial/learning-the-ropes-of-the-hortonworks-sandbox/)
tutorial.

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
/path/to/input/file/		\
votecount-in.txt /path/to/output/directory/      
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