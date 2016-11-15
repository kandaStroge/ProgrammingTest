import java.util.ArrayList;

public class Users  {
    // User repository
    private ArrayList<IUser> userList;
    private User us;

    // Create new user with type, name and; password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        User us = new User();
        us.setName(name);
        us.setPassword(password);
        us.setUserType(type);
       return us;
    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);

    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if (isUserEmpty(user.getName()) && count() > 0){
            if (exists(user)){
                userList.remove(user);
            }
        }

    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {

        if(isUserEmpty(user.getName())){
            for (IUser user1: userList){
                if (user1.getName().equals(user.getName())){
                    return true;
                }

            }

        }return false;
    }

    // Return number of user in the list
    public int count() {
        return userList.size();
    }

    public boolean isUserEmpty(String e) {
        return (e != null && !e.equals(""));
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        int count = 0;
        for (IUser user1: userList){
            if(user1.getType() == type){
                count++;
            }

        }
        return count;




    }



}
