import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaLogin extends JFrame {

    private final GradientPanel panel;
    private final JTextField campoUsuario = new JTextField();
    private final JPasswordField campoSenha = new JPasswordField();

    public JanelaLogin(){


        setSize(300,650);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new GradientPanel(Color.decode("#eedae5"),Color.decode("#eedae5"));


        add(panel);
        logo();
        usuario(campoUsuario);
        senha(campoSenha);
        entrar_registrar();

    }
    public void logo(){

        JLabel espaco3 = new JLabel("", SwingConstants.CENTER);
        espaco3.setPreferredSize(new Dimension(150,50));
        espaco3.setForeground(Color.decode("#FFFFFF"));

        ImageIcon icon = new ImageIcon("assets/img/logo.png");
        Image image = icon.getImage().getScaledInstance(200, 100,Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(image));

        panel.add(espaco3);
        panel.add(logo);

    }

    public void usuario(JTextField campoUsuario){

        JLabel user = new JLabel("Usuário", SwingConstants.CENTER);
        user.setPreferredSize(new Dimension(200,20));
        user.setForeground(Color.decode("#FFFFFF"));


        campoUsuario.setPreferredSize(new Dimension(200,50));
        campoUsuario.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        campoUsuario.setBackground(Color.decode("#FFFFFF"));
        campoUsuario.setForeground(Color.BLACK);

        JLabel espaco2 = new JLabel("", SwingConstants.CENTER);
        espaco2.setPreferredSize(new Dimension(200,75));
        espaco2.setForeground(Color.decode("#FFFFFF"));

        panel.add(espaco2);
        panel.add(user);
        panel.add(campoUsuario);

    }

    public void senha(JPasswordField campoSenha){

        JLabel password = new JLabel("Senha", SwingConstants.CENTER);
        password.setPreferredSize(new Dimension(200,20));
        password.setForeground(Color.decode("#FFFFFF"));

        campoSenha.setPreferredSize(new Dimension(200,50));
        campoSenha.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        campoSenha.setBackground(Color.decode("#FFFFFF"));
        campoSenha.setForeground(Color.BLACK);


        JLabel espaco1 = new JLabel("", SwingConstants.CENTER);
        espaco1.setPreferredSize(new Dimension(200,50));
        espaco1.setForeground(Color.decode("#FFFFFF"));

        panel.add(espaco1);
        panel.add(password);
        panel.add(campoSenha);
        panel.add(espaco1);

    }
    public void entrar_registrar(){

        JButton login = new JButton(String.valueOf(SwingConstants.CENTER));
        login.setText("Entrar");
        login.setForeground(Color.decode("#eedae5"));
        login.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        login.setBackground(Color.decode("#FFFFFF"));
        login.setPreferredSize(new Dimension(100,25));

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("logado");
            }
        });


        JButton registro = new JButton(String.valueOf(SwingConstants.CENTER));
        registro.setText("Cadastra-se");
        registro.setForeground(Color.decode("#eedae5"));
        registro.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        registro.setBackground(Color.decode("#FFFFFF"));
        registro.setPreferredSize(new Dimension(100,25));

        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cadastrado");
            }
        });

        JLabel espaco = new JLabel("", SwingConstants.CENTER);
        espaco.setPreferredSize(new Dimension(200,20));
        espaco.setForeground(Color.decode("#FFFFFF"));

        panel.add(login);
        panel.add(espaco);
        panel.add(registro);

    }




}
