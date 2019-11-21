

PImage llorona;
PImage[] lloronas = new PImage[430];
int num_llorona=0;
int min_llorona=0;
int tot_llorona=70;//107
int medio_llorona=66;

void CargarLlorona(){
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

void PintarLlorona(){
    num_llorona+=1;
    if(num_llorona>=medio_llorona){
      //num_llorona=min_llorona; ///LOOP
      num_llorona=medio_llorona-1;
    }
    
   image(lloronas[num_llorona],-20,200,720*0.9,1280*0.9);
       
   //image(catrinas[num_llorona],100,100,720*0.95,1280*0.95);
   
}

void PintarLloronaSalida(){
    num_llorona+=1;
    if(num_llorona>=tot_llorona-1){
      //num_llorona=min_llorona; ///LOOP
      num_llorona=tot_llorona-1;
    }
    
   image(lloronas[num_llorona],-20,200,720*0.9,1280*0.9);
    
}


void IniciarLloronaAnim(){
  num_llorona=min_llorona;
}
