
//@author: Trisha Basak

   class Teacher {
    private String tname;
    private String subject;
    private int yrsOfExp;

    // Getters and Setters
    public String getTname(){
	return this.tname; }
    public void setTname(String tname){
		this.tname = tname; }
		
    public String getSubject(){
	return this.subject; }
    public void setSubject(String subject){
		this.subject = subject; }

    public int getYrsOfExp(){
		return yrsOfExp; }
    public void setYrsOfExp(int yrsOfExp){
		this.yrsOfExp = yrsOfExp; }
}

class Student {
    private String sname;
    private String degree;
    private String college;

    // Getters and Setters
    public String getSname(){
		return sname; }
    public void setSname(String sname){ 
	    this.sname = sname; }

    public String getDegree(){
		return degree; }
    public void setDegree(String degree){
		this.degree = degree; }

    public String getCollege(){
		return college; }
    public void setCollege(String college){
		this.college = college; }
}

class Relationship {
    public static void createRelationship(Student student, Teacher teacher) {
        System.out.println(student.getSname() + " takes " + teacher.getSubject() + " class under " + teacher.getTname());
    }

    public static void detailedRelationship(Teacher teacher, Student student) {
        System.out.println(teacher.getTname() + " teaches " + teacher.getSubject() + " to " + student.getSname()
                           + " who reads as " + student.getDegree() + " Student in " + student.getCollege() + " college");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTname("Amitava Sir");
        teacher.setSubject("OOPS design");
        teacher.setYrsOfExp(10);

        Student student1 = new Student();
        student1.setSname("Ankan");
        student1.setDegree("Btech");
        student1.setCollege("UEM");

        Student student2 = new Student();
        student2.setSname("Madhu");
        student2.setDegree("Btech");
        student2.setCollege("UEM");

        Relationship.createRelationship(student1, teacher);
        Relationship.detailedRelationship(teacher, student2);
    }
}