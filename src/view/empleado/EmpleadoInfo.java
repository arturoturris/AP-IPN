package view.empleado;

public class EmpleadoInfo extends javax.swing.JPanel {

    public EmpleadoInfo() {
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
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel10 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        InfoUsuario = new javax.swing.JPanel();
        Imagen = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnCrearInicio = new javax.swing.JButton();
        TextoUsuario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtUltimoInicio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        InfoPersona = new javax.swing.JPanel();
        Nombre = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Paterno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        Materno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        Sexo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        InfoEmpleado = new javax.swing.JPanel();
        Id = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaAlta = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setOpaque(false);
        Titulo.setLayout(new javax.swing.BoxLayout(Titulo, javax.swing.BoxLayout.LINE_AXIS));
        Titulo.add(filler3);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("INFORMACIÓN DE EMPLEADO");
        Titulo.add(jLabel10);
        Titulo.add(filler4);

        InfoUsuario.setOpaque(false);

        lblImagen.setBackground(new java.awt.Color(0, 102, 204));
        lblImagen.setMinimumSize(new java.awt.Dimension(120, 100));
        lblImagen.setOpaque(true);

        javax.swing.GroupLayout ImagenLayout = new javax.swing.GroupLayout(Imagen);
        Imagen.setLayout(ImagenLayout);
        ImagenLayout.setHorizontalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ImagenLayout.setVerticalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCrearInicio.setText("Crear inicio de sesión");

        TextoUsuario.setOpaque(false);
        TextoUsuario.setLayout(new java.awt.GridLayout(4, 2, 0, 5));

        jLabel13.setText("Último inicio:");
        TextoUsuario.add(jLabel13);

        txtUltimoInicio.setEditable(false);
        txtUltimoInicio.setOpaque(false);
        TextoUsuario.add(txtUltimoInicio);

        jLabel14.setText("Usuario:");
        TextoUsuario.add(jLabel14);

        txtUsuario.setEditable(false);
        txtUsuario.setOpaque(false);
        TextoUsuario.add(txtUsuario);

        jLabel15.setText("Contraseña:");
        TextoUsuario.add(jLabel15);

        txtContraseña.setEditable(false);
        txtContraseña.setOpaque(false);
        TextoUsuario.add(txtContraseña);

        jLabel12.setText("Tipo:");
        TextoUsuario.add(jLabel12);

        txtTipo.setEditable(false);
        txtTipo.setOpaque(false);
        TextoUsuario.add(txtTipo);

        javax.swing.GroupLayout InfoUsuarioLayout = new javax.swing.GroupLayout(InfoUsuario);
        InfoUsuario.setLayout(InfoUsuarioLayout);
        InfoUsuarioLayout.setHorizontalGroup(
            InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        InfoUsuarioLayout.setVerticalGroup(
            InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearInicio)
                .addContainerGap())
        );

        InfoPersona.setOpaque(false);
        InfoPersona.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        Nombre.setOpaque(false);
        Nombre.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setText("Nombre:");
        Nombre.add(jLabel2);

        txtNombre.setEditable(false);
        txtNombre.setOpaque(false);
        Nombre.add(txtNombre);

        InfoPersona.add(Nombre);

        Paterno.setOpaque(false);
        Paterno.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setText("Paterno:");
        Paterno.add(jLabel3);

        txtPaterno.setEditable(false);
        txtPaterno.setOpaque(false);
        Paterno.add(txtPaterno);

        InfoPersona.add(Paterno);

        Materno.setOpaque(false);
        Materno.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setText("Materno:");
        Materno.add(jLabel4);

        txtMaterno.setEditable(false);
        txtMaterno.setOpaque(false);
        Materno.add(txtMaterno);

        InfoPersona.add(Materno);

        Sexo.setOpaque(false);
        Sexo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setText("Sexo:");
        Sexo.add(jLabel5);

        txtSexo.setEditable(false);
        txtSexo.setOpaque(false);
        Sexo.add(txtSexo);

        InfoPersona.add(Sexo);

        InfoEmpleado.setOpaque(false);
        InfoEmpleado.setLayout(new java.awt.GridLayout(6, 2, 0, 5));

        Id.setOpaque(false);
        Id.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setText("Id:");
        Id.add(jLabel1);

        txtId.setEditable(false);
        txtId.setOpaque(false);
        Id.add(txtId);

        InfoEmpleado.add(Id);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setText("Puesto:");
        jPanel6.add(jLabel6);

        txtPuesto.setEditable(false);
        txtPuesto.setOpaque(false);
        jPanel6.add(txtPuesto);

        InfoEmpleado.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setText("Horario:");
        jPanel7.add(jLabel7);

        txtHorario.setEditable(false);
        txtHorario.setOpaque(false);
        jPanel7.add(txtHorario);

        InfoEmpleado.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setText("Salario:");
        jPanel8.add(jLabel8);

        txtSalario.setEditable(false);
        txtSalario.setOpaque(false);
        jPanel8.add(txtSalario);

        InfoEmpleado.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setText("Fecha alta:");
        jPanel9.add(jLabel9);

        txtFechaAlta.setEditable(false);
        txtFechaAlta.setOpaque(false);
        jPanel9.add(txtFechaAlta);

        InfoEmpleado.add(jPanel9);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel11.setText("Estado:");
        jPanel11.add(jLabel11);

        txtEstado.setEditable(false);
        txtEstado.setOpaque(false);
        jPanel11.add(txtEstado);

        InfoEmpleado.add(jPanel11);

        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnRegresar)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                            .addComponent(InfoPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InfoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addComponent(InfoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Id;
    private javax.swing.JPanel Imagen;
    private javax.swing.JPanel InfoEmpleado;
    private javax.swing.JPanel InfoPersona;
    private javax.swing.JPanel InfoUsuario;
    private javax.swing.JPanel Materno;
    private javax.swing.JPanel Nombre;
    private javax.swing.JPanel Paterno;
    private javax.swing.JPanel Sexo;
    private javax.swing.JPanel TextoUsuario;
    private javax.swing.JPanel Titulo;
    public javax.swing.JButton btnCrearInicio;
    public javax.swing.JButton btnRegresar;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel lblImagen;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtFechaAlta;
    public javax.swing.JTextField txtHorario;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtMaterno;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPaterno;
    public javax.swing.JTextField txtPuesto;
    public javax.swing.JTextField txtSalario;
    public javax.swing.JTextField txtSexo;
    public javax.swing.JTextField txtTipo;
    public javax.swing.JTextField txtUltimoInicio;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
