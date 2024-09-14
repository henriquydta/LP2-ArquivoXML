import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class LeituraXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("pessoa2.xml");
            document.getDocumentElement().normalize();
            
            Element root = document.getDocumentElement();
            System.out.println("Elemento raiz: " + root.getNodeName());
           
            NodeList idPessoaList = document.getElementsByTagName("idPessoa");
            System.out.println("idPessoa: " + idPessoaList.item(0).getTextContent());
            NodeList nomeList = document.getElementsByTagName("nome");
            System.out.println("Nome: " + nomeList.item(0).getTextContent());
            NodeList sobrenomeList = document.getElementsByTagName("sobrenome");
            System.out.println("Sobrenome: " + sobrenomeList.item(0).getTextContent());
            NodeList emailList = document.getElementsByTagName("email");
            System.out.println("Email: " + emailList.item(0).getTextContent());
            NodeList logradouroList = document.getElementsByTagName("logradouro");
            System.out.println("Logradouro: " + logradouroList.item(0).getTextContent());
            NodeList numeroList = document.getElementsByTagName("numero");
            System.out.println("Número: " + numeroList.item(0).getTextContent());
            NodeList bairroList = document.getElementsByTagName("bairro");
            System.out.println("Bairro: " + bairroList.item(0).getTextContent());
            NodeList cidadeList = document.getElementsByTagName("cidade");
            System.out.println("Cidade: " + cidadeList.item(0).getTextContent());
            NodeList estadoList = document.getElementsByTagName("estado");
            System.out.println("Estado: " + estadoList.item(0).getTextContent());
            NodeList paisList = document.getElementsByTagName("pais");
            System.out.println("País: " + paisList.item(0).getTextContent());
            NodeList nacionalidadeList = document.getElementsByTagName("nacionalidade");
            System.out.println("Nacionalidade: " + nacionalidadeList.item(0).getTextContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}