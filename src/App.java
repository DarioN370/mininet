public class App {
    public static void main(String[] args) throws Exception {
        User usuario1 = new User(); // pedindo pra construir ele do zero eu uso o NEW
        usuario1.id = 1;
        usuario1.name = "Dario Miranda";
        usuario1.username = "IamD4rio";
        usuario1.email = "dario.neto@sou.unifeob.edu.br";

        usuario1.displayProfile(); //abre e fecha parenteses para executar ação
    }
}
