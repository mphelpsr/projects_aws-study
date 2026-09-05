# Domínio 3: RAG, Fine-tuning e Customização de Modelos

**Peso no exame:** Parte dos 28% | **Tempo sugerido:** 25 minutos para 20 questões

---

## Questão 1
Uma empresa precisa adaptar um modelo de fundação para usar terminologia específica do seu setor. Quando o fine-tuning é mais apropriado que RAG?

A) Quando você precisa adicionar fatos atualizados frequentemente  
B) Quando você quer que o modelo aprenda novos padrões de linguagem e comportamento  
C) Quando você tem poucos dados de treinamento  
D) Quando você quer manter custos baixos  

---

## Questão 2
Qual é a diferença entre "fine-tuning" e "continued pre-training"?

A) Não há diferença, são sinônimos  
B) Fine-tuning adapta para tarefas específicas; continued pre-training adiciona conhecimento de domínio amplo  
C) Fine-tuning é mais caro que continued pre-training  
D) Continued pre-training só funciona com modelos pequenos  

---

## Questão 3
Uma aplicação RAG está retornando respostas imprecisas. Qual NÃO é uma estratégia válida de otimização?

A) Melhorar a qualidade dos chunks de documentos  
B) Ajustar o número de documentos recuperados (top-k)  
C) Usar embeddings mais apropriados para o domínio  
D) Sempre usar o modelo maior disponível independente do caso  

---

## Questão 4
No Amazon Bedrock, qual recurso permite fazer fine-tuning de modelos selecionados?

A) Bedrock Agents  
B) Bedrock Custom Models  
C) Bedrock Knowledge Bases  
D) Bedrock Playground  

---

## Questão 5
Para implementar RAG, você precisa converter documentos em embeddings. Qual serviço pode gerar embeddings de texto?

A) Amazon Comprehend  
B) Amazon Bedrock (com modelos de embedding) ou SageMaker  
C) Amazon Textract  
D) Amazon Translate  

---

## Questão 6
Uma empresa tem um catálogo de produtos que muda semanalmente. Qual abordagem é mais eficiente para manter o modelo atualizado?

A) Fine-tuning semanal do modelo  
B) RAG com base de conhecimento atualizada  
C) Retreinar o modelo do zero toda semana  
D) Continued pre-training semanal  

---

## Questão 7
Qual é o tamanho típico recomendado para "chunks" (pedaços) de documentos em um sistema RAG?

A) 1 palavra  
B) Aproximadamente 200-500 tokens por chunk  
C) Documento completo sem divisão  
D) Exatamente 10 tokens  

---

## Questão 8
Amazon Bedrock Knowledge Bases armazena embeddings em qual tipo de armazenamento por padrão?

A) Amazon S3  
B) Amazon DynamoDB  
C) Amazon OpenSearch Service ou outros bancos vetoriais suportados  
D) Amazon RDS  

---

## Questão 9
Qual é uma vantagem do fine-tuning comparado ao RAG?

A) Fine-tuning não requer dados de treinamento  
B) Fine-tuning pode ensinar novos comportamentos e estilos de linguagem ao modelo  
C) Fine-tuning é sempre mais barato  
D) Fine-tuning funciona sem GPU  

---

## Questão 10
Em um pipeline RAG, o que acontece durante a fase de "augmentation"?

A) O modelo é retreinado com novos dados  
B) Os documentos recuperados são adicionados ao contexto do prompt  
C) Os embeddings são atualizados  
D) O modelo é substituído por um maior  

---

## Questão 11
Uma empresa quer usar RAG mas está preocupada com documentos sensíveis. Qual prática de segurança é recomendada?

A) Não usar RAG com dados sensíveis  
B) Implementar controles de acesso (IAM) e criptografia (KMS) na base de conhecimento  
C) Sempre usar modelos open source locais  
D) Compartilhar embeddings publicamente para melhor performance  

---

## Questão 12
Quantos dados de treinamento você tipicamente precisa para fine-tuning efetivo?

A) 5-10 exemplos  
B) Centenas a milhares de exemplos de alta qualidade  
C) Milhões de exemplos sempre  
D) Nenhum dado é necessário  

---

## Questão 13
Qual modelo de custo é geralmente associado ao fine-tuning no Amazon Bedrock?

A) Custo único fixo  
B) Custo de treinamento (computação) + custo de inferência (pode ser maior que modelo base)  
C) Sempre gratuito  
D) Apenas custo de armazenamento  

---

## Questão 14
Um sistema RAG está recuperando documentos irrelevantes. Qual técnica pode melhorar a relevância?

A) Usar queries de busca híbridas (vetorial + keyword)  
B) Sempre aumentar o número de documentos recuperados  
C) Reduzir o tamanho dos embeddings  
D) Usar apenas busca por palavra-chave exata  

---

## Questão 15
O que é "prompt engineering" comparado a "fine-tuning"?

A) Prompt engineering modifica os pesos do modelo  
B) Prompt engineering otimiza a entrada sem alterar o modelo; fine-tuning altera os pesos  
C) São exatamente a mesma coisa  
D) Fine-tuning é uma forma de prompt engineering  

---

## Questão 16
Para RAG em tempo real com baixa latência, qual combinação de serviços AWS é mais apropriada?

A) S3 + Lambda  
B) OpenSearch Service (vector engine) + Bedrock  
C) RDS + EC2  
D) Redshift + Glue  

---

## Questão 17
Uma empresa fez fine-tuning de um modelo mas os resultados não melhoraram. Qual NÃO é uma causa provável?

A) Dados de treinamento de baixa qualidade ou insuficientes  
B) Hyperparameters inadequados (taxa de aprendizado, epochs)  
C) O modelo base escolhido não era apropriado para a tarefa  
D) Usar Amazon Bedrock em vez de treinar do zero  

---

## Questão 18
Em RAG, por que é importante ter boa "separação semântica" entre chunks?

A) Para usar menos armazenamento  
B) Para que cada chunk represente uma ideia coerente e seja recuperado apropriadamente  
C) Para acelerar o treinamento  
D) Não é importante, chunks aleatórios funcionam igual  

---

## Questão 19
Qual abordagem você escolheria para um chatbot que precisa: (1) responder com estilo de marca específico E (2) acessar catálogo de produtos atualizado?

A) Apenas fine-tuning  
B) Apenas RAG  
C) Combinação: fine-tuning para estilo + RAG para catálogo  
D) Nem fine-tuning nem RAG, apenas zero-shot  

---

## Questão 20
Amazon Bedrock Agents combina qual funcionalidade?

A) Apenas fine-tuning de modelos  
B) Orquestração de tarefas + RAG + integração com APIs/ferramentas  
C) Apenas armazenamento de embeddings  
D) Apenas geração de imagens  

---

## 📝 GABARITO

1. **B** - Fine-tuning é ideal para ensinar novos comportamentos, estilos e padrões de linguagem persistentes.

2. **B** - Fine-tuning é específico para tarefas; continued pre-training adiciona conhecimento de domínio mais amplo antes do fine-tuning.

3. **D** - Usar sempre o maior modelo não é estratégia de otimização; pode ser caro e desnecessário.

4. **B** - Bedrock Custom Models permite fine-tuning de modelos selecionados com seus dados.

5. **B** - Bedrock oferece modelos de embedding (Titan Embeddings, Cohere); SageMaker também suporta modelos de embedding.

6. **B** - RAG com base atualizada é muito mais eficiente que retreinar; basta atualizar os documentos indexados.

7. **B** - Chunks de 200-500 tokens balanceiam contexto suficiente com precisão de recuperação.

8. **C** - Bedrock Knowledge Bases integra com OpenSearch Service, Aurora PostgreSQL (pgvector), Pinecone, entre outros.

9. **B** - Fine-tuning pode mudar comportamento e estilo do modelo de forma persistente.

10. **B** - Augmentation é adicionar documentos recuperados ao contexto/prompt antes da geração.

11. **B** - Controles de acesso IAM + criptografia KMS protegem dados sensíveis em sistemas RAG.

12. **B** - Fine-tuning efetivo geralmente requer centenas a milhares de exemplos de alta qualidade.

13. **B** - Custos incluem treinamento (computação durante fine-tuning) + inferência (que pode ser mais cara que modelo base).

14. **A** - Busca híbrida (vetorial + keyword) melhora relevância combinando similaridade semântica com matches exatos.

15. **B** - Prompt engineering otimiza entrada sem modificar modelo; fine-tuning altera pesos do modelo.

16. **B** - OpenSearch com vector engine oferece busca vetorial rápida; Bedrock fornece os modelos.

17. **D** - Usar Bedrock é perfeitamente válido; problemas vêm de dados ruins, hyperparameters ou modelo inadequado.

18. **B** - Chunks coerentes semanticamente melhoram relevância da recuperação e qualidade das respostas.

19. **C** - Combinar é comum: fine-tuning para estilo/comportamento + RAG para informação dinâmica.

20. **B** - Bedrock Agents orquestra tarefas complexas, usa RAG para contexto e pode chamar APIs/ferramentas externas.

---

## 📊 Como Avaliar

- **18-20 corretas:** Domínio avançado de RAG e fine-tuning!
- **15-17 corretas:** Muito bom, revisar edge cases
- **12-14 corretas:** Entendimento sólido, praticar mais cenários
- **< 12 corretas:** Focar em diferenças entre RAG e fine-tuning

---

## 💡 Conceitos-Chave para Revisar

**RAG:**
- Pipeline: Embed → Retrieve → Augment → Generate
- Ideal para: informações atualizadas, fatos específicos
- Trade-offs: latência, relevância de retrieval

**Fine-tuning:**
- Ideal para: estilo, comportamento, terminologia específica
- Requer: dados de qualidade, computação, tempo
- Trade-offs: custo, manutenção, menos flexível

**Quando usar cada um:**
- **RAG:** Conhecimento muda frequentemente, fatos externos
- **Fine-tuning:** Comportamento específico, estilo persistente
- **Ambos:** Casos complexos (estilo + conhecimento dinâmico)

**Próximo passo:** `dominio3-questoes-metricas-avaliacao.md`
