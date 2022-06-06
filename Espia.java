import javax.swing.*;
import java.util.*;

public class Espia 
{
	private int nr=0;

	private JButton[] btn_botones;
	private Random rnd = new Random();

	public Espia(int nr, JButton[] btn_botones)
	{
		this.nr = nr;
		this.btn_botones = btn_botones;
	}
	
	public void setBtn_botones() {
		int x=0, y=0;
		x=btn_botones[nr].getLocation().x;
		y=btn_botones[nr].getLocation().y;
		System.out.println("Número random= "+nr+" X= "+x+" Y= "+y);
	}
	
	int nespia(){
		return nr;
	}
	
	boolean mover(int a)
	{ int posicion, total=0;
		posicion= nr+btn_botones[nr].getLocation().x+btn_botones[nr].getLocation().y;
		total=(a+btn_botones[a].getLocation().x+btn_botones[a].getLocation().y)-posicion;
		System.out.println("Número random= "+nr+" X= "+btn_botones[a].getLocation().x+" Y= "+btn_botones[a].getLocation().y+" Posición= "+posicion+" Total= "+total);

			if( total == -11 || total==55 || total==-121 || total==-66  || total== 121 || total== -55 || total==11 || total == 66){
				return true;
			}

		return false;		
	}
	
	public int esconder()
	{		
		this.nr=rnd.nextInt(100);
		return nr;
	}

}