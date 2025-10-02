package model.postModel;
import model.userModel.User;

public class TextPost extends Post{ // ele tem esse extends, isso significa que ele vai herdar atributos e metodos da classe Post.java vai ter ID, Content, Author... alem dos get e set, e o display post tbm
    public TextPost(int id, String content, User author){
        //o método super ele executa o método da super class, da class pai
        super(id, content, author);
    }

    }
    

