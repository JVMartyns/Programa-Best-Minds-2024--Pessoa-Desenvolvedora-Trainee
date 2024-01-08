# Teste técnico Programa Best Minds 2024 - Pessoa Desenvolvedora Trainee

Este projeto em Java foi desenvolvido como parte de um teste prático de programação. Onde deve-se criar uma empresa
fictícia chamada Nunes Sports, com um board para gerenciamento e exibição dos produtos vendidos pela empresa.

### Abaixo os requisitos para a conclusão do teste:

Neste desafio a pessoa candidata terá total liberdade de usar as ferramentas e linguagens que está mais
familiarizado.

O objetivo principal será identificar sua criatividade e a capacidade de resolver um problema, principalmente
o potencial de implementação, qualidade de código, organização, boas práticas, conceitos de Clean Code, SOLID
e preocupação com desenvolvimento para grandes volumes transacionais.

Você é responsável por desenvolver a solução, definir o modelo de entrega, utilizando-se das ferramentas de mercado
atuais, bem como por pensar em compartilhamento de código, versão de fontes etc. O desafio consiste em criar uma
solução para atender um requisito de um projeto:

Nosso cliente fictício será a empresa Nunes Sports e foi solicitado pelo board da empresa que seja desenvolvido um
sistema para exibição, criação, edição e deleção dos produtos vendidos pela companhia.

#### REQUISITOS DO TESTE DE PROGRAMAÇÃO.

- Ter uma base de dados com uma tabela produtos com os campos:

  - Nome do produto
  - Código do produto
  - Descrição do produto
  - Preço do produto

- Criar uma página web na tecnologia de sua preferência para o CRUD de produtos.
- Nessa página o usuário deverá ter a habilidade de exibir os produtos em uma tabela, criar, editar e deletar
  produtos que estão salvos na base.
- Todas as ações na página deverão refletir no banco de dados

#### Orientações gerais:

**IMPORTANTE**: O projeto deverá estar em um repositório do git para conferência. Compartilhe no link disponível na
página da WallJobs, o seu github, com as informações para acesso.

**CONSIDERAÇÕES FINAIS**: esperamos que consiga executar até o final, entretanto, mesmo que não consiga concluir
totalmente, pedimos que entregue o que conseguir.

## Tecnologias Utilizadas

- Java
- Spring Boot
- H2 Data Base (**em memória**)
- Thymeleaf
- VSCode

## Como Usar o Projeto

### Configuração do Ambiente

- Certifique-se de ter o Java instalado em sua máquina.
- Recomenda-se utilizar um editor de código, como VSCode, Eclipse ou IntelliJ, para facilitar o desenvolvimento.

### Clonar o Repositório

```bash
git https://github.com/JVMartyns/Programa-Best-Minds-2024--Pessoa-Desenvolvedora-Trainee.git
```

### Importar o Projeto

- Abra a IDE e importe o projeto como um projeto Java.

### Executar o Projeto

- Execute a classe Principal **_NunessportsApplication_** como um aplicativo Java na porta 8080.
- Abra um navegar e digite **http://localhost:8080/products** para exibir a lista de produtos já cadastrados.

### Funcionalidades Implementadas

1. Lista a tabela Products do banco de dados.
2. Cria um novo produto na tabela Products do banco de dados.
3. Deleta um produto existente da tabela Products do banco de dados.
4. Edita um produto existente na tabela Products do banco de dados.
