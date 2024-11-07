/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos2;

/**
 *
 * @author Alumno
 */
    
    
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    //private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btncalcular;
    
    private JLabel labelresta;
    private JLabel labeldivicion;
    private JLabel labelmultiplicacion;
    
    

    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // alto ancho
        setSize(550, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
        
        labelresta = new JLabel("resta");
        labeldivicion = new JLabel("divicion");
        labelmultiplicacion = new JLabel("multiplicacion");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btncalcular = new JButton("Calcular");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular);      
        ventana.add(result);
        
        ventana.add(labelresta);
        ventana.add(labeldivicion);
        ventana.add(labelmultiplicacion);
        
        

        btncalcular.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                suma(evt);
                resta(evt);
                divicion(evt);
                multiplicacion(evt);
            }
        });   
        
        /*btncalcular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btncalcularActionPerformed2(evt);
            }
        });*/
         
    }
    
    private void suma(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
    private void resta(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        labelresta.setText("Resultado: " + re);
    }
    
    private void divicion(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1/v2;
        labeldivicion.setText("divicion : " + re);
    }
    private void multiplicacion(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1*v2;
        labelmultiplicacion.setText("divicion : " + re);
        
    }
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}    

