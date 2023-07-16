package cunstuctor;

class student1
{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

public class cunst_2 {
    public static void main(String[] args) {

        student1 st = new student1();

        st.setAge(18);
        st.setName("abhay");
        String name=st.getName();
        int age = st.getAge();

        System.out.println(name);
        System.out.println(age);

    }
}
