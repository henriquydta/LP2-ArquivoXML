import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscreveXML {
    public static void main(String[] args) {
        escrever(null);
    }
    
    public static void escrever(Pessoa pessoa) {
        try {
            // Cria uma instância de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // Cria um DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Cria um novo documento XML
            Document document = builder.newDocument();
            
            if (pessoa == null) {
                // Cria o elemento raiz
                Element rootElement = document.createElement("pessoa");
                document.appendChild(rootElement);
                
                // Cria e adiciona elementos filho
                Element idPessoa = document.createElement("idPessoa");
                idPessoa.appendChild(document.createTextNode("1"));
                rootElement.appendChild(idPessoa);
                
                Element nome = document.createElement("nome");
                nome.appendChild(document.createTextNode("Fulano"));
                rootElement.appendChild(nome);
                
                Element sobrenome = document.createElement("sobrenome");
                sobrenome.appendChild(document.createTextNode("da Silva"));
                rootElement.appendChild(sobrenome);
                
                Element email = document.createElement("email");
                email.appendChild(document.createTextNode("fulano@gmail.com"));
                rootElement.appendChild(email);
                
                Element logradouro = document.createElement("logradouro");
                logradouro.appendChild(document.createTextNode("Rua Cabrobó"));
                rootElement.appendChild(logradouro);
                
                Element numero = document.createElement("numero");
                numero.appendChild(document.createTextNode("123"));
                rootElement.appendChild(numero);
                
                Element bairro = document.createElement("bairro");
                bairro.appendChild(document.createTextNode("Centro"));
                rootElement.appendChild(bairro);
                
                Element cidade = document.createElement("cidade");
                cidade.appendChild(document.createTextNode("Ibirá"));
                rootElement.appendChild(cidade);
                
                Element estado = document.createElement("estado");
                estado.appendChild(document.createTextNode("SP"));
                rootElement.appendChild(estado);
                
                Element pais = document.createElement("pais");
                pais.appendChild(document.createTextNode("Brasil"));
                rootElement.appendChild(pais);
                
                Element nacionalidade = document.createElement("nacionalidade");
                nacionalidade.appendChild(document.createTextNode("Brasileiro"));
                rootElement.appendChild(nacionalidade);
            } else {
                // Cria o elemento raiz
                Element rootElement = document.createElement("pessoa");
                document.appendChild(rootElement);
                
                // Cria e adiciona elementos filho
                Element idPessoa = document.createElement("idPessoa");
                idPessoa.appendChild(document.createTextNode(String.valueOf(pessoa.getIdPessoa())));
                rootElement.appendChild(idPessoa);
                
                Element nome = document.createElement("nome");
                nome.appendChild(document.createTextNode(pessoa.getNome()));
                rootElement.appendChild(nome);
                
                Element sobrenome = document.createElement("sobrenome");
                sobrenome.appendChild(document.createTextNode(pessoa.getSobrenome()));
                rootElement.appendChild(sobrenome);
                
                Element email = document.createElement("email");
                email.appendChild(document.createTextNode(pessoa.getEmail()));
                rootElement.appendChild(email);
                
                Element logradouro = document.createElement("logradouro");
                logradouro.appendChild(document.createTextNode(pessoa.getLogradouro()));
                rootElement.appendChild(logradouro);
                
                Element numero = document.createElement("numero");
                numero.appendChild(document.createTextNode(pessoa.getNumero()));
                rootElement.appendChild(numero);
                
                Element bairro = document.createElement("bairro");
                bairro.appendChild(document.createTextNode(pessoa.getBairro()));
                rootElement.appendChild(bairro);
                
                Element cidade = document.createElement("cidade");
                cidade.appendChild(document.createTextNode(pessoa.getCidade()));
                rootElement.appendChild(cidade);
                
                Element estado = document.createElement("estado");
                estado.appendChild(document.createTextNode(pessoa.getEstado()));
                rootElement.appendChild(estado);
                
                Element pais = document.createElement("pais");
                pais.appendChild(document.createTextNode(pessoa.getPais()));
                rootElement.appendChild(pais);
                
                Element nacionalidade = document.createElement("nacionalidade");
                nacionalidade.appendChild(document.createTextNode(pessoa.getNacionalidade()));
                rootElement.appendChild(nacionalidade);
            }
            // Cria um Transformer para converter o documento para XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(System.out);

            if(pessoa == null) {
                result = new StreamResult("pessoa1.xml");
            } else {
                result = new StreamResult("pessoa2.xml");
            }
            
            // Escreve o documento XML para o arquivo
            transformer.transform(source, result);
            
            System.out.println("Arquivo XML criado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
