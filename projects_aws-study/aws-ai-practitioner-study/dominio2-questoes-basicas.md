# Domínio 2: Fundamentos de IA Generativa - Questões Básicas

**Peso no exame:** 24% | **Tempo sugerido:** 20 minutos para 15 questões

---

## Questão 1
Uma empresa deseja implementar uma solução que possa gerar descrições de produtos automaticamente baseadas em especificações técnicas. Qual característica da IA Generativa é mais relevante para este caso de uso?

A) Capacidade de classificar produtos em categorias  
B) Capacidade de criar novo conteúdo textual baseado em padrões aprendidos  
C) Capacidade de detectar anomalias em dados de produtos  
D) Capacidade de fazer previsões numéricas sobre vendas  

---

## Questão 2
O que são "tokens" no contexto de modelos de linguagem grandes (LLMs)?

A) Chaves de autenticação para acessar APIs da AWS  
B) Unidades básicas de texto processadas pelo modelo, como palavras ou sub-palavras  
C) Certificados de segurança para proteger dados sensíveis  
D) Métricas de desempenho do modelo  

---

## Questão 3
Uma desenvolvedora está trabalhando com um modelo de fundação e percebe que ele está fornecendo informações incorretas sobre eventos recentes de 2026. Qual é a explicação mais provável?

A) O modelo está com problemas de configuração  
B) O modelo tem um knowledge cutoff (limite de conhecimento) anterior a 2026  
C) O modelo precisa ser retreinado do zero  
D) O tamanho do context window é muito pequeno  

---

## Questão 4
Qual serviço AWS oferece acesso gerenciado a múltiplos modelos de fundação de diferentes provedores através de uma única API?

A) Amazon SageMaker Studio  
B) Amazon Comprehend  
C) Amazon Bedrock  
D) AWS Lambda  

---

## Questão 5
O que é um "embedding" no contexto de IA Generativa?

A) Uma técnica de criptografia de dados  
B) Uma representação vetorial numérica de texto que captura significado semântico  
C) Um método de compressão de modelos  
D) Um tipo de banco de dados vetorial  

---

## Questão 6
Um cliente quer usar IA Generativa para criar um chatbot que responda perguntas sobre seus produtos. No entanto, ele está preocupado que o modelo possa "alucinar" informações incorretas. O que significa "alucinação" neste contexto?

A) Quando o modelo produz respostas muito lentas  
B) Quando o modelo gera informações que parecem plausíveis mas são factualmente incorretas  
C) Quando o modelo requer muitos recursos computacionais  
D) Quando o modelo não consegue processar a entrada  

---

## Questão 7
Qual é a principal diferença entre IA Generativa e ML tradicional?

A) IA Generativa é sempre mais cara que ML tradicional  
B) ML tradicional só funciona com dados estruturados  
C) IA Generativa cria novo conteúdo, enquanto ML tradicional geralmente faz previsões ou classificações  
D) ML tradicional não pode ser usado na nuvem  

---

## Questão 8
O que é um "context window" em um modelo de linguagem?

A) O tempo máximo que um modelo pode executar  
B) A quantidade máxima de tokens que o modelo pode processar em uma única interação  
C) O número de modelos que podem ser executados simultaneamente  
D) A janela de tempo para treinar um modelo  

---

## Questão 9
Uma empresa deseja usar modelos de fundação pré-treinados para começar rapidamente, sem precisar treinar modelos do zero. Qual serviço AWS oferece acesso a modelos pré-treinados e soluções prontas?

A) Amazon Forecast  
B) Amazon SageMaker JumpStart  
C) Amazon Rekognition  
D) Amazon Textract  

---

## Questão 10
Qual dos seguintes NÃO é uma capacidade típica da IA Generativa?

A) Gerar código de programação  
B) Criar imagens a partir de descrições textuais  
C) Executar cálculos matemáticos complexos com 100% de precisão garantida  
D) Resumir documentos longos  

---

## Questão 11
O que é Amazon Q?

A) Um serviço de filas de mensagens da AWS  
B) Um assistente de IA generativa para negócios e desenvolvedores  
C) Um banco de dados quântico  
D) Uma ferramenta de qualidade de código  

---

## Questão 12
Qual é uma limitação importante dos modelos de fundação atuais?

A) Eles não podem processar texto  
B) Eles não têm conhecimento sobre eventos após sua data de treinamento  
C) Eles só funcionam com inglês  
D) Eles requerem sempre GPU para inferência  

---

## Questão 13
Uma empresa quer gerar emails de marketing personalizados em grande escala. Qual característica de um modelo de fundação é mais relevante?

A) Capacidade de análise preditiva  
B) Capacidade de geração de texto natural e personalização baseada em contexto  
C) Capacidade de reconhecimento de imagens  
D) Capacidade de processamento de séries temporais  

---

## Questão 14
O que diferencia um "foundation model" (modelo de fundação) de outros modelos de ML?

A) Foundation models são sempre gratuitos  
B) Foundation models são treinados em grandes volumes de dados diversos e podem ser adaptados para múltiplas tarefas  
C) Foundation models só funcionam com dados estruturados  
D) Foundation models não podem ser customizados  

---

## Questão 15
Uma equipe de desenvolvimento precisa integrar capacidades de IA generativa em sua aplicação existente com o mínimo de overhead operacional. Qual abordagem a AWS recomenda?

A) Treinar um modelo do zero usando instâncias EC2  
B) Usar serviços gerenciados como Amazon Bedrock com APIs prontas  
C) Construir sua própria infraestrutura de GPU  
D) Baixar modelos open source e hospedá-los localmente  

---

## 📝 GABARITO

1. **B** - IA Generativa cria novo conteúdo textual. Descrições de produtos são conteúdo novo baseado em padrões.

2. **B** - Tokens são as unidades básicas de processamento de texto. Uma palavra pode ser um ou múltiplos tokens.

3. **B** - Knowledge cutoff é o limite temporal do conhecimento do modelo, determinado pela data de treinamento.

4. **C** - Amazon Bedrock oferece acesso unificado a modelos de múltiplos provedores (Anthropic, AI21, Meta, etc).

5. **B** - Embeddings são representações vetoriais que capturam significado semântico, permitindo comparações matemáticas.

6. **B** - Alucinação é quando o modelo gera informações falsas mas convincentes, um desafio importante da IA Generativa.

7. **C** - A principal diferença é que Gen AI cria conteúdo novo, enquanto ML tradicional tipicamente classifica ou prevê.

8. **B** - Context window é a quantidade máxima de tokens (entrada + saída) que o modelo pode processar de uma vez.

9. **B** - SageMaker JumpStart fornece modelos pré-treinados e soluções prontas para uso rápido.

10. **C** - LLMs podem fazer cálculos mas não com 100% de precisão garantida; eles são probabilísticos, não determinísticos.

11. **B** - Amazon Q é o assistente de IA generativa da AWS para ajudar em tarefas de negócios e desenvolvimento.

12. **B** - Knowledge cutoff é uma limitação fundamental; modelos não sabem sobre eventos após o treinamento.

13. **B** - Geração de texto natural personalizado é a capacidade core necessária para emails de marketing.

14. **B** - Foundation models são grandes modelos treinados em dados diversos que servem como base para múltiplas tarefas.

15. **B** - Serviços gerenciados como Bedrock minimizam overhead operacional com APIs prontas e infraestrutura gerenciada.

---

## 📊 Como Avaliar

- **13-15 corretas:** Excelente! Fundamentos sólidos
- **10-12 corretas:** Bom entendimento, revisar pontos fracos
- **7-9 corretas:** Precisa estudar mais os conceitos básicos
- **< 7 corretas:** Foco em material introdutório primeiro

---

**Próximo passo:** `dominio2-questoes-servicos-aws.md`
