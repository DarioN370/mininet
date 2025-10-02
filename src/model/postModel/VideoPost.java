package model.postModel;
import model.userModel.User;

public class VideoPost extends Post{
    //atributo 
    private String videoUrl;

    //construtor
    public VideoPost(int id, String content, User author, String videoUrl) {
        super(id, content, author);
        this.videoUrl = videoUrl;
    }

    //métodos
    public String getVideoUrl(){
        return videoUrl;
    }
    public void setvideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }
}