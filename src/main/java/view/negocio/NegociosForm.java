package view.negocio;

public class NegociosForm extends javax.swing.JPanel {
    public static enum formType {SIGNUP,UPDATE};
    public formType type;
    
    public NegociosForm(formType type) {
        initComponents();
        this.type = type;
        
        switch(type){
            case SIGNUP:{
                setViewToSignUp();
                break;
            }
            case UPDATE:{
                setViewToModify();
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblTitulo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Botones = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnRegistrar = new javax.swing.JToggleButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnCancelar = new javax.swing.JToggleButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtIdNegocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtGiroComercial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtInterior = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtColonia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtCP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtSuperficie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtHorario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtCoordenadas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setOpaque(false);
        Titulo.setLayout(new javax.swing.BoxLayout(Titulo, javax.swing.BoxLayout.LINE_AXIS));
        Titulo.add(filler2);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTitulo.setText("REGISTRO DE NEGOCIO");
        Titulo.add(lblTitulo);
        Titulo.add(filler1);

        Botones.setOpaque(false);
        Botones.setLayout(new javax.swing.BoxLayout(Botones, javax.swing.BoxLayout.LINE_AXIS));
        Botones.add(filler5);

        btnRegistrar.setText("Registrar");
        Botones.add(btnRegistrar);
        Botones.add(filler3);

        btnCancelar.setText("Cancelar");
        Botones.add(btnCancelar);
        Botones.add(filler4);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler6);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(5, 3, 20, 10));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        txtIdNegocio.setEditable(false);
        txtIdNegocio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdNegocio.setOpaque(false);
        jPanel3.add(txtIdNegocio);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID Negocio");
        jPanel3.add(jLabel2);

        jPanel2.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtNombre);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre*");
        jPanel4.add(jLabel3);

        jPanel2.add(jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        txtGiroComercial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtGiroComercial);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giro Comercial*");
        jPanel5.add(jLabel4);

        jPanel2.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(txtCalle);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Calle*");
        jPanel6.add(jLabel5);

        jPanel2.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(2, 1));

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(txtNumero);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Número*");
        jPanel7.add(jLabel6);

        jPanel2.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(2, 1));

        txtInterior.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(txtInterior);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Interior");
        jPanel8.add(jLabel7);

        jPanel2.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(2, 1));

        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(txtColonia);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Colonia*");
        jPanel9.add(jLabel8);

        jPanel2.add(jPanel9);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(2, 1));

        txtMunicipio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtMunicipio);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Municipio*");
        jPanel10.add(jLabel9);

        jPanel2.add(jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(2, 1));

        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(txtEstado);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Estado*");
        jPanel11.add(jLabel10);

        jPanel2.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(2, 1));

        txtCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(txtCP);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("C.P.*");
        jPanel12.add(jLabel11);

        jPanel2.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(2, 1));

        txtSuperficie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(txtSuperficie);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Superficie");
        jPanel13.add(jLabel12);

        jPanel2.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        txtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel14.add(txtHorario);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Horario");
        jPanel14.add(jLabel13);

        jPanel2.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.GridLayout(2, 1));

        txtCoordenadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(txtCoordenadas);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Coordenadas");
        jPanel15.add(jLabel14);

        jPanel2.add(jPanel15);

        jPanel1.add(jPanel2);
        jPanel1.add(filler7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setViewToSignUp(){        
        this.lblTitulo.setText("REGISTRO DE NEGOCIO");
        this.btnRegistrar.setText("Registrar");
    }
    
    private void setViewToModify(){
        this.lblTitulo.setText("MODIFICACIÓN DE NEGOCIO");
        this.btnRegistrar.setText("Modificar");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Titulo;
    public javax.swing.JToggleButton btnCancelar;
    public javax.swing.JToggleButton btnRegistrar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtCP;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtColonia;
    public javax.swing.JTextField txtCoordenadas;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtGiroComercial;
    public javax.swing.JTextField txtHorario;
    public javax.swing.JTextField txtIdNegocio;
    public javax.swing.JTextField txtInterior;
    public javax.swing.JTextField txtMunicipio;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}
