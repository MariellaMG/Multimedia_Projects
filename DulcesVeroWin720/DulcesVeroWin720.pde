//import gab.opencv.*;
//import processing.video.*;
import java.awt.*;
///////
import java.awt.Rectangle;
import java.util.*;
///////////////////////////
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

void CorrerAudio(String audio) {

  minim.stop();
  //player.close();

  player = minim.loadFile(audio, 2048);
  player.play();
}


void PararAudio()
{
  player.close();
  minim.stop();
  //super.stop();
}



void setup() {
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






void init() {
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

void mouseReleased() {

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


void ReiniciarSeleccion() {
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


void draw() {

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


void stop()
{
  player.close();
  minim.stop();
  super.stop();
}
