package model.postModel;

import model.userModel.User;

public class Post {
    //ATRIBUTOS
    private int id;
    private String content;
    private User author; // esse sera do tipo usuario, vincular quem é o user


    //metodo construtor
    //Defini como os objetos serão construidos
    public Post(int id, String content, User author){
        this.id = id;
        this.content = content;
        this.author = author;
    }



    //GETTER E SETTER
    public int getId(){ //RECEBE
        return id;
    }
    public void setId(int id){ //MODIFICA
        if(id > 0){
            this.id = id;
        } else {
            System.out.println("VALOR DE ID INVALIDO, PREENCHER COM NUMERO DO ID MAIOR QUE ZERO");
        } // esse if é pra nao permitir que haja um id menor que zero, pra não ter user negativo né
    }

    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content; // esse this se usa pra dizer que o text de dentro da classe vai receber o de fora, o text que vc get ele vai set no daqui de dentro 
    }

    public User getAuthor(){
        return author;
    }
    public void setAuthor(User author){
        this.author = author; //esse this é pra dizer que o de dentro da class recebe o de fora
    }







        //METODOS
    public void displayPost(){
        System.out.println("O Perfil de: " + author.getUsername() + "\npublicou: " + content);
    }
}