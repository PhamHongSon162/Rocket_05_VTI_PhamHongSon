
public class HighSchoolStudent extends Studentq3 {
	private String clazz;
	private String desiredUniversity;

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	@Override
	public String toString() {
		return super.toString() + "" + clazz + desiredUniversity ;
	}

}
