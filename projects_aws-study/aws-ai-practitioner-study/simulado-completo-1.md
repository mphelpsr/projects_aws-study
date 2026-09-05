# Simulado Completo 1 - Domínios 2 e 3 (52% da Prova)

**Questões:** 34 (proporcional aos 52% = 34 de 65 questões)  
**Tempo sugerido:** 50 minutos  
**Nota de aprovação simulada:** 24 corretas (≈70%)

---

## 🎯 INSTRUÇÕES

1. Anote suas respostas em um papel separado
2. Não consulte materiais durante o simulado
3. Marque questões que você não tem certeza para revisão
4. Após terminar, confira o gabarito no final
5. Revise as explicações das questões erradas

---

## QUESTÃO 1
Uma startup quer criar um assistente virtual que responda perguntas sobre seus produtos usando informações do site da empresa. O site é atualizado diariamente. Qual arquitetura é mais apropriada?

A) Fine-tuning do modelo semanalmente com conteúdo do site  
B) RAG com web scraping diário e atualização da base de conhecimento  
C) Usar apenas zero-shot prompting sem contexto adicional  
D) Retreinar um modelo foundation do zero  

---

## QUESTÃO 2
Qual parâmetro de inferência controla a aleatoriedade das respostas de um modelo de linguagem?

A) max_tokens  
B) top_k  
C) temperature  
D) context_window  

---

## QUESTÃO 3
Um modelo está gerando respostas repetitivas e muito previsíveis. Qual ajuste você faria?

A) Diminuir temperature para 0.1  
B) Aumentar temperature para 0.8-1.0  
C) Diminuir max_tokens  
D) Aumentar apenas o top_k  

---

## QUESTÃO 4
O que acontece quando você define temperature = 0 em um modelo de linguagem?

A) O modelo gera respostas aleatórias  
B) O modelo sempre escolhe o token mais provável (determinístico)  
C) O modelo para de funcionar  
D) O modelo fica mais criativo  

---

## QUESTÃO 5
Amazon Bedrock oferece acesso a modelos de quais fornecedores? (Escolha a mais completa)

A) Apenas Amazon  
B) Amazon, Anthropic, AI21 Labs, Cohere, Meta, Stability AI  
C) Apenas OpenAI  
D) Apenas modelos open source  

---

## QUESTÃO 6
Uma empresa quer que um modelo gere sempre respostas em formato JSON estruturado. Qual técnica é apropriada?

A) Usar temperatura muito alta  
B) Especificar formato de saída no prompt com exemplos (format specification)  
C) Fine-tuning obrigatório  
D) Usar apenas modelos de imagem  

---

## QUESTÃO 7
Qual é a principal diferença entre Amazon SageMaker e Amazon Bedrock?

A) SageMaker é para ML tradicional e customizado; Bedrock é para acesso gerenciado a modelos de fundação  
B) Não há diferença, são o mesmo serviço  
C) SageMaker é mais caro sempre  
D) Bedrock não permite inferência  

---

## QUESTÃO 8
Em um prompt, você escreve: "Explique em linguagem simples para uma criança de 10 anos." Que técnica você está usando?

A) Fine-tuning  
B) Role/persona prompting e instrução de estilo  
C) RAG  
D) Continued pre-training  

---

## QUESTÃO 9
O que é "top_p" (nucleus sampling) em parâmetros de inferência?

A) O token com maior probabilidade  
B) Amostragem dos tokens cuja probabilidade cumulativa alcança p  
C) O número de tokens gerados  
D) O tamanho do modelo  

---

## QUESTÃO 10
Uma aplicação RAG precisa buscar informações em documentos técnicos extensos. Qual é a ordem correta do pipeline?

A) Generate → Retrieve → Embed → Augment  
B) Embed query → Retrieve documents → Augment prompt → Generate  
C) Retrieve → Generate → Embed → Augment  
D) Augment → Embed → Generate → Retrieve  

---

## QUESTÃO 11
Amazon Bedrock Guardrails pode fazer o quê?

A) Apenas aumentar velocidade de inferência  
B) Filtrar conteúdo tóxico, bloquear tópicos, aplicar políticas de segurança e validar saídas  
C) Apenas reduzir custos  
D) Apenas armazenar logs  

---

## QUESTÃO 12
Você quer avaliar a qualidade de resumos gerados automaticamente. Qual métrica é mais apropriada?

A) BLEU  
B) ROUGE  
C) Precision@K  
D) Mean Absolute Error  

---

## QUESTÃO 13
O que é "hallucination" em modelos de linguagem?

A) Quando o modelo processa muito lentamente  
B) Quando o modelo gera informações que parecem plausíveis mas são incorretas  
C) Quando o modelo usa muita memória  
D) Quando o modelo não responde  

---

## QUESTÃO 14
Para implementar RAG, onde você armazena os embeddings dos documentos?

A) Amazon S3 apenas  
B) Banco de dados vetorial como OpenSearch, Aurora pgvector, ou Pinecone  
C) Amazon RDS MySQL  
D) Diretamente no código  

---

## QUESTÃO 15
Uma empresa tem 5000 exemplos de conversas de atendimento ao cliente bem classificadas. Eles querem que um modelo aprenda o estilo específico de resposta. Qual abordagem é mais apropriada?

A) RAG  
B) Fine-tuning com os 5000 exemplos  
C) Apenas zero-shot  
D) Continued pre-training  

---

## QUESTÃO 16
Qual é o limite de conhecimento (knowledge cutoff) de um modelo de fundação?

A) O número máximo de tokens  
B) A data até a qual o modelo foi treinado; ele não sabe sobre eventos posteriores  
C) O tamanho máximo de arquivo  
D) O número de usuários simultâneos  

---

## QUESTÃO 17
Em few-shot prompting, você fornece 5 exemplos de classificação de sentimento antes da sua query. Quantos exemplos você usou?

A) Zero-shot (0 exemplos)  
B) One-shot (1 exemplo)  
C) Few-shot (5 exemplos)  
D) Many-shot (muitos exemplos)  

---

## QUESTÃO 18
Amazon Bedrock Knowledge Bases automatiza qual padrão arquitetural?

A) Supervised learning  
B) RAG (Retrieval-Augmented Generation)  
C) Reinforcement learning  
D) Transfer learning  

---

## QUESTÃO 19
Um modelo está retornando respostas muito longas. Qual parâmetro você deve ajustar?

A) temperature  
B) max_tokens ou max_length  
C) top_p  
D) knowledge_cutoff  

---

## QUESTÃO 20
O que é chain-of-thought (CoT) prompting?

A) Conectar múltiplos modelos em série  
B) Pedir ao modelo para mostrar raciocínio passo a passo  
C) Usar múltiplos prompts simultâneos  
D) Treinar uma cadeia de modelos  

---

## QUESTÃO 21
Qual métrica mede a "surpresa" do modelo com o texto? (menor é melhor)

A) ROUGE  
B) BLEU  
C) Perplexity  
D) Accuracy  

---

## QUESTÃO 22
Para avaliar qualidade de tradução automática, qual métrica é tradicionalmente usada?

A) ROUGE  
B) BLEU  
C) F1-Score  
D) Pass@K  

---

## QUESTÃO 23
Uma empresa quer que seu modelo NÃO discuta tópicos políticos. Qual recurso do Bedrock pode ajudar?

A) Bedrock Pricing  
B) Bedrock Guardrails com bloqueio de tópicos  
C) Bedrock Metrics  
D) Bedrock Storage  

---

## QUESTÃO 24
O que BERTScore mede que ROUGE e BLEU não capturam bem?

A) Velocidade  
B) Similaridade semântica usando embeddings contextuais  
C) Custo  
D) Tamanho do arquivo  

---

## QUESTÃO 25
Amazon SageMaker JumpStart oferece:

A) Apenas armazenamento de dados  
B) Modelos pré-treinados e soluções prontas para uso rápido  
C) Apenas ferramentas de visualização  
D) Apenas notebooks vazios  

---

## QUESTÃO 26
Você tem um catálogo de 10.000 produtos que muda diariamente. Para um chatbot de vendas, qual estratégia é mais eficiente?

A) Fine-tuning diário  
B) RAG com base de produtos sincronizada diariamente  
C) Retreinar foundation model diariamente  
D) Apenas memorizar os 10.000 produtos no prompt  

---

## QUESTÃO 27
O que é "embedding" no contexto de IA Generativa?

A) Incorporar o modelo em hardware  
B) Representação vetorial numérica de texto que captura significado semântico  
C) Criptografar dados  
D) Comprimir o modelo  

---

## QUESTÃO 28
Em RAG, qual é a vantagem de usar busca híbrida (vetorial + keyword)?

A) É sempre mais lenta  
B) Combina similaridade semântica com matches exatos, melhorando relevância  
C) Usa menos memória  
D) Não requer embeddings  

---

## QUESTÃO 29
Uma empresa fez fine-tuning de um modelo Bedrock. O custo de inferência será:

A) Sempre menor que o modelo base  
B) Igual ao modelo base  
C) Potencialmente maior que o modelo base  
D) Zero após o fine-tuning  

---

## QUESTÃO 30
Para avaliar um modelo de geração de código, qual métrica é mais relevante?

A) ROUGE  
B) BLEU  
C) Pass@K (código passa em testes unitários)  
D) Apenas número de linhas geradas  

---

## QUESTÃO 31
O que acontece quando "top_k" é definido como 50?

A) Gera no máximo 50 tokens  
B) Considera apenas os 50 tokens mais prováveis para amostragem  
C) Usa 50 modelos diferentes  
D) Custo é reduzido em 50%  

---

## QUESTÃO 32
Amazon Q é:

A) Um banco de dados  
B) Um serviço de filas  
C) Um assistente de IA generativa para negócios e desenvolvedores  
D) Um quantum computer  

---

## QUESTÃO 33
Para avaliar se um modelo está gerando conteúdo ofensivo, você deve:

A) Apenas calcular BLEU  
B) Usar ferramentas de detecção de toxicidade + revisão humana  
C) Ignorar, pois modelos nunca geram conteúdo ofensivo  
D) Apenas medir velocidade  

---

## QUESTÃO 34
Uma empresa quer usar IA Generativa mas garantir que dados de clientes não sejam usados para treinar modelos. O que o Amazon Bedrock oferece?

A) Nenhuma garantia  
B) Política de que dados de clientes não são usados para treinar modelos base  
C) Dados são sempre compartilhados  
D) Apenas modelos open source têm essa proteção  

---

---

## 📝 GABARITO E EXPLICAÇÕES

1. **B** - RAG com atualização diária permite informação fresca sem retreinar. Mais eficiente que fine-tuning para conteúdo dinâmico.

2. **C** - Temperature controla aleatoriedade: baixa = determinístico, alta = criativo/aleatório.

3. **B** - Aumentar temperature introduz mais aleatoriedade e diversidade nas respostas.

4. **B** - Temperature = 0 faz o modelo sempre escolher o token mais provável (greedy, determinístico).

5. **B** - Bedrock oferece modelos de múltiplos fornecedores: Amazon (Titan), Anthropic (Claude), AI21, Cohere, Meta (Llama), Stability AI.

6. **B** - Format specification no prompt (com exemplos) instrui o modelo sobre estrutura desejada.

7. **A** - SageMaker é plataforma completa para ML customizado; Bedrock é acesso gerenciado a foundation models.

8. **B** - Definir persona/audiência e estilo de comunicação no prompt.

9. **B** - Top_p (nucleus sampling) amostra tokens cuja probabilidade cumulativa soma até p.

10. **B** - Pipeline RAG: Vetorizar query → Buscar docs relevantes → Enriquecer prompt → Gerar resposta.

11. **B** - Guardrails filtra conteúdo, bloqueia tópicos, aplica políticas PII, e valida saídas.

12. **B** - ROUGE mede overlap de n-gramas, ideal para avaliar resumos.

13. **B** - Hallucination = gerar informações falsas mas plausíveis, desafio importante da Gen AI.

14. **B** - Embeddings são armazenados em bancos vetoriais otimizados para busca por similaridade.

15. **B** - 5000 exemplos de qualidade são suficientes para fine-tuning efetivo de estilo/comportamento.

16. **B** - Knowledge cutoff é a data final do treinamento; modelo não tem informação posterior.

17. **C** - 5 exemplos = few-shot prompting.

18. **B** - Bedrock Knowledge Bases implementa RAG de forma gerenciada e automatizada.

19. **B** - max_tokens limita o comprimento da resposta gerada.

20. **B** - CoT pede raciocínio explícito passo a passo, melhorando respostas complexas.

21. **C** - Perplexity mede incerteza/surpresa do modelo; menor = melhor.

22. **B** - BLEU é métrica padrão para tradução automática.

23. **B** - Guardrails permite configurar bloqueio de tópicos específicos.

24. **B** - BERTScore usa embeddings para capturar similaridade semântica, não apenas n-gramas.

25. **B** - JumpStart oferece modelos pré-treinados e soluções prontas para acelerar desenvolvimento.

26. **B** - RAG com sincronização diária é muito mais eficiente que fine-tuning para dados dinâmicos.

27. **B** - Embeddings são vetores numéricos que representam significado semântico.

28. **B** - Busca híbrida combina benefícios de similaridade semântica com matches de palavras-chave exatas.

29. **C** - Modelos fine-tuned podem ter custo de inferência maior que modelos base.

30. **C** - Pass@K mede quantas soluções geradas passam em testes, métrica específica para código.

31. **B** - top_k restringe amostragem aos k tokens mais prováveis.

32. **C** - Amazon Q é assistente de IA generativa para produtividade em negócios e desenvolvimento.

33. **B** - Detecção de toxicidade requer ferramentas especializadas + validação humana.

34. **B** - Bedrock garante que dados de clientes não são usados para treinar modelos base.

---

## 📊 AVALIAÇÃO DO DESEMPENHO

| Acertos | Avaliação | Recomendação |
|---------|-----------|--------------|
| 30-34 | Excelente! Pronto para a prova | Revisar conceitos específicos errados |
| 24-29 | Bom, próximo da aprovação | Focar em áreas fracas identificadas |
| 18-23 | Precisa estudar mais | Revisar Domínios 2 e 3 completamente |
| < 18 | Mais preparação necessária | Estudar material base antes de simulados |

---

## 🎯 PRÓXIMOS PASSOS

1. **30+ acertos:** Faça o Simulado Completo 2 e depois simulados dos outros domínios
2. **24-29 acertos:** Revise questões erradas e refaça este simulado em 3 dias
3. **< 24 acertos:** Estude os arquivos individuais por tópico antes de refazer

---

**Próximo simulado:** `simulado-completo-2.md`
