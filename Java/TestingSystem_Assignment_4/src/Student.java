
public class Student {
private      int id;
private      String name;
private      String hometown;
private      Float mark;
public Student(String name , String hometown) {
	this.name = name ;
	this.hometown = hometown;
	this.mark =(float) 0;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getHometown() {
	return hometown;
}

public void setHometown(String hometown) {
	this.hometown = hometown;
}

public float getMark() {
	return mark;
}

public void setMark(float mark) {
	this.mark = mark;
}

public void addMark(float mark) {
	this.mark += mark;
}

@Override
public String toString() {
	String classification;
	if (mark < 4.0) {

classification = "Yeu";
	} else if (mark < 6) {

classification = "Trung binh";
	} else if (mark < 8) {

classification= "Kha";
	} else {

classification = "Gioi";
	}

	return "ID=" + id + ", Name='" + name + '\'' + ", Hometown='" + hometown + '\'' + ", Mark="
			+ mark + ", XepLoai='" + classification + '\'' ;	
}
}




