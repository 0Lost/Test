package lecture5.strategy;

import javax.swing.*;
import java.awt.event.*;

public class Signal {
	private final int SAMPLING = 200;
	
	private Sampler sampler = new DefaultSampler();
	
	public void setSampler(Sampler s) {
		sampler = s;
	}
	
	public Signal(JTextArea jta) {
		Timer t = new Timer(SAMPLING, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amplitude = sampler.read();

				jta.append(""+String.format("%.6f", amplitude)+"\n");
				for(int i=0;i<(int)amplitude;i++)
					System.out.print('*');
				System.out.println();
				// inform another view 
			}
		});
		t.start();
	}
	
}