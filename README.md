# Estudos AWS - Certificação Developer Associate (DVA-C02) 🚀

Este repositório tem como objetivo consolidar os **estudos práticos e conceituais** para a certificação **AWS Certified Developer Associate (DVA-C02)**, utilizando exemplos reais implementados com **Spring Boot** e **LocalStack**.

Aqui são desenvolvidos projetos de integração com os principais serviços cobrados na prova, com foco total em:
- Mensageria (SQS, SNS)
- Infraestrutura como código (CloudFormation)
- Armazenamento (S3)
- Automação de deploys e listeners
- Modelos de fan-out e DLQ (Dead-Letter Queues)

---

## ✅ Conteúdo abordado até agora

### 📨 **Amazon SQS (Simple Queue Service)**
- Envio e recebimento de mensagens
- Integração com Spring Boot via `SqsTemplate` e `@SqsListener`
- Configuração local com LocalStack
- Tratamento de mensagens com falha
- Implementação de DLQ (Dead-Letter Queue)

### 📢 **Amazon SNS (Simple Notification Service)**
- Publicação em tópicos via `SnsTemplate`
- Arquitetura de fan-out com entrega automática para SQS
- Casos em que SNS é mais apropriado que SQS
- Assinatura de filas SQS em tópicos SNS

### 🚀 **LocalStack para testes locais**
- Instalação e configuração no Windows 11 com Git Bash e Docker
- Criação de filas SQS, tópicos SNS e assinaturas via `awslocal`
- Integração da aplicação com o LocalStack usando endpoints customizados

### ⚒️ **Spring Boot + AWS SDK**
- Criação de projetos com Maven
- Uso das bibliotecas Spring Cloud AWS 3.x (SQS e SNS)
- Correção de problemas comuns com `pom.xml`, parent, repositórios e compatibilidade
- Tratamento de erros, retries e DLQ

### ⚖️ **CloudFormation (Infraestrutura como Código)**
- Conceitos de `Resources`, `Parameters`, `Outputs`, `Conditions`
- Uso prático para criar filas, tópicos, buckets e mais
- Automatização de ambientes com exemplos prontos

---

## 📊 Objetivo deste repositório

- Consolidar estudos práticos sobre os serviços cobrados na certificação AWS DVA-C02
- Criar **projetos aplicados com Spring Boot + LocalStack**
- Gerar base de conhecimento reusável para equipes de desenvolvimento
- Simular problemas reais como falhas, reprocessamento e entrega de eventos

---

## 📖 Estudo recomendado

- Documentação oficial da AWS
- Curso preparatório AWS Developer Associate (DVA-C02)
- Spring Cloud AWS docs: https://docs.awspring.io
- LocalStack docs: https://docs.localstack.cloud/

---

Este repositório está em evolução constante ✨
e será enriquecido com novos exemplos incluindo:
- Lambda + SQS + DLQ
- CloudWatch Logs
- IAM policies e Roles
- Simulação de ambientes produtivos

---

📄 **Licença:** MIT
