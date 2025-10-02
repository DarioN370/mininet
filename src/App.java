import model.postModel.PhotoPost;
import model.postModel.Post;
import model.postModel.TextPost;
import model.postModel.VideoPost;
import model.userModel.User;
public class App {
    public static void main(String[] args) throws Exception {
        User usuario1 = new User(); // pedindo pra construir ele do zero eu uso o NEW
        usuario1.setId(1);
        usuario1.setName("Dario Miranda");
        usuario1.setUsername("IamD4rio");
        usuario1.setEmail("dario.neto@sou.unifeob.edu.br");

        usuario1.displayProfile(); //abre e fecha parenteses para executar ação

        //Criando os posts
        Post p1 = new Post(101, "Meu primeiro post", usuario1);
    
        TextPost tp1 = new TextPost(102, "Post de texto", usuario1);

        PhotoPost pp1 = new PhotoPost(103, "Post com foto", usuario1, "meudominio.com/foto1.jpg");

        VideoPost vp1 = new VideoPost(104, "Post com video", usuario1, "meudominio.com/video1.mp4");

        p1.displayPost();
        tp1.displayPost();
        pp1.displayPost();
        vp1.displayPost();
        
        System.out.println("ID DO USUARIO que publica: " + usuario1.getId()); //aqui eu uso o getId(), ele vai la na class User.java, pega o valor do ID, e me mostra aqui
    }
}
