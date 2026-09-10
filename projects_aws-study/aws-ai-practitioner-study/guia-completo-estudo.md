# 🎓 Guia Completo de Estudo - AWS Certified AI Practitioner

**Última atualização:** Setembro 2026

---

## 📊 Visão Geral da Certificação

| Detalhe | Informação |
|---------|------------|
| **Código** | AIF-C01 |
| **Nível** | Foundational |
| **Questões** | 65 questões |
| **Duração** | 90 minutos |
| **Nota de Corte** | 700/1000 (escala) ≈ 70-75% |
| **Custo** | $100 USD |
| **Validade** | 3 anos |

---

## 🎯 Distribuição por Domínio

### Foco Estratégico

**Domínios PRINCIPAIS (52% da prova):**
- ✅ **Domínio 2:** Fundamentos de IA Generativa (24%)
- ✅ **Domínio 3:** Aplicações de Modelos de Fundação (28%)

**Domínios SECUNDÁRIOS (48% da prova):**
- ✅ **Domínio 1:** Fundamentos de IA e ML (20%)
- ✅ **Domínio 4:** Diretrizes para IA Responsável (14%)
- ✅ **Domínio 5:** Segurança, Conformidade e Governança (14%)

---

## 📚 Domínio 1: Fundamentos de IA e ML (20%)

### Conceitos-Chave

**Tipos de Aprendizado:**
- **Supervisionado:** Dados rotulados
  - Classificação: categorias (spam/não spam)
  - Regressão: valores contínuos (preço, temperatura)
- **Não Supervisionado:** Sem rótulos
  - Clustering: agrupar similaridades
  - Redução de dimensão
- **Reforço:** Aprender por tentativa/erro com recompensas

**Ciclo de Vida ML:**
1. Coleta e preparação de dados
2. Feature engineering
3. Treinamento
4. Avaliação (validação)
5. Deploy
6. Monitoramento e manutenção

**Serviços AWS AI/ML Essenciais:**

| Categoria | Serviço | Uso |
|-----------|---------|-----|
| **Visão** | Rekognition | Análise de imagens/vídeos |
| | Textract | OCR, extração de texto |
| **Linguagem** | Comprehend | NLP, sentimento, entidades |
| | Translate | Tradução de idiomas |
| | Transcribe | Speech-to-text |
| | Polly | Text-to-speech |
| **Conversação** | Lex | Chatbots |
| **Previsão** | Forecast | Séries temporais |
| **Recomendação** | Personalize | Recomendações personalizadas |
| **Busca** | Kendra | Enterprise search inteligente |
| **Plataforma** | SageMaker | ML end-to-end |
| **Gen AI** | Bedrock | Modelos de fundação |

---

## 🤖 Domínio 2: Fundamentos de IA Generativa (24%)

### Conceitos-Chave

**Terminologia Essencial:**
- **Foundation Model:** Modelo grande treinado em dados diversos
- **LLM:** Large Language Model
- **Tokens:** Unidades de texto processadas
- **Embeddings:** Vetores numéricos de significado semântico
- **Context Window:** Quantidade máxima de tokens processados
- **Knowledge Cutoff:** Data limite do treinamento
- **Hallucination:** Informações falsas mas plausíveis

**Amazon Bedrock - Componentes:**
- **Models:** Acesso a múltiplos fornecedores (Anthropic, AI21, Cohere, Meta, Stability AI)
- **Knowledge Bases:** RAG gerenciado
- **Agents:** Orquestração de tarefas + APIs
- **Guardrails:** Políticas de segurança
- **Custom Models:** Fine-tuning

**Capacidades Gen AI:**
- ✅ Geração de texto/código
- ✅ Resumos
- ✅ Tradução
- ✅ Conversação
- ✅ Análise e extração
- ❌ Não é calculadora precisa
- ⚠️ Pode alucinar

---

## 🔧 Domínio 3: Aplicações de Modelos de Fundação (28%)

### Prompt Engineering

**Técnicas:**

| Técnica | Quando Usar | Exemplo |
|---------|-------------|---------|
| **Zero-shot** | Sem exemplos, tarefa simples | "Traduza: Hello" |
| **Few-shot** | 2-10 exemplos, melhorar precisão | Mostrar 3 exemplos |
| **Chain-of-thought** | Raciocínio passo a passo | "Pense passo a passo" |
| **Role prompting** | Definir persona | "Você é especialista em..." |

### RAG vs Fine-tuning

**RAG (Retrieval-Augmented Generation):**
- ✅ Informações atualizadas frequentemente
- ✅ Fatos e dados externos
- ✅ Custo-efetivo
- ✅ Fácil atualização
- ❌ Não ensina estilo/comportamento

**Fine-tuning:**
- ✅ Estilo e comportamento específicos
- ✅ Terminologia de domínio
- ✅ Tom de voz consistente
- ❌ Caro (treino + inferência)
- ❌ Não adiciona conhecimento factual novo
- ❌ Precisa retreinar para atualizar

**Combinar RAG + Fine-tuning:**
- Bancos, medicina, legal
- Estilo específico + informação atualizada

### Pipeline RAG

```
Query → Embedding → Retrieval → Augmentation → Generation
```

**Componentes:**
1. **Embeddings:** Titan Embeddings, Cohere
2. **Vector DB:** OpenSearch, Aurora pgvector
3. **Retrieval:** Busca por similaridade
4. **LLM:** Claude, Titan

**Busca Híbrida:**
- Vetorial (semântica) + Keyword (lexical)
- Melhor relevância

### Parâmetros de Inferência

| Parâmetro | Função | Valores Típicos |
|-----------|--------|-----------------|
| **temperature** | Aleatoriedade geral | 0.0 (determinístico) - 1.0+ (criativo) |
| **top_p** | Probabilidade cumulativa | 0.9 - 0.95 |
| **top_k** | K tokens mais prováveis | 10 - 50 |
| **max_tokens** | Comprimento máximo | Conforme necessidade |

**Casos de Uso:**
- FAQ/Atendimento: temp=0.1, top_p=0.7
- Equilibrado: temp=0.7, top_p=0.9
- Criativo: temp=0.9, top_p=0.95

### Métricas de Avaliação

| Métrica | Uso | Foco |
|---------|-----|------|
| **ROUGE** | Resumos | Recall |
| **BLEU** | Tradução | Precision |
| **BERTScore** | Similaridade semântica | Embeddings |
| **Perplexity** | Qualidade do modelo | Confiança |
| **Pass@K** | Código | Testes unitários |

---

## 🤝 Domínio 4: IA Responsável (14%)

### Pilares Fundamentais

**1. Fairness (Equidade):**
- Não discriminação
- Tratamento justo de grupos
- Detecção de viés

**2. Transparency (Transparência):**
- Explicabilidade
- Model Cards
- Documentação

**3. Privacy (Privacidade):**
- Proteção de dados pessoais
- Anonimização
- GDPR/LGPD compliance

**4. Safety (Segurança):**
- Robustez
- Human-in-the-loop
- Guardrails

**5. Accountability:**
- Auditoria
- Governança
- Responsabilização

### Ferramentas AWS

- **SageMaker Clarify:** Viés + explicabilidade
- **Bedrock Guardrails:** Políticas de segurança
- **Model Cards:** Documentação
- **Human-in-the-loop:** Decisões críticas

### Quando Human-in-the-loop é ESSENCIAL

- ⚕️ Saúde (diagnósticos)
- ⚖️ Legal (decisões judiciais)
- 💰 Financeiro (crédito)
- 👥 RH (contratação)
- Qualquer decisão de alto impacto

---

## 🔒 Domínio 5: Segurança e Governança (14%)

### Segurança AWS - Camadas

**1. Identidade:**
- AWS IAM
- Least Privilege
- MFA

**2. Criptografia:**
- Em repouso: AWS KMS
- Em trânsito: TLS/HTTPS

**3. Rede:**
- VPC (isolamento)
- Security Groups
- VPC Endpoints

**4. Auditoria:**
- CloudTrail (quem/o quê/quando)
- CloudWatch (métricas/logs)
- Macie (dados sensíveis)

### Conformidade

| Regulamentação | Setor | Requisitos |
|----------------|-------|------------|
| **HIPAA** | Saúde | PHI protegido, BAA |
| **GDPR** | Geral (UE) | Dados pessoais, direito à explicação |
| **LGPD** | Brasil | Proteção de dados |
| **PCI-DSS** | Financeiro | Dados de cartão |

### Governança de ML

- **Model Registry:** Versionamento
- **Data Lineage:** Rastreabilidade
- **Lake Formation:** Governança de data lakes
- **Monitoring:** Drift detection

---

## 📅 Plano de Estudo Sugerido

### Semana 1-2: Domínios 2 e 3 (52%)
- Fundamentos de Gen AI
- Prompt engineering
- RAG vs Fine-tuning
- Parâmetros de inferência
- Métricas
- Bedrock components

### Semana 3: Domínio 1 (20%)
- Tipos de aprendizado
- Ciclo de vida ML
- Serviços AWS AI/ML
- Casos de uso

### Semana 4: Domínios 4 e 5 (28%)
- IA Responsável
- Segurança AWS
- Conformidade
- Governança

### Semana 5: Revisão e Simulados
- Simulados completos
- Revisar erros
- Conceitos fracos
- Prática intensiva

---

## 🎯 Estratégias para o Exame

### Antes do Exame

1. **Pratique simulados:** Mínimo 4-6 completos
2. **Foque nos 52%:** Domínios 2 e 3 primeiro
3. **Entenda trade-offs:** RAG vs Fine-tuning, métricas, etc
4. **Memorize serviços AWS:** O que cada um faz
5. **Durma bem:** 8 horas antes do exame

### Durante o Exame

1. **Gestão de tempo:** 83 segundos/questão (1min 23s)
2. **Leia TODA a pergunta:** Restrições no final
3. **Marque e revise:** Use flags para questões difíceis
4. **Eliminação:** Remova opções absurdas primeiro
5. **Nunca deixe em branco:** Não há penalidade

### Palavras-Chave nas Questões

**RAG:**
- "atualizada frequentemente"
- "informações dinâmicas"
- "base de conhecimento externa"

**Fine-tuning:**
- "estilo específico"
- "terminologia do setor"
- "comportamento consistente"

**Knowledge Cutoff:**
- "eventos recentes"
- "não sabe sobre [data futura]"
- "informações desatualizadas"

**Hallucination:**
- "informações falsas mas plausíveis"
- "inventa fatos"
- "cita fontes inexistentes"

---

## ✅ Checklist Final

Antes de marcar o exame, você deve:

- [ ] Completar todos os questionários dos 5 domínios
- [ ] Fazer pelo menos 4 simulados completos
- [ ] Acertar consistentemente 75%+ nos simulados
- [ ] Entender RAG vs Fine-tuning profundamente
- [ ] Conhecer todos os serviços AWS AI/ML
- [ ] Dominar parâmetros de inferência
- [ ] Entender métricas (ROUGE, BLEU, etc)
- [ ] Conhecer princípios de IA Responsável
- [ ] Saber fundamentos de segurança AWS

---

## 🚀 Recursos Adicionais

**Seus arquivos de estudo:**
- ✅ `dominio1-questoes-fundamentos-ml.md`
- ✅ `dominio2-questoes-basicas.md`
- ✅ `dominio3-questoes-prompt-engineering.md`
- ✅ `dominio3-questoes-rag-finetuning.md`
- ✅ `dominio3-questoes-metricas-avaliacao.md`
- ✅ `dominio3-questoes-inferencia.md`
- ✅ `dominio4-questoes-responsible-ai.md`
- ✅ `dominio5-questoes-seguranca-governanca.md`
- ✅ `simulado-completo-1.md`

**Documentação AWS:**
- Amazon Bedrock User Guide
- SageMaker Developer Guide
- AWS AI Services documentation

**Prática:**
- AWS Skill Builder (curso oficial)
- AWS Free Tier (hands-on)

---

## 💪 Mensagem Final

Você está estudando uma certificação que combina:
- 🤖 **Tecnologia de ponta** (IA Generativa)
- ☁️ **Cloud computing** (AWS)
- 📈 **Alta demanda** no mercado

**Com 80%+ nos seus quizzes, você está no caminho certo!**

Continue praticando, mantenha a consistência e você vai conseguir! 🎯

---

**Boa sorte na sua certificação! 🍀**
