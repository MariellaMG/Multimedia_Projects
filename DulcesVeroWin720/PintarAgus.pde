

PImage agus;
PImage[] aguss = new PImage[430];
int num_agus=0;
int min_agus=0;
int tot_agus=55;//42
int medio_agus=55;

void CargarAgus(){
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

void PintarAgus(){
    num_agus+=1;
    if(num_agus>=medio_agus){
      //num_agus=min_agus; ///LOOP
      num_agus=medio_agus-1;
    }
    
   image(aguss[num_agus],0,100,720*1,1280*1);
       
   //image(catrinas[num_agus],100,100,720*0.95,1280*0.95);
   
}

void PintarAgusSalida(){
    num_agus+=1;
    if(num_agus>=tot_agus-1){
      //num_agus=min_agus; ///LOOP
      num_agus=tot_agus-1;
    }
    
     image(aguss[num_agus],0,100,720*1,1280*1);
    
}


void IniciarAgusAnim(){
  num_agus=min_agus;
}
