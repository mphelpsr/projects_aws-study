# Domínio 3: Prompt Engineering - Questões Avançadas

**Peso no exame:** Parte dos 28% | **Tempo sugerido:** 25 minutos para 20 questões

---

## Questão 1
Uma empresa quer que um modelo classifique emails como "urgente" ou "não urgente" sem fornecer exemplos. Qual técnica de prompt engineering deve ser usada?

A) Few-shot prompting  
B) Zero-shot prompting  
C) Chain-of-thought prompting  
D) Fine-tuning  

---

## Questão 2
Um desenvolvedor está usando um LLM para resolver problemas matemáticos complexos e quer que o modelo mostre seu raciocínio passo a passo. Qual técnica é mais apropriada?

A) Zero-shot prompting  
B) Instruction prompting  
C) Chain-of-thought (CoT) prompting  
D) Negative prompting  

---

## Questão 3
Você fornece ao modelo 3 exemplos de pares pergunta-resposta antes de fazer sua pergunta real. Que técnica você está usando?

A) Zero-shot learning  
B) Few-shot learning  
C) Transfer learning  
D) Fine-tuning  

---

## Questão 4
Qual das seguintes NÃO é uma técnica válida de prompt engineering?

A) Fornecer contexto relevante no início do prompt  
B) Usar delimitadores claros para separar instruções de dados  
C) Sempre usar o máximo de tokens disponíveis  
D) Especificar o formato de saída desejado  

---

## Questão 5
Uma empresa quer que um modelo responda perguntas sobre seus documentos internos que não estavam no treinamento original. Qual padrão arquitetural é mais apropriado?

A) Fine-tuning do modelo com todos os documentos  
B) Retrieval-Augmented Generation (RAG)  
C) Aumentar o context window  
D) Usar apenas zero-shot prompting  

---

## Questão 6
No contexto de RAG (Retrieval-Augmented Generation), qual é o papel do componente de "retrieval"?

A) Recuperar o modelo mais apropriado do catálogo  
B) Buscar informações relevantes de uma base de conhecimento externa para incluir no prompt  
C) Recuperar respostas anteriores do cache  
D) Buscar melhores parâmetros de inferência  

---

## Questão 7
Um prompt contém a instrução: "Você é um assistente especializado em AWS. Responda sempre em formato JSON com as chaves 'resposta' e 'confianca'." Que técnicas estão sendo combinadas?

A) Role prompting + format specification  
B) Few-shot + chain-of-thought  
C) Zero-shot + negative prompting  
D) Instruction tuning + fine-tuning  

---

## Questão 8
Qual é a vantagem principal de usar RAG em vez de fine-tuning para adicionar conhecimento específico do domínio?

A) RAG é sempre mais barato  
B) RAG permite atualizar a base de conhecimento sem retreinar o modelo  
C) RAG produz respostas mais criativas  
D) RAG não requer embeddings  

---

## Questão 9
Em um sistema RAG, que tipo de banco de dados é tipicamente usado para armazenar embeddings de documentos?

A) Banco de dados relacional (RDS)  
B) Banco de dados de grafos (Neptune)  
C) Banco de dados vetorial (como OpenSearch ou pgvector)  
D) Data warehouse (Redshift)  

---

## Questão 10
Você está criando um prompt e quer evitar que o modelo gere conteúdo tóxico. Qual serviço AWS pode ajudar a filtrar saídas indesejadas?

A) AWS WAF  
B) Amazon Bedrock Guardrails  
C) AWS Shield  
D) Amazon Macie  

---

## Questão 11
Um prompt engineering pattern comum é: "Pense passo a passo e mostre seu raciocínio." Isso é um exemplo de:

A) Few-shot prompting  
B) Chain-of-thought prompting  
C) Instruction fine-tuning  
D) Zero-shot classification  

---

## Questão 12
Qual é a ordem correta dos componentes em um pipeline RAG típico?

A) Query → Embedding → Retrieval → Augmentation → Generation  
B) Retrieval → Query → Embedding → Generation → Augmentation  
C) Embedding → Query → Generation → Retrieval → Augmentation  
D) Generation → Query → Embedding → Retrieval → Augmentation  

---

## Questão 13
Uma empresa quer usar prompts que incluem informações proprietárias sensíveis. Qual consideração de segurança é importante?

A) Prompts são sempre públicos, então não pode incluir dados sensíveis  
B) Garantir que o serviço usado (como Bedrock) não use os prompts para treinar modelos  
C) Sempre usar modelos open source locais  
D) Criptografar os prompts com KMS antes de enviar  

---

## Questão 14
Em few-shot prompting, quantos exemplos você geralmente fornece?

A) Zero exemplos  
B) Normalmente entre 2-10 exemplos  
C) Sempre exatamente 3 exemplos  
D) Milhares de exemplos  

---

## Questão 15
Qual técnica você usaria se precisasse que o modelo execute uma tarefa que ele nunca viu durante o treinamento, mas você tem alguns exemplos para mostrar?

A) Zero-shot prompting  
B) Few-shot prompting  
C) Fine-tuning completo  
D) Continued pre-training  

---

## Questão 16
Amazon Bedrock Knowledge Bases usa qual padrão arquitetural?

A) Traditional ML pipeline  
B) RAG (Retrieval-Augmented Generation)  
C) Reinforcement learning  
D) Supervised fine-tuning  

---

## Questão 17
Um desenvolvedor quer melhorar a precisão de um modelo em uma tarefa específica sem alterar os pesos do modelo. Qual estratégia é mais apropriada?

A) Fine-tuning  
B) Otimização de prompt engineering  
C) Continued pre-training  
D) Retreinar do zero  

---

## Questão 18
Em um prompt, você escreve: "NÃO inclua informações sobre preços." Que tipo de técnica você está usando?

A) Positive reinforcement  
B) Negative prompting ou constraining  
C) Few-shot learning  
D) Chain-of-thought  

---

## Questão 19
Qual é um desafio comum ao implementar RAG?

A) Não é possível usar com Amazon Bedrock  
B) Requer sempre fine-tuning do modelo  
C) Garantir que os documentos recuperados sejam realmente relevantes para a query  
D) Não funciona com modelos de fundação  

---

## Questão 20
Uma empresa está implementando um chatbot e quer que ele sempre responda baseado apenas em documentos internos verificados. Qual combinação é mais apropriada?

A) Fine-tuning + high temperature  
B) RAG + Bedrock Guardrails  
C) Zero-shot + maximum tokens  
D) Few-shot + continued pre-training  

---

## 📝 GABARITO

1. **B** - Zero-shot prompting: o modelo executa a tarefa sem exemplos prévios, apenas com a instrução.

2. **C** - Chain-of-thought (CoT) prompting solicita que o modelo mostre o raciocínio passo a passo.

3. **B** - Few-shot learning fornece alguns exemplos (tipicamente 2-10) antes da tarefa real.

4. **C** - Usar o máximo de tokens não é uma prática recomendada; use tokens necessários de forma eficiente.

5. **B** - RAG permite consultar documentos externos sem precisar retreinar o modelo.

6. **B** - Retrieval busca informações relevantes de bases externas para enriquecer o contexto do prompt.

7. **A** - Role prompting (definir papel) + format specification (especificar formato de saída).

8. **B** - RAG permite atualizar conhecimento dinamicamente sem retreinar; basta atualizar a base de documentos.

9. **C** - Bancos vetoriais são otimizados para buscar embeddings por similaridade semântica.

10. **B** - Bedrock Guardrails permite definir filtros de conteúdo, bloqueio de tópicos e validações de saída.

11. **B** - "Pense passo a passo" é a frase clássica para invocar chain-of-thought reasoning.

12. **A** - Query → Embedding (vetorizar) → Retrieval (buscar) → Augmentation (enriquecer prompt) → Generation.

13. **B** - Importante verificar políticas de uso de dados; Bedrock não treina modelos com dados de clientes por padrão.

14. **B** - Few-shot tipicamente usa 2-10 exemplos; o número exato depende do context window e complexidade.

15. **B** - Few-shot prompting é ideal quando você tem exemplos mas não quer fazer fine-tuning completo.

16. **B** - Bedrock Knowledge Bases implementa RAG de forma gerenciada, com vetorização e busca automáticas.

17. **B** - Prompt engineering otimiza resultados sem alterar o modelo; é não-invasivo e flexível.

18. **B** - Negative prompting define restrições sobre o que NÃO deve ser incluído.

19. **C** - Relevância da retrieval é crítica; documentos irrelevantes podem degradar a qualidade da resposta.

20. **B** - RAG garante fonte verificada + Guardrails impõe políticas de conteúdo e segurança.

---

## 📊 Como Avaliar

- **18-20 corretas:** Excelente domínio de prompt engineering!
- **15-17 corretas:** Muito bom, revisar conceitos de RAG
- **12-14 corretas:** Entendimento sólido, praticar mais
- **< 12 corretas:** Estudar materiais sobre prompting e RAG

---

## 💡 Conceitos-Chave para Revisar

- **Zero-shot vs Few-shot:** Diferença no número de exemplos
- **Chain-of-thought:** Raciocínio passo a passo explícito
- **RAG Pipeline:** Query → Embed → Retrieve → Augment → Generate
- **Guardrails:** Filtros de segurança e qualidade de conteúdo
- **Vector DB:** Armazenamento otimizado para busca semântica

**Próximo passo:** `dominio3-questoes-rag-finetuning.md`
