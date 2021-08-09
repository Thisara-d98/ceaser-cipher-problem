package packagecc

object Ceasar_cipher extends App{
  def Decrypt(){
  
	  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	
	  val inputText = scala.io.StdIn.readLine("Secret Message: ")

	  val outputText = inputText.map( (c: Char) => { 

	
		  val x = alphabet.indexOf(c.toUpper)

		  if (x == -1){
	  		c
		  }
		  else{
		    var v=x-shift;
		    if(v<0){
		      alphabet((x - shift) + alphabet.size)
		    }
		    else {
		    	alphabet((x - shift) % alphabet.size)
		    }
		
	    }});
	   println(outputText);

  }
  
  def Encrypt() {
    
	  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	  val inputText = scala.io.StdIn.readLine("Secret Message: ")

	  val outputText = inputText.map( (c: Char) => { 

		  val x = alphabet.indexOf(c.toUpper)

		  if (x == -1){
			  c
		  }
		  else{
		    	alphabet((x + shift) % alphabet.size)
		  } 
	  });
	  println(outputText);

  }
	
	  println("Enter 1.Encrypt 2.Decrypt");
	  var n=scala.io.StdIn.readInt();
	  if(n==1)
	    Encrypt();
	  else if(n==2)
	    Decrypt();
	
	   
}