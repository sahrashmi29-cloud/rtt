package week17;

public class Student
{
    private String studentId, name, course;
    Student(String stidentId, String name, String course)
    {
        this.studentId = studentId;
        this.name = name;
        this.course = course;

    }
    
    public String getFormattedHTMLText() 
    {
        return String.format(
           "<html><p>ID: %s</p><p>Name: %s<p><p>Course: %s</p></html>",
           studentId,
           name,
           course
           );
    }
 }   