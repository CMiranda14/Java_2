public class LogicaPrograma {

    public boolean comprobacionCorre(String correo){

    

    
        int arroba = 0;
        int punto = 0;


        for (int i = 0; i < correo.length(); i++) {
            if(correo.charAt(i) == '@'){//<-  @
                arroba++;
                punto++;
            }
        }

        //verifica que ambas condiciones sean verdaderas.
        if(arroba == 0 && punto >=0){
            return true;
        }else{
            return false;
        }

    }

    public boolean comprobacionNombre(String nombre){

        //Valores no permitidos en un nombre
        char numeros []= {'0','1','2','3','4','5','6','7','8','9'};

        boolean resultado = true;

        for(int i = 0; i < nombre.length();i++){

            for (int j = 0; j < numeros.length ; j++){
                if (nombre.charAt(i) == numeros[j]){
                    resultado = false;
                }
            }
        }

        return resultado;
    }

 

	    
	
	    public boolean comprobacionEdad(String edad) {
	    	
	    	
	    	char numeros []= {'a','b','c','d','e','f','g','h','i','j','k','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	        boolean resultado = true;

	        for(int i = 1; i < edad.length();i++){

	            for (int x = 1; x < numeros.length ; x++){
	                if (edad.charAt(i) == numeros[x]){
	                    resultado = false;
	                }
	            }
	        }

	        return resultado;
	    }
	       
      
		        public boolean comprobacionRegistro(String registro) {
		        	
		        	int labelVerificacion1 = 0;
			    	int labelVerificacion2 = 0;	
			    	int labelVerificacion3 = 0;	
			    	
			    	
			    	
			    	for (int i = 0; i < registro.length(); i++) {
				        if(registro.charAt(i) == 'T') {
				        	labelVerificacion1++;
				        	labelVerificacion2++;
				        	labelVerificacion3++;
				       
				        	}
			    	}    
			        if(labelVerificacion1 >= 0 && labelVerificacion2 >=0 && labelVerificacion3 >=0 ){
				        return true;
				    }else{
				        return false;
				    }
			        
			        
               
				        
				        
		        	
		        
		
	}
	}  