# Sistema de Leilões - UC11

Este projeto consiste em um sistema informatizado para a gestão de rotinas de uma casa de leilões, permitindo o controle de itens, lances e status de venda de produtos.

## 📋 Sobre o Projeto
O sistema foi desenvolvido para atender às necessidades de organização de inventário e vendas de uma casa de leilões. Ele permite o cadastro de itens, o monitoramento de valores e a atualização do status de cada produto (ex: "A Venda", "Vendido").

A base de dados conta com uma estrutura robusta para armazenar:
* Identificação única do produto (ID)
* Descrição/Nome do item
* Valor atribuído
* Status atual no leilão

## 🚀 Tecnologias Utilizadas
* **Linguagem:** Java
* **Banco de Dados:** MySQL (MariaDB)
* **Versionamento:** Git e GitHub
* **Ferramenta de Gerenciamento:** phpMyAdmin (para exportação/importação do SQL)

## 🗄️ Estrutura do Banco de Dados
O projeto utiliza o banco de dados `uc11` com a seguinte tabela principal:
* `produtos`: Gerencia o inventário do leilão.

## 🔧 Como Executar
1. Clone este repositório.
2. Importe o arquivo SQL fornecido no diretório de materiais para o seu servidor MySQL.
3. Certifique-se de que as credenciais de conexão no código Java estejam compatíveis com seu ambiente local.
