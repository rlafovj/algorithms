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
    private double height;
    private double weight;

    //카우프 지수에서 사용하는 생성자
    public MemberModel(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    //회원가입에서 사용하는 생성자
    public MemberModel(String username, String password, String passwordCheck, String name, int residentRegistrationNumber, int phoneNumber, String address, String job){
        this.username = username;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.name = name;
        this.residentRegistrationNumber = residentRegistrationNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

//    public void setUsername(String username){
//        this.username = username;
//    }
//    public String getUsername(){
//        return this.username;
//    }
//    public void setPassword(String password){
//        this.password = password;
//    }
//    public String getPassword(){
//        return this.password;
//    }
//    public void setPasswordCheck(String passwordCheck){
//        this.passwordCheck = passwordCheck;
//    }
//    public String getPasswordCheck(){
//        return this.passwordCheck;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public void setResidentRegistrationNumber(int residentRegistrationNumber){
//        this.residentRegistrationNumber = residentRegistrationNumber;
//    }
//    public int getResidentRegistrationNumber(){
//        return this.residentRegistrationNumber;
//    }
//    public void setPhoneNumber(int phoneNumber){
//        this.phoneNumber = phoneNumber;
//    }
//    public int getPhoneNumber(){
//        return this.phoneNumber;
//    }
//    public void setAddress(String address){
//        this.address = address;
//    }
//    public String getAddress(){
//        return this.address;
//    }
//    public void setJob(String job){
//        this.job = job;
//    }
//    public String getJob(){
//        return this.job;
//    }


    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return ("ID : "+username+"\n이름 : "+name+"\n주민번호 : "+residentRegistrationNumber+"\n전화번호 : "+phoneNumber+"\n주소 : "+address+"\n직업 : "+job);
    }
}
