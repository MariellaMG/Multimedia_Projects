void EnviarEmail(String str, String foto){
  println("EnviarEmail ");
  println("http://dulcesvero.xyz/msg/mensaje.php?email="+str+"&foto="+foto);
  
  String[] lines = loadStrings("http://dulcesvero.xyz/msg/mensaje.php?email="+str+"&foto="+foto);
  println("ASVISO REMOTO are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) {
    //println(lines[i]);
  }
  
}

