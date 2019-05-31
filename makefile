clean:
	find */src/ -type f -name "*.class" -delete

build15:
	javac ./ProgrammingToAnInterfaceExample/src/*.java
	java ProgrammingToAnInterfaceExample.src.Computer