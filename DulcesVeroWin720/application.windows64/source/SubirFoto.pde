//webcam_3823309
String timestamp="";


void ObtenerTimestamp() {
  timestamp = "webcam_"+str(month())+str(day())+str(hour())+str(minute())+str(second());
}

void TomarSelfie(){
  println("TomarSelfie");
  ObtenerTimestamp();
  //EnviarDato("Foto");
  save("C:/dulcesvero/selfie/selfie.jpg");
  save("C:/dulcesvero/lasselfiees/"+timestamp+".jpg");
  lastselfie = loadImage("C:/dulcesvero/selfie/selfie.jpg");
  SubirSelfie(timestamp);
}


String[] cmd_selfie =  {"WScript.exe","C:\\dulcesvero\\subir_selfie.vbs","Toca la pantalla para comenzar","0"};


void SubirSelfie(String str){
  println("-SubirSelfie: "+str);
  cmd_selfie[2] = str;
  EjecutarComandoSelfie();
  AvisaRemotoFoto(str);
}


void EjecutarComandoSelfie(){
  try {
      Process p = Runtime.getRuntime().exec(cmd_selfie);
      p.waitFor();
      //p.start();
      float error = p.exitValue();
      //println(p.exitValue());
  } catch (InterruptedException e) {
      e.printStackTrace();
      println(e);
  } catch (IOException e) {
      e.printStackTrace();
      println(e);
  }
}


//#wget -q -i "http://thetimelapse.info/json/thetimelapse_alta_foto.php?id=1&carpeta=lugar-uno&archivo=$DATES" --output-document salida/url-$DATES.txt
//http://thetimelapse.info/json/thetimelapse_alta_foto.php?id=1&carpeta=lugar-uno&archivo=17082019_120337_40&data=0,26.4,23.9,22.9,0,34.43,343.34,23,34,65,87,78,23

void AvisaRemotoFoto(String str){
  println("AvisaRemotoFoto ");
  println("http://dulcesvero.xyz/alta_foto.php?foto="+str);
  
  String[] lines = loadStrings("http://dulcesvero.xyz/alta_foto.php?foto="+str);
  println("ASVISO REMOTO are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) {
    //println(lines[i]);
  }
  
}

