
PImage nahual;
PImage[] nahuals = new PImage[430];
int num_nahual=0;
int min_nahual=0;
int tot_nahual=135;//135
int medio_nahual=90;

void CargarNahual() {

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

void PintarNahual() {
  num_nahual+=1;
  if (num_nahual>=medio_nahual) {
    //num_nahual=min_nahual; ///LOOP
    num_nahual=medio_nahual-1;
  }

  image(nahuals[num_nahual], 200, 400, 720*0.8, 1280*0.8);
  
  //image(nahuals[num_nahual],100,100,720*0.95,1280*0.95);
}

void PintarNahualSalida() {
  num_nahual+=1;
  if (num_nahual>=tot_nahual-1) {
    //num_nahual=min_nahual; ///LOOP
    num_nahual=tot_nahual-1;
  }

  image(nahuals[num_nahual], 200, 400, 720*0.8, 1280*0.8);
}


void IniciarNahualAnim() {
  num_nahual=min_nahual;
}

