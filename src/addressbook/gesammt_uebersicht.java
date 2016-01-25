package addressbook;


import java.awt.*;

public class Gesammt_uebersicht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Frame fenster = new Frame("Adressbuch");
				
		fenster.setLocation(10,20);
		fenster.setSize(500,400);
		 
				GridLayout fensterLayout = new GridLayout (2, 2);
		 
				fenster.setLaayout(fensterLayout);
		 
		 Button start = new Button("Start");
		 fenster.add(start)
		 
		 fenster.setVisible (true);
	}

}
