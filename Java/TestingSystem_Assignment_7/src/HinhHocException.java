
public class HinhHocException extends Exception {
	 public HinhHocException (String message) {
	        super(message);
	    }	     
	    @Override
	    public String getMessage() {
	        return "Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA;
	        		 
	    } 
	}


