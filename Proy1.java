import javax.swing.*;

public class Proy1 /*implements ActionListener*/
{
	private JFrame ventanaPrincipal;
	private JLabel lbl_presentacion, lbl_numerosF, lbl_numerosC, lbl_norte, lbl_sur, lbl_oeste, lbl_este, lbl_noroeste, lbl_suroeste, lbl_sureste, lbl_noreste;
	private JButton[] btn_botones;
	private JButton btn_iniciar;
	private JTextField tf_comprobante;

	public static void main(String[] args)
	{
		new Proy1();
	}

	Proy1()
	{	
		int nr=0, vida=0;
		
		//CREACION DE LA VENTANA PRINCIPAL
		ventanaPrincipal = new JFrame("JUEGO DE ESPIA");
		ventanaPrincipal.setBounds(100,100,1370,715);
		ventanaPrincipal.setLayout(null);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//CREACION DE LA PRESENTACION
		lbl_presentacion = new JLabel("Universidad Tecnologica de Panama");
		lbl_presentacion.setBounds(200,160,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("Licenciatura Desarrollo de Software");
		lbl_presentacion.setBounds(200,180,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("Desarrollo de Software III");
		lbl_presentacion.setBounds(230,200,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("Proyecto 1 - Espia");
		lbl_presentacion.setBounds(235,230,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("Joseph Miranda");
		lbl_presentacion.setBounds(260,270,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("8-916-2401");
		lbl_presentacion.setBounds(265,290,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("1LS-221");
		lbl_presentacion.setBounds(272,320,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		lbl_presentacion = new JLabel("02/04/2022");
		lbl_presentacion.setBounds(266,350,300,20);
		ventanaPrincipal.add(lbl_presentacion);

		//PUNTOS CARDINALES
		lbl_norte = new JLabel("NORTE");
		lbl_norte.setBounds(850,0,100,20);  
		ventanaPrincipal.add(lbl_norte);

		lbl_noreste = new JLabel("NE");
		lbl_noreste.setBounds(1250,2,100,20);
		ventanaPrincipal.add(lbl_noreste);

		lbl_este = new JLabel("ESTE");
		lbl_este.setBounds(1250,327,100,20);
		ventanaPrincipal.add(lbl_este);

		lbl_sureste = new JLabel("SE");
		lbl_sureste.setBounds(1250,640,100,20);
		ventanaPrincipal.add(lbl_sureste);

		lbl_sur = new JLabel("SUR");
		lbl_sur.setBounds(855,700,100,20);
		ventanaPrincipal.add(lbl_sur);

		lbl_suroeste= new JLabel("SO");
		lbl_suroeste.setBounds(475,640,100,20);
		ventanaPrincipal.add(lbl_suroeste);

		lbl_oeste = new JLabel("OESTE");
		lbl_oeste.setBounds(475,327,100,20);
		ventanaPrincipal.add(lbl_oeste);

		lbl_noroeste = new JLabel("NO");
		lbl_noroeste.setBounds(475,2,100,20);
		ventanaPrincipal.add(lbl_noroeste); 

		tf_comprobante = new JTextField();
		tf_comprobante.setBounds(266,380,100,20);
		ventanaPrincipal.add(tf_comprobante);

		Usuario usuario = new Usuario(tf_comprobante, nr, vida);

		//BOTON INICIAR JUEGO
		btn_iniciar = new JButton("Iniciar");
		btn_iniciar.setBounds(266,410,100,20);
		btn_iniciar.addActionListener(usuario);
		ventanaPrincipal.add(btn_iniciar);

		btn_botones = new JButton[100];

		//CREACION DE MATRIZ PARA EL ESPIA
		for (int i=0; i<100; i++)
		{	
			btn_botones[i] = new JButton(String.valueOf(i+1));
			btn_botones[i].setBounds(550+65*(i%10),603-65*(i/10),60,60);
			System.out.println("Número generado= "+ (i+1) + " X= "+ (550+65*(i%10)) + " Y= "+ (603-65*(i/10)) + "");
			btn_botones[i].addActionListener(usuario);
			ventanaPrincipal.add(btn_botones[i]);
		}

		usuario.setBtn_botones(btn_botones, btn_iniciar);

		//CREACION DE FILA Y COLUMNA DE NUMEROS
		for (int i=0; i<10; i++)
		{
			lbl_numerosC = new JLabel(String.valueOf(i+1));
			lbl_numerosF = new JLabel(String.valueOf(i+1));

			lbl_numerosC.setBounds(575+65*(i%10),650,60,60);
			lbl_numerosF.setBounds(530,603-65*(i%10),60,60);

			ventanaPrincipal.add(lbl_numerosC);
			ventanaPrincipal.add(lbl_numerosF);
		}

		ventanaPrincipal.setVisible(true);

	}

}