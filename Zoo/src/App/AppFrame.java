package App;

import sources.Fecha;
import sources.ZooAnimal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame
{
    private String[] Tipos = {"Mamifero","Reptil"};
    private int ANIO_ACTUAL = 2018;

    private javax.swing.JButton btn  = new JButton("Presionar");
    private javax.swing.JLabel tituloLabel = new JLabel("Administrador de Animales");
    private javax.swing.JLabel nombreLabel = new JLabel("Nombre");
    private javax.swing.JTextField nombreTF = new JTextField();
    private javax.swing.JLabel nombreCientfLabel = new JLabel("Nombre Científico");
    private javax.swing.JTextField nombreCientfTF = new JTextField();
    private javax.swing.JSeparator separator1 = new JSeparator();
    private javax.swing.JLabel FechaNacLabel = new JLabel("Fecha de Nacimiento");
    private javax.swing.JLabel Mes = new JLabel("Mes:");
    private javax.swing.JComboBox mes = new JComboBox(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" });
    private javax.swing.JLabel Anio = new JLabel("Año:");
    private javax.swing.SpinnerNumberModel anio = new SpinnerNumberModel(ANIO_ACTUAL,ANIO_ACTUAL-100,ANIO_ACTUAL+100,1);
    private javax.swing.JLabel Dia = new JLabel("Día:");
    private javax.swing.SpinnerModel dia = new SpinnerNumberModel(1,1,31,1);
    private javax.swing.JLabel peligroExtincionLabel = new JLabel("Peligro de extinción:");
    private javax.swing.JCheckBox peligroExtincionBtn = new JCheckBox();
    private javax.swing.JLabel claseLabel = new JLabel("Clase");
    private javax.swing.JComboBox claseCombo = new JComboBox(Tipos);
    private JTextArea out = new JTextArea();
    private AppFrame(){
        init();
    }
    private void init(){
        JFrame frame = new JFrame("Administrador del Zoologico");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon(getClass().getResource("/App/icon.png")).getImage());
        //Titulo
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 0.5;
        c.weighty = 0;
        c.ipady = 10;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTHWEST;
        c.insets = new Insets(10,10,3,10);
        frame.add(tituloLabel,c);
        //Separador
        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        c.insets = new Insets(2,10,8,10);
        frame.add(separator1,c);
        //Label Nombre
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHEAST;
        c.gridx = 0;
        c.weighty = 0.4;
        c.fill = GridBagConstraints.NONE;
        c.gridy = 2;
        c.insets = new Insets(8,5,8,5);
        frame.add(nombreLabel,c);
        //Textfield nombre
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(nombreTF,c);
        //Label nombre cientifico
        c.gridwidth = 1;
        c.gridy = 3;
        c.gridx = 0;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        frame.add(nombreCientfLabel,c);
        //Text field nombre cientifico
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        frame.add(nombreCientfTF,c);
        //Label fecha nacimiento
        c.gridwidth = 1;
        c.gridy = 4;
        c.gridx = 0;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        frame.add(FechaNacLabel,c);
        //Dia label
        c.insets = new Insets(8,8,8,8);
        c.gridx = 1;
        c.weightx = 1;
        c.fill = GridBagConstraints.NONE;
        frame.add(Dia,c);
        //Dia spinner
        c.gridx = 2;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JSpinner(dia),c);
        //Mes label
        c.gridx = 3;
        c.weightx = 1;
        c.fill = GridBagConstraints.NONE;
        frame.add(Mes,c);
        //Mes selector
        c.gridx = 4;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(mes,c);
        //Año label
        c.gridx = 5;
        c.weightx = 1;
        c.fill = GridBagConstraints.NONE;
        frame.add(Anio,c);
        //año spinner
        c.gridx = 6;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JSpinner(anio),c);
        //En peligro de exitincion label
        c.gridy = 7;
        c.insets = new Insets(2,5,8,5);
        c.gridx = 0;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        frame.add(peligroExtincionLabel,c);
        //Checkbox pelibro extincion
        c.gridx = 1;
        c.weightx = 0;
        frame.add(peligroExtincionBtn,c);
        //clse exitincion label
        c.gridy = 7;
        c.gridx = 2;
        c.weightx = 0;
        c.fill = GridBagConstraints.NONE;
        frame.add(claseLabel,c);
        //clase textbox
        c.gridx = 3;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = GridBagConstraints.REMAINDER;
        frame.add(claseCombo,c);
        //Out textpane
        c.gridy = 8;
        c.gridheight = 3;
        c.gridx = 0;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.ipady = 60;
        frame.add(out,c);
        //Boton
        c.ipady = 0;
        c.weighty = 0;
        c.gridy = 12;
        c.gridx = 0;
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.anchor = GridBagConstraints.CENTER;
        frame.add(btn,c);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnEvent(e);
            }
        });
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);
    }
    private boolean camposCompletos(){
        return !nombreTF.getText().isEmpty() && !nombreCientfTF.getText().isEmpty();
    }
    private void BtnEvent(ActionEvent evt){
        if(camposCompletos()){
            ZooAnimal animal = new ZooAnimal();
            animal.setClase(claseCombo.getSelectedItem().toString());
            animal.setFechaNacimiento(new Fecha(dia.getValue().toString(),mes.getSelectedItem().toString(),anio.getValue().toString()));
            animal.setNombre(nombreTF.getText());
            animal.setNombreCientifico(nombreCientfTF.getText());
            animal.setPeligroExtincion(peligroExtincionBtn.isSelected());
            out.setText(animal.toString());
        }else{
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar","Alerta",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new AppFrame();
    }
}
