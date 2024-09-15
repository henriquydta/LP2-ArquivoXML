import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        // 2, Beltrano, dos Santos, beltrano@hotmail.com, Rua Tal, 456, Centro, Ibirá, SP, Brasil, Brasileiro

        String inputSeparado[] = input.split(", ");

        String idPessoa = inputSeparado[0];
        String nome = inputSeparado[1];
        String sobrenome = inputSeparado[2];
        String email = inputSeparado[3];
        String logradouro = inputSeparado[4];
        String numero = inputSeparado[5];
        String bairro = inputSeparado[6];
        String cidade = inputSeparado[7];
        String estado = inputSeparado[8];
        String pais = inputSeparado[9];
        String nacionalidade = inputSeparado[10];
        Pessoa pessoa = new Pessoa(Integer.parseInt(idPessoa), nome, sobrenome, email, logradouro, numero, bairro, cidade, estado, pais, nacionalidade);
        sc.close();

        EscreveXML.escrever(pessoa);
        LeituraXML.main(args);
    }
}
