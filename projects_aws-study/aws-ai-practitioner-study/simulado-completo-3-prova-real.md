# Simulado Completo 3 - AWS Certified AI Practitioner (AIF-C01)

**EXAME COMPLETO - Condições Reais - VERSÃO ALTERNATIVA**

---

## 📋 INFORMAÇÕES DO EXAME

| Detalhe | Valor |
|---------|-------|
| **Questões** | 65 questões |
| **Tempo** | 90 minutos |
| **Nota de Corte** | ~46 questões corretas (70%) |
| **Formato** | Múltipla escolha |

---

## ⏱️ INSTRUÇÕES

1. **Cronometre 90 minutos** - Simule condições reais
2. **Anote suas respostas** em papel separado (A, B, C ou D)
3. **NÃO consulte materiais** durante o exame
4. **Marque questões com dúvida** para revisar depois
5. **Não deixe em branco** - Não há penalidade por erro
6. **Após terminar:** Confira gabarito e conte acertos

---

## 🎯 DISTRIBUIÇÃO POR DOMÍNIO

- Domínio 1 (Fundamentos AI/ML): 13 questões (20%)
- Domínio 2 (Fundamentos Gen AI): 16 questões (24%)
- Domínio 3 (Aplicações Modelos): 18 questões (28%)
- Domínio 4 (IA Responsável): 9 questões (14%)
- Domínio 5 (Segurança/Governança): 9 questões (14%)

---

## 📝 QUESTÕES

### DOMÍNIO 1: FUNDAMENTOS DE IA E ML (Questões 1-13)

**Questão 1**
Uma empresa de e-commerce quer identificar automaticamente se imagens enviadas por vendedores contêm produtos proibidos, rostos de pessoas ou conteúdo inadequado.

Qual serviço AWS é mais apropriado?

A) Amazon Comprehend  
B) Amazon Rekognition  
C) Amazon Textract  
D) Amazon Translate

---

**Questão 2**
Uma streaming platform quer agrupar usuários com padrões de visualização similares, SEM categorias pré-definidas. Qual tipo de ML?

A) Aprendizado supervisionado - classificação  
B) Aprendizado supervisionado - regressão  
C) Aprendizado não supervisionado - clustering  
D) Aprendizado por reforço

---

**Questão 3**
Qual é a função principal do Amazon Comprehend?

A) Reconhecimento de imagens  
B) Análise de texto (sentimento, entidades, NLP)  
C) Conversão de fala em texto  
D) Tradução de idiomas

---

**Questão 4**
No ciclo de vida de ML, quando você deve separar dados em treino, validação e teste?

A) Após o deploy  
B) Durante a preparação de dados, antes do treino  
C) Apenas se o modelo falhar  
D) Não é necessário separar

---

**Questão 5**
Amazon Transcribe é usado para:

A) Traduzir texto entre idiomas  
B) Converter áudio em texto (speech-to-text)  
C) Converter texto em áudio (text-to-speech)  
D) Analisar sentimento

---

**Questão 6**
O que é "overfitting"?

A) Modelo muito simples que não aprende  
B) Modelo decora dados de treino mas não generaliza para dados novos  
C) Modelo processa muito rápido  
D) Dataset muito grande

---

**Questão 7**
Uma empresa quer converter artigos de blog em áudio para criar podcasts automaticamente. Qual serviço?

A) Amazon Transcribe  
B) Amazon Polly  
C) Amazon Translate  
D) Amazon Lex

---

**Questão 8**
Qual serviço AWS fornece recomendações personalizadas (como "clientes que compraram X também compraram Y")?

A) Amazon Forecast  
B) Amazon Personalize  
C) Amazon Comprehend  
D) Amazon Rekognition

---

**Questão 9**
O que caracteriza aprendizado supervisionado?

A) Dados sem rótulos  
B) Dados rotulados com entrada e saída conhecidas  
C) Apenas dados de imagens  
D) Não requer dados de treino

---

**Questão 10**
Amazon Comprehend Medical é usado para:

A) Diagnóstico automático de pacientes  
B) Extrair informações médicas de textos clínicos (medicamentos, dosagens)  
C) Análise de imagens de raios-X  
D) Agendar consultas médicas

---

**Questão 11**
Qual é o objetivo da fase de "validação" no ciclo de vida de ML?

A) Treinar o modelo  
B) Ajustar hiperparâmetros e evitar overfitting  
C) Deploy em produção  
D) Coletar novos dados

---

**Questão 12**
Uma empresa quer detectar fraudes em transações financeiras em tempo real. Isso é um exemplo de:

A) Regressão  
B) Classificação binária (fraude/não-fraude)  
C) Clustering  
D) Redução de dimensionalidade

---

**Questão 13**
Amazon Translate é usado para:

A) Converter áudio em texto  
B) Traduzir texto entre idiomas  
C) Análise de sentimento  
D) Reconhecimento de imagens

---

### DOMÍNIO 2: FUNDAMENTOS DE IA GENERATIVA (Questões 14-29)

**Questão 14**
Por que um modelo foundation pode "alucinar" informações?

A) Falta de memória RAM  
B) Modelos são probabilísticos e podem gerar texto plausível mas incorreto  
C) Configuração de rede incorreta  
D) Sempre que temperature = 0

---

**Questão 15**
Qual é o propósito de embeddings em IA Generativa?

A) Criptografar dados  
B) Representar texto como vetores numéricos que capturam significado semântico  
C) Autenticar usuários  
D) Reduzir custos

---

**Questão 16**
Uma empresa quer usar Gen AI mas está preocupada com dados de clientes sendo usados para treinar modelos. O que Amazon Bedrock garante?

A) Nenhuma garantia  
B) Dados de clientes não são usados para treinar modelos base  
C) Todos os dados são compartilhados  
D) Apenas modelos open source protegem dados

---

**Questão 17**
Qual NÃO é uma capacidade típica de IA Generativa?

A) Gerar código  
B) Criar imagens de texto  
C) Resumir documentos  
D) Executar cálculos matemáticos com 100% de precisão garantida

---

**Questão 18**
O que limita o quanto de texto um LLM pode processar em uma única interação?

A) Velocidade da internet  
B) Context window (tamanho em tokens)  
C) Tamanho do disco  
D) Número de usuários

---

**Questão 19**
Amazon Bedrock Custom Models permite:

A) Apenas usar modelos base  
B) Fine-tuning de modelos selecionados com seus dados  
C) Apenas monitorar custos  
D) Apenas fazer backup

---

**Questão 20**
Qual é a relação entre IA, ML e Deep Learning?

A) São exatamente a mesma coisa  
B) IA é o mais amplo, ML é subconjunto de IA, Deep Learning é subconjunto de ML  
C) Não são relacionados  
D) Deep Learning é mais antigo que ML

---

**Questão 21**
Por que modelos foundation são chamados de "foundation" (fundação)?

A) São os mais baratos  
B) São modelos grandes treinados em dados diversos que servem de base para múltiplas tarefas  
C) Foram os primeiros modelos criados  
D) Funcionam apenas em aplicações básicas

---

**Questão 22**
O que acontece quando você tenta fazer uma pergunta que excede o context window?

A) Modelo responde normalmente  
B) Modelo não consegue processar ou trunca a entrada  
C) Modelo fica mais rápido  
D) Custo diminui

---

**Questão 23**
Amazon Bedrock Playground é usado para:

A) Apenas treinar modelos  
B) Testar e experimentar com diferentes modelos e prompts interativamente  
C) Apenas armazenar dados  
D) Apenas calcular custos

---

**Questão 24**
Tokens em LLMs são tipicamente:

A) Sempre uma palavra completa  
B) Palavras ou sub-palavras (pedaços de palavras)  
C) Sempre uma letra  
D) Sempre uma frase completa

---

**Questão 25**
Uma empresa quer gerar emails de marketing criativos e únicos. Qual temperatura é apropriada?

A) 0.0 (determinístico)  
B) 0.8-1.0 (criativo)  
C) 3.0  
D) Temperature não importa

---

**Questão 26**
O que diferencia Gen AI de classificação tradicional?

A) Gen AI cria conteúdo novo; classificação atribui categorias existentes  
B) Gen AI é sempre mais barata  
C) Classificação não usa ML  
D) Não há diferença

---

**Questão 27**
SageMaker JumpStart vs Amazon Bedrock - qual diferença principal?

A) São idênticos  
B) JumpStart: modelos ML diversos; Bedrock: foco em foundation models para Gen AI  
C) JumpStart é mais caro sempre  
D) Bedrock não permite inferência

---

**Questão 28**
Uma startup quer começar com Gen AI rapidamente sem gerenciar infraestrutura. Melhor opção?

A) Construir cluster GPU próprio  
B) Amazon Bedrock (totalmente gerenciado)  
C) Treinar modelos do zero  
D) Comprar servidores físicos

---

**Questão 29**
O que "knowledge cutoff" significa?

A) Limite de custo  
B) Data até qual modelo foi treinado; não sabe eventos posteriores  
C) Número máximo de usuários  
D) Limite de armazenamento

---

### DOMÍNIO 3: APLICAÇÕES DE MODELOS DE FUNDAÇÃO (Questões 30-47)

**Questão 30**
Você escreve no prompt: "Pense passo a passo e mostre seu raciocínio." Qual técnica?

A) Zero-shot  
B) Few-shot  
C) Chain-of-thought  
D) Fine-tuning

---

**Questão 31**
Para um chatbot que precisa SEMPRE dar a mesma resposta factual, configure:

A) temperature = 1.5, top_p = 1.0  
B) temperature = 0.0, top_p = 0.9  
C) temperature = 2.0  
D) Não importa

---

**Questão 32**
Um sistema RAG está recuperando documentos irrelevantes. Como melhorar?

A) Ignorar o problema  
B) Usar busca híbrida (vetorial + keyword), melhorar chunks, ajustar top-k  
C) Sempre usar modelo maior  
D) Remover todos os documentos

---

**Questão 33**
Você fornece ZERO exemplos, apenas a instrução. Qual técnica?

A) Zero-shot prompting  
B) Few-shot prompting  
C) Chain-of-thought  
D) Fine-tuning

---

**Questão 34**
Amazon Bedrock Agents permite fazer o quê que RAG sozinho não faz?

A) Apenas gerar texto  
B) Chamar APIs externas e executar ações além de buscar documentos  
C) Apenas armazenar dados  
D) Nada diferente

---

**Questão 35**
Para avaliar similaridade semântica (não apenas n-gramas), qual métrica?

A) ROUGE  
B) BLEU  
C) BERTScore  
D) Accuracy

---

**Questão 36**
O que é "perplexity" em modelos de linguagem?

A) Velocidade de processamento  
B) Medida de incerteza; menor perplexity = modelo mais confiante  
C) Número de parâmetros  
D) Custo de inferência

---

**Questão 37**
Fine-tuning vs RAG para dados que mudam semanalmente:

A) Fine-tuning é melhor (retreinar semanalmente)  
B) RAG é melhor (atualizar base sem retreinar)  
C) Ambos são igualmente eficientes  
D) Nenhum funciona

---

**Questão 38**
"top_k = 50" significa:

A) Gera 50 tokens  
B) Considera apenas os 50 tokens mais prováveis para amostragem  
C) Usa 50 modelos  
D) Custo é $50

---

**Questão 39**
Amazon Bedrock Knowledge Bases armazena embeddings onde?

A) Apenas em memória  
B) OpenSearch, Aurora pgvector, ou outros bancos vetoriais suportados  
C) Arquivo CSV  
D) Blockchain

---

**Questão 40**
Uma empresa quer estilo de marca específico E informações de produtos atualizadas. Melhor estratégia?

A) Apenas fine-tuning  
B) Apenas RAG  
C) Fine-tuning (estilo) + RAG (produtos)  
D) Apenas zero-shot

---

**Questão 41**
Bedrock Guardrails pode fazer o quê?

A) Apenas reduzir custos  
B) Bloquear tópicos sensíveis, detectar PII, filtrar toxicidade  
C) Apenas treinar modelos  
D) Apenas fazer backup

---

**Questão 42**
Para criar escritor criativo de histórias, configure:

A) temperature = 0.0  
B) temperature = 0.9-1.0  
C) Temperatura não importa  
D) temperature = -1.0

---

**Questão 43**
O que "max_tokens" controla?

A) Número de usuários  
B) Comprimento máximo da resposta gerada  
C) Número de modelos  
D) Tamanho do dataset

---

**Questão 44**
Modelo fine-tuned adiciona conhecimento factual novo sobre eventos recentes?

A) Sim, sempre  
B) Não, fine-tuning adapta estilo/comportamento mas não adiciona fatos pós-treino  
C) Apenas se usar GPU  
D) Apenas em modelos pequenos

---

**Questão 45**
Pipeline RAG típico:

A) Generate → Retrieve → Augment  
B) Query → Embed → Retrieve → Augment → Generate  
C) Retrieve → Generate  
D) Embed → Generate

---

**Questão 46**
Para evitar que modelo discuta tópicos políticos, use:

A) Apenas temperature baixa  
B) Bedrock Guardrails com bloqueio de tópicos  
C) Apenas fine-tuning  
D) Não é possível

---

**Questão 47**
BERTScore vs ROUGE - principal diferença:

A) Nenhuma  
B) BERTScore usa embeddings (semântica); ROUGE usa n-gramas  
C) BERTScore é sempre mais lento  
D) São sinônimos

---

### DOMÍNIO 4: IA RESPONSÁVEL (Questões 48-56)

**Questão 48**
O que SageMaker Clarify fornece?

A) Apenas treino  
B) Detecção de viés e explicabilidade (SHAP values)  
C) Apenas armazenamento  
D) Apenas logs

---

**Questão 49**
Um modelo de RH está rejeitando mais candidatos mulheres que homens com mesmas qualificações. Problema:

A) Velocidade  
B) Viés / Falta de Fairness  
C) Custo  
D) Escalabilidade

---

**Questão 50**
Human-in-the-loop é obrigatório em:

A) Filtros de spam  
B) Decisões médicas e legais críticas  
C) Recomendações de música  
D) Todas as aplicações de IA sempre

---

**Questão 51**
Model Cards documentam:

A) Apenas custos  
B) Uso pretendido, limitações, performance, considerações éticas  
C) Apenas código  
D) Apenas arquitetura

---

**Questão 52**
Para cumprir GDPR (direito à explicação), você precisa:

A) Não usar IA  
B) Explicar como modelo tomou decisão (explicabilidade)  
C) Sempre usar modelos mais baratos  
D) Compartilhar dados publicamente

---

**Questão 53**
Como detectar se dados de treino têm viés de gênero?

A) Ignorar  
B) Usar SageMaker Clarify para analisar métricas de fairness  
C) Apenas visual  
D) Não é possível detectar

---

**Questão 54**
Princípios de IA Responsável incluem:

A) Apenas maximizar lucro  
B) Fairness, Transparency, Privacy, Safety, Accountability  
C) Apenas velocidade  
D) Apenas custo

---

**Questão 55**
Bedrock Guardrails ajuda com qual pilar de IA Responsável?

A) Apenas custo  
B) Safety e Privacy (filtra conteúdo, detecta PII)  
C) Apenas performance  
D) Apenas backup

---

**Questão 56**
Para garantir modelo não discrimine por idade, você deve:

A) Não testar  
B) Avaliar fairness métricas por grupo etário, usar dados balanceados  
C) Usar apenas modelo mais complexo  
D) Treinar com menos dados

---

### DOMÍNIO 5: SEGURANÇA, CONFORMIDADE E GOVERNANÇA (Questões 57-65)

**Questão 57**
Para descobrir automaticamente onde há PII (CPF, emails) em buckets S3, use:

A) IAM  
B) Amazon Macie  
C) KMS  
D) CloudWatch

---

**Questão 58**
Least Privilege significa:

A) Dar todas as permissões  
B) Conceder apenas permissões mínimas necessárias  
C) Não ter controle de acesso  
D) Sempre usar admin

---

**Questão 59**
Para auditar "quem deletou este endpoint SageMaker?", consulte:

A) S3  
B) CloudWatch Metrics  
C) AWS CloudTrail  
D) KMS

---

**Questão 60**
HIPAA (regulamentação de saúde) requer:

A) Dados desprotegidos  
B) Criptografia, controles de acesso, auditoria, BAA  
C) Compartilhar PHI publicamente  
D) Não documentar nada

---

**Questão 61**
Para criptografar modelo SageMaker em repouso, use:

A) IAM  
B) AWS KMS  
C) CloudTrail  
D) S3 apenas

---

**Questão 62**
SageMaker Model Registry permite:

A) Apenas treinar  
B) Versionar e catalogar modelos para governança  
C) Apenas deletar  
D) Apenas calcular custos

---

**Questão 63**
Para garantir que dados de treino trafeguem criptografados entre serviços:

A) Sem criptografia  
B) TLS/HTTPS  
C) Apenas KMS  
D) Apenas IAM

---

**Questão 64**
CloudWatch vs CloudTrail - diferença principal:

A) São idênticos  
B) CloudWatch: métricas/performance; CloudTrail: auditoria de API calls  
C) CloudWatch é mais caro  
D) CloudTrail não funciona com ML

---

**Questão 65**
Uma role IAM para aplicação de inferência deve ter:

A) Permissões * (tudo)  
B) Apenas sagemaker:InvokeEndpoint para endpoints específicos (least privilege)  
C) Acesso admin completo  
D) Nenhuma permissão

---

---

## 📝 GABARITO

### Domínio 1 (1-13):
1. B | 2. C | 3. B | 4. B | 5. B | 6. B | 7. B | 8. B | 9. B | 10. B | 11. B | 12. B | 13. B

### Domínio 2 (14-29):
14. B | 15. B | 16. B | 17. D | 18. B | 19. B | 20. B | 21. B | 22. B | 23. B | 24. B | 25. B | 26. A | 27. B | 28. B | 29. B

### Domínio 3 (30-47):
30. C | 31. B | 32. B | 33. A | 34. B | 35. C | 36. B | 37. B | 38. B | 39. B | 40. C | 41. B | 42. B | 43. B | 44. B | 45. B | 46. B | 47. B

### Domínio 4 (48-56):
48. B | 49. B | 50. B | 51. B | 52. B | 53. B | 54. B | 55. B | 56. B

### Domínio 5 (57-65):
57. B | 58. B | 59. C | 60. B | 61. B | 62. B | 63. B | 64. B | 65. B

---

## 📊 AVALIAÇÃO

**Conte seus acertos:**

- **58-65 corretas (89%+):** 🔥 EXCELENTE! Você está PRONTO!
- **52-57 corretas (80-88%):** ✅ Muito bom! Leve revisão
- **46-51 corretas (70-79%):** ⚠️ Nota de corte, praticar mais
- **< 46 corretas (<70%):** 📚 Mais estudo necessário

---

## 🎯 PROGRESSÃO IDEAL

| Simulado | Meta | Quando Fazer |
|----------|------|--------------|
| Simulado 1 | 70%+ | Dia 7 |
| Simulado 2 | 75%+ | Dia 11-12 |
| Simulado 3 | 80%+ | Dia 16 |

**Se atingir 80%+ consistentemente → PRONTO PARA PROVA REAL!** ✅

---

## 📚 APÓS ESTE SIMULADO

1. **Revisar TODOS os erros** - Entender por quê errou
2. **Consultar material** dos domínios com <80%
3. **Refazer questões erradas** em 2-3 dias
4. **Avaliar se precisa mais prática** ou está pronto

---

**Sucesso! 🚀**
