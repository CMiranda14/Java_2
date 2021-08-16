import javax.swing.*;
import java.awt.*; //libreria para agregar color al JLabel
import java.awt.event.*;

public class InterfazGrafica extends JFrame implements ActionListener{

    //PROPIEDADES
    public JLabel ViewText, inputPassword;
    public JTextField ViewEntrada, inputtCorreo;
    public JButton ViewBoton;
    public JTextField inputCorreo, inputNombre, inputFecha;
    public JLabel labelVerificacionCorreo, labelVerificacionNombre, labelVerificacionEdad, labelVerificacion4;
    public JButton buttonRegistrar, buttonIniciar;
    public JLabel lableMensajeFinal;

    //COMPORTAMIENTOS MÉTODO CONSTRUCTOR
    
   InterfazGrafica(String ventana){
    	
        etiqueta("Ventana de registro",285,20,230,80);
        
        etiqueta ("Nombre de Usuario", 285, 80, 230, 80);
        
       
        
        
        entrada("", 235, 230, 210, 25);
        
        inputtCorreo = new JTextField();
        inputtCorreo.setBounds(225, 150, 240, 25);
        add(inputtCorreo);
        

        inputPassword = new JLabel("Password");
        inputPassword.setBounds(320, 170, 230, 80);
        add(inputPassword);
        
        lableMensajeFinal = new JLabel("Mensaje de verificación");
        lableMensajeFinal.setBounds(130, 350, 300, 25);
        add(lableMensajeFinal);
        
        labelVerificacion4 = new JLabel("");
        labelVerificacion4.setBounds(280, 350, 300, 25);
        add(labelVerificacion4);
      
      
        buttonIniciar = new JButton("Registrar");
        buttonIniciar.setBounds(280, 280, 120,25);
        add(buttonIniciar);
        buttonIniciar.addActionListener(this);
        
    }
   
    InterfazGrafica(){//<-- constructor

        System.out.println("hola");
        setLayout(null); //Control del diseño predeterminado

        etiqueta("Registro de alumnos",285,20,230,80);
        etiqueta("Correo electronico",130, 100, 140, 25);
        etiqueta("Nombre Completo",130, 150, 140, 25);
        etiqueta("Fecha de nacimiento",130, 200, 160, 25);

        labelVerificacionCorreo = new JLabel("");
        labelVerificacionCorreo.setBounds(510, 100, 140, 25);
        add(labelVerificacionCorreo);
        
        labelVerificacionNombre = new JLabel("");
        labelVerificacionNombre.setBounds(510, 150, 140, 25);
        add(labelVerificacionNombre);
        
        labelVerificacionEdad = new JLabel("");
        labelVerificacionEdad.setBounds(510, 200, 140, 25);
        add(labelVerificacionEdad);
        
        labelVerificacion4 = new JLabel("");
        labelVerificacion4.setBounds(280, 280, 300, 25);
        add(labelVerificacion4);
        
        lableMensajeFinal = new JLabel("Mensaje de verificación");
        lableMensajeFinal.setBounds(130, 280, 300, 25);
        add(lableMensajeFinal);

        //ENTRADA DE DATOS
        inputCorreo = new JTextField();
        inputCorreo.setBounds(300,100,200,25);
        add(inputCorreo);

        inputNombre = new JTextField();
        inputNombre.setBounds(300,150,200,25);
        add(inputNombre);

        inputFecha = new JTextField();
        inputFecha.setBounds(300,200,200,25);
        add(inputFecha);

        //BOTÓN DE REGISTRO
        buttonRegistrar = new JButton("Registrar");
        buttonRegistrar.setBounds(550,400,100,25);
        add(buttonRegistrar);
        buttonRegistrar.addActionListener(this);
    }



    //Construcción de texto de la interfaz
    public void etiqueta(String contenido, int horizontal, int vertical, int width, int heigth){
        setLayout(null);
        ViewText = new JLabel(contenido);
        ViewText.setBounds(horizontal, vertical, width, heigth);
        add(ViewText);
    }
    
    
  //Construcción de entradas de texto de la interfaz
    public void entrada(String contenido, int horizontal, int vertical, int width, int heigth){
        setLayout(null);
        ViewEntrada = new JTextField(contenido);
        ViewEntrada.setBounds(horizontal, vertical, width, heigth);
        add(ViewEntrada);
    }
    
    //Construcción de botones de la interfaz
    public void boton(String contenido, int horizontal, int vertical, int width, int heigth){
        setLayout(null);
        ViewBoton = new JButton(contenido);
        ViewBoton.setBounds(horizontal, vertical, width, heigth);
        add(ViewBoton);
    }

    //VENTANAS
    

    public void inicioSesion(){
        InterfazGrafica interfazLogin = new InterfazGrafica("login");
        interfazLogin.setBounds(0,0,700,500);// POSICIÓN Y TAMAÑO DE MI VENTANA
        interfazLogin.setVisible(true); 		// PERMITE MOSTRAR MI VENTANA
        interfazLogin.setResizable(false);	// REDIMENSION DE LA VENTANA
        interfazLogin.setLocationRelativeTo(null);
    }
    
    
    public void ventanaDeRegistro(){
        InterfazGrafica interfazGrafica = new InterfazGrafica();
        interfazGrafica.setBounds(0,0,700,500);// POSICIÓN Y TAMAÑO DE MI VENTANA
        interfazGrafica.setVisible(true); 		// PERMITE MOSTRAR MI VENTANA
        interfazGrafica.setResizable(false);	// REDIMENSION DE LA VENTANA
        interfazGrafica.setLocationRelativeTo(null);
    }

    

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonRegistrar) {

            //Instancia de clase
            LogicaPrograma registrarDatos = new LogicaPrograma();

            //RECUPERACIÓN DE DATOS
            String correo = inputCorreo.getText();
            String nombre = inputNombre.getText();
            String edad = inputFecha.getText();
            String registro = labelVerificacion4.getText();

            //Verificación del correo electronico
            if(registrarDatos.comprobacionCorre(correo)){
                labelVerificacionCorreo.setText("true");              // Agrega un texto
                labelVerificacionCorreo.setForeground(Color.GREEN);   // Cambia el color del texto
            }else{
                labelVerificacionCorreo.setText("null");
                labelVerificacionCorreo.setForeground(Color.RED);
            }

            //Verificación del nombre de usuario
            if(registrarDatos.comprobacionNombre(nombre)){
                labelVerificacionNombre.setText("true");
                labelVerificacionNombre.setForeground(Color.GREEN);
            }else{
                labelVerificacionNombre.setText("null");
                labelVerificacionNombre.setForeground(Color.red);
            }

            //Verificación de la edad del usuario
            if(registrarDatos.comprobacionEdad(edad)){
                labelVerificacionEdad.setText("true");
                labelVerificacionEdad.setForeground(Color.GREEN);
            }else{
                labelVerificacionEdad.setText("null");
                labelVerificacionEdad.setForeground(Color.red);
            }
            
          //Acción de Registro  
            
            if(registrarDatos.comprobacionRegistro(registro)){
                labelVerificacion4.setText("Registro completo");
                labelVerificacion4.setOpaque(true);
                labelVerificacion4.setForeground(Color.GREEN);
            }else{
                labelVerificacion4.setText("Registro incompleto, verifique los datos");
                labelVerificacion4.setOpaque(true);
                labelVerificacion4.setForeground(Color.RED);
            }  

        }if(e.getSource () == buttonIniciar) {
        	
        	LogicaPrograma registrarDatos = new LogicaPrograma();
        	
        	String correo = inputtCorreo.getText();
        	String nombre = inputPassword.getText();
        	
        	if(correo.equals("jefuentes@scl.edu.gt")) {
        		InterfazGrafica interfazGrafica = new InterfazGrafica();
        		interfazGrafica.ventanaDeRegistro();
        	}else {
        		lableMensajeFinal.setText("Correo o contraseña incorrecta");
        		lableMensajeFinal.setOpaque(true);
        		lableMensajeFinal.setForeground(Color.RED);
        	}
        	
        	
        
        }


    

		            
		          
		            
		       

		}

		}



