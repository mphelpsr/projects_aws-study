# Domínio 5: Segurança, Conformidade e Governança para Soluções de IA (14% da Prova)

**Peso no exame:** 14% (~9 questões de 65) | **Tempo sugerido:** 20 minutos para 15 questões

---

## Questão 1
Qual serviço AWS é usado para gerenciar controle de acesso e permissões para recursos de IA/ML?

A) Amazon S3  
B) AWS IAM (Identity and Access Management)  
C) Amazon CloudWatch  
D) AWS Lambda  

---

## Questão 2
Uma empresa quer criptografar dados de treinamento de ML em repouso. Qual serviço AWS deve ser usado?

A) AWS IAM  
B) AWS KMS (Key Management Service)  
C) Amazon CloudWatch  
D) AWS CloudTrail  

---

## Questão 3
Qual serviço AWS registra todas as chamadas de API para auditoria e conformidade?

A) Amazon S3  
B) AWS CloudWatch  
C) AWS CloudTrail  
D) AWS Lambda  

---

## Questão 4
Uma empresa precisa garantir que seus modelos de ML processem dados apenas em uma VPC privada isolada da internet. Qual configuração AWS é apropriada?

A) Expor tudo publicamente  
B) Configurar VPC com subnets privadas e VPC endpoints  
C) Usar apenas IP público  
D) Desabilitar toda segurança  

---

## Questão 5
Qual princípio de segurança AWS recomenda conceder apenas as permissões mínimas necessárias?

A) Máximo privilégio  
B) Least Privilege (privilégio mínimo)  
C) Acesso total para todos  
D) Sem controle de acesso  

---

## Questão 6
Uma empresa quer monitorar métricas de performance de modelos em produção (latência, taxa de erro). Qual serviço AWS usar?

A) AWS IAM  
B) AWS KMS  
C) Amazon CloudWatch  
D) AWS CloudTrail  

---

## Questão 7
Qual regulamentação europeia impõe requisitos rigorosos sobre proteção de dados pessoais e direito à explicação?

A) HIPAA  
B) GDPR (General Data Protection Regulation)  
C) SOX  
D) PCI-DSS  

---

## Questão 8
Amazon Macie é usado para qual propósito de segurança?

A) Gerenciar chaves de criptografia  
B) Descobrir e proteger dados sensíveis (PII) em S3  
C) Registrar chamadas de API  
D) Monitorar métricas  

---

## Questão 9
Uma empresa precisa garantir que dados de treinamento de ML sejam criptografados durante transmissão entre serviços. Que tecnologia usar?

A) Enviar dados sem criptografia  
B) TLS/HTTPS para criptografia em trânsito  
C) Apenas criptografia em repouso  
D) Nenhuma criptografia  

---

## Questão 10
O que é "data lineage" no contexto de governança de ML?

A) Tamanho dos dados  
B) Rastreamento da origem, transformações e fluxo dos dados ao longo do pipeline  
C) Velocidade de processamento  
D) Custo de armazenamento  

---

## Questão 11
AWS Lake Formation ajuda com qual aspecto de governança de dados?

A) Apenas armazenamento  
B) Gerenciamento centralizado, controle de acesso e auditoria de data lakes  
C) Apenas aumentar velocidade  
D) Apenas reduzir custos  

---

## Questão 12
Uma empresa precisa demonstrar conformidade com regulamentações de saúde (HIPAA) para dados de pacientes. Quais considerações são importantes?

A) Ignorar regulamentações  
B) Criptografia, controles de acesso, auditoria, BAA (Business Associate Agreement)  
C) Compartilhar dados publicamente  
D) Não documentar nada  

---

## Questão 13
O que é "model governance" em ML?

A) Apenas treinar modelos  
B) Processos e políticas para gerenciar ciclo de vida de modelos (versionamento, aprovação, monitoramento)  
C) Apenas fazer deploy  
D) Apenas deletar modelos antigos  

---

## Questão 14
Amazon SageMaker Model Registry fornece qual funcionalidade?

A) Apenas treinar modelos  
B) Catalogar, versionar e gerenciar modelos de ML para governança  
C) Apenas fazer backup  
D) Apenas calcular custos  

---

## Questão 15
Uma empresa quer garantir que apenas usuários autorizados possam acessar endpoints de inferência de ML. Qual combinação de serviços AWS usar?

A) Nenhum controle de acesso  
B) AWS IAM policies + VPC + Security Groups  
C) Apenas expor publicamente  
D) Confiar em usuários sem validação  

---

## 📝 GABARITO

1. **B** - AWS IAM gerencia identidades, permissões e políticas de acesso para todos os recursos AWS incluindo AI/ML.

2. **B** - AWS KMS gerencia chaves de criptografia para dados em repouso (S3, EBS, SageMaker, etc).

3. **C** - AWS CloudTrail registra todas as chamadas de API para auditoria, conformidade e análise de segurança.

4. **B** - VPC privada com subnets privadas + VPC endpoints isola workloads ML da internet pública.

5. **B** - Least Privilege: conceder apenas permissões mínimas necessárias (princípio fundamental de segurança).

6. **C** - Amazon CloudWatch monitora métricas, logs e eventos de recursos AWS incluindo modelos ML.

7. **B** - GDPR (UE) impõe proteção de dados pessoais, direito ao esquecimento, direito à explicação de decisões automatizadas.

8. **B** - Amazon Macie usa ML para descobrir, classificar e proteger dados sensíveis (PII, PHI) em S3.

9. **B** - TLS/HTTPS criptografa dados em trânsito entre serviços, protegendo contra interceptação.

10. **B** - Data lineage rastreia origem, transformações e fluxo de dados (essencial para auditoria e reprodutibilidade).

11. **B** - AWS Lake Formation facilita setup, segurança e governança de data lakes com controles centralizados.

12. **B** - HIPAA requer: criptografia, controles de acesso, auditoria, BAA com AWS, PHI protegido.

13. **B** - Model governance: gerenciar ciclo de vida (versionamento, aprovação, deploy, monitoramento, retirement).

14. **B** - SageMaker Model Registry cataloga e versiona modelos, facilitando governança e rastreabilidade.

15. **B** - IAM (autenticação/autorização) + VPC (isolamento de rede) + Security Groups (firewall) = defesa em profundidade.

---

## 📊 Como Avaliar

- **13-15 corretas:** Excelente conhecimento de segurança!
- **10-12 corretas:** Muito bom, revisar alguns serviços
- **7-9 corretas:** Razoável, estudar mais segurança AWS
- **< 7 corretas:** Foco em fundamentos de segurança AWS

---

## 💡 Conceitos-Chave para Revisar

**Segurança AWS - Camadas:**

1. **Identidade e Acesso:**
   - AWS IAM (usuários, roles, policies)
   - Least Privilege
   - MFA (autenticação multifator)

2. **Criptografia:**
   - **Em repouso:** AWS KMS
   - **Em trânsito:** TLS/HTTPS
   - **Client-side:** Criptografar antes de enviar

3. **Rede:**
   - VPC (isolamento)
   - Security Groups (firewall)
   - VPC Endpoints (privacidade)

4. **Auditoria e Monitoramento:**
   - **CloudTrail:** Quem fez o quê e quando
   - **CloudWatch:** Métricas e logs
   - **Macie:** Dados sensíveis

5. **Proteção de Dados:**
   - **Macie:** Descoberta de PII/PHI
   - **Lake Formation:** Governança de data lakes
   - **Backup:** Disaster recovery

**Conformidade por Setor:**

| Setor | Regulamentação | Requisitos-chave |
|-------|----------------|------------------|
| **Saúde** | HIPAA | PHI protegido, BAA, criptografia |
| **Financeiro** | PCI-DSS, SOX | Dados de cartão, auditoria |
| **Geral (UE)** | GDPR | Dados pessoais, direito à explicação |
| **Brasil** | LGPD | Proteção de dados pessoais |

**Governança de ML:**

1. **Model Governance:**
   - Versionamento (Model Registry)
   - Aprovação workflow
   - Lineage tracking
   - Retirement policy

2. **Data Governance:**
   - Data lineage
   - Quality checks
   - Access controls
   - Retention policies

3. **Monitoring & Auditing:**
   - Model drift detection
   - Performance metrics
   - Compliance reporting
   - Incident response

**Serviços AWS por Função:**

| Função | Serviços |
|--------|----------|
| **Acesso** | IAM, Cognito |
| **Criptografia** | KMS, CloudHSM |
| **Rede** | VPC, Security Groups |
| **Auditoria** | CloudTrail, CloudWatch |
| **Dados sensíveis** | Macie |
| **Governança** | Lake Formation, Model Registry |

**Arquitetura Segura ML:**
```
┌─────────────────────────────────┐
│ IAM (autenticação/autorização)  │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│ VPC (isolamento de rede)        │
│  └─ Subnets privadas            │
│  └─ Security Groups             │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│ SageMaker / Bedrock             │
│  └─ Dados: KMS encryption       │
│  └─ Modelo: Model Registry      │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│ CloudTrail + CloudWatch         │
│ (auditoria e monitoramento)     │
└─────────────────────────────────┘
```

**Próximo:** Vou criar um resumo executivo e guia de estudo!
