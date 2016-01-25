
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class GesammtUebersicht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Frame fenster = new Frame("Adressbuch");
				
		fenster.setLocation(10,20);
		fenster.setSize(500,400);
		 
				GridLayout fensterLayout = new GridLayout (6, 1);
		 
				fenster.setLayout(fensterLayout);
		 
		
		 Panel l = new Panel();
		 l.setLayout(new GridLayout(1,6));
		 l.add(new Label("Name"));
		 l.add(new Label("Vorname"));
		 l.add(new Label("Straﬂe"));
		 l.add(new Label("PLZ"));
		 l.add(new Label("ORT"));
		 l.add(new Label("TEL"));
		 fenster.add(l);
		 
		 l = new Panel();
		 l.setLayout(new GridLayout(1,6));
		 l.add(new Label("char_Name"));
		 l.add(new Label("char Vorname"));
		 l.add(new Label("char Straﬂe"));
		 l.add(new Label("char PLZ"));
		 l.add(new Label("char ORT"));
		 l.add(new Label("char TEL"));
		 
		 l = new Panel();
		 l.setLayout(new GridLayout(1,6));
		 l.add(new Label("char_Name"));
		 l.add(new Label("char Vorname"));
		 l.add(new Label("char Straﬂe"));
		 l.add(new Label("char PLZ"));
		 l.add(new Label("char ORT"));
		 l.add(new Label("char TEL"));
		 fenster.add(l);
		 
		 Button neu = new Button ("Neu");
		 fenster.add(neu);
		 
		 fenster.setVisible (true);
	}

}
