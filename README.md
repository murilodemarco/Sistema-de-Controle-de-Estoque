# 📦 Sistema de Controle de Estoque

Projeto desenvolvido em Java como trabalho acadêmico da disciplina de Linguagem de Programação, com o objetivo de aplicar conceitos de Programação Orientada a Objetos (POO), integração com banco de dados MySQL e operações CRUD.

## 🚀 Funcionalidades

O sistema permite:

- ✅ Cadastrar novos produtos
- ✅ Listar produtos cadastrados
- ✅ Calcular o valor total do estoque
- ✅ Excluir produtos pelo ID

## 🛠️ Tecnologias Utilizadas

- Java
- MySQL
- JDBC
- Apache NetBeans IDE
- JOptionPane (Interface gráfica simples)

## 📂 Estrutura do Projeto

O código foi organizado em classes separadas, seguindo o princípio da responsabilidade única.

| Classe | Responsabilidade |
|----------|----------|
| `Sistema_Controle_de_Estoque_Loja` | Menu principal e controle do sistema |
| `Conexao` | Conexão com o banco de dados |
| `CadastrarProduto` | Cadastro de produtos |
| `ListarProdutos` | Consulta e exibição dos produtos |
| `ValorEstoqueTotal` | Cálculo do valor total do estoque |
| `ExcluirProduto` | Exclusão de produtos |

## 🗄️ Banco de Dados

O sistema utiliza o MySQL para armazenamento das informações.

## ▶️ Como Executar

1. Clone o repositório
git clone https://github.com/murilodemarco/Sistema-de-Controle-de-Estoque.git

2. Configure o banco de dados
   
- Crie o banco de dados MySQL.
- Execute o script SQL.
- Atualize as credenciais da classe Conexao.java.
  
``` java
String url = "jdbc:mysql://localhost:3306/seu_banco";
String usuario = "seu_usuario";
String senha = "sua_senha";
```

3. Execute o projeto pelo Apache NetBeans.

## 📸 Funcionalidades Demonstradas

- Cadastro de produtos
- Consulta de estoque
- Exclusão de registros
- Cálculo do valor total armazenado

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para consolidar conhecimentos em:

- Programação Orientada a Objetos
- Manipulação de banco de dados com JDBC
- Estruturação de projetos Java
- Operações CRUD
- Boas práticas de organização de código

