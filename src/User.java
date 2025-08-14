// a nossa class é a receita de bolo, e o objeto é o bolo pronto, deito seguindo a nossa receita;

//fortemente tipada, os atributos tem sempre tipos

// o nome da classe tem que ser o mesmo do arquivo .java
public class User {
    //ATRIBUTOS = O que a classe tem
    int id;
    String name; //nome da pessoa
    String username; //nome de usuario
    String email;

    //MÉTODOS = O que a classe faz = são executores
    void displayProfile(){
        System.out.println("Perfil de "+ name); //comando pra escrever na tela "sistema, escreva na tela tal coisa, o que esta em parenteses" o ln pula uma lina quando ele escrever
    } //o tipo VOID significa que eu vou executar o metodo mas não vou devolver nenhum dado
} 