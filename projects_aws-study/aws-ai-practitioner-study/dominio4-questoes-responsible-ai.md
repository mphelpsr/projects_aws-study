# Domínio 4: Diretrizes para IA Responsável (14% da Prova)

**Peso no exame:** 14% (~9 questões de 65) | **Tempo sugerido:** 20 minutos para 15 questões

---

## Questão 1
O que é "viés" (bias) no contexto de IA e Machine Learning?

A) Um erro de programação no código  
B) Quando um modelo sistematicamente favorece ou discrimina certos grupos devido a dados de treinamento enviesados  
C) Quando o modelo é muito lento  
D) A velocidade de processamento do modelo  

---

## Questão 2
Uma empresa treinou um modelo de contratação usando dados históricos de funcionários. O modelo está rejeitando desproporcionalmente candidatos de certo gênero. Qual princípio de IA responsável está sendo violado?

A) Transparência  
B) Fairness (equidade/justiça)  
C) Privacidade  
D) Robustez  

---

## Questão 3
Qual serviço AWS ajuda a detectar viés em dados de treinamento e modelos de ML?

A) Amazon Bedrock Guardrails  
B) Amazon SageMaker Clarify  
C) Amazon Comprehend  
D) Amazon Macie  

---

## Questão 4
O que significa "explicabilidade" (explainability) em IA?

A) Documentação do código  
B) Capacidade de entender e explicar como o modelo chegou a uma decisão específica  
C) Velocidade do modelo  
D) Custo do modelo  

---

## Questão 5
Uma empresa quer garantir que seu modelo de crédito possa explicar por que negou um empréstimo a um cliente. Qual princípio de IA responsável é mais relevante?

A) Eficiência  
B) Transparência e explicabilidade  
C) Escalabilidade  
D) Velocidade  

---

## Questão 6
O que é "human-in-the-loop" no contexto de IA responsável?

A) Treinar modelos sem intervenção humana  
B) Incluir supervisão e revisão humana em decisões críticas de IA  
C) Usar apenas modelos automatizados  
D) Eliminar todos os processos manuais  

---

## Questão 7
Amazon SageMaker Clarify fornece qual funcionalidade relacionada a IA responsável?

A) Apenas aumenta velocidade de treinamento  
B) Detecta viés em dados e modelos, fornece explicabilidade de previsões  
C) Apenas reduz custos  
D) Apenas faz backup de modelos  

---

## Questão 8
Uma empresa de saúde está usando IA para sugerir diagnósticos. Qual prática de IA responsável é ESSENCIAL?

A) Eliminar completamente médicos humanos  
B) Manter supervisão médica humana e não usar IA como única fonte de decisão  
C) Confiar 100% no modelo sem validação  
D) Nunca explicar as decisões do modelo  

---

## Questão 9
O que são "Model Cards" no contexto de IA responsável?

A) Cartões de crédito para pagar modelos  
B) Documentação estruturada sobre modelo incluindo uso pretendido, limitações, performance e considerações éticas  
C) Hardware para rodar modelos  
D) Métricas de custo apenas  

---

## Questão 10
Qual princípio de IA responsável envolve proteger dados pessoais e sensíveis dos usuários?

A) Eficiência  
B) Privacidade e proteção de dados  
C) Escalabilidade  
D) Velocidade  

---

## Questão 11
Uma empresa está desenvolvendo um modelo que processa dados de pacientes. Como garantir privacidade?

A) Compartilhar todos os dados publicamente  
B) Usar técnicas como anonimização, criptografia e controles de acesso rigorosos  
C) Nunca usar dados de pacientes  
D) Ignorar regulamentações  

---

## Questão 12
O que é "fairness" (equidade) em IA?

A) Dividir custos igualmente  
B) Garantir que o modelo não discrimine injustamente grupos protegidos  
C) Usar sempre o modelo mais caro  
D) Processar dados mais rapidamente  

---

## Questão 13
Amazon Bedrock Guardrails ajuda com qual aspecto de IA responsável?

A) Apenas reduzir custos  
B) Aplicar políticas de segurança, filtrar conteúdo tóxico, detectar PII, bloquear tópicos sensíveis  
C) Apenas aumentar velocidade  
D) Apenas fazer backup  

---

## Questão 14
Uma empresa quer garantir que seu modelo de IA não seja manipulado por entradas maliciosas (adversarial attacks). Qual princípio está sendo considerado?

A) Eficiência de custo  
B) Robustez e segurança  
C) Velocidade apenas  
D) Popularidade do modelo  

---

## Questão 15
Qual NÃO é um pilar fundamental de IA responsável?

A) Fairness (equidade)  
B) Transparência  
C) Privacidade  
D) Maximizar lucro independentemente de consequências éticas  

---

## 📝 GABARITO

1. **B** - Viés é quando modelo favorece/discrimina sistematicamente certos grupos devido a dados enviesados ou escolhas de design.

2. **B** - Fairness: equidade, não discriminação injusta. Modelo deve tratar grupos protegidos de forma justa.

3. **B** - SageMaker Clarify detecta viés em dados e modelos, fornece métricas de fairness e explicabilidade.

4. **B** - Explicabilidade: capacidade de entender como modelo tomou decisão (importante para confiança e conformidade).

5. **B** - Transparência e explicabilidade são cruciais para decisões financeiras (regulações como GDPR exigem explicações).

6. **B** - Human-in-the-loop: manter supervisão humana em decisões críticas, especialmente em áreas sensíveis.

7. **B** - SageMaker Clarify: detecta viés, fornece métricas de fairness, explica previsões (SHAP values, feature importance).

8. **B** - Em saúde, supervisão humana é ESSENCIAL. IA é ferramenta de suporte, não substituto de profissionais.

9. **B** - Model Cards: documentação transparente sobre modelo (uso, limitações, performance, viés, considerações éticas).

10. **B** - Privacidade: proteger dados pessoais/sensíveis, conformidade com GDPR, LGPD, HIPAA.

11. **B** - Privacidade requer: anonimização, criptografia (KMS), controles de acesso (IAM), auditoria (CloudTrail).

12. **B** - Fairness: garantir que modelo não discrimine injustamente com base em características protegidas (raça, gênero, idade).

13. **B** - Bedrock Guardrails: filtros de conteúdo, detecção de PII, bloqueio de tópicos, políticas de segurança.

14. **B** - Robustez: modelo deve ser resiliente a ataques adversariais, entradas maliciosas, edge cases.

15. **D** - IA Responsável prioriza ética sobre lucro máximo. Pilares: fairness, transparência, privacidade, segurança, accountability.

---

## 📊 Como Avaliar

- **13-15 corretas:** Excelente compreensão de IA Responsável!
- **10-12 corretas:** Muito bom, revisar alguns conceitos
- **7-9 corretas:** Razoável, estudar mais princípios éticos
- **< 7 corretas:** Foco em fundamentos de IA Responsável

---

## 💡 Conceitos-Chave para Revisar

**Pilares de IA Responsável:**

1. **Fairness (Equidade):**
   - Não discriminação
   - Tratamento justo de grupos
   - Detecção e mitigação de viés

2. **Transparency (Transparência):**
   - Explicabilidade de decisões
   - Model Cards
   - Documentação clara

3. **Privacy (Privacidade):**
   - Proteção de dados pessoais
   - Anonimização
   - Conformidade regulatória

4. **Safety (Segurança):**
   - Robustez a ataques
   - Human-in-the-loop
   - Guardrails

5. **Accountability (Responsabilização):**
   - Auditoria
   - Monitoramento
   - Governança

**Ferramentas AWS para IA Responsável:**
- **SageMaker Clarify:** Viés + explicabilidade
- **Bedrock Guardrails:** Políticas de segurança
- **Macie:** Proteção de dados sensíveis
- **CloudTrail:** Auditoria
- **KMS:** Criptografia

**Quando usar Human-in-the-loop:**
- Decisões médicas
- Decisões legais
- Aprovação de crédito
- Contratação
- Qualquer decisão de alto impacto

**Próximo arquivo:** `dominio5-questoes-seguranca-governanca.md`
