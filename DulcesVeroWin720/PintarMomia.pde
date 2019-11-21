

PImage momia;
PImage[] momias = new PImage[430];
int num_momia=0;
int min_momia=0;
int tot_momia=68;///107
int medio_momia=66;

void CargarMomia(){
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

void PintarMomia(){
    num_momia+=1;
    if(num_momia>=medio_momia){
      //num_momia=min_momia; ///LOOP
      num_momia=medio_momia-1;
    }
    
   image(momias[num_momia],-80,0,720*1,1280*1);
       
   //image(catrinas[num_momia],100,100,720*0.95,1280*0.95);
   
}

void PintarMomiaSalida(){
    num_momia+=1;
    if(num_momia>=tot_momia-1){
      //num_momia=min_momia; ///LOOP
      num_momia=tot_momia-1;
    }
    
     image(momias[num_momia],-80,0,720*1,1280*1);
    
}


void IniciarMomiaAnim(){
  num_momia=min_momia;
}
