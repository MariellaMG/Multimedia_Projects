import processing.video.*;

Capture cam1;



void SetCamara(){
  
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



void drawCamara() {
  
  
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





