public class Student {
    private String name;
    private int mark;

    public Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    /**
     * Determines the grade classification based on the given mark.
     * @return "First" if mark is 70 or above, "Pass" if mark is 40
     * or above, otherwise "Fail".
     */
    public String getGrade(){
        if (mark >= 70 )
            return "First";
        else if (mark >= 40)
            return "Pass";
        else
            return "Fail";
    }
}