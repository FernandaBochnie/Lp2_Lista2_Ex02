

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    JPanel pnNorte = new JPanel();
    JPanel pnCentro = new JPanel();
    
    private JLabel lbNota = new JLabel("Nota");
    private JLabel lbConceito = new JLabel("Conceito");
    private JButton btEnviar = new JButton("Enviar");
    
    private JTextField tfNotainformada = new JTextField();
    
    private JLabel lbResultado = new JLabel();
    private JLabel lbVazio = new JLabel();
    
    private JLabel lbNota49 = new JLabel("0 à 49");
    private JLabel lbNota64 = new JLabel("50 à 64");
    private JLabel lbNota84 = new JLabel("65 à 84");
    private JLabel lbNota100 = new JLabel("85 à 100");
    
    private JLabel lbInsuficiente = new JLabel("Insuficiente");
    private JLabel lbRegular = new JLabel("Regular");
    private JLabel lbBom = new JLabel("Bom");
    private JLabel lbOtimo = new JLabel("Ótimo");
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("Lista 2 - Exercício 02");
        
        cp.add(pnNorte, BorderLayout.NORTH);
        cp.add(pnCentro, BorderLayout.CENTER);
        
        pnNorte.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pnCentro.setLayout(new GridLayout(7,2));
        
        pnCentro.add(lbNota);
        pnCentro.add(lbConceito);
        
        pnCentro.add(lbNota49);
        pnCentro.add(lbInsuficiente);
        pnCentro.add(lbNota64);
        pnCentro.add(lbRegular);
        pnCentro.add(lbNota84);
        pnCentro.add(lbBom);
        pnCentro.add(lbNota100);
        pnCentro.add(lbOtimo);
        
        pnCentro.add(tfNotainformada);
        pnCentro.add(lbResultado);
        pnCentro.add(lbVazio);
        pnCentro.add(btEnviar);
        
        lbNota.setOpaque(true);
        lbNota49.setOpaque(true);
        lbNota64.setOpaque(true);
        lbNota84.setOpaque(true);
        lbNota100.setOpaque(true);
        
        lbConceito.setOpaque(true);
        lbInsuficiente.setOpaque(true);
        lbRegular.setOpaque(true);
        lbBom.setOpaque(true);
        lbOtimo.setOpaque(true);
        
        lbNota.setBackground(Color.BLUE);
        lbNota49.setBackground(Color.cyan);
        lbNota64.setBackground(Color.cyan);
        lbNota84.setBackground(Color.cyan);
        lbNota100.setBackground(Color.cyan);

        lbConceito.setBackground(Color.GRAY);
        lbInsuficiente.setBackground(Color.lightGray);
        lbRegular.setBackground(Color.lightGray);
        lbBom.setBackground(Color.lightGray);
        lbOtimo.setBackground(Color.lightGray);

        btEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
               
                lbNota49.setBackground(Color.cyan);
                lbNota64.setBackground(Color.cyan);
                lbNota84.setBackground(Color.cyan);
                lbNota100.setBackground(Color.cyan);

                lbInsuficiente.setBackground(Color.lightGray);
                lbRegular.setBackground(Color.lightGray);
                lbBom.setBackground(Color.lightGray);
                lbOtimo.setBackground(Color.lightGray);
                
                int nota= Integer.parseInt(tfNotainformada.getText());
                if (nota>= 0 && nota< 50) {
                    lbInsuficiente.setBackground(Color.MAGENTA);
                }
                if (nota >= 50 && nota < 65) {
                    lbRegular.setBackground(Color.MAGENTA);
                }
                if (nota >= 65 && nota < 85) {
                    lbBom.setBackground(Color.MAGENTA);
                }
                if (nota >= 85 && nota <= 100) {
                    lbOtimo.setBackground(Color.MAGENTA);
                }
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
