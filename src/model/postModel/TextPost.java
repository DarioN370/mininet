package model.postModel;

public class TextPost extends Post{ // ele tem esse extends, isso significa que ele vai herdar atributos e metodos da classe Post.java vai ter ID, Content, Author... alem dos get e set, e o display post tbm
    public void modificarId(){
        setId(15);
        setContent("texto de conteudo");
    }
}
