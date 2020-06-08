package view.negocio;

public class NegocioInfo extends javax.swing.JPanel {

    public NegocioInfo() {
        initComponents();
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
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Info = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdNegocio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtGiroComercial = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtInterior = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSuperficie = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCoordenadas = new javax.swing.JTextField();
        txtMapa = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setOpaque(false);
        Titulo.setLayout(new javax.swing.BoxLayout(Titulo, javax.swing.BoxLayout.LINE_AXIS));
        Titulo.add(filler1);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("INFORMACIÓN DEL NEGOCIO");
        Titulo.add(jLabel1);
        Titulo.add(filler2);

        Info.setOpaque(false);
        Info.setLayout(new java.awt.GridLayout(7, 2, 0, 10));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel2.setText("ID Negocio:");
        jPanel2.add(jLabel2);

        txtIdNegocio.setEditable(false);
        txtIdNegocio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdNegocio.setOpaque(false);
        jPanel2.add(txtIdNegocio);

        Info.add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3);

        txtNombre.setEditable(false);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        jPanel3.add(txtNombre);

        Info.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel4.setText("Giro comercial:");
        jPanel4.add(jLabel4);

        txtGiroComercial.setEditable(false);
        txtGiroComercial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtGiroComercial.setOpaque(false);
        jPanel4.add(txtGiroComercial);

        Info.add(jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel5.setText("Calle:");
        jPanel5.add(jLabel5);

        txtCalle.setEditable(false);
        txtCalle.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCalle.setOpaque(false);
        jPanel5.add(txtCalle);

        Info.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel6.setText("Número:");
        jPanel6.add(jLabel6);

        txtNumero.setEditable(false);
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumero.setOpaque(false);
        jPanel6.add(txtNumero);

        Info.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel7.setText("Interior:");
        jPanel7.add(jLabel7);

        txtInterior.setEditable(false);
        txtInterior.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtInterior.setOpaque(false);
        jPanel7.add(txtInterior);

        Info.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel8.setText("Colonia:");
        jPanel8.add(jLabel8);

        txtColonia.setEditable(false);
        txtColonia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtColonia.setOpaque(false);
        jPanel8.add(txtColonia);

        Info.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel9.setText("Municipio:");
        jPanel9.add(jLabel9);

        txtMunicipio.setEditable(false);
        txtMunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMunicipio.setOpaque(false);
        jPanel9.add(txtMunicipio);

        Info.add(jPanel9);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel10.setText("Estado:");
        jPanel10.add(jLabel10);

        txtEstado.setEditable(false);
        txtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEstado.setOpaque(false);
        jPanel10.add(txtEstado);

        Info.add(jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel11.setText("Código postal:");
        jPanel11.add(jLabel11);

        txtCodigoPostal.setEditable(false);
        txtCodigoPostal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigoPostal.setOpaque(false);
        jPanel11.add(txtCodigoPostal);

        Info.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel12.setText("Superficie:");
        jPanel12.add(jLabel12);

        txtSuperficie.setEditable(false);
        txtSuperficie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSuperficie.setOpaque(false);
        jPanel12.add(txtSuperficie);

        Info.add(jPanel12);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel13.setText("Horario:");
        jPanel13.add(jLabel13);

        txtHorario.setEditable(false);
        txtHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHorario.setOpaque(false);
        jPanel13.add(txtHorario);

        Info.add(jPanel13);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        jLabel14.setText("Coordenadas:");
        jPanel14.add(jLabel14);

        txtCoordenadas.setEditable(false);
        txtCoordenadas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCoordenadas.setOpaque(false);
        jPanel14.add(txtCoordenadas);

        Info.add(jPanel14);

        txtMapa.setBackground(new java.awt.Color(0, 102, 204));
        txtMapa.setOpaque(true);

        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addComponent(txtMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMapa, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Info;
    private javax.swing.JPanel Titulo;
    public javax.swing.JButton btnRegresar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtCodigoPostal;
    public javax.swing.JTextField txtColonia;
    public javax.swing.JTextField txtCoordenadas;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtGiroComercial;
    public javax.swing.JTextField txtHorario;
    public javax.swing.JTextField txtIdNegocio;
    public javax.swing.JTextField txtInterior;
    private javax.swing.JLabel txtMapa;
    public javax.swing.JTextField txtMunicipio;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}
