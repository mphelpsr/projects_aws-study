# Domínio 3: Métricas e Avaliação de Modelos de Fundação

**Peso no exame:** Parte dos 28% | **Tempo sugerido:** 20 minutos para 18 questões

---

## Questão 1
Qual métrica é comumente usada para avaliar qualidade de resumos gerados comparando com resumos de referência?

A) Accuracy  
B) ROUGE (Recall-Oriented Understudy for Gisting Evaluation)  
C) F1-Score  
D) Mean Squared Error  

---

## Questão 2
O que a métrica BLEU (Bilingual Evaluation Understudy) mede principalmente?

A) Velocidade de inferência  
B) Qualidade de tradução automática comparando n-gramas com referências  
C) Uso de memória do modelo  
D) Diversidade de vocabulário  

---

## Questão 3
O que é "perplexity" no contexto de modelos de linguagem?

A) Uma medida de confusão do usuário  
B) Uma medida de quão "surpreso" o modelo está com o texto; valores menores são melhores  
C) O número de parâmetros no modelo  
D) O tempo de resposta do modelo  

---

## Questão 4
Uma empresa quer avaliar se seu modelo de geração de texto médico usa terminologia correta. Qual tipo de avaliação é mais apropriada?

A) Apenas métricas automáticas como ROUGE  
B) Avaliação humana por especialistas médicos  
C) Apenas medir perplexity  
D) Apenas contar tokens gerados  

---

## Questão 5
Qual é a vantagem da métrica BERTScore sobre ROUGE e BLEU?

A) BERTScore é sempre mais rápido  
B) BERTScore captura similaridade semântica usando embeddings, não apenas n-gramas exatos  
C) BERTScore não requer referências  
D) BERTScore funciona apenas com código  

---

## Questão 6
Para avaliar um chatbot de atendimento ao cliente, qual combinação de métricas é mais completa?

A) Apenas BLEU  
B) Métricas automáticas (ROUGE, relevância) + avaliação humana (satisfação, correção)  
C) Apenas perplexity  
D) Apenas tempo de resposta  

---

## Questão 7
O que é "ground truth" no contexto de avaliação de modelos?

A) O servidor físico onde o modelo roda  
B) Dados ou respostas de referência consideradas corretas para comparação  
C) O primeiro modelo treinado  
D) O custo de inferência  

---

## Questão 8
Um modelo está gerando textos muito genéricos e seguros. Qual aspecto você deve avaliar?

A) Apenas precisão  
B) Diversidade e criatividade das respostas  
C) Apenas velocidade  
D) Apenas uso de memória  

---

## Questão 9
Qual métrica NÃO é apropriada para avaliar qualidade de texto gerado?

A) ROUGE  
B) BLEU  
C) BERTScore  
D) Precision@K (usado para sistemas de recomendação)  

---

## Questão 10
O que significa um valor ROUGE-1 de 0.7?

A) 70% dos unigramas (palavras individuais) na saída estão presentes na referência  
B) O modelo acertou 7 de 10 perguntas  
C) O modelo usa 70% menos recursos  
D) 70% dos usuários aprovaram  

---

## Questão 11
Para avaliar se um modelo de fundação está gerando informações factuais corretas, qual método é essencial?

A) Apenas calcular perplexity  
B) Verificação factual (fact-checking) manual ou automática contra fontes confiáveis  
C) Apenas medir velocidade de geração  
D) Contar número de tokens  

---

## Questão 12
Uma empresa quer avaliar dois modelos de fundação diferentes para a mesma tarefa. Qual abordagem é recomendada?

A) Escolher o modelo com mais parâmetros  
B) Testar ambos com o mesmo conjunto de dados e métricas consistentes (benchmark)  
C) Sempre escolher o mais barato  
D) Escolher aleatoriamente  

---

## Questão 13
O que é "avaliação A/B" no contexto de aplicações de IA Generativa?

A) Avaliar modelos versão A e B do mesmo fornecedor  
B) Comparar duas versões de um sistema (ex: prompts diferentes) com usuários reais para ver qual performa melhor  
C) Testar em duas regiões AWS diferentes  
D) Avaliar apenas em dias alternados  

---

## Questão 14
Qual é uma limitação importante das métricas automáticas como ROUGE e BLEU?

A) Elas são muito lentas  
B) Elas não capturam bem aspectos como fluência, coerência e correção factual  
C) Elas só funcionam em inglês  
D) Elas requerem sempre GPU  

---

## Questão 15
Para avaliar um modelo de geração de código, qual métrica específica é comumente usada?

A) ROUGE  
B) Pass@K (percentual de soluções que passam em testes)  
C) Apenas BLEU  
D) Apenas perplexity  

---

## Questão 16
O que você deve monitorar continuamente em produção para um modelo de IA Generativa?

A) Apenas custo  
B) Qualidade das respostas, latência, taxa de erro, feedback dos usuários  
C) Apenas número de requisições  
D) Apenas tamanho do modelo  

---

## Questão 17
Uma empresa implementou um modelo e quer detectar quando a qualidade das respostas degrada. Que estratégia ela deve usar?

A) Nunca monitorar após deploy  
B) Implementar monitoramento contínuo com métricas de qualidade e alertas  
C) Apenas verificar manualmente uma vez por ano  
D) Confiar que nunca vai degradar  

---

## Questão 18
Para avaliar se um modelo está gerando conteúdo ofensivo ou tendencioso, qual abordagem é apropriada?

A) Apenas BLEU score  
B) Avaliação de viés e toxicidade usando ferramentas especializadas + revisão humana  
C) Apenas medir velocidade  
D) Ignorar essa avaliação  

---

## 📝 GABARITO

1. **B** - ROUGE mede overlap de n-gramas entre texto gerado e referência, ideal para resumos.

2. **B** - BLEU compara n-gramas da tradução gerada com traduções de referência.

3. **B** - Perplexity mede incerteza do modelo; menor perplexity = modelo mais confiante e geralmente melhor.

4. **B** - Terminologia médica requer validação por especialistas; métricas automáticas não capturam correção do domínio.

5. **B** - BERTScore usa embeddings contextuais para capturar similaridade semântica, não apenas matches exatos.

6. **B** - Avaliação completa combina métricas automáticas (escala) com avaliação humana (qualidade nuançada).

7. **B** - Ground truth são dados de referência considerados corretos para comparação e avaliação.

8. **B** - Respostas genéricas indicam problema de diversidade/criatividade, não apenas precisão.

9. **D** - Precision@K é para sistemas de recomendação/ranking, não para qualidade de texto gerado.

10. **A** - ROUGE-1 mede overlap de unigramas (palavras individuais); 0.7 = 70% de overlap.

11. **B** - Correção factual requer verificação contra fontes confiáveis, não apenas métricas linguísticas.

12. **B** - Benchmarking com dados e métricas consistentes permite comparação justa entre modelos.

13. **B** - A/B testing compara variantes com usuários reais para medir impacto real no negócio.

14. **B** - Métricas automáticas capturam bem n-gramas mas não avaliam bem fluência, coerência ou fatos.

15. **B** - Pass@K mede quantas soluções geradas passam em testes unitários.

16. **B** - Monitoramento holístico inclui qualidade, performance, custos e experiência do usuário.

17. **B** - Monitoramento contínuo com alertas detecta degradação antes de impactar usuários significativamente.

18. **B** - Viés e toxicidade requerem ferramentas especializadas (como AWS Comprehend para PII/toxicidade) + revisão humana.

---

## 📊 Como Avaliar

- **16-18 corretas:** Excelente compreensão de métricas!
- **13-15 corretas:** Muito bom, revisar nuances
- **10-12 corretas:** Entendimento básico, estudar mais
- **< 10 corretas:** Focar em fundamentos de avaliação

---

## 💡 Conceitos-Chave para Revisar

**Métricas Automáticas:**
- **ROUGE:** Resumos (recall-oriented)
- **BLEU:** Tradução (precision-oriented)
- **BERTScore:** Similaridade semântica com embeddings
- **Perplexity:** Confiança do modelo em texto

**Limitações:**
- Métricas automáticas não capturam: correção factual, fluência, coerência
- Sempre complementar com avaliação humana para tarefas críticas

**Avaliação em Produção:**
- Monitoramento contínuo é essencial
- Combinar: métricas técnicas + feedback de usuários
- Detectar degradação proativamente

**Avaliação Especializada:**
- Código: Pass@K
- Viés/Toxicidade: Ferramentas especializadas
- Domínio específico: Especialistas humanos

**Próximo passo:** `dominio3-questoes-inferencia.md`
