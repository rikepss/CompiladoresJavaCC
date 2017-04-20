start /WAIT "" "java" -cp C:\javacc-6.0\bin\lib\javacc.jar javacc LALG.jj
start "" "javac" *.java
pause