package demos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MyApplet extends JApplet implements ActionListener {
	
	
	 JMenuBar mb;
	    JMenu college;
	    JMenuItem engg,medical;
	    JTextArea area;

	    public void init()
	    {
	      mb = new JMenuBar();
	      college = new JMenu("College");
	      engg = new JMenuItem("Engineering");
	      medical = new JMenuItem("Medical");
	      area = new JTextArea(20,20);

	      college.add(engg);
	      college.add(medical);
	      mb.add(college);
	      setJMenuBar(mb);
	      add(area);
	      setLayout(new FlowLayout());

	      validate();

	    }


	   public void start()
	    {
	      engg.addActionListener(this);
	      engg.setActionCommand("engg");
	      medical.addActionListener(this);
	      medical.setActionCommand("medical");

	    }

	   public void stop()
	   {}

	   public void destroy(){}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s = ae.getActionCommand();

        if(s.equals("engg"))
        area.append("All is well");
        else if(s.equals("medical"))
        area.append("Hey ,mamu kya karela hai");

	}

}
