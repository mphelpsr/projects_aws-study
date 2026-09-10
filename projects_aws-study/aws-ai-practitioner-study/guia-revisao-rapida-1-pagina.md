# 📄 Guia de Revisão Rápida - 1 Página

**AWS Certified AI Practitioner (AIF-C01)**  
**Use este guia na véspera da prova!**

---

## 🎯 DOMÍNIOS E PESOS

| Domínio | Peso | Foco |
|---------|------|------|
| 1. Fundamentos AI/ML | 20% | Tipos aprendizado, serviços AWS |
| 2. Fundamentos Gen AI | 24% | Tokens, embeddings, knowledge cutoff |
| 3. Aplicações Modelos | **28%** | RAG, prompting, métricas, Bedrock |
| 4. IA Responsável | 14% | Fairness, HITL, Clarify |
| 5. Segurança | 14% | IAM, KMS, CloudTrail, Macie |

---

## 🔑 CONCEITOS ESSENCIAIS

### Tipos de Aprendizado
- **Supervisionado:** Dados rotulados → Classificação (categorias) ou Regressão (números)
- **Não Supervisionado:** Sem rótulos → Clustering (agrupar)
- **Reforço:** Tentativa/erro com recompensas

### Overfitting vs Underfitting
- **Overfitting:** Alta acurácia treino, baixa teste (decora)
- **Underfitting:** Baixa acurácia treino E teste (muito simples)

### Gen AI - Conceitos
- **Tokens:** Unidades de texto (palavras/sub-palavras)
- **Embeddings:** Vetores numéricos de significado
- **Context Window:** Max tokens processados
- **Knowledge Cutoff:** Limite temporal do treino
- **Hallucination:** Gera info falsa mas plausível

### RAG vs Fine-tuning
- **RAG:** Info atualizada, fatos externos, custo-efetivo
- **Fine-tuning:** Estilo/comportamento, terminologia
- **Combinar:** Estilo específico + info dinâmica

### Prompt Engineering
- **Zero-shot:** Sem exemplos
- **Few-shot:** 2-10 exemplos
- **Chain-of-thought:** "Pense passo a passo"

### Parâmetros Inferência
- **temperature:** 0=determinístico, 1=criativo
- **top_p:** Probabilidade cumulativa (0.9 típico)
- **max_tokens:** Comprimento resposta

### Métricas
- **ROUGE:** Resumos
- **BLEU:** Tradução
- **Pass@K:** Código
- **BERTScore:** Semântica

---

## 🛠️ SERVIÇOS AWS AI/ML

| Serviço | Função |
|---------|--------|
| **Bedrock** | Foundation models gerenciados |
| **SageMaker** | ML end-to-end |
| **Comprehend** | NLP (sentimento, entidades) |
| **Rekognition** | Imagens/vídeos |
| **Textract** | OCR documentos |
| **Transcribe** | Speech-to-text |
| **Polly** | Text-to-speech |
| **Translate** | Tradução |
| **Lex** | Chatbots |
| **Forecast** | Séries temporais |
| **Personalize** | Recomendações |

### Bedrock Componentes
- **Models:** Acesso multi-fornecedor
- **Knowledge Bases:** RAG gerenciado
- **Agents:** Orquestração + APIs
- **Guardrails:** Segurança/filtros
- **Custom Models:** Fine-tuning

---

## 🤝 IA RESPONSÁVEL

**Pilares:**
- Fairness: Não discriminar
- Transparency: Explicar decisões
- Privacy: Proteger dados
- Safety: HITL em decisões críticas
- Accountability: Responsabilização

**Ferramentas:**
- **SageMaker Clarify:** Detecta viés, explicabilidade
- **Guardrails:** Filtra conteúdo, bloqueia tópicos

**HITL obrigatório:** Saúde, legal, financeiro crítico

---

## 🔒 SEGURANÇA AWS

| Função | Serviço |
|--------|---------|
| Controle acesso | **IAM** (least privilege) |
| Criptografia repouso | **KMS** |
| Criptografia trânsito | **TLS/HTTPS** |
| Auditoria | **CloudTrail** |
| Monitoramento | CloudWatch |
| Descobrir PII | **Macie** |
| Governança ML | Model Registry |

**Least Privilege:** Apenas permissões mínimas necessárias

---

## ⚡ DICAS RÁPIDAS PROVA

1. **52% = Domínios 2+3** → Priorize
2. **Palavras-chave:**
   - "Atualizado frequentemente" → RAG
   - "Estilo específico" → Fine-tuning
   - "Passo a passo" → Chain-of-thought
   - "Sem exemplos" → Zero-shot
   - "Descobrir grupos" → Clustering
   - "Prever categoria" → Classificação
   - "Prever número" → Regressão
3. **Eliminate absurdos** primeiro
4. **Leia TODA questão** (restrições no final)
5. **83 segundos/questão** (~1min 20s)

---

## ✅ CHECKLIST MENTAL

- [ ] RAG vs Fine-tuning → Quando cada um
- [ ] Temperature → 0 (factual) vs 1 (criativo)
- [ ] ROUGE (resumos) vs BLEU (tradução)
- [ ] Overfitting → Alta treino, baixa teste
- [ ] Knowledge cutoff → Não sabe eventos recentes
- [ ] Embeddings → Vetores semânticos
- [ ] IAM → Controle acesso
- [ ] KMS → Criptografia
- [ ] CloudTrail → Auditoria
- [ ] Macie → Descobrir PII
- [ ] Clarify → Viés + explicabilidade
- [ ] HITL → Decisões críticas

---

**VOCÊ ESTÁ PRONTO! BOA SORTE! 🍀🚀**
