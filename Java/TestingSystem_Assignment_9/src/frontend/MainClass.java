package frontend;

import entity.OuterClass;
import entity.OuterClass.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         OuterClass outerClass = new OuterClass();
         outerClass.show();
         
         InnerClass innerClass = outerClass.new InnerClass();
         innerClass.show();
	}

}
