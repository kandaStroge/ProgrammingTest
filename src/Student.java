public class Student extends User {
    public Student(String username, String password){
        setName(username);
        setPassword(password);
        setUserType(1);
    }
}
