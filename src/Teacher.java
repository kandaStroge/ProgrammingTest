public class Teacher extends User {
    public Teacher(String username, String password){
        setName(username);
        setPassword(password);
        setUserType(IUser.USER_TEACHER);
    }
}
