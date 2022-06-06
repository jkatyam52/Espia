import java.awt.event.*;
import javax.swing.*;

public class Usuario implements ActionListener
{
	private int nr=0, vida=0;
	private JButton btn_tmp;
	private JTextField tf_tmp;
	private JButton btn_iniciar;
	private JButton[] btn_botones;

	Usuario(JTextField tf_tmp, int nr, int vida)
	{
		this.tf_tmp = tf_tmp;
		this.nr = nr;
		this.vida = vida;
	}

	public void setBtn_botones(JButton[] btn_botones, JButton btn_iniciar) {
		this.btn_iniciar = btn_iniciar;
		this.btn_botones = btn_botones;
	}

	public void actionPerformed(ActionEvent e)
	{ 	int i;
		System.out.println("Envento");
		Espia obj = new Espia(nr, btn_botones);
		obj.setBtn_botones();

		vida++;
		
		if(e.getSource() == btn_iniciar){
			this.nr = obj.esconder();
			System.out.println("NR= "+nr);
		}else if(e.getSource() != btn_iniciar)
		{	
			btn_tmp = (JButton)e.getSource(); 
			tf_tmp.setText(btn_tmp.getText());
			i= Integer.parseInt(btn_tmp.getText());
			
			if(i==nr)
			{
				System.out.println("Ganaste, has encontrado al espia");
			}else if(obj.mover(i)==true)
			{
				this.nr = obj.esconder();
				System.out.println("El espia se ha movido, intento # "+vida+" NR= "+nr);
			}else{
				System.out.println("El espía no esta aquí, intento # "+vida+" sigue buscando");
			}
			
		}
	}

}