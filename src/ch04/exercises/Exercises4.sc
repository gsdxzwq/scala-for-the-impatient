import java.io.File
import java.util.Scanner

//4.1
val equipment = Map("sward"->10.0, "shoes"-> 8.0)
for((k,v)<-equipment) yield (k, v*0.9)

//4.10
"Hello".zip("World")