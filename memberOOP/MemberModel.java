package memberOOP;

public class MemberModel {
    private String username;
    private String password;
    private String passwordCheck;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPasswordCheck(String passwordCheck){
        this.passwordCheck = passwordCheck;
    }
    public String getPasswordCheck(){
        return this.passwordCheck;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setResidentRegistrationNumber(int residentRegistrationNumber){
        this.residentRegistrationNumber = residentRegistrationNumber;
    }
    public int getResidentRegistrationNumber(){
        return this.residentRegistrationNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return this.job;
    }
}
