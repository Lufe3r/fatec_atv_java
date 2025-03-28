# 🏥 Sistema de Fila de Atendimento do SUS

Este projeto implementa um **sistema de fila para um consultório do SUS**, onde pacientes são atendidos seguindo regras pré-definidas.

---

## ✅ Requisitos Atendidos

✔️ A fila tem um número de pacientes que **pode ser alterado** quando chega mais um.  
✔️ O consultório chama **até 2 pacientes por vez** e os pacientes saem da fila.  
✔️ O médico atende **enquanto houver pacientes na fila**.  

---

## 🚀 Como executar o projeto

### 📌 1️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/fila-atendimento-sus.git
cd fila-atendimento-sus
````
📌 2️⃣ Compilar e executar
````
javac -d . src/br/edu/fatecpg/abstracaoLogica/model/FilaAtendimento.java src/br/edu/fatecpg/abstracaoLogica/view/Main.java
java br.edu.fatecpg.abstracaoLogica.view.Main
````

### 📂 Estrutura do projeto
````
📂 fila-atendimento-sus
 ┣ 📂 src
 ┃ ┣ 📂 br
 ┃ ┃ ┣ 📂 edu
 ┃ ┃ ┃ ┣ 📂 fatecpg
 ┃ ┃ ┃ ┃ ┣ 📂 abstracaoLogica
 ┃ ┃ ┃ ┃ ┃ ┣ 📂 model
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜 FilaAtendimento.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂 view
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜 Main.java
 ┣ 📜 README.md
 ````
### 📝 Descrição das Classes
🔹 FilaAtendimento.java
📌 Gerencia a fila de pacientes e permite que novos pacientes sejam adicionados.
📌 Atende até 2 pacientes por vez.
📌 Garante que o médico continue atendendo enquanto houver pacientes.

🔹 Main.java
📌 Captura a quantidade inicial de pacientes.
📌 Inicia o atendimento e interage com o usuário para adicionar novos pacientes.

🖥 Exemplo de Uso
```
Quantos pacientes vão entrar na fila? 5
Chamando 2 paciente(s) para atendimento.
Novo paciente chegou? (s/n): s
Novo paciente entrou na fila. Total na fila: 4
Chamando 2 paciente(s) para atendimento.
Novo paciente chegou? (s/n): n
Chamando 1 paciente(s) para atendimento.
Todos os pacientes foram atendidos.
```

🛠 Tecnologias Utilizadas
🖥 Linguagem: Java
🎯 Paradigma: Programação Orientada a Objetos (POO)
📜 Licença
Este projeto é de uso livre para fins educacionais.
