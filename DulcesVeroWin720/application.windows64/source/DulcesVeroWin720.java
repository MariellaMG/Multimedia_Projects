import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.awt.*; 
import java.awt.Rectangle; 
import java.util.*; 
import java.awt.Color; 
import java.awt.Dimension; 
import java.awt.Graphics; 
import java.awt.Rectangle; 
import java.awt.GraphicsDevice; 
import java.awt.GraphicsEnvironment; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent; 
import java.awt.event.KeyEvent; 
import javax.swing.AbstractAction; 
import javax.swing.BorderFactory; 
import javax.swing.JComponent; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.KeyStroke; 
import ddf.minim.*; 
import processing.video.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class DulcesVeroWin720 extends PApplet {

//import gab.opencv.*;
//import processing.video.*;

///////


///////////////////////////


















AudioPlayer player;
Minim minim;//audio context



int W, H, PX, PY;

PImage fondo;

int pantalla=0;

PImage pantalla1;
PImage pantalla2;
PImage pantalla3;
PImage pantalla4;
PImage pantalla5;

PImage sonrie;
PImage ponte;

PFont font;
PFont font1;


PImage apagados;
PImage catrina_prendida;
PImage agus_prendida;
PImage momia_prendida;
PImage nahual_prendida;
PImage yola_prendida;

PImage boton;

PImage lastselfie;
PImage marco;

PImage teclado;

PImage logo;

String emailtxt="Escribe tu mail";

public void CorrerAudio(String audio) {

  minim.stop();
  //player.close();

  player = minim.loadFile(audio, 2048);
  player.play();
}


public void PararAudio()
{
  player.close();
  minim.stop();
  //super.stop();
}



public void setup() {
  size(720, 1280);
  frameRate(18);

  minim = new Minim(this);

  SetCamara();

  //smooth(2);


  //////////////
  W=720;
  H=1280;
  PX=0;
  PY=0;



  fondo = loadImage("fondo.jpg");
  pantalla1 = loadImage("pantalla1.jpg");
  pantalla2 = loadImage("pantalla2.jpg");
  pantalla3 = loadImage("pantalla3.jpg");
  pantalla4 = loadImage("pantalla4.jpg");
  pantalla5 = loadImage("pantalla5.jpg");

  sonrie = loadImage("sonrie.png");
  ponte = loadImage("ponte.png");

  momia = loadImage("p_momia.png");

  apagados = loadImage("apagados720.jpg");
  catrina_prendida = loadImage("catrina_prendida.png");
  agus_prendida = loadImage("agus_prendido.png");
  momia_prendida = loadImage("momia_prendida.png");
  nahual_prendida = loadImage("nahual_prendida.png");
  yola_prendida = loadImage("yola_prendida.png");
  
  marco = loadImage("marco.png");
  
  teclado = loadImage("teclado.jpg");

  boton=loadImage("boton.png");
  
  logo=loadImage("logo.png");

  font = createFont("AvenirNextCondensed-DemiBold-200.vlw", 100);
  textFont(font);
  //text("word", 10, 50);


  font1 = createFont("Verdana-15.vlw", 15);


  CargarMomia();

  CargarCatrina();

  CargarNahual();

  CargarLlorona();

  CargarAgus();
}






public void init() {
  frame.removeNotify(); 
  // comment this out to turn OS chrome back on
  frame.setUndecorated(true); 
  // comment this out to not have the window "float"
  //frame.setAlwaysOnTop(true); 
  frame.setResizable(false);  
  //frame.addNotify();
  frame.setVisible(true);
  //final GraphicsDevice device = frame.getGraphicsConfiguration().getDevice();
  //device.setFullScreenWindow(frame);
  super.init();
}

int desface_p6=0;

public void mouseReleased() {

  int cambio=0;

  if (pantalla==0 && cambio==0) {
    pantalla=1;
    cambio=1;
    frames=0;
    segundos=0;
    
  }
  
  
  if(pantalla==7 && cambio==0){
    pantalla=0;
    cambio=1;
    frames=0;
    segundos=0;
  }
  
  if (pantalla==8) {
      //println("mouseX: "+mouseX+" mouseY: "+mouseY);
      TocarClick(mouseX,mouseY);
  }
  
  
   if (pantalla==6) {
      println("pantalla 6 --- mouseX: "+mouseX+" mouseY: "+mouseY);
      //if (mouseX>51 && mouseX <318 && mouseY >767-desface_p6 && mouseY < 845-desface_p6) {
      if (mouseX>51 && mouseX <318 && mouseY >500 && mouseY < 1000) {
        //////MAIL
         pantalla=8;
        frames=0;
        segundos=0;
      }
      if (mouseX>404 && mouseX <633 && mouseY >500 && mouseY < 1000 ) {
        ///////TEXTO
        pantalla=7;
        frames=0;
        segundos=0;
      }
   }

  if (pantalla==1 && cambio==0) {
    println("mouseX: "+mouseX+" mouseY: "+mouseY);

    //catrina
    //mouseX: 51 mouseY: 280
    //mouseX: 233 mouseY: 483
    int catrina_cambio=0;
    if (mouseX>51 && mouseX <233 && mouseY >280 && mouseY < 483 && seleccionados<4) {
      if (catrina_seleccionada==0 && seleccionados<3 && catrina_cambio==0) {
        catrina_cambio=1;
        catrina_seleccionada=1;

        CorrerAudio("cata.mp3");

        //seleccionados++;
        seleccionados++;
        if (seleccionados>=3) {
          seleccionados=3;
        }
      }

      if (catrina_seleccionada==1 && catrina_cambio==0) {
        catrina_seleccionada=0;
        seleccionados--;
        if (seleccionados<=0) {
          seleccionados=0;
        }
      }
    }

    ////ANGUS
    int agus_cambio=0;
    if (mouseX>272 && mouseX <461 && mouseY >284 && mouseY < 474 && seleccionados<4) {
      if (agus_seleccionada==0 && seleccionados<3 && agus_cambio==0) {
        agus_cambio=1;
        agus_seleccionada=1;

        CorrerAudio("agus.mp3");

        //seleccionados++;
        seleccionados++;
        if (seleccionados>=3) {
          seleccionados=3;
        }
      }
      if (agus_seleccionada==1 && agus_cambio==0) {
        agus_cambio=1;
        agus_seleccionada=0;
        seleccionados--;
        if (seleccionados<=0) {
          seleccionados=0;
        }
      }
    }


    //MOMIA
    int momia_cambio = 0;
    if (mouseX>390 && mouseX <575 && mouseY >551 && mouseY < 724 && seleccionados<4) {
      if (momia_seleccionada==0 && seleccionados<3 && momia_cambio==0) {
        momia_cambio=1;

        CorrerAudio("momia.mp3");

        momia_seleccionada=1;
        seleccionados++;
        if (seleccionados>=3) {
          seleccionados=3;
        }
      }
      if (momia_seleccionada==1 && momia_cambio==0) {
        momia_seleccionada=0;
        seleccionados--;
        if (seleccionados<=0) {
          seleccionados=0;
        }
      }
    }

    //NAHUAL
    int nahual_cambio=0;
    if (mouseX>155 && mouseX <315 && mouseY >561 && mouseY < 704 && seleccionados<4) {
      if (nahual_seleccionada==0 && seleccionados<3 && nahual_cambio==0) {
        nahual_seleccionada=1;
        nahual_cambio=1;

        CorrerAudio("nahual.mp3");

        // seleccionados++;
        seleccionados++;
        if (seleccionados>=3) {
          seleccionados=3;
        }
      }
      if (nahual_seleccionada==1 && nahual_cambio==0) {
        nahual_seleccionada=0;
        seleccionados--;
        if (seleccionados<=0) {
          seleccionados=0;
        }
      }
    }


    //yola
    int yola_cambio=0;
    if (mouseX>499 && mouseX <665 && mouseY >304 && mouseY < 458 && seleccionados<4) {
      if (yola_seleccionada==0 && seleccionados<3 && yola_cambio==0) {
        yola_seleccionada=1;
        yola_cambio=1;

        CorrerAudio("yola.mp3");

        // seleccionados++;
        seleccionados++;
        if (seleccionados>=3) {
          seleccionados=3;
        }
      }
      if (yola_seleccionada==1 && yola_cambio==0) {
        yola_seleccionada=0;
        seleccionados--;
        if (seleccionados<=0) {
          seleccionados=0;
        }
      }
    }

    ////SELECCIONAR
    if (mouseX>67 && mouseX <310 && mouseY >816 && mouseY < 887 && seleccionados>0) {
      pantalla=2;
      frames=0;
      segundos=0;
      PararAudio();
    } 

    ////REINICIAR
    if (mouseX>406 && mouseX < 645 && mouseY > 813 && mouseY < 884) {
      ReiniciarSeleccion();
      PararAudio();
    }
  }
}


int frames=0;
int segundos=0;

int seleccionados=0;
int catrina_seleccionada=0;
int agus_seleccionada=0;
int momia_seleccionada=0;
int nahual_seleccionada=0;
int yola_seleccionada;

int foto_tomada=0;


public void ReiniciarSeleccion() {
  seleccionados=0;
  catrina_seleccionada=0;
  agus_seleccionada=0;
  momia_seleccionada=0;
  nahual_seleccionada=0;
  yola_seleccionada=0;
  /////////////
  num_nahual=0;
  num_catrina=0;
  num_llorona=0;
  num_momia=0;
  num_agus=0;
  foto_tomada=0;
}


public void draw() {

  frames++;
  if (frames>frameRate) {
    frames=0;
    segundos++;
    if (pantalla==2 && segundos>=5) {
    }
  }

  //scale(2);
  if (frameCount==5) {
    frame.resize(W, H);
    frame.setLocation(PX, PY);

    //noCursor();
    //frame.repaint();
    //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //GraphicsDevice myDevice;
  }

  background(0);
  //scale(0.5);

  image(fondo, 0, 0);

  if(pantalla!=8){
    drawCamara();
  }
  
  

  if (pantalla==0) {
    image(pantalla1,0, 0, W, H);
  }


  if (pantalla>=3) {
    //image(momia,0,0,1080,1920);

    if (pantalla==3 && segundos<3) {
    }
    else {
      //pintar personajes
      if (momia_seleccionada==1) {
        PintarMomia();
      }
      if (catrina_seleccionada==1) {
        PintarCatrina();
      }
      if (nahual_seleccionada==1) {
        PintarNahual();
      }
      if (yola_seleccionada==1) {
        PintarLlorona();
      }
      if (agus_seleccionada==1) {
        PintarAgus();
      }
    }
  }


  if (pantalla==1) {
    image(apagados, 0, 0, W, H);

    if (catrina_seleccionada==1) {
      image(catrina_prendida, 0, 0, W, H);
    }
    if (agus_seleccionada==1) {
      image(agus_prendida, 0, 0, W, H);
    }
    if (momia_seleccionada==1) {
      image(momia_prendida, 0, 0, W, H);
    }
    if (nahual_seleccionada==1) {
      image(nahual_prendida, 0, 0, W, H);
    }
    if (yola_seleccionada==1) {
      image(yola_prendida, 0, 0, W, H);
    }


    fill(255);
    textFont(font);
    textSize(30);
    textAlign(CENTER, CENTER);
    text(seleccionados+"/3", W/2, (H/2) - 400 );
  }

  if (pantalla==2) {
    image(pantalla2, 0, 0, 720, 1280); 
    if (segundos>=5) {
      segundos=0;
      pantalla=3;
      IniciarMomiaAnim();
    }
  }

  //////PANTALLA 3 ponte
  if (pantalla==3) {
    // image(pantalla3,0,0,1080,1920);

    if (segundos<3) {
      image(ponte, 35, 400, 650, 500);
    }

    if (segundos>=9) {
      segundos=0;
      pantalla=4;
    }
  }



  ///////////////////PANTALLA 4 sonrrie
  if (pantalla==4) {
    //image(pantalla4,0,0,1080,1920); 

    if (segundos>=2) {
      //image(sonrie,120,900,800,600);
      image(sonrie, 35, 600, 650, 500);
    }



    fill(255);
    textFont(font);
    textSize(300);
    textAlign(CENTER, CENTER);
    
    if(3-segundos!=0){
       text(3-segundos, W/2, (H/2)-200);
    }
   




    if (segundos>=3) {
      pantalla=5;
      segundos=0;
    }
  }


  if (pantalla==5) {

    if (foto_tomada==0 && frames>=2) {
      //TOMAR SELFIE
      
      foto_tomada=1;
      TomarSelfie();
    }

    if (segundos>=4) {


      pantalla=6;
      segundos=0;
      ReiniciarSeleccion();
    }
  }
  
  
  if(pantalla==6){
    image(pantalla5,0,-(desface_p6),W,H);
    //145   582
    // 143  695
    image(lastselfie,145,343-desface_p6,582-145,695-143);
    /////
    image(marco,136,330-desface_p6,593-136,894-315);
  }
  
  if(pantalla==7){
    ////////////////URL
    fill(255);
    textFont(font);
    textSize(40);
    
    textAlign(CENTER, CENTER);
    fill(0);
    text("http://dulcesvero.xyz", W/2, (H/2)-200);
    
    fill(255);
    text("http://dulcesvero.xyz", W/2-4, (H/2)-200-3);
    
     
    
    ///360    116 ////
    image(boton,(W/2)-(360/2),(H/2)+400,360,116);
    textSize(62);
    text("REINICIAR", (W/2), (H/2)+400+40+5);
    
    
    image(logo,W/2-(360/2),100);
    
  }
  
  if(pantalla==8){
    /////////////////EMAIL
    fill(255);
    textFont(font);
    
    textSize(40);
    
    textAlign(CENTER, CENTER);
    fill(0);
    text(emailtxt, W/2, (H/2)-400);
    fill(255);
    text(emailtxt, (W/2)-3, (H/2)-400-3);
    
    image(teclado,0,(H/2)-200,W,487); 
    
    
    ///360    116 ////
    image(boton,(W/2)-(360/2),(H/2)+400,360,116);
    textSize(62);
    fill(2);
    text("ENVIAR", (W/2), (H/2)+400+40+5);
    fill(255);
    text("ENVIAR", (W/2), (H/2)+400+40+5);
    
    
    
    
  }
  
  

  


  ////////
  //image(pantalla4,0,0,1080,1920); 





  /*
    textFont(font1);
   textSize(12);
   text(frameRate, 30, 80);
   
   textSize(12);
   text("segundos: "+segundos,30,120);
   
   
   textSize(12);
   text("pantalla: "+pantalla,30,150);
   
   
   textSize(12);
   text("seleccionados: "+seleccionados,30,180);
   */

  textSize(17);
  fill(0);
}


public void stop()
{
  player.close();
  minim.stop();
  super.stop();
}


Capture cam1;



public void SetCamara(){
  
  String[] cameras = Capture.list();

  if (cameras == null) {
    println("Failed to retrieve the list of available cameras, will try the default...");
    cam1 = new Capture(this, 640, 480);
  } if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(i+" "+cameras[i]);
    }
    
    cam1 = new Capture(this, cameras[3]);
    cam1.start();
  }
  
  textSize(50);
}


int pas=0;



public void drawCamara() {
  
  
    if (cam1.available() == true) {
      cam1.read();
    }
  
    
    pushMatrix();
    rotate(radians(90));
    fill(0);  
    rect(0, 0, 50, 50);  // Black rectangle
    scale(1,-1);
    translate(0,720);
    image(cam1,0,-720,1280,720);
    popMatrix();

  //image(cam1,0,0);
  
  
}





public void EnviarEmail(String str, String foto){
  println("EnviarEmail ");
  println("http://dulcesvero.xyz/msg/mensaje.php?email="+str+"&foto="+foto);
  
  String[] lines = loadStrings("http://dulcesvero.xyz/msg/mensaje.php?email="+str+"&foto="+foto);
  println("ASVISO REMOTO are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) {
    //println(lines[i]);
  }
  
}


PImage nahual;
PImage[] nahuals = new PImage[430];
int num_nahual=0;
int min_nahual=0;
int tot_nahual=135;//135
int medio_nahual=90;

public void CargarNahual() {

  num_nahual=min_nahual;
  for (int i=min_nahual; i<=tot_nahual; i++) {
    String salida="";
    if (i<10) {
      salida = "00"+str(i);
    }
    if (i>=10 && i<=99) {
      salida = "0"+str(i);
    }
    if (i>99) {
      salida = str(i);
    }
    println("LOAD: "+"nahual720corto/nahual_"+salida);
    nahuals[i] = loadImage("nahual720corto/nahual_"+salida+".png");
  }
}

public void PintarNahual() {
  num_nahual+=1;
  if (num_nahual>=medio_nahual) {
    //num_nahual=min_nahual; ///LOOP
    num_nahual=medio_nahual-1;
  }

  image(nahuals[num_nahual], 200, 400, 720*0.8f, 1280*0.8f);
  
  //image(nahuals[num_nahual],100,100,720*0.95,1280*0.95);
}

public void PintarNahualSalida() {
  num_nahual+=1;
  if (num_nahual>=tot_nahual-1) {
    //num_nahual=min_nahual; ///LOOP
    num_nahual=tot_nahual-1;
  }

  image(nahuals[num_nahual], 200, 400, 720*0.8f, 1280*0.8f);
}


public void IniciarNahualAnim() {
  num_nahual=min_nahual;
}



PImage agus;
PImage[] aguss = new PImage[430];
int num_agus=0;
int min_agus=0;
int tot_agus=55;//42
int medio_agus=55;

public void CargarAgus(){
  println("CargarAgus");
  num_agus=min_agus;
  for(int i=min_agus;i<=tot_agus;i++){
      String salida="";
      if(i<10){
        salida = "00"+str(i);
      }
      if(i>=10 && i<=99){
        salida = "0"+str(i);
      }
      if(i>99){
        salida = str(i);
      }
      println("LOAD: "+"alebrije/agus_"+salida);
      aguss[i] = loadImage("alebrije/alebrije_"+salida+".png");
   }
}

public void PintarAgus(){
    num_agus+=1;
    if(num_agus>=medio_agus){
      //num_agus=min_agus; ///LOOP
      num_agus=medio_agus-1;
    }
    
   image(aguss[num_agus],0,100,720*1,1280*1);
       
   //image(catrinas[num_agus],100,100,720*0.95,1280*0.95);
   
}

public void PintarAgusSalida(){
    num_agus+=1;
    if(num_agus>=tot_agus-1){
      //num_agus=min_agus; ///LOOP
      num_agus=tot_agus-1;
    }
    
     image(aguss[num_agus],0,100,720*1,1280*1);
    
}


public void IniciarAgusAnim(){
  num_agus=min_agus;
}

PImage catrina;
PImage[] catrinas = new PImage[430];
int num_catrina=0;
int min_catrina=0;
int tot_catrina=97;//167
int medio_catrina=96;

public void CargarCatrina(){
  
  num_catrina=min_catrina;
  for(int i=min_catrina;i<=tot_catrina;i++){
      String salida="";
      if(i<10){
        salida = "00"+str(i);
      }
      if(i>=10 && i<=99){
        salida = "0"+str(i);
      }
      if(i>99){
        salida = str(i);
      }
      println("LOAD: "+"catrina720corto/catrina_"+salida);
      catrinas[i] = loadImage("catrina720corto/catrina_"+salida+".png");
   }  
}

public void PintarCatrina(){
    num_catrina+=1;
    if(num_catrina>=medio_catrina){
      //num_catrina=min_catrina; ///LOOP
      num_catrina=medio_catrina-1;
    }
    
   image(catrinas[num_catrina],170,250,720*0.8f,1280*0.8f);
       
   //image(catrinas[num_catrina],100,100,720*0.95,1280*0.95);
   
}

public void PintarCatrinaSalida(){
    num_catrina+=1;
    if(num_catrina>=tot_catrina-1){
      //num_catrina=min_catrina; ///LOOP
      num_catrina=tot_catrina-1;
    }
    
    image(catrinas[num_catrina],170,250,720*0.8f,1280*0.8f);
    
}


public void IniciarCatrinaAnim(){
  num_catrina=min_catrina;
}


PImage llorona;
PImage[] lloronas = new PImage[430];
int num_llorona=0;
int min_llorona=0;
int tot_llorona=70;//107
int medio_llorona=66;

public void CargarLlorona(){
  num_llorona=min_llorona;
  for(int i=min_llorona;i<=tot_llorona;i++){
      String salida="";
      if(i<10){
        salida = "00"+str(i);
      }
      if(i>=10 && i<=99){
        salida = "0"+str(i);
      }
      if(i>99){
        salida = str(i);
      }
      println("LOAD: "+"llorona720corto/llorona_"+salida);
      lloronas[i] = loadImage("llorona720corto/llorona_"+salida+".png");
   }
}

public void PintarLlorona(){
    num_llorona+=1;
    if(num_llorona>=medio_llorona){
      //num_llorona=min_llorona; ///LOOP
      num_llorona=medio_llorona-1;
    }
    
   image(lloronas[num_llorona],-20,200,720*0.9f,1280*0.9f);
       
   //image(catrinas[num_llorona],100,100,720*0.95,1280*0.95);
   
}

public void PintarLloronaSalida(){
    num_llorona+=1;
    if(num_llorona>=tot_llorona-1){
      //num_llorona=min_llorona; ///LOOP
      num_llorona=tot_llorona-1;
    }
    
   image(lloronas[num_llorona],-20,200,720*0.9f,1280*0.9f);
    
}


public void IniciarLloronaAnim(){
  num_llorona=min_llorona;
}


PImage momia;
PImage[] momias = new PImage[430];
int num_momia=0;
int min_momia=0;
int tot_momia=68;///107
int medio_momia=66;

public void CargarMomia(){
  num_momia=min_momia;
  for(int i=min_momia;i<=tot_momia;i++){
      String salida="";
      if(i<10){
        salida = "00"+str(i);
      }
      if(i>=10 && i<=99){
        salida = "0"+str(i);
      }
      if(i>99){
        salida = str(i);
      }
      println("LOAD: "+"momia720corto/momia_"+salida);
      momias[i] = loadImage("momia720corto/momia_"+salida+".png");
   }
}

public void PintarMomia(){
    num_momia+=1;
    if(num_momia>=medio_momia){
      //num_momia=min_momia; ///LOOP
      num_momia=medio_momia-1;
    }
    
   image(momias[num_momia],-80,0,720*1,1280*1);
       
   //image(catrinas[num_momia],100,100,720*0.95,1280*0.95);
   
}

public void PintarMomiaSalida(){
    num_momia+=1;
    if(num_momia>=tot_momia-1){
      //num_momia=min_momia; ///LOOP
      num_momia=tot_momia-1;
    }
    
     image(momias[num_momia],-80,0,720*1,1280*1);
    
}


public void IniciarMomiaAnim(){
  num_momia=min_momia;
}
//webcam_3823309
String timestamp="";


public void ObtenerTimestamp() {
  timestamp = "webcam_"+str(month())+str(day())+str(hour())+str(minute())+str(second());
}

public void TomarSelfie(){
  println("TomarSelfie");
  ObtenerTimestamp();
  //EnviarDato("Foto");
  save("C:/dulcesvero/selfie/selfie.jpg");
  save("C:/dulcesvero/lasselfiees/"+timestamp+".jpg");
  lastselfie = loadImage("C:/dulcesvero/selfie/selfie.jpg");
  SubirSelfie(timestamp);
}


String[] cmd_selfie =  {"WScript.exe","C:\\dulcesvero\\subir_selfie.vbs","Toca la pantalla para comenzar","0"};


public void SubirSelfie(String str){
  println("-SubirSelfie: "+str);
  cmd_selfie[2] = str;
  EjecutarComandoSelfie();
  AvisaRemotoFoto(str);
}


public void EjecutarComandoSelfie(){
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

public void AvisaRemotoFoto(String str){
  println("AvisaRemotoFoto ");
  println("http://dulcesvero.xyz/alta_foto.php?foto="+str);
  
  String[] lines = loadStrings("http://dulcesvero.xyz/alta_foto.php?foto="+str);
  println("ASVISO REMOTO are " + lines.length + " lines");
  for (int i = 0 ; i < lines.length; i++) {
    //println(lines[i]);
  }
  
}


int anchox=40;
int anchoy=40;


public void TocarClick(int px,int py){
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

public void Limpiar(){
  if(emailtxt.equals("Escribe tu mail")){
    emailtxt="";
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "DulcesVeroWin720" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
