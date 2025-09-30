public class App {
    public static void main(String[] args) throws Exception {
        User usuario1 = new User(); // pedindo pra construir ele do zero eu uso o NEW
        usuario1.setId(1);
        usuario1.setName("Dario Miranda");
        usuario1.setUsername("IamD4rio");
        usuario1.setEmail("dario.neto@sou.unifeob.edu.br");

        usuario1.displayProfile(); //abre e fecha parenteses para executar ação

        //Criando um post
        Post p1 = new Post();
        p1.setId(101); // agora eu uso o set pois que encapsulei elas na class Post.java, então a class App.java não consegue acessar os valores 
        p1.setContent("Meu primeiro post");
        p1.setId(usuario1);

        p1.displayPost();
        System.out.println("ID DO USUARIO: " + usuario1.getId()); //aqui eu uso o getId(), ele vai la na class User.java, pega o valor do ID, e me mostra aqui
    }
}
