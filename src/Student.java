public class Student extends User {
    public Student(String username, String password){
        setName(username);
        setPassword(password);
        setUserType(IUser.USER_STUDENT);
    }
}
