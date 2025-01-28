
# Java ViaCEP API 📡

Um projeto Java para consultar endereços via API do ViaCEP. Simples, eficiente e fácil de integrar!

---

## Funcionalidades 🛠️
- Consulta de endereço por **CEP** (logradouro, bairro, cidade, estado).
- Tratamento de erros para CEPs inválidos ou não encontrados.
- Integração direta com projetos Java existentes.

---

## Como Usar 🚀

### Pré-requisitos
- **Java 8+** instalado.
- **Maven** para gerenciamento de dependências.

### Passos Rápidos
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/PedroPaino/java-viacep-api.git
   ```
   
2. **Acesse a pasta do projeto**:
   ```bash
   cd java-viacep-api
   ```

3. **Compile o projeto**:
   ```bash
   mvn clean install
   ```

4. **Execute (substitua SEU_CEP por um CEP válido)**:
   ```bash
   java -jar target/nome-do-jar.jar SEU_CEP
   ```

### Exemplo de Código 💻
```java
public class Main {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();
        try {
            EnderecoDto endereco = apiService.getEndereco("01001000"); // CEP da Praça da Sé, SP
            System.out.println("Logradouro: " + endereco.getLogradouro());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Cidade: " + endereco.getLocalidade());
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

### Saída Esperada:
```
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo
```

### Estrutura do Projeto 📂
```
.
├── src
│   └── main
│       └── java
│           └── org
│               └── api1cacao
│                   ├── dto
│                   │   └── EnderecoDto.java    // Mapeia a resposta JSON da API
│                   ├── service
│                   │   └── ApiService.java     // Classe de serviço para a ViaCEP
│                   └── Main.java               // Classe de teste
├── pom.xml                                     // Configuração do Maven
└── README.md
```

### Contribuições 🤝
1. Faça um fork do projeto.
2. Crie uma branch para sua feature:
   ```bash
   git checkout -b feature/nova-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m 'Adiciona recurso incrível'
   ```
4. Envie para o repositório:
   ```bash
   git push origin feature/nova-feature
   ```
5. Abra um Pull Request no GitHub.

### Licença 📜
MIT License - Veja o arquivo LICENSE para detalhes.

Desenvolvido por Pedro Palmo
🔗 Repositório: [java-viacep-api](https://github.com/PedroPaino/java-viacep-api)
```

Depois de criar o arquivo, você pode fazer commit e push para o repositório com os seguintes comandos:

```bash
git add README.md
git commit -m "Adiciona README completo"
git push origin main
```
