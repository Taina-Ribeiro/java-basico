## 📌 Java Básico - Contador com Exceção Personalizada

Bem-vindo ao meu projeto básico que simula um **contador via terminal**, escrito em **Java** no Visual Studio Code. O usuário informa dois números inteiros e o programa retorna uma sequência de valores baseada na diferença entre eles. Caso o primeiro número seja maior ou igual ao segundo número uma exceção personalizada é lançada.

## ✔ Como funciona
- Solicita e armazena dois números inteiros do usuário
- Verifica se o segundo número é maior que o primeiro
- Se a verificação for válida, imprime do número 1 até a diferença entre o segundo e o primeiro número informado
- Se a verificação for inválida, lança e imprime a mensagem de erro definida na exceção personalizada `ParametrosInvalidosException`

## 💻 Tecnologias utilizadas no projeto 
- **Java (JDK 17+)**
- **Classe Scanner**
- **Exceções personalizadas**
- **Terminal/Prompt de comando**
- **Visual Studio Code**

## 💡 Para executar o projeto
- **Pré-requisitos**
  - Ter o **Java JDK** instalado na máquina
  - Salvar os arquivos `Contador.java` e `ParametrosInvalidosException.java` em uma mesma pasta no computador
    
- **Execução**
  - Abra o terminal/prompt de comando na pasta onde salvou os arquivos.
  - Compile o programa:
    ```
    javac Contador.java ParametrosInvalidosException.java
    ```
  - Execute o programa:
    ```
    java Contador
    ```
