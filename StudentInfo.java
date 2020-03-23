public class StudentInfo {

   String studentName;
    int count;

    String[] students=new String[5];

    public  void addStudent(){
        students[count]=studentName;
        count++;
    }

     public void printNames(){
         int st=1;
        for(String name : students){

            System.out.println("Student "+st+" "+name+", ");

            st++;

        }

    }
}

    class MeetingRoom{

    public static void main(String[] args) {
        StudentInfo st=new StudentInfo();

        st.studentName="John";
        st.addStudent();
        st.studentName="Mark";
        st.addStudent();
        st.studentName="Murat";
        st.addStudent();
        st.studentName="JPatel";
        st.addStudent();
        st.studentName="Kerry";
        st.addStudent();

        System.out.println("Students: "+st.count);

        st.printNames();
    }

}
