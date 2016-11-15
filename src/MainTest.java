/**
 * Created by com on 15/11/2559.
 */
public class MainTest {
    public static void main(String[] args) {
        Student jack = new Student("Jack", "A1232");
        Teacher robin = new Teacher("Robin", "A1122");
        Users userList = new Users();
        IUser u1 = new User(jack);
        IUser u2 = new User(robin);
        IUser u3 = new User(1,"RRRRRRR", "RRRRRR");
        //userList.create(1,"rrrr","ssss");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        System.out.println(u3.setName(""));
        System.out.println(u3.setPassword(""));
        System.out.println(u1.getName());
        System.out.println(userList.count());
        System.out.println(u1.isPasswordCorrect("A1232"));
        System.out.println(u1.isPasswordCorrect("A1232ff"));
        System.out.println(userList.countByType(IUser.USER_STUDENT));
        userList.remove(u1);
        IUser u4 = new User();
        userList.remove(u4);
        System.out.println(userList.countByType(IUser.USER_STUDENT));
    }



}
