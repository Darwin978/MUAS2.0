package Controlador;

import Modelo.Conexion;
import Modelo.ModeloNatural;
import Modelo.Persona;
import Modelo.Persona_Natural;
import Vista.VistaPersonaNatural;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

import sun.swing.table.DefaultTableCellHeaderRenderer;
//import javax.xml.ws.Holder;

/**
 *
 * @author Kevin
 */
//JUNTA EL MODELO CON LA VISTA EN LA CLASE CONTROLADOR
public class ControladorNatural {
    Conexion conecta = new Conexion();
    private ModeloNatural modelo;
    private VistaPersonaNatural vista;

    public ControladorNatural(ModeloNatural modelo, VistaPersonaNatural vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.Encontrar();

        vista.setVisible(true);
       // vista.setLocationRelativeTo(null);

    }
    public void Iniciar_Control() {
        
 cargaLista("");
//LISTENER - BOTONES
       
        vista.getBtnGuardar().addActionListener(al -> grabarPersona());
       

       vista.getBtnEliminar().addActionListener(al->Eliminar_Persona());
//        vista.getBtnimprimir().addActionListener(al);

    vista.getBtnExaminar().addActionListener(l->cargarImagen());
    vista.getBtnActualizar().addActionListener(al->Rellenar_Dialogo_Editar());
          vista.getBtn_actualizar_act().addActionListener(al->Editar_Natural());
          
          vista.getTxtCodigo().addKeyListener(kcn);
          vista.getTxtRuc().addKeyListener(krn);
          vista.getTxtNombres().addKeyListener(knn);
          vista.getTxtApellidos().addKeyListener(kan);
          vista.getTxtDireccion().addKeyListener(kdn);
          vista.getTxtTelefono().addKeyListener(ktn);
          vista.getTxtCelular().addKeyListener(ktca);
          vista.getTxtCorreo().addKeyListener(kcon);
          
    }
    private void cargaLista(String aguja){
        
        
        vista.getTablaPerNaturall().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTablaPerNaturall().setRowHeight(100);
        DefaultTableCellRenderer renderer= new DefaultTableCellHeaderRenderer();
        
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista.getTablaPerNaturall().getModel();
        tblModel.setNumRows(0);
        List<Persona_Natural> lista=ModeloNatural.Listar(aguja);
        int ncols=tblModel.getColumnCount();
//        Holder<Integer> i = new Holder<>(0);
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1->{
             

           
           tblModel.addRow(new Object[ncols]);
           vista.getTablaPerNaturall().setValueAt(p1.getCodigo(), i.value , 0);
           vista.getTablaPerNaturall().setValueAt(p1.getDNI(), i.value ,1 );
            vista.getTablaPerNaturall().setValueAt(p1.getNombres(), i.value , 2);
            vista.getTablaPerNaturall().setValueAt(p1.getApellidos(), i.value , 3);
            vista.getTablaPerNaturall().setValueAt(p1.getDireccion(), i.value , 4);
            vista.getTablaPerNaturall().setValueAt(p1.getCorreo(), i.value , 5);
            vista.getTablaPerNaturall().setValueAt(p1.getTelefono(), i.value , 6);
            vista.getTablaPerNaturall().setValueAt(p1.getCelular(), i.value , 7);
            vista.getTablaPerNaturall().setValueAt(p1.getUsuario(), i.value , 8);
            vista.getTablaPerNaturall().setValueAt(p1.getClave(), i.value, 9);
            
           
            //completar datos
           Image img = p1.getFoto();
           if(img!=null){
                Image newimg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vista.getTablaPerNaturall().setValueAt(new JLabel(icon), i.value, 10);
           }else{
               vista.getTablaPerNaturall().setValueAt(null, i.value, 10);
           }
           i.value++;
          ;
        });
    }
    private void grabarPersona() {
        if ( vista.getTxtNombres().getText().equals("")|| vista.getTxtClave().getText().equals("")|| vista.getTxtCorreo().getText().equals("")||
            vista.getTxtApellidos().getText().equals("")|| vista.getTxtCodigo().getText().equals("")|| vista.getTxtCelular().getText().equals("")||
            vista.getTxtCorreo().getText().equals("")|| vista.getTxtRuc().getText().equals("")||vista.getTxtDireccion().getText().equals("")||
            vista.getTxtUsuario().getText().equals("")||vista.getTxtTelefono().getText().equals("")||vista.getTxtCelular().getText().equals("")
            ) {
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODAs lAS CASILLAS");
        }
        else if (validar_codigo() == false) {
            JOptionPane.showMessageDialog(null, "EL CODIGO DE LA PERSONA NATURAL YA EXISTE", "", JOptionPane.ERROR_MESSAGE);
        } else if (validar_cedula() == false) {
            JOptionPane.showMessageDialog(null, "LA CEDULA DE LA PERSONA NATURAL YA EXISTE", "", JOptionPane.ERROR_MESSAGE);
        }else {
        String codigo = vista.getTxtCodigo().getText();
        String idp = vista.getTxtRuc().getText();
        String nombre = vista.getTxtNombres().getText();
        String apellido = vista.getTxtApellidos().getText();
        String direccion= vista.getTxtDireccion().getText();
        String correo= vista.getTxtCorreo().getText();
        String telefono= vista.getTxtTelefono().getText();
        
        String celular = vista.getTxtCelular().getText();
        String usuario = vista.getTxtUsuario().getText();
        String clave = vista.getTxtClave().getText();//sueldo 
      

        
        ModeloNatural persona = new ModeloNatural(codigo,idp,nombre,apellido,direccion,correo,telefono,celular,usuario,clave);
        ImageIcon ic = (ImageIcon) vista.getJblFoto().getIcon();
        persona.setFoto(ic.getImage());
        if (persona.Crear_Persona_Natural()) {
            JOptionPane.showMessageDialog(vista, "Registro grabado Satisfactoriamente");
            cargaLista("");
            
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
   
        }   
    }
    private void Eliminar_Persona(){
         String idSeleccion = "";
        int fila = vista.getTablaPerNaturall().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
        } else {
            JTable tabla = vista.getTablaPerNaturall();
            idSeleccion = tabla.getValueAt(tabla.getSelectedRow(), 0).toString();
            ModeloNatural persona = new ModeloNatural(idSeleccion);
        if(persona.Eliminar_Natural()){
            cargaLista("");
            JOptionPane.showMessageDialog(vista, "SE HA ELIMINADO LA PERSONA");
        }else{
            System.out.println("NO SE HA ELIMIANDO NADA ");
        }

        }
                 
        
    }
    public final  void Encontrar(){
        vista.getTxtBuscar().addKeyListener( new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                   }

            @Override
            public void keyReleased(KeyEvent e) {
            ModeloNatural persona= new ModeloNatural();
             DefaultTableModel tabla;    
            tabla = (DefaultTableModel) vista.getTablaPerNaturall().getModel();
            
            String encontrar=vista.getTxtBuscar().getText();
            
            List <Persona_Natural> lista=persona.Listar(encontrar);
            tabla.setNumRows(0);
            lista.stream().forEach(p ->{
               

            String[] fila = {p.getCodigo(),p.getDNI(), p.getNombres(), p.getApellidos(), p.getDireccion(),p.getCorreo(), p.getTelefono(), p.getCelular(), p.getUsuario(), p.getClave()};
            tabla.addRow(fila);
            });
            
            }
        }
        
        );
                
        
    }
    //Cargar Imagen desde el label
    private void cargarImagen(){
    
        JFileChooser jfc= new JFileChooser();
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
  jfc.setFileFilter(filtroImagen);
//        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado=jfc.showOpenDialog(null);
        if(estado==JFileChooser.APPROVE_OPTION){
            try {
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vista.getJblFoto().getWidth(),
                        vista.getJblFoto().getHeight(),
                        Image.SCALE_DEFAULT
                );
             Icon ic=new ImageIcon(icono);
             vista.getJblFoto().setIcon(ic);
             vista.getJblFoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControladorNatural.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    public void Rellenar_Dialogo_Editar() {
        String idSeleccion = "";
        int fila = vista.getTablaPerNaturall().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
        } else {
            JTable tabla = vista.getTablaPerNaturall();
            idSeleccion = tabla.getValueAt(tabla.getSelectedRow(), 1 ).toString();
        }

        ModeloNatural persona = new ModeloNatural(idSeleccion);
        List<Persona_Natural> lista = persona.Buscar_Natural();
        for (int i = 0; i < lista.size(); i++) {
            Persona_Natural p = lista.get(i);
            String cod = p.getCodigo();
            String id = p.getDNI();
            String nombre = p.getNombres();
            String apellido = p.getApellidos();
            String dire = p.getDireccion();
            String correo = p.getCorreo();
            String telefono = p.getTelefono();
            String celular = p.getCelular();
            String usu=p.getUsuario();
            String clave=p.getClave();
            
            Image img = p.getFoto();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                vista.getJblFoto_act().setIcon(icon);
            } else {
                vista.getJblFoto_act().setIcon(null);
            }
            
            vista.getDialogo_Natural().setVisible(true);
            
            vista.getDialogo_Natural().setTitle("EDITAR PERSONA");
//            vista.getDialogo_Natural().setSize(525, 700);
//            
//            vista.getDialogo_Natural().setLocationRelativeTo(null);
            vista.getTxtcodigo_act().setText(cod);
            vista.getTxtcodigo_act().setEditable(false);
            vista.getTxtruc_act().setText(id);
            vista.getTxtruc_act().setEditable(false);
            vista.getTxtNombres_act().setText(nombre);
            vista.getTxtApellidos_act().setText(apellido);
            vista.getTxtdireccion_act().setText(dire);
            vista.getTxtcorreo_act().setText(correo);
            vista.getTxtTelefono_act().setText(telefono);
            vista.getTxtCelular_act().setText(celular);
            vista.getTxtUsuario_act().setText(usu);
            vista.getTxtClave_act().setText(clave);
            
        }
    }
    private void Editar_Natural () {
          String codigo= vista.getTxtcodigo_act().getText();
          String id=vista.getTxtruc_act().getText();
          String nombre=vista.getTxtNombres_act().getText();
          String apellido=vista.getTxtApellidos_act().getText();
          String dire=vista.getTxtdireccion_act().getText();
          String correo=vista.getTxtcorreo_act().getText();
          String tele=vista.getTxtTelefono_act().getText();
          String celu=vista.getTxtCelular_act().getText();
          String usu=vista.getTxtUsuario_act().getText();
          String clave=vista.getTxtClave_act().getText();
        

        ModeloNatural persona = new ModeloNatural(codigo,id,nombre,apellido,dire,correo,tele,celu,usu,clave);
        ImageIcon ic = (ImageIcon) vista.getJblFoto_act().getIcon();
        persona.setFoto(ic.getImage());
        if (persona.Editar_Natural()) {
            JOptionPane.showMessageDialog(vista, "Registro Modificado");
            cargaLista("");
            vista.getDialogo_Natural().setVisible(false);
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
    }
    //validar si existen codigo
    public boolean validar_codigo() {
        String sql = "SELECT codigo FROM persona_natural  WHERE codigo ='" + vista.getTxtCodigo().getText() + "'";
        ResultSet rs = conecta.query(sql);
        try {
            if (rs.next() == true) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persona_Natural.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //validar si existen cedula 
    public boolean validar_cedula() {
        String sql = "SELECT ruc FROM persona_natural  WHERE ruc='" + vista.getTxtRuc().getText() + "'";
        ResultSet rs = conecta.query(sql);
        try {
            if (rs.next() == true) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persona_Natural.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    KeyListener kcn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char codigo = ke.getKeyChar();
                if ((codigo < '0' | codigo > '9') | (vista.getTxtCodigo().getText().length() >= 4)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener krn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char ruc = ke.getKeyChar();
                if ((ruc < '0' | ruc > '9') | (vista.getTxtRuc().getText().length() >= 13)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener knn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                char Nombres = ke.getKeyChar();
               if (((Nombres < 'a' | Nombres > 'z') & (Nombres < 'A' | Nombres > 'Z') & (Nombres!=45)& (Nombres != KeyEvent.VK_SPACE)) | (vista.getTxtNombres().getText().length() >= 50)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kan = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                char Nombres = ke.getKeyChar();
               if (((Nombres < 'a' | Nombres > 'z') & (Nombres < 'A' | Nombres > 'Z') & (Nombres!=45)& (Nombres != KeyEvent.VK_SPACE)) | (vista.getTxtApellidos().getText().length() >= 50)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kdn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                 char direccion = ke.getKeyChar();
                if (((direccion < 'a' | direccion > 'z') & (direccion < 'A' | direccion > 'Z') & (direccion < '0' | direccion > '9') & (direccion != 45) & (direccion != KeyEvent.VK_SPACE)) | (vista.getTxtDireccion().getText().length() >= 100)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kcon = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char correo = ke.getKeyChar();
        if (((correo < 'a' | correo > 'z') & (correo < 'A' | correo > 'Z') & (correo < '0' | correo > '9') & (correo != 64) & (correo != 46)) | (vista.getTxtCorreo().getText().length() >= 80)) {
            ke.consume();
        }
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener ktn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char telefono = ke.getKeyChar();
                if ((telefono < '0' | telefono > '9') | (vista.getTxtTelefono().getText().length() >= 4)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    KeyListener ktc = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char telefono = ke.getKeyChar();
                if ((telefono < '0' | telefono > '9') | (vista.getTxtCelular().getText().length() >= 10)) {
                    ke.consume();
                }
            
            }
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener krna = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char ruc = ke.getKeyChar();
                if ((ruc < '0' | ruc > '9') | (vista.getTxtruc_act().getText().length() >= 13)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener knna = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                char Nombres = ke.getKeyChar();
               if (((Nombres < 'a' | Nombres > 'z') & (Nombres < 'A' | Nombres > 'Z') & (Nombres!=45)& (Nombres != KeyEvent.VK_SPACE)) | (vista.getTxtNombres_act().getText().length() >= 50)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kana = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                char Nombres = ke.getKeyChar();
               if (((Nombres < 'a' | Nombres > 'z') & (Nombres < 'A' | Nombres > 'Z') & (Nombres!=45)& (Nombres != KeyEvent.VK_SPACE)) | (vista.getTxtApellidos_act().getText().length() >= 50)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kdna = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                 char direccion = ke.getKeyChar();
                if (((direccion < 'a' | direccion > 'z') & (direccion < 'A' | direccion > 'Z') & (direccion < '0' | direccion > '9') & (direccion != 45) & (direccion != KeyEvent.VK_SPACE)) | (vista.getTxtdireccion_act().getText().length() >= 100)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener kcona = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char correo = ke.getKeyChar();
        if (((correo < 'a' | correo > 'z') & (correo < 'A' | correo > 'Z') & (correo < '0' | correo > '9') & (correo != 64) & (correo != 46)) | (vista.getTxtcorreo_act().getText().length() >= 80)) {
            ke.consume();
        }
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
    KeyListener ktna = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char telefono = ke.getKeyChar();
                if ((telefono < '0' | telefono > '9') | (vista.getTxtTelefono_act().getText().length() >= 9)) {
                    ke.consume();
                }
            
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    KeyListener ktca = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                   char telefono = ke.getKeyChar();
                if ((telefono < '0' | telefono > '9') | (vista.getTxtCelular_act().getText().length() >= 10)) {
                    ke.consume();
                }
            
            }
            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                cargaLista(vista.getTxtBuscar().getText());
            }

        };
    
}
