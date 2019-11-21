
int anchox=40;
int anchoy=40;


void TocarClick(int px,int py){
  println("TocarClick   mouseX: "+px+" mouseY: "+py);
  
  int ttx=0;
  int tty=0;
  
  
  ///////ENVIAR
  if(py>900){
    EnviarEmail(emailtxt,timestamp);
    emailtxt="Escribe tu mail";
     pantalla=0;
    //cambio=1;
    frames=0;
    segundos=0;
  }
  
  
  
  ////////////TECLA
  ttx=61;
  tty=605;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: q");
    Limpiar();
    emailtxt=emailtxt+"q";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=62;
  tty=533;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 1");
    Limpiar();
    emailtxt=emailtxt+"1";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=125;
  tty=529;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 2");
    Limpiar();
    emailtxt=emailtxt+"2";
  }
  /////////////TECLA
  
 ////////////TECLA
  ttx=192;
  tty=530;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 3");
    Limpiar();
    emailtxt=emailtxt+"3";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=260;
  tty=530;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 4");
    Limpiar();
    emailtxt=emailtxt+"4";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=328;
  tty=531;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 5");
    Limpiar();
    emailtxt=emailtxt+"5";
  }
  /////////////TECLA
  
    ////////////TECLA
  ttx=390;
  tty=531;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 6");
    Limpiar();
    emailtxt=emailtxt+"6";
  }
  /////////////TECLA
  
      ////////////TECLA
  ttx=457;
  tty=530;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 7");
    Limpiar();
    emailtxt=emailtxt+"7";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=524;
  tty=531;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 8");
    Limpiar();
    emailtxt=emailtxt+"8";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=591;
  tty=530;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 9");
    Limpiar();
    emailtxt=emailtxt+"9";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=659;
  tty=533;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: 0");
    Limpiar();
    emailtxt=emailtxt+"0";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=126;
  tty=602;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: w");
    Limpiar();
    emailtxt=emailtxt+"w";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=190;
  tty=602;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: e");
    Limpiar();
    emailtxt=emailtxt+"e";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=258;
  tty=600;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: r");
    Limpiar();
    emailtxt=emailtxt+"r";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=325;
  tty=598;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: t");
    Limpiar();
    emailtxt=emailtxt+"t";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=391;
  tty=604;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: y");
    Limpiar();
    emailtxt=emailtxt+"y";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=457;
  tty=599;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: u");
    Limpiar();
    emailtxt=emailtxt+"u";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=524;
  tty=604;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: i");
    Limpiar();
    emailtxt=emailtxt+"i";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=590;
  tty=600;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: o");
    Limpiar();
    emailtxt=emailtxt+"o";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=657;
  tty=603;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: p");
    Limpiar();
    emailtxt=emailtxt+"p";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=59;
  tty=669;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: a");
    Limpiar();
    emailtxt=emailtxt+"a";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=124;
  tty=667;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: s");
    Limpiar();
    emailtxt=emailtxt+"s";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=191;
  tty=668;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: d");
    Limpiar();
    emailtxt=emailtxt+"d";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=259;
  tty=666;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: f");
    Limpiar();
    emailtxt=emailtxt+"f";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=325;
  tty=667;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: g");
    Limpiar();
    emailtxt=emailtxt+"g";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=392;
  tty=667;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: h");
    Limpiar();
    emailtxt=emailtxt+"h";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=457;
  tty=668;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: j");
    Limpiar();
    emailtxt=emailtxt+"j";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=523;
  tty=669;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: k");
    Limpiar();
    emailtxt=emailtxt+"k";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=590;
  tty=667;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: l");
    Limpiar();
    emailtxt=emailtxt+"l";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=656;
  tty=668;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: -");
    Limpiar();
    emailtxt=emailtxt+"-";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=656;
  tty=668;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: ");
    Limpiar();
    emailtxt=emailtxt+"-";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=190;
  tty=738;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: z");
    Limpiar();
    emailtxt=emailtxt+"z";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=259;
  tty=737;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: x");
    Limpiar();
    emailtxt=emailtxt+"x";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=325;
  tty=735;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: c");
    Limpiar();
    emailtxt=emailtxt+"c";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=392;
  tty=736;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: v");
    Limpiar();
    emailtxt=emailtxt+"v";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=458;
  tty=733;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: b");
    Limpiar();
    emailtxt=emailtxt+"b";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=524;
  tty=739;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: n");
    Limpiar();
    emailtxt=emailtxt+"n";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=590;
  tty=736;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: m");
    Limpiar();
    emailtxt=emailtxt+"m";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=656;
  tty=735;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: _");
    Limpiar();
    emailtxt=emailtxt+"_";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=65;
  tty=801;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @gmail.com");
    Limpiar();
    emailtxt=emailtxt+"@gmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=129;
  tty=801;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @gmail.com");
    Limpiar();
    emailtxt=emailtxt+"@gmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=202;
  tty=800;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @gmail.com");
    Limpiar();
    emailtxt=emailtxt+"@gmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=268;
  tty=802;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @yahoo.com");
    Limpiar();
    emailtxt=emailtxt+"@yahoo.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=328;
  tty=800;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @yahoo.com");
    Limpiar();
    emailtxt=emailtxt+"@yahoo.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=403;
  tty=803;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @yahoo.com");
    Limpiar();
    emailtxt=emailtxt+"@yahoo.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=470;
  tty=801;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @hotmail.com");
    Limpiar();
    emailtxt=emailtxt+"@hotmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=552;
  tty=800;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @hotmail.com");
    Limpiar();
    emailtxt=emailtxt+"@hotmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=647;
  tty=799;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @hotmail.com");
    Limpiar();
    emailtxt=emailtxt+"@hotmail.com";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=190;
  tty=867;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: ,");
    Limpiar();
    emailtxt=emailtxt+",";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=259;
  tty=866;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: @");
    Limpiar();
    emailtxt=emailtxt+"@";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=325;
  tty=871;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: .");
    Limpiar();
    emailtxt=emailtxt+".";
  }
  /////////////TECLA
  
  ////////////TECLA
  ttx=426;
  tty=865;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: .com");
    Limpiar();
    emailtxt=emailtxt+".com";
  }
  /////////////TECLA
  
   ////////////TECLA
  ttx=592;
  tty=869;
  if(px>=ttx-(anchox/2) && px<=ttx+(anchox/2) && py>=tty-(anchoy/2) && py<=tty+(anchoy/2) ){
    println("TECLA: back");
    Limpiar();
    if(emailtxt.length()>=1){
      emailtxt=emailtxt.substring(0,emailtxt.length()-1);
    }
    
  }
  /////////////TECLA
}

void Limpiar(){
  if(emailtxt.equals("Escribe tu mail")){
    emailtxt="";
  }
}

