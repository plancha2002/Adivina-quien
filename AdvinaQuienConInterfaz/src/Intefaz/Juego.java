package Intefaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;



/**
 *
 * @author placha
 */
public class Juego extends javax.swing.JFrame {
        private Personajes[] lista = new Personajes[9];

        //creamos una persona que seleccionara maquina
         private Personajes maq = new Personajes();
         
         private int puntuacion = 10;
         
         private int partida = 0;
         
         FileWriter fw = null;
         PrintWriter pw = null;
         
         File f = null;
         FileReader fr = null;
         BufferedReader br = null;
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        bAnthony.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anthony.png")));
        bFernando.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alonso.jpg")));
        bJamie.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chadwick.jpeg")));
        bFlavio.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flavio.png")));
        bHannah.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hannah.jpeg")));
        bLewis.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lewis.jpeg")));
        bAntonio.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lobato.jpeg")));
        bEsteban.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mojon.jpeg")));
        bStephanie.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stephanie.png")));
        
        Scanner input = new Scanner(System.in);

        int seleccionMenu = 0;

        int contador = 0;
        
          String adivinaPersonaje="";

        //Leemos los personajes
        
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        
        try{
            fis= new FileInputStream ("Personajes.dat");
            entrada = new ObjectInputStream (fis);
            
            for (int i = 0; i < lista.length; i++) {
                lista[i]= (Personajes) entrada.readObject();            
            }
        }catch(IOException | ClassNotFoundException e){
                    System.out.println("Error:"+e.toString());
        }finally{
            try{
                entrada.close();
                fis.close();
            }catch(IOException e){
                System.out.println("Error"+e.toString());
            }
        }
        
        //hacemos un lector de las lineas para saber cuantas partidas han habido
        try{
            f=new File("Puntuaciones.txt");
            fr=new FileReader(f);
            br=new BufferedReader(fr);
            
            //leemos
            while(br.readLine() != null){
                partida++;
            }
        }catch(IOException e){
            System.out.println("Erro: "+ e.toString());
        }finally{
            try{
                
                br.close();
                fr.close();
            }catch(IOException e){
                System.out.println("Error: "+ e.toString());
            }
        }
        
        lPartida.setText("Partida Num: "+partida);
        /**
         * @param nombre nombre del personaje
         * @param pelo tiene pelo o no
         * @param pielClara piel clara o oscura
         * @param barba tiene barba o no
         * @param esHombre es hombre o no
         * @param gafas tiene o no gafa
         * @param piloto es piloto de f1 o no
         */
        //inicia la creacion de personajes
//        lista[0] = new Personajes("Fernando Alonso", true, true, true, true, false, true);//bien 
//        lista[1] = new Personajes("Lewis Hamilton", true, false, true, true, false, true);//bien 
//        lista[2] = new Personajes("Flavio Briatore", true, true, true, true, true, false);//bien 
//        lista[3] = new Personajes("Hanna Schmitz", true, true, false, false, false, false);//bien 
//        lista[4] = new Personajes("Antonio Lobato", false, true, false, true, false, false);//bien 
//        lista[5] = new Personajes("Esteban Mojon", true, true, false, true, false, true);//bien 
//        lista[6] = new Personajes("Stephanie Travers", true, false, false, false, true, false);//bien
//        lista[7] = new Personajes("Jamie Chadwick", true, true, false, false, true, true);//bien
//        lista[8] = new Personajes("Anthony Hamilton", false, false, false, true, true, false);//bien
//        //finaliza la creacion de personajes

        //se genera un numero random para escoger un elemento del array para la maquina
        int select =4;// (int) (Math.random()*8+0);

        //se selecciona el personaje
        maq =lista [(int)(Math.random()*8+0)];//seleccionamos un personaje en lista entre las 9 opciones para adivinarlo
         
        //inicio menu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pMenuInferior = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lRespuesta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bTerminar = new javax.swing.JButton();
        bAdivinar = new javax.swing.JButton();
        pMenu = new javax.swing.JPanel();
        bMenu = new javax.swing.JButton();
        bReiniciar = new javax.swing.JButton();
        bNuevaPartida = new javax.swing.JButton();
        bPuntuaciones = new javax.swing.JButton();
        pMenuLateral = new javax.swing.JPanel();
        pInfo = new javax.swing.JPanel();
        pPuntuacion = new javax.swing.JPanel();
        lPuntuacion = new javax.swing.JLabel();
        pPartida = new javax.swing.JPanel();
        lPartida = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bPelo = new javax.swing.JButton();
        bPiel = new javax.swing.JButton();
        bBarba = new javax.swing.JButton();
        bHombre = new javax.swing.JButton();
        bGafas = new javax.swing.JButton();
        bPiloto = new javax.swing.JButton();
        pPersonajes = new javax.swing.JPanel();
        pPersonaje6 = new javax.swing.JPanel();
        bFernando = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pPersonaje4 = new javax.swing.JPanel();
        bLewis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pPersonaje3 = new javax.swing.JPanel();
        bFlavio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pPersonaje2 = new javax.swing.JPanel();
        bHannah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pPersonaje5 = new javax.swing.JPanel();
        bAntonio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pPersonaje7 = new javax.swing.JPanel();
        bEsteban = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pPersonaje8 = new javax.swing.JPanel();
        bStephanie = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pPersonaje9 = new javax.swing.JPanel();
        bJamie = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pPersonaje10 = new javax.swing.JPanel();
        bAnthony = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 850));

        jPanel3.setLayout(new java.awt.BorderLayout());

        pMenuInferior.setLayout(new javax.swing.BoxLayout(pMenuInferior, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.BorderLayout());

        lRespuesta.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        lRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lRespuesta, java.awt.BorderLayout.CENTER);

        pMenuInferior.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        bTerminar.setText("Terminar partida");
        jPanel2.add(bTerminar);

        bAdivinar.setText("Adivinar Personaje");
        bAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdivinarActionPerformed(evt);
            }
        });
        jPanel2.add(bAdivinar);

        pMenuInferior.add(jPanel2);

        jPanel3.add(pMenuInferior, java.awt.BorderLayout.SOUTH);

        pMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pMenu.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        bMenu.setText("Menu");
        bMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuActionPerformed(evt);
            }
        });
        pMenu.add(bMenu);

        bReiniciar.setText("Reiniciar partida");
        bReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReiniciarActionPerformed(evt);
            }
        });
        pMenu.add(bReiniciar);

        bNuevaPartida.setText("Iniciar nueva partida");
        bNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevaPartidaActionPerformed(evt);
            }
        });
        pMenu.add(bNuevaPartida);

        bPuntuaciones.setText("Ver puntuaciones");
        pMenu.add(bPuntuaciones);

        jPanel3.add(pMenu, java.awt.BorderLayout.NORTH);

        pMenuLateral.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        pInfo.setLayout(new java.awt.GridLayout(0, 1));

        pPuntuacion.setLayout(new java.awt.BorderLayout());

        lPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPuntuacion.setText("Puntuacion: 10");
        pPuntuacion.add(lPuntuacion, java.awt.BorderLayout.CENTER);

        pInfo.add(pPuntuacion);

        pPartida.setLayout(new java.awt.BorderLayout());

        lPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPartida.setText("Partida Num: 0");
        pPartida.add(lPartida, java.awt.BorderLayout.CENTER);

        pInfo.add(pPartida);

        pMenuLateral.add(pInfo);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Preguntas");
        pMenuLateral.add(jLabel11);

        bPelo.setText("¿Tiene pelo?");
        bPelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPeloActionPerformed(evt);
            }
        });
        pMenuLateral.add(bPelo);

        bPiel.setText("¿Tiene la piel clara?");
        bPiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPielActionPerformed(evt);
            }
        });
        pMenuLateral.add(bPiel);

        bBarba.setText("¿Tiene Barba?");
        bBarba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBarbaActionPerformed(evt);
            }
        });
        pMenuLateral.add(bBarba);

        bHombre.setText("¿Es hombre?");
        bHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHombreActionPerformed(evt);
            }
        });
        pMenuLateral.add(bHombre);

        bGafas.setText("¿Tiene gafas?");
        bGafas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGafasActionPerformed(evt);
            }
        });
        pMenuLateral.add(bGafas);

        bPiloto.setText("¿Es piloto de F1?");
        bPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPilotoActionPerformed(evt);
            }
        });
        pMenuLateral.add(bPiloto);

        jPanel3.add(pMenuLateral, java.awt.BorderLayout.EAST);

        pPersonajes.setLayout(new java.awt.GridLayout(3, 3));

        pPersonaje6.setLayout(new java.awt.BorderLayout());

        bFernando.setBackground(new java.awt.Color(0, 128, 255));
        bFernando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alonso.jpg"))); // NOI18N
        bFernando.setEnabled(false);
        bFernando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bFernando.setSelected(true);
        bFernando.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alonso.jpg"))); // NOI18N
        bFernando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFernandoActionPerformed(evt);
            }
        });
        pPersonaje6.add(bFernando, java.awt.BorderLayout.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fernando Alonso");
        pPersonaje6.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje6);

        pPersonaje4.setLayout(new java.awt.BorderLayout());

        bLewis.setBackground(new java.awt.Color(0, 128, 255));
        bLewis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lewis.jpeg"))); // NOI18N
        bLewis.setEnabled(false);
        bLewis.setSelected(true);
        bLewis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLewisActionPerformed(evt);
            }
        });
        pPersonaje4.add(bLewis, java.awt.BorderLayout.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lewis Hamilton");
        pPersonaje4.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje4);

        pPersonaje3.setLayout(new java.awt.BorderLayout());

        bFlavio.setBackground(new java.awt.Color(0, 128, 255));
        bFlavio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flavio.png"))); // NOI18N
        bFlavio.setEnabled(false);
        bFlavio.setSelected(true);
        bFlavio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFlavioActionPerformed(evt);
            }
        });
        pPersonaje3.add(bFlavio, java.awt.BorderLayout.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Favio Briatore");
        pPersonaje3.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje3);

        pPersonaje2.setLayout(new java.awt.BorderLayout());

        bHannah.setBackground(new java.awt.Color(0, 128, 255));
        bHannah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hannah.jpeg"))); // NOI18N
        bHannah.setToolTipText("");
        bHannah.setEnabled(false);
        bHannah.setSelected(true);
        bHannah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHannahActionPerformed(evt);
            }
        });
        pPersonaje2.add(bHannah, java.awt.BorderLayout.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hanna Schmitz");
        pPersonaje2.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje2);

        pPersonaje5.setLayout(new java.awt.BorderLayout());

        bAntonio.setBackground(new java.awt.Color(0, 128, 255));
        bAntonio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lobato.jpeg"))); // NOI18N
        bAntonio.setEnabled(false);
        bAntonio.setSelected(true);
        bAntonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntonioActionPerformed(evt);
            }
        });
        pPersonaje5.add(bAntonio, java.awt.BorderLayout.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Antonio Lobato");
        pPersonaje5.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje5);

        pPersonaje7.setLayout(new java.awt.BorderLayout());

        bEsteban.setBackground(new java.awt.Color(0, 128, 255));
        bEsteban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mojon.jpeg"))); // NOI18N
        bEsteban.setEnabled(false);
        bEsteban.setSelected(true);
        bEsteban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstebanActionPerformed(evt);
            }
        });
        pPersonaje7.add(bEsteban, java.awt.BorderLayout.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Esteban Mojon");
        pPersonaje7.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje7);

        pPersonaje8.setLayout(new java.awt.BorderLayout());

        bStephanie.setBackground(new java.awt.Color(0, 128, 255));
        bStephanie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stephanie.png"))); // NOI18N
        bStephanie.setEnabled(false);
        bStephanie.setSelected(true);
        bStephanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStephanieActionPerformed(evt);
            }
        });
        pPersonaje8.add(bStephanie, java.awt.BorderLayout.CENTER);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Stephanie Travers");
        pPersonaje8.add(jLabel8, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje8);

        pPersonaje9.setLayout(new java.awt.BorderLayout());

        bJamie.setBackground(new java.awt.Color(0, 128, 255));
        bJamie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chadwick.jpeg"))); // NOI18N
        bJamie.setEnabled(false);
        bJamie.setSelected(true);
        bJamie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJamieActionPerformed(evt);
            }
        });
        pPersonaje9.add(bJamie, java.awt.BorderLayout.CENTER);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Jamie Chadwick");
        pPersonaje9.add(jLabel9, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje9);

        pPersonaje10.setLayout(new java.awt.BorderLayout());

        bAnthony.setBackground(new java.awt.Color(0, 128, 255));
        bAnthony.setForeground(new java.awt.Color(0, 0, 0));
        bAnthony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anthony.png"))); // NOI18N
        bAnthony.setEnabled(false);
        bAnthony.setSelected(true);
        bAnthony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnthonyActionPerformed(evt);
            }
        });
        pPersonaje10.add(bAnthony, java.awt.BorderLayout.CENTER);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Anthony Hamilton");
        pPersonaje10.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        pPersonajes.add(pPersonaje10);

        jPanel3.add(pPersonajes, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bloquearBotones(){
        
        //Botones de personajes
        bFernando.setEnabled(false);
        bAnthony.setEnabled(false);
        bJamie.setEnabled(false);
        bAntonio.setEnabled(false);
        bLewis.setEnabled(false);
        bStephanie.setEnabled(false);
        bHannah.setEnabled(false);
        bEsteban.setEnabled(false);
        bFlavio.setEnabled(false);
        //Botones de menu lateral
        bPelo.setEnabled(false);
        bBarba.setEnabled(false);
        bGafas.setEnabled(false);
        bPiloto.setEnabled(false);
        bPiel.setEnabled(false);
        bHombre.setEnabled(false);
        bAdivinar.setEnabled(false);
    }
    private void desbloquearBotones(){
        
         bPelo.setEnabled(true);
        bBarba.setEnabled(true);
        bGafas.setEnabled(true);
        bPiloto.setEnabled(true);
        bPiel.setEnabled(true);
        bHombre.setEnabled(true);
        bAdivinar.setEnabled(true);
        
    }
    private void restarPuntuacionUno(){
        if (puntuacion>0) {
            puntuacion--;
            
            lPuntuacion.setText("Puntuación: "+puntuacion);
        }else if(puntuacion<=0){
            lPuntuacion.setText("Haz perdido!");
            lRespuesta.setText("Haz perdido!");
            bloquearBotones();
        }
    }
    private void restarPuntuacionDos(){
        if (puntuacion>0) {
            puntuacion=puntuacion-2;
            
            lPuntuacion.setText("Puntuación: "+puntuacion);
        }else if(puntuacion<=0){
            lPuntuacion.setText("Haz perdido!");
            lRespuesta.setText("Haz perdido!");
            bloquearBotones();
        }
    }
    
    private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMenuActionPerformed

    private void bAnthonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnthonyActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Anthony Hamilton")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
        
        
    }//GEN-LAST:event_bAnthonyActionPerformed

    private void bStephanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStephanieActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Stephanie Travers")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
        }
    }//GEN-LAST:event_bStephanieActionPerformed

    private void bFlavioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFlavioActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Flavio Briatore")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
    }//GEN-LAST:event_bFlavioActionPerformed

    private void bPeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPeloActionPerformed
       
       if(maq.respuesta(1)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
       restarPuntuacionUno();
       
       
       
    }//GEN-LAST:event_bPeloActionPerformed

    private void bPielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPielActionPerformed
        // TODO add your handling code here:
        if(maq.respuesta(2)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
        
        restarPuntuacionUno();
       
    }//GEN-LAST:event_bPielActionPerformed

    private void bBarbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBarbaActionPerformed
        // TODO add your handling code here:
        if(maq.respuesta(3)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
        
        restarPuntuacionUno();
       
    }//GEN-LAST:event_bBarbaActionPerformed

    private void bHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHombreActionPerformed
        // TODO add your handling code here:
        if(maq.respuesta(4)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
        restarPuntuacionUno();
       
    }//GEN-LAST:event_bHombreActionPerformed

    private void bGafasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGafasActionPerformed
        // TODO add your handling code here:
        if(maq.respuesta(5)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
        restarPuntuacionUno();
       
    }//GEN-LAST:event_bGafasActionPerformed

    private void bPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPilotoActionPerformed
        // TODO add your handling code here:
        if(maq.respuesta(6)){
           lRespuesta.setText("Correcto");
       }else{
           lRespuesta.setText("Incorrecto!");
       }
        restarPuntuacionUno();
       
    }//GEN-LAST:event_bPilotoActionPerformed

    private void bAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdivinarActionPerformed
        // TODO add your handling code here:
        lRespuesta.setText("¿Que personaje crees que soy?");
        bFernando.setEnabled(true);
        bAnthony.setEnabled(true);
        bJamie.setEnabled(true);
        bAntonio.setEnabled(true);
        bLewis.setEnabled(true);
        bStephanie.setEnabled(true);
        bHannah.setEnabled(true);
        bEsteban.setEnabled(true);
        bFlavio.setEnabled(true);
        
        
          
    }//GEN-LAST:event_bAdivinarActionPerformed

    private void bFernandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFernandoActionPerformed
        // TODO add your handling code here: 
        if (maq.comparaNombre("Fernando Alonso")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
        
        
    }//GEN-LAST:event_bFernandoActionPerformed

    private void bLewisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLewisActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Lewis Hamilton")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
    }//GEN-LAST:event_bLewisActionPerformed

    private void bHannahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHannahActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Hanna Schmitz")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
        }
    }//GEN-LAST:event_bHannahActionPerformed

    private void bAntonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntonioActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Antonio Lobato")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
    }//GEN-LAST:event_bAntonioActionPerformed

    private void bEstebanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstebanActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Esteban Mojon")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
    }//GEN-LAST:event_bEstebanActionPerformed

    private void bJamieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJamieActionPerformed
        // TODO add your handling code here:
        if (maq.comparaNombre("Jamie Chadwick")) {
            lRespuesta.setText("Correcto");
            bloquearBotones();
        }else{
            lRespuesta.setText("Incorrecto la respues correcta era: "+  maq.getNombre());
            restarPuntuacionDos();
        }
    }//GEN-LAST:event_bJamieActionPerformed

    private void bReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReiniciarActionPerformed
        // TODO add your handling code here:
        if (puntuacion>0) {
            maq =lista [(int)(Math.random()*8+0)];
        bFernando.setEnabled(false);
        bAnthony.setEnabled(false);
        bJamie.setEnabled(false);
        bAntonio.setEnabled(false);
        bLewis.setEnabled(false);
        bStephanie.setEnabled(false);
        bHannah.setEnabled(false);
        bEsteban.setEnabled(false);
        bFlavio.setEnabled(false);
        lRespuesta.setText("Partida reiniciada");
        
        }else if(puntuacion<=0){
            lRespuesta.setText("Haz llegado a la puntuacion minima, inicia una nueva partida");
            bloquearBotones();
        }
        
        
    }//GEN-LAST:event_bReiniciarActionPerformed

    private void bNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevaPartidaActionPerformed
        // TODO add your handling code here:
        maq =lista [(int)(Math.random()*8+0)];
        partida++;
        desbloquearBotones();
        lPartida.setText("Partida Num: "+partida);
        try{
            fw = new FileWriter("Puntuaciones.txt", true);
            pw = new PrintWriter(fw);
            
            pw.println("Partida numero: "+partida + " con puntuación "+puntuacion);
                    
        }catch(IOException e){
            System.out.println("Error: "+ e.toString());
        }finally{
            try{
                pw.close();
                fw.close();
            }catch(IOException e){
                System.out.println("Error: "+e.toString());
            }
        }
        
        puntuacion=10;
        lPuntuacion.setText("Puntuación: "+puntuacion);
        lRespuesta.setText("Nueva partida!");
    }//GEN-LAST:event_bNuevaPartidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdivinar;
    private javax.swing.JButton bAnthony;
    private javax.swing.JButton bAntonio;
    private javax.swing.JButton bBarba;
    private javax.swing.JButton bEsteban;
    private javax.swing.JButton bFernando;
    private javax.swing.JButton bFlavio;
    private javax.swing.JButton bGafas;
    private javax.swing.JButton bHannah;
    private javax.swing.JButton bHombre;
    private javax.swing.JButton bJamie;
    private javax.swing.JButton bLewis;
    private javax.swing.JButton bMenu;
    private javax.swing.JButton bNuevaPartida;
    private javax.swing.JButton bPelo;
    private javax.swing.JButton bPiel;
    private javax.swing.JButton bPiloto;
    private javax.swing.JButton bPuntuaciones;
    private javax.swing.JButton bReiniciar;
    private javax.swing.JButton bStephanie;
    private javax.swing.JButton bTerminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lPartida;
    private javax.swing.JLabel lPuntuacion;
    private javax.swing.JLabel lRespuesta;
    private javax.swing.JPanel pInfo;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pMenuInferior;
    private javax.swing.JPanel pMenuLateral;
    private javax.swing.JPanel pPartida;
    private javax.swing.JPanel pPersonaje10;
    private javax.swing.JPanel pPersonaje2;
    private javax.swing.JPanel pPersonaje3;
    private javax.swing.JPanel pPersonaje4;
    private javax.swing.JPanel pPersonaje5;
    private javax.swing.JPanel pPersonaje6;
    private javax.swing.JPanel pPersonaje7;
    private javax.swing.JPanel pPersonaje8;
    private javax.swing.JPanel pPersonaje9;
    private javax.swing.JPanel pPersonajes;
    private javax.swing.JPanel pPuntuacion;
    // End of variables declaration//GEN-END:variables
}
