# Domínio 3: Parâmetros de Inferência e Otimização

**Peso no exame:** Parte dos 28% | **Tempo sugerido:** 20 minutos para 16 questões

---

## Questão 1
Qual é o efeito de definir `temperature = 0.0` em um modelo de linguagem?

A) O modelo gera respostas completamente aleatórias  
B) O modelo sempre escolhe o token mais provável (determinístico)  
C) O modelo para de funcionar  
D) O modelo usa menos memória  

---

## Questão 2
Para uma tarefa criativa como escrever poesia, qual configuração de temperature é mais apropriada?

A) temperature = 0.0  
B) temperature = 0.2  
C) temperature = 0.8 - 1.0  
D) temperature = 5.0  

---

## Questão 3
O que o parâmetro `max_tokens` controla?

A) O número máximo de modelos que podem executar  
B) O comprimento máximo da resposta gerada (em tokens)  
C) O tamanho do modelo em GB  
D) O número de usuários simultâneos  

---

## Questão 4
Um chatbot de atendimento ao cliente precisa fornecer respostas consistentes e factuais. Qual configuração é recomendada?

A) temperature = 1.5, top_p = 1.0  
B) temperature = 0.1-0.3, top_p = 0.9  
C) temperature = 2.0, top_p = 0.1  
D) Apenas aumentar max_tokens  

---

## Questão 5
O que é `top_p` (nucleus sampling)?

A) O token com maior probabilidade  
B) Amostragem dos tokens mais prováveis até probabilidade cumulativa atingir p  
C) O número de tokens a gerar  
D) A posição do token no vocabulário  

---

## Questão 6
Se você define `top_p = 0.9`, o que acontece?

A) O modelo considera tokens que somam 90% da distribuição de probabilidade  
B) O modelo usa 90% menos recursos  
C) O modelo gera exatamente 90 tokens  
D) O modelo tem 90% de precisão  

---

## Questão 7
O que o parâmetro `top_k` controla?

A) Considera apenas os k tokens mais prováveis para amostragem  
B) Gera exatamente k tokens  
C) Usa k modelos em paralelo  
D) Define k como número de usuários  

---

## Questão 8
Para um sistema de FAQ que deve sempre dar a mesma resposta para a mesma pergunta, qual configuração é ideal?

A) temperature = 1.0  
B) temperature = 0.0 (determinístico)  
C) temperature = 2.0  
D) Apenas aumentar top_k  

---

## Questão 9
Você quer que o modelo seja criativo mas não completamente aleatório. Qual combinação é boa?

A) temperature = 0.0, top_p = 0.5  
B) temperature = 0.7, top_p = 0.9  
C) temperature = 3.0, top_p = 0.1  
D) temperature = 0.0, top_p = 1.0  

---

## Questão 10
O que acontece se você definir `max_tokens` muito baixo para uma tarefa complexa?

A) O modelo processa mais rápido  
B) A resposta pode ser cortada/incompleta  
C) O modelo fica mais preciso  
D) O custo diminui para zero  

---

## Questão 11
Em qual cenário você usaria `temperature` alta (>0.8)?

A) Geração de documentação técnica precisa  
B) Extração de informações de documentos  
C) Brainstorming criativo, geração de ideias diversas  
D) Cálculos matemáticos  

---

## Questão 12
Um modelo está gerando sempre a mesma resposta sem variação. O que você deve fazer?

A) Diminuir temperature ainda mais  
B) Aumentar temperature para introduzir variação  
C) Diminuir max_tokens  
D) Aumentar knowledge cutoff  

---

## Questão 13
Como `top_k` e `top_p` se relacionam?

A) São exatamente a mesma coisa  
B) Ambos limitam a amostragem, mas de formas diferentes (top_k por contagem, top_p por probabilidade)  
C) top_k sempre substitui top_p  
D) Não podem ser usados no mesmo modelo  

---

## Questão 14
Para otimizar custo de inferência sem sacrificar muito a qualidade, o que você pode fazer?

A) Sempre usar o maior modelo disponível  
B) Escolher modelo apropriado ao tamanho da tarefa, ajustar max_tokens, usar caching  
C) Definir temperature = 10  
D) Fazer inferência apenas à noite  

---

## Questão 15
Qual parâmetro você NÃO pode controlar durante inferência?

A) temperature  
B) max_tokens  
C) top_p  
D) Data de treinamento do modelo (knowledge cutoff)  

---

## Questão 16
Amazon Bedrock permite ajustar quais parâmetros de inferência? (Escolha a mais completa)

A) Apenas temperature  
B) temperature, top_p, top_k, max_tokens, stop sequences  
C) Apenas max_tokens  
D) Nenhum parâmetro pode ser ajustado  

---

## 📝 GABARITO

1. **B** - Temperature = 0 torna o modelo determinístico, sempre escolhendo o token mais provável (greedy decoding).

2. **C** - Tarefas criativas beneficiam de temperature alta (0.8-1.0) para maior diversidade e originalidade.

3. **B** - max_tokens limita o comprimento da resposta gerada em número de tokens.

4. **B** - Respostas factuais consistentes requerem temperature baixa (0.1-0.3) para minimizar aleatoriedade.

5. **B** - top_p (nucleus sampling) amostra tokens até probabilidade cumulativa atingir p.

6. **A** - top_p = 0.9 significa considerar tokens que somam 90% da probabilidade cumulativa.

7. **A** - top_k restringe amostragem aos k tokens com maiores probabilidades.

8. **B** - Temperature = 0.0 garante respostas determinísticas (sempre iguais para mesma entrada).

9. **B** - temperature = 0.7 e top_p = 0.9 equilibram criatividade com coerência.

10. **B** - max_tokens insuficiente resulta em respostas truncadas/incompletas.

11. **C** - Temperature alta é ideal para tarefas criativas que requerem diversidade e originalidade.

12. **B** - Aumentar temperature introduz variação ao permitir tokens menos prováveis.

13. **B** - top_k limita por contagem absoluta; top_p limita por probabilidade cumulativa. Ambos podem ser combinados.

14. **B** - Otimização: modelo adequado ao tamanho da tarefa + controle de tokens + caching quando possível.

15. **D** - Knowledge cutoff é fixo no treinamento, não pode ser alterado em inferência.

16. **B** - Bedrock permite ajustar temperature, top_p, top_k, max_tokens, stop sequences e outros parâmetros.

---

## 📊 Como Avaliar

- **14-16 corretas:** Domínio excelente de parâmetros!
- **11-13 corretas:** Muito bom, revisar edge cases
- **8-10 corretas:** Entendimento básico, praticar mais
- **< 8 corretas:** Estudar fundamentos de inferência

---

## 💡 Conceitos-Chave para Revisar

**Temperature:**
- **0.0:** Determinístico, sempre o token mais provável
- **0.1-0.3:** Factual, consistente (FAQ, extração)
- **0.7-0.9:** Equilibrado, criativo moderado
- **1.0+:** Muito criativo, maior aleatoriedade

**Top_p (Nucleus Sampling):**
- Amostra tokens até probabilidade cumulativa atingir p
- **0.9-0.95:** Valores comuns para equilíbrio
- **<0.9:** Mais conservador
- **>0.95:** Mais diverso

**Top_k:**
- Considera apenas k tokens mais prováveis
- **10-50:** Valores típicos
- Combina bem com top_p

**Max_tokens:**
- Limita comprimento da resposta
- Impacta custo diretamente
- Deve ser apropriado à tarefa

**Otimização:**
- Modelo certo para a tarefa (não sempre o maior)
- Temperature baixa para consistência
- max_tokens ajustado à necessidade
- Caching para queries repetidas

---

**Próximo passo:** `simulado-completo-1.md` para testar conhecimento integrado!
