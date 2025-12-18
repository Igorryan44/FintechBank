package main.java.br.com.banco.auth;

public class User {
    String idUser;
    String nickName;
    String fullName;
    String userEmail;
    String cpfUser;
    String creationDate;
    String dateUserBorn;
    String userType;

    public User(String idUser, String nickName, String fullName, String cpfUser , String creationDate, String dateUserBorn, String userType, String userEmail){
        this.idUser = idUser;
        this.nickName = nickName;
        this.fullName = fullName;
        this.userEmail = userEmail;
        this.cpfUser = cpfUser;
        this.creationDate = creationDate;
        this.dateUserBorn = dateUserBorn;
        this.userType = userType;
    }

    private void Create(){
//        TODO when data config be create: Function add user
        System.out.println("Novo usuário criado: " + this.nickName);
    }

    private void Delete(){
//        TODO when data config be create: Function remove user
        System.out.println("Usuário deletado: " + this.nickName);
    }

}
