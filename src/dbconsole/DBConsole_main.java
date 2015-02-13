package dbconsole;

import java.sql.ResultSet;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			BDConsoleController controller = new BDConsoleController();
			BDConsoleView frame = new BDConsoleView(controller);
			frame.setBounds(5,5,655,455);
			frame.setVisible(true);
			
	}

}
