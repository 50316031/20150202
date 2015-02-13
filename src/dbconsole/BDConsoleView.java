package dbconsole;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDConsoleView extends Frame implements ActionListener,WindowListener{

		
		public BDConsoleView(BDConsoleController controller){
			
			int ID,hight,weight;
			String name;
			ResultSet rs;
			
			MySQL mysql = new MySQL();
			
			rs = mysql.selectAll();
			
			addWindowListener(this);
			setTitle("50316031");
			setLayout(new FlowLayout(FlowLayout.CENTER));
			
			try {
				while(rs.next()){
				ID = rs.getInt("ID");
				name = rs.getString("name");
				hight = rs.getInt("hight");
				weight = rs.getInt("weight");
				add(new Label("ID:"+ ID));
				add(new Label("ñºëO:"+ name));
				add(new Label("êgí∑:"+ hight));
				add(new Label("ëÃèd:"+ weight));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
}
