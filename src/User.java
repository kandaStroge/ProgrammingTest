public class User implements IUser {
    private String Name;
    private String Password;
    private int userType;


    public User(){
        setName("");
        setPassword("");
        setUserType(0);

    }

    public  String getPassword(){
        return this.Password;
    }
    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String setName(String name) {

        String a = "[a-zA-Z][A-Za-z0-9]{8,}";
        if(name != null && !name.equals("")){
            if(name.matches(a)){
                Name = name;
            }else
                throw new RuntimeException("Username not Correct");
        }
        return name;
    }


    @Override
    public String setPassword(String password) {

        String b = "[a-zA-Z][A-Za-z0-9]{10,}";
        if(password != null && !password.equals("")){
            if(password.matches(b)){
                Password = password;
            }else
                throw new RuntimeException("Password not correct");
        }
        return password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(password.matches(Password)){
            return true;
        }
        return false;
    }

    @Override
    public int getType() {
        return userType;
    }

    public void setUserType(int userType){
        if (userType == USER_STUDENT || userType == USER_TEACHER){
            this.userType = userType;
        }else {
            throw new RuntimeException("User Type Error");
        }

    }
}
