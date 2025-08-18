public class Post {
    int id;
    String text;
    User author; // esse sera do tipo usuario, vincular quem é o user

    void displayPost(){
        System.out.println(author.username + " publicou: " + text);
    }
}
