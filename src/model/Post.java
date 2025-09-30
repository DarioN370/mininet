package model;
public class Post {
    //ATRIBUTOS
    protected int id;
    private String content;
    private User author; // esse sera do tipo usuario, vincular quem é o user

    public int getId(){ //RECEBE
        return id;
    }
    public void setId(int id){ //MODIFICA
        this.id = id; //esse this é pra dizer que o de dentro da class recebe o de fora
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