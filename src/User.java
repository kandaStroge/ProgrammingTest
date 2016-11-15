public class User implements IUser {
    private String Name;
    private String Password;
    private int userType;
    private String Oname;


    public User(){
    }

    public User(int type, String name, String password){
        setName(name);
        setPassword(password);
        setUserType(type);
    }

    public User(Student o){
        this.setName(o.getName());
        this.setPassword(o.getPassword());
        this.setUserType(o.getType());
    }
    
    public User(Teacher o){
        this.setName(o.getName());
        this.setPassword(o.getPassword());
        this.setUserType(o.getType());
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
        String a = "[a-zA-Z][A-Za-z0-9]{3,}";
        if(name != null && !name.equals("")){
            if(name.matches(a)){
                Oname = name;
                Name = name;
                return name;
            }
        }return Oname;

    }


    @Override
    public String setPassword(String password) {

        String b = "[a-zA-Z][A-Za-z0-9]{3,}";
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
        if(password != null && !password.equals("") && this.Password.equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public int getType() {
        return userType;
    }

    public void setUserType(int userType){
        if (userType == USER_STUDENT || userType == USER_TEACHER) {
            this.userType = userType;
        }

    }
}
