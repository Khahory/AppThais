package Editor;


import static com.sun.java.accessibility.util.AWTEventMonitor.addItemListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Element;
import javax.swing.text.StyledEditorKit;

/**
 *
 * Thais Contreras
 */
public class AppThais {
    
    public JFrame ventana;
    public JMenu  Archivo,Ayuda,Fuente,FuenteE,FuenteT,Ver;
    public JMenuItem Nuevo,Abrir,Guardar,Salir,AcercaDe;
    public JCheckBoxMenuItem Barra;
    public JScrollPane Scroll;
    public Font font;
    public JList FuenteList, EstiloList, TamanoList;
    public JTextPane area;
    public JMenuBar menu;
    public JPanel panel;
    public JLabel detalles,barrus,linea,col;
    String tlt;
    public JTextField lineaTextField,colTextField;
   
    
    public AppThais(){
        
     ventana = new JFrame("Editor de Texto");
     panel = new JPanel();
     menu = new JMenuBar ();
     detalles = new JLabel();
     barrus = new JLabel();
     panel.add(detalles);
  
     area = new JTextPane();
     Scroll = new JScrollPane();
     ventana.add(area);

     Archivo = new JMenu("Archivo");
     Ayuda = new JMenu("Ayuda");
     Fuente = new JMenu("Fuente");
     FuenteE = new JMenu("Fuente Estilo");
     FuenteT = new JMenu("Fuente Tamano");
     Ver = new JMenu("Ver");
     
     
     Nuevo = new JMenuItem("Nuevo");
     Abrir = new JMenuItem("Abrir");
     Guardar = new JMenuItem("Guardar");
     Salir = new JMenuItem("Salir");
     AcercaDe = new JMenuItem("Acerca del Editor de Texto");
     Barra = new JCheckBoxMenuItem("Barra de estado");
     
     Archivo.add(Nuevo);
     Archivo.add(Abrir);
     Archivo.add(Guardar);
     Archivo.add(Salir); 
     Ayuda.add(AcercaDe);
     Ver.add(Barra);
     
     menu.add(Archivo);
     menu.add(Fuente);
     menu.add(FuenteE);
     menu.add(FuenteT);
     menu.add(Ver);
     menu.add(Ayuda);
    
     
     ventana.setJMenuBar(menu);
    
     Cmenu("Arial","Fuente","Arial",0,12); 
     Cmenu("Serif","Fuente","Serif",0,12);
     Cmenu("Calibri","Fuente","Calibri",0,12);
     Cmenu("Agency FB","Fuente","Agency FB",0,12);
     Cmenu("Consolas","Fuente","Consolas",0,12);
     
     
     /////////////////////////////////
     Cmenu("Negrita","Fuente Estilo","",Font.BOLD,12);
     Cmenu("Cursiva","Fuente Estilo","",Font.ITALIC,12);

     ///////////////////////////////////////
     Cmenu("10","Fuente Tamano","",0,10);
     Cmenu("12","Fuente Tamano","",0,12);
     Cmenu("16","Fuente Tamano","",0,16);
     Cmenu("18","Fuente Tamano","",0,18);
     Cmenu("20","Fuente Tamano","",0,20);
     Cmenu("24","Fuente Tamano","",0,24);
     Cmenu("36","Fuente Tamano","",0,36);
     
     Nuevo.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
         area.setText(" ");
     }
    });
     
     Abrir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            openArchivo();
        }
    });
     Guardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveArchivo();
        }
    });
    
     Salir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
     
       AcercaDe.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           openAcerca();
         }         
     });
      
       
        Barra.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       
          ver();
         }         
     });
  
    
    ponerScroll();
    ventana.setSize(900, 600);
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        openStatus();
        ocultarTab();
  
}
    
    
        private void Cmenu(String rot, String format, String typeF,int estiloF, int tamanoF){
        
        JMenuItem elementos_m = new JMenuItem(rot);
        
        if(format == "Fuente"){
            Fuente.add(elementos_m);
            if(typeF=="Arial"){
                elementos_m.addActionListener(new StyledEditorKit.FontFamilyAction("tipofuente","Arial"));
            }else if(typeF=="Serif"){
                elementos_m.addActionListener(new StyledEditorKit.FontFamilyAction("tipofuente","Serif"));
            }else if(typeF=="Calibri"){
                elementos_m.addActionListener(new StyledEditorKit.FontFamilyAction("tipofuente","Calibri"));
            }else if(typeF=="Agency FB"){
                elementos_m.addActionListener(new StyledEditorKit.FontFamilyAction("tipofuente","Agency FB"));
            }else if(typeF=="Consolas"){
                elementos_m.addActionListener(new StyledEditorKit.FontFamilyAction("tipofuente","Consolas"));
            }
        }else if (format == "Fuente Estilo"){
            
            FuenteE.add(elementos_m);
            if (estiloF==Font.BOLD){
                elementos_m.addActionListener(new StyledEditorKit.BoldAction());
            }else if(estiloF==Font.ITALIC){
                elementos_m.addActionListener(new StyledEditorKit.ItalicAction());
            }
                
           
        }else if (format == "Fuente Tamano"){
            FuenteT.add(elementos_m);
            elementos_m.addActionListener(new StyledEditorKit.FontSizeAction("tamano", tamanoF));
        }
  
    }
        
        
       
        
        
        private void ver(){
             Ver.setMnemonic(KeyEvent.VK_V);
             Barra.setMnemonic(KeyEvent.VK_S);
             Barra.addItemListener(new ItemListener(){
     
                 @Override
                 public void itemStateChanged(ItemEvent e) {
                   if (e.getStateChange() == ItemEvent.SELECTED){
                       mostrarTab();
                   }else{
                       ocultarTab();
                   }
                 }
                 });
      }
        
        private void mostrarTab(){
                    linea.setVisible(true);
        col.setVisible(true);
        lineaTextField.setVisible(true);
        colTextField.setVisible(true);
        panel.setVisible(true);
        }

    private void ocultarTab() {
        linea.setVisible(false);
        col.setVisible(false);
        lineaTextField.setVisible(false);
        colTextField.setVisible(false);
        panel.setVisible(false);
    }

    public final void openStatus() {

        panel.setBorder(BorderFactory.createEtchedBorder());
       ventana.add(panel, BorderLayout.SOUTH);
        
       linea = new JLabel("Linea:");
       panel.add(linea);
       lineaTextField = new JTextField(2);
       lineaTextField.setEditable(false);
       panel.add(lineaTextField);
       
       col = new JLabel("Col: ");
       panel.add(col);
       colTextField = new JTextField(2);
       colTextField.setEditable(false);
       panel.add(colTextField);
        
        area.addCaretListener(new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent ce) {
            int pos = area.getCaretPosition();
            Element map = area.getDocument().getDefaultRootElement();
            int lin = map.getElementIndex(pos);
            Element lineElem = map.getElement(lin);
            int col = pos - lineElem.getStartOffset();
  
            lineaTextField.setText(""+lin);
            colTextField.setText(""+col);
         }
      });
        
    }
    
    
    private void ponerScroll(){
        ventana.getContentPane().add(Scroll);
        Scroll.setViewportView(area);
        
     //   Deslizador.setColumns(20);
      //  Deslizador.setRows(5);
        Scroll.setBounds(23, 40, 394, 191);
      //  ventana.getContentPane().add(Scroll);
     //   Scroll.setViewportView(Deslizador);
    }
    
    
    
    
    
    
    public void openAcerca(){
        
        JDialog aDialog = new JDialog();
        aDialog.setTitle("Acerca del Editor de Texto");
        
       
        aDialog.setBounds(400,400,400,400);
        aDialog.setLocationRelativeTo(null);
        aDialog.setResizable(false);
         
         
        aDialog.setVisible(true);
        
        
         // Hacer que al cerrarse la secundaria con la x de arriba a la
         // derecha, se muestre la primaria
       aDialog.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 ventana.setVisible(true);
                 aDialog.setVisible(false);
             }
             
             @Override
             public void windowClosed(WindowEvent e) {
                 ventana.setVisible(true);
                 aDialog.setVisible(false);
             }
         });
        
    }
 
    public void openArchivo() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(ventana)) {
        File archivo = fileChooser.getSelectedFile();
        FileReader lector = null;
        try {
            lector = new FileReader(archivo);
            BufferedReader bfReader = new BufferedReader(lector);

            String lineaFichero;
            StringBuilder contenidoFichero = new StringBuilder();

            // Recupera el contenido del fichero
            while ((lineaFichero = bfReader.readLine()) != null) {
                contenidoFichero.append(lineaFichero);
                contenidoFichero.append("\n");
            }

            // Pone el contenido del fichero en el area de texto
            area.setText(contenidoFichero.toString());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
                Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
    public void saveArchivo() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(ventana)) {
        File archivo = fileChooser.getSelectedFile();
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(area.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(AppThais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


    
    public static void main(String[] args){
        AppThais et = new AppThais();
        
    }
    
}
