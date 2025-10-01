// a nossa class é a receita de bolo, e o objeto é o bolo pronto, deito seguindo a nossa receita;

//fortemente tipada, os atributos tem sempre tipos

// o nome da classe tem que ser o mesmo do arquivo .java
package model.userModel;
public class User {
    //ATRIBUTOS = O que a classe tem
    private int id;
    private String name; //nome da pessoa
    private String username; //nome de usuario
    private String email;

    //MÉTODOS = O que a classe faz = são executores
    public void displayProfile(){
        System.out.println("Perfil de: " + name); //comando pra escrever na tela "sistema, escreva na tela tal coisa, o que esta em parenteses" o ln pula uma lina quando ele escrever
    } //o tipo VOID significa que eu vou executar o metodo mas não vou devolver nenhum dado

    //metodos acessores e modificadores = GETTER e SETTER (get e set)
    public int getId(){
        return id;
    } //usando o metodo para pegar o id

    public void setId(int id){
        if(id > 0){
            this.id = id;
        } else {
            System.out.println("VALOR DE ID INVALIDO, PREENCHER COM NUMERO DO ID MAIOR QUE ZERO");
        } // esse if é pra nao permitir que haja um id menor que zero, pra não ter user negativo né
        
    } //void pq ele só pega o valor e guarda, o argumento (), mostra o que você vai pegar, e o tipo que ce ta pegando - Quando voce usa o This, vc pega o da classe, ou seja, aqui eu mexo no ID da classe, e guardando nele o ID que vou receber de outro lugar 



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }



    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}