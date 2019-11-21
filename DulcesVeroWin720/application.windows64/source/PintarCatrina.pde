
PImage catrina;
PImage[] catrinas = new PImage[430];
int num_catrina=0;
int min_catrina=0;
int tot_catrina=97;//167
int medio_catrina=96;

void CargarCatrina(){
  
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

void PintarCatrina(){
    num_catrina+=1;
    if(num_catrina>=medio_catrina){
      //num_catrina=min_catrina; ///LOOP
      num_catrina=medio_catrina-1;
    }
    
   image(catrinas[num_catrina],170,250,720*0.8,1280*0.8);
       
   //image(catrinas[num_catrina],100,100,720*0.95,1280*0.95);
   
}

void PintarCatrinaSalida(){
    num_catrina+=1;
    if(num_catrina>=tot_catrina-1){
      //num_catrina=min_catrina; ///LOOP
      num_catrina=tot_catrina-1;
    }
    
    image(catrinas[num_catrina],170,250,720*0.8,1280*0.8);
    
}


void IniciarCatrinaAnim(){
  num_catrina=min_catrina;
}
