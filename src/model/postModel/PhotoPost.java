package model.postModel;
import model.userModel.User;

public class PhotoPost extends Post{
    //atributo
    private String photoUrl;

    //construtor
    public PhotoPost(int id, String content, User author, String photoUrl) {
        super(id, content, author);
        this.photoUrl = photoUrl;

        //no caso desse constutor, eu tive que usar o this.photoUrl = photoUrl ainda pq o construtor super puxa da class Post.java, e la eu não tenho o photoUrl, então como essa tem particularidade, eu passo manual aqui
    }
    
    //metodos
    public String getPhotoUrl(){
        return photoUrl;
    }
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

}
