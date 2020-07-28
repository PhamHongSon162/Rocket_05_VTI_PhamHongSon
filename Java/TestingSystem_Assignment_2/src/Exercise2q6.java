import javax.swing.JTable;
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
public class Exercise2q6 {
	 // frame 
    JFrame f; 
    // Table 
    JTable j; 
    Exercise2q6()
    { 
        f = new JFrame(); 
  
        // Frame Title //
        f.setTitle("Thông tin các  account"); 
        String[] columnNames = {"email","fullName","departmentName"};
		String[] [] data = { 
				{"hongson@gmail.com","Phạm Hồng Sơn","Marketing"},
				{"lucgay@gmail.com","Lê Huy Lực","Sale"},
				{"huygay@gmail.com","Lê Đăng Huy","Manager"}
		};
		j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true 
        f.setVisible(true); 
    } 

	public static void main(String[] args) {
		
         new Exercise2q6();
	}

}
