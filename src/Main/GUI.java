

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
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
        
        pnCentro.setLayout(new GridLayout(3,2));
        
        pnCentro.add(lbNota);
        pnCentro.add(lbConceito);
        
        pnCentro.add(tfNotainformada);
        pnCentro.add(lbVazio);
        pnCentro.add(lbResultado);
        pnCentro.add(btEnviar);
        
        btEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setValor(Integer.valueOf(tfNotainformada.getText()));
                
                entidade.setInsuficiente(String.valueOf(lbInsuficiente.getText()));
                entidade.setRegular(String.valueOf(lbRegular.getText()));
                entidade.setBom(String.valueOf(lbBom.getText()));
                entidade.setOtimo(String.valueOf(lbOtimo.getText()));
                
                lbResultado.setText(String.valueOf(entidade.getResultado()));
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
