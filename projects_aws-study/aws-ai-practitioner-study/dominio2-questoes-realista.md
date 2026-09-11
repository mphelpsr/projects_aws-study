# Domínio 2: Fundamentos de IA Generativa — Questões Estilo Prova Real

**Peso no exame:** 24% | **Formato:** cenários de negócio, incluindo questões "Selecione DUAS respostas"
**Tempo sugerido:** 30 minutos para 20 questões

Este arquivo complementa `dominio2-questoes-basicas.md`. Aqui as questões têm contexto de negócio e cada alternativa — certa e erradas — é explicada.

---

## Questão 1

Um analista descreve um modelo como sendo "treinado em um enorme volume de dados diversos da internet, capaz de ser adaptado para múltiplas tarefas diferentes (resumir, traduzir, gerar código) sem precisar ser treinado do zero para cada uma". Como esse tipo de modelo é chamado?

A) Modelo de regressão linear
B) Foundation Model (modelo de fundação)
C) Árvore de decisão
D) Rede neural convolucional simples

**Resposta correta:** B

**Por que está correta:** Foundation Models são modelos de grande escala pré-treinados em dados massivos e diversos, projetados para serem generalistas e adaptáveis (via prompting, fine-tuning ou RAG) a múltiplas tarefas posteriores, sem precisar de treinamento do zero para cada nova aplicação.

**Por que as outras estão erradas:**
- A) Regressão linear é um modelo estatístico simples para uma tarefa específica de predição numérica, sem a característica de generalização multi-tarefa.
- C) Árvores de decisão são modelos interpretáveis para classificação/regressão específicas, não modelos generalistas de propósito amplo.
- D) Uma rede convolucional simples é tipicamente treinada para uma tarefa específica (ex.: classificar um tipo de imagem), não é multi-tarefa por natureza.

---

## Questão 2

Ao processar o texto de entrada, um LLM primeiro divide a frase "A IA generativa está transformando negócios" em pequenas unidades antes de processá-la numericamente. Como essas unidades são chamadas?

A) Embeddings
B) Tokens
C) Epochs
D) Guardrails

**Resposta correta:** B

**Por que está correta:** Tokens são as unidades básicas de texto (palavras, subpalavras ou caracteres) em que um LLM divide o texto de entrada e saída; o custo e os limites de contexto dos modelos são medidos em tokens.

**Por que as outras estão erradas:**
- A) Embeddings são representações vetoriais numéricas de significado, geradas a partir dos tokens, não a etapa de divisão do texto em si.
- C) Epochs referem-se a uma passagem completa pelo conjunto de dados de treinamento; não têm relação com a segmentação de texto durante a inferência.
- D) Guardrails são mecanismos de política e segurança de conteúdo, não relacionados à tokenização.

---

## Questão 3

Uma empresa gera representações numéricas de documentos de forma que textos com significados semelhantes fiquem "próximos" em um espaço vetorial, permitindo buscas por similaridade semântica. Como essas representações numéricas são chamadas?

A) Guardrails
B) Embeddings
C) Prompts
D) Hiperparâmetros

**Resposta correta:** B

**Por que está correta:** Embeddings são vetores numéricos de alta dimensão que capturam o significado semântico de um texto (ou imagem), de forma que itens semanticamente similares fiquem próximos nesse espaço vetorial — a base técnica de buscas semânticas e RAG.

**Por que as outras estão erradas:**
- A) Guardrails são políticas de segurança de conteúdo (bloqueio de tópicos, filtros de toxicidade), não representações vetoriais de significado.
- C) Prompts são as instruções/textos de entrada fornecidos ao modelo, não representações numéricas internas de significado.
- D) Hiperparâmetros são configurações do processo de treinamento (taxa de aprendizado, batch size), não vetores de significado semântico.

---

## Questão 4

Um usuário pergunta a um chatbot baseado em LLM sobre um evento que ocorreu depois da data em que o modelo foi treinado. O modelo responde com informações desatualizadas ou incorretas, apresentadas com total confiança. Além da explicação de "knowledge cutoff", que fenômeno também pode explicar respostas erradas e apresentadas com confiança pelo modelo?

A) Overfitting de dados de treinamento de imagens
B) Alucinação (hallucination)
C) Data leakage
D) Undersampling

**Resposta correta:** B

**Por que está correta:** Alucinação é quando um LLM gera informações falsas, inventadas ou incorretas, mas apresentadas de forma fluente e confiante como se fossem fatos verdadeiros — um risco inerente aos modelos generativos que deve ser mitigado (ex.: com RAG ou verificação humana).

**Por que as outras estão erradas:**
- A) Overfitting é um conceito de ML supervisionado tradicional relacionado a generalização de modelos preditivos, não à geração de texto incorreto por um LLM.
- C) Data leakage refere-se a informação do conjunto de teste vazando para o treinamento, distorcendo métricas de avaliação — não é o fenômeno descrito.
- D) Undersampling é uma técnica de balanceamento de classes em dados desbalanceados, sem relação com o comportamento descrito.

---

## Questão 5

Qual é o principal limite técnico que determina quantos tokens de texto (entrada + saída) um LLM consegue processar em uma única interação?

A) Temperature
B) Context window (janela de contexto)
C) Top-p
D) Embeddings

**Resposta correta:** B

**Por que está correta:** A context window define o número máximo de tokens (prompt + resposta) que um modelo consegue considerar em uma única chamada; ultrapassar esse limite trunca ou impede o processamento de parte do conteúdo.

**Por que as outras estão erradas:**
- A) Temperature controla a aleatoriedade/criatividade das respostas geradas, não o limite de tokens processáveis.
- C) Top-p (nucleus sampling) controla quais tokens candidatos são considerados na amostragem da próxima palavra, não o tamanho da janela de contexto.
- D) Embeddings são representações vetoriais de significado; não definem limites de tamanho de entrada/saída.

---

## Questão 6

Uma arquitetura de rede neural chamada "Transformer" é a base da maioria dos LLMs modernos (como os disponíveis no Amazon Bedrock). Qual mecanismo interno é a principal inovação que permite aos Transformers processar relações entre palavras distantes em uma frase de forma eficiente?

A) Convolução
B) Mecanismo de atenção (self-attention)
C) Pooling
D) Regressão logística

**Resposta correta:** B

**Por que está correta:** O mecanismo de self-attention permite que o modelo pese a relevância de cada token em relação a todos os outros tokens da sequência simultaneamente, capturando dependências de longo alcance de forma muito mais eficiente que arquiteturas sequenciais anteriores (como RNNs).

**Por que as outras estão erradas:**
- A) Convolução é o mecanismo central de redes neurais convolucionais (CNNs), tipicamente usadas em visão computacional, não a inovação central dos Transformers.
- C) Pooling é uma operação de redução de dimensionalidade usada principalmente em CNNs, não o diferencial dos Transformers.
- D) Regressão logística é um algoritmo estatístico simples de classificação, sem relação com a arquitetura Transformer.

---

## Questão 7 (Selecione DUAS respostas)

Uma empresa está avaliando se deve adotar IA generativa para automatizar a criação de respostas de atendimento ao cliente. Quais DUAS afirmações descrevem corretamente limitações inerentes da IA generativa que a empresa deve considerar antes de confiar cegamente nas respostas?

A) Os modelos generativos podem produzir respostas não determinísticas — a mesma pergunta pode gerar respostas ligeiramente diferentes em execuções distintas
B) Os modelos generativos garantem 100% de precisão factual em qualquer domínio
C) Os modelos generativos podem alucinar, produzindo informações plausíveis mas factualmente incorretas
D) Os modelos generativos eliminam completamente a necessidade de revisão humana em qualquer aplicação
E) Os modelos generativos nunca requerem atualização ou reavaliação após o deploy

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Modelos generativos usam amostragem probabilística na geração de texto, o que os torna não determinísticos por padrão (a mesma entrada pode gerar saídas diferentes), especialmente com temperature > 0.
- C) Alucinação é uma limitação bem documentada dos LLMs, que podem gerar conteúdo incorreto com alta confiança aparente, exigindo mitigação (RAG, guardrails, revisão humana).

**Por que as outras estão erradas:**
- B) É o oposto da realidade: nenhum LLM atual garante 100% de precisão factual, especialmente em domínios especializados ou eventos recentes.
- D) Aplicações de alto risco (jurídico, médico, financeiro) tipicamente ainda requerem human-in-the-loop; a IA generativa não elimina essa necessidade em todos os casos.
- E) Modelos e seus dados de referência (via RAG) frequentemente precisam de reavaliação e atualização contínua, especialmente à medida que o negócio e o mundo mudam.

---

## Questão 8

Qual serviço da AWS oferece acesso unificado, via uma única API, a múltiplos modelos de fundação de diferentes provedores (como Anthropic, Meta, Cohere, AI21, Amazon), sem que o cliente precise gerenciar a infraestrutura de hospedagem dos modelos?

A) Amazon SageMaker (treinamento customizado do zero)
B) Amazon Bedrock
C) AWS Lambda
D) Amazon EC2

**Resposta correta:** B

**Por que está correta:** Amazon Bedrock é o serviço totalmente gerenciado que oferece acesso via API a modelos de fundação de múltiplos provedores (Anthropic, Meta, Cohere, AI21, Stability AI, Amazon Titan/Nova, entre outros), sem necessidade de provisionar ou gerenciar servidores para hospedar os modelos.

**Por que as outras estão erradas:**
- A) SageMaker é uma plataforma mais ampla de ML que permite construir e treinar modelos customizados do zero (inclusive via SageMaker JumpStart para FMs), mas o acesso simplificado e unificado a múltiplos FMs de terceiros via API é a proposta central do Bedrock.
- C) AWS Lambda é um serviço de computação serverless para executar código sob demanda; não hospeda nem fornece acesso a modelos de fundação por si só.
- D) Amazon EC2 fornece instâncias de computação de propósito geral; usar EC2 diretamente exigiria que a empresa gerenciasse a infraestrutura e o software de inferência manualmente.

---

## Questão 9

Uma empresa quer que seu chatbot corporativo, construído sobre um modelo de fundação no Bedrock, consulte automaticamente seus documentos internos (PDFs de políticas, manuais) para responder perguntas, sem precisar retreinar o modelo sempre que um documento é atualizado. Qual recurso do Amazon Bedrock resolve isso de forma gerenciada?

A) Bedrock Guardrails
B) Bedrock Knowledge Bases
C) Bedrock Model Evaluation
D) Bedrock Provisioned Throughput

**Resposta correta:** B

**Por que está correta:** Bedrock Knowledge Bases implementa RAG (Retrieval-Augmented Generation) de forma gerenciada: ingere documentos, gera embeddings, armazena em um banco vetorial e recupera trechos relevantes para enriquecer o prompt em tempo de consulta — permitindo atualizar o conhecimento apenas atualizando os documentos-fonte, sem retreinar o modelo.

**Por que as outras estão erradas:**
- A) Bedrock Guardrails define políticas de segurança de conteúdo (bloqueio de tópicos, filtros de PII/toxicidade), não gerencia recuperação de conhecimento.
- C) Bedrock Model Evaluation é usado para comparar e avaliar a qualidade de diferentes modelos, não para conectar uma base de conhecimento externa.
- D) Provisioned Throughput garante capacidade de inferência dedicada e previsível para modelos específicos, uma preocupação de performance/custo, não de conhecimento externo.

---

## Questão 10

Ao escolher entre diferentes modelos de fundação disponíveis no Amazon Bedrock para uma aplicação de atendimento ao cliente com alto volume e requisito de resposta em menos de 1 segundo, qual critério de seleção é o MAIS diretamente relevante para essa decisão?

A) O tamanho do nome do modelo
B) Latência e custo por inferência do modelo
C) A cor do logotipo do provedor do modelo
D) O número de funcionários da empresa que fornece o modelo

**Resposta correta:** B

**Por que está correta:** Para uma aplicação de alto volume com requisito rígido de latência, os critérios técnicos relevantes incluem latência de inferência, throughput e custo por token/requisição — modelos menores/otimizados costumam responder mais rápido e mais barato, o que impacta diretamente a viabilidade da solução.

**Por que as outras estão erradas:**
- A) O tamanho do nome do modelo é irrelevante tecnicamente para qualquer decisão de arquitetura.
- C) A identidade visual do provedor não tem relação com desempenho técnico do modelo.
- D) O número de funcionários do provedor não é um critério técnico de seleção de modelo para requisitos de latência/custo.

---

## Questão 11

Qual das opções a seguir é um exemplo de aplicação de IA generativa multimodal?

A) Um modelo que classifica um email apenas como "spam" ou "não spam" usando texto
B) Um modelo que recebe uma imagem e um texto de instrução, e gera uma descrição textual detalhada da imagem
C) Um modelo de regressão que prevê apenas um valor numérico a partir de dados tabulares
D) Um algoritmo de clustering que agrupa clientes por comportamento de compra

**Resposta correta:** B

**Por que está correta:** Um modelo multimodal processa e/ou gera conteúdo combinando mais de um tipo de dado (por exemplo, imagem + texto), como descrever uma imagem em linguagem natural — capacidade presente em modelos de fundação multimodais modernos.

**Por que as outras estão erradas:**
- A) É um exemplo de classificação de texto unimodal tradicional, sem combinação de modalidades.
- C) É um problema clássico de regressão com dados tabulares, unimodal e não generativo.
- D) Clustering é uma tarefa de aprendizado não supervisionado unimodal, sem geração de conteúdo nem múltiplas modalidades.

---

## Questão 12

Uma empresa está avaliando adotar IA generativa e lista como vantagem: "o modelo pode se adaptar rapidamente a novas tarefas apenas mudando as instruções (prompt), sem precisar reescrever código ou retreinar do zero." A que característica da IA generativa isso se refere?

A) Determinismo total
B) Adaptabilidade (adaptability)
C) Ausência completa de vieses
D) Necessidade obrigatória de fine-tuning para qualquer tarefa

**Resposta correta:** B

**Por que está correta:** Adaptabilidade é uma vantagem central da IA generativa: um único modelo de fundação pode ser reaproveitado para diversas tarefas (resumo, tradução, geração de código, Q&A) apenas ajustando o prompt, sem exigir retraining para cada nova aplicação.

**Por que as outras estão erradas:**
- A) IA generativa é tipicamente não determinística por padrão, o oposto do que é descrito na alternativa.
- C) Modelos de fundação podem herdar vieses dos dados de treinamento; a adaptabilidade via prompt não elimina esse risco.
- D) A própria descrição do cenário contradiz essa alternativa: a adaptação ocorre via prompt, sem necessidade de fine-tuning.

---

## Questão 13

O que é o Amazon SageMaker JumpStart, no contexto de construção de aplicações de IA generativa?

A) Um serviço exclusivo de monitoramento de custos da AWS
B) Um hub que oferece modelos de fundação pré-treinados e soluções de ML prontas, que podem ser implantados e ajustados rapidamente dentro do SageMaker
C) Uma ferramenta de gerenciamento de identidade e acesso (IAM)
D) Um serviço de armazenamento de objetos

**Resposta correta:** B

**Por que está correta:** SageMaker JumpStart é um hub de modelos dentro do SageMaker que disponibiliza modelos de fundação pré-treinados (incluindo modelos open-source populares) e soluções de ML prontas para uso, permitindo deploy e fine-tuning rápidos diretamente na infraestrutura do cliente.

**Por que as outras estão erradas:**
- A) Monitoramento de custos é função de serviços como AWS Cost Explorer/Budgets, não do SageMaker JumpStart.
- C) Gerenciamento de identidade e acesso é função do AWS IAM, um serviço completamente diferente.
- D) Armazenamento de objetos é a função do Amazon S3, não do SageMaker JumpStart.

---

## Questão 14

Uma pequena empresa quer experimentar rapidamente ideias de IA generativa (como criar um app simples de geração de texto ou imagem) sem escrever código, para validar um conceito antes de investir em desenvolvimento completo. Qual ferramenta da AWS foi desenhada para esse tipo de prototipagem rápida e no-code?

A) AWS PartyRock
B) Amazon Redshift
C) AWS CloudFormation
D) Amazon VPC

**Resposta correta:** A

**Por que está correta:** AWS PartyRock é um playground de IA generativa, construído sobre o Amazon Bedrock, que permite criar e experimentar aplicações de IA generativa sem escrever código, ideal para prototipagem rápida e aprendizado.

**Por que as outras estão erradas:**
- B) Amazon Redshift é um data warehouse para análise de dados em larga escala, sem relação com prototipagem de IA generativa.
- C) AWS CloudFormation é uma ferramenta de infraestrutura como código para provisionar recursos AWS, não uma ferramenta de prototipagem de IA generativa no-code.
- D) Amazon VPC é um serviço de rede virtual privada, sem relação com criação de aplicações de IA generativa.

---

## Questão 15 (Selecione DUAS respostas)

Ao selecionar um modelo de fundação no Amazon Bedrock para uma aplicação específica, quais DUAS características são consideradas critérios técnicos válidos de seleção, segundo as boas práticas da AWS?

A) O tamanho da janela de contexto (context window) suportada pelo modelo
B) A cor da interface do console AWS usada para configurar o modelo
C) O suporte a múltiplos idiomas (multi-lingual) necessário para o caso de uso
D) O número de curtidas do modelo em redes sociais
E) O horário de lançamento (fuso horário) em que o modelo foi anunciado

**Resposta correta:** A e C

**Por que estão corretas:**
- A) O tamanho da context window determina quanto texto (documentos, histórico de conversa) o modelo consegue processar de uma vez, sendo um critério técnico central para casos de uso com documentos longos.
- C) Suporte multi-idioma é um critério relevante quando a aplicação precisa atender usuários ou processar conteúdo em diferentes idiomas.

**Por que as outras estão erradas:**
- B) A aparência visual do console AWS não tem nenhuma relação com a capacidade técnica do modelo.
- D) Popularidade em redes sociais não é um critério técnico de avaliação de modelos de fundação.
- E) O horário/fuso do anúncio do modelo é irrelevante para critérios de seleção técnica.

---

## Questão 16

Qual é a diferença central entre um modelo de linguagem (LLM) tradicional voltado a texto e um modelo de difusão (diffusion model)?

A) Modelos de difusão são usados exclusivamente para classificação de texto
B) Modelos de difusão são tipicamente usados para geração de imagens, aprendendo a reverter um processo gradual de adição de ruído a partir de dados
C) LLMs e modelos de difusão são exatamente a mesma arquitetura com nomes diferentes
D) Modelos de difusão só funcionam com dados tabulares estruturados

**Resposta correta:** B

**Por que está correta:** Modelos de difusão são uma classe de modelos generativos amplamente usados para geração de imagens (como Stable Diffusion), que aprendem a "remover ruído" progressivamente de dados aleatórios até formar uma imagem coerente, um paradigma bem diferente da geração autoregressiva de texto usada pelos LLMs baseados em Transformer.

**Por que as outras estão erradas:**
- A) Modelos de difusão não são usados para classificação de texto; seu uso predominante é geração de imagens (e, mais recentemente, outras modalidades).
- C) São arquiteturas fundamentalmente diferentes: LLMs geralmente usam Transformers autoregressivos para texto, enquanto modelos de difusão usam um processo iterativo de remoção de ruído, tipicamente para imagens.
- D) Modelos de difusão são majoritariamente aplicados a imagens (e áudio/vídeo em pesquisas mais recentes), não a dados tabulares estruturados.

---

## Questão 17

Uma equipe de compliance levanta a preocupação: "se enviarmos dados de clientes em nossos prompts para um modelo de terceiros no Bedrock, esses dados serão usados para treinar o modelo base do provedor?" Qual afirmação reflete corretamente a prática padrão de privacidade de dados do Amazon Bedrock?

A) Sim, todos os prompts enviados ao Bedrock são automaticamente usados para treinar os modelos de base de todos os provedores
B) Por padrão, a AWS não usa os prompts e completions dos clientes no Bedrock para treinar os modelos de base dos provedores, e os dados permanecem na região/conta do cliente
C) Os dados enviados ao Bedrock se tornam propriedade pública automaticamente
D) O Bedrock não permite nenhum tipo de criptografia dos dados em trânsito

**Resposta correta:** B

**Por que está correta:** O Amazon Bedrock foi desenhado com privacidade em mente: por padrão, as entradas e saídas dos clientes não são compartilhadas com os provedores de modelo nem usadas para retreinar os modelos de base, e os dados dos clientes permanecem sob o controle da conta/região do cliente, criptografados em trânsito e em repouso.

**Por que as outras estão erradas:**
- A) Contraria diretamente a política de privacidade de dados divulgada pela AWS para o Bedrock.
- C) Dados de clientes no Bedrock não se tornam públicos; permanecem privados e sob controle do cliente.
- D) O Bedrock suporta criptografia em trânsito (TLS) e em repouso (KMS) por padrão — a afirmação é falsa.

---

## Questão 18

Um desenvolvedor quer usar um modelo de fundação hospedado no Amazon Bedrock, mas precisa garantir capacidade de inferência dedicada e previsível para atender picos de tráfego de um evento de vendas, evitando throttling do modo sob demanda (on-demand). Qual recurso do Bedrock resolve isso?

A) Bedrock Agents
B) Bedrock Provisioned Throughput
C) Bedrock Guardrails
D) Bedrock Knowledge Bases

**Resposta correta:** B

**Por que está correta:** Provisioned Throughput permite reservar capacidade de inferência dedicada para um modelo específico, garantindo throughput consistente e previsível, adequado para cargas de trabalho com alto volume e requisitos de performance estáveis (como picos de tráfego esperados).

**Por que as outras estão erradas:**
- A) Bedrock Agents orquestra tarefas complexas e chamadas de API/ações em nome do usuário; não resolve throttling ou capacidade dedicada.
- C) Bedrock Guardrails aplica políticas de segurança de conteúdo; não tem relação com capacidade de inferência.
- D) Bedrock Knowledge Bases implementa RAG para consulta a documentos; não resolve necessidade de throughput garantido.

---

## Questão 19

Qual das seguintes é uma limitação real e amplamente reconhecida da IA generativa que uma empresa deve comunicar aos usuários finais de um chatbot baseado em LLM?

A) O modelo sempre responderá com 100% de exatidão factual, mesmo sobre eventos futuros
B) As respostas podem ser não determinísticas e ocasionalmente incorretas (alucinações), exigindo verificação em contextos críticos
C) O modelo elimina totalmente qualquer necessidade de testes antes do lançamento
D) O modelo nunca precisa de guardrails ou políticas de moderação de conteúdo

**Resposta correta:** B

**Por que está correta:** É uma prática recomendada e um fato técnico reconhecido que LLMs podem produzir respostas variáveis entre execuções e ocasionalmente alucinar informações incorretas — por isso aplicações críticas devem incluir avisos, verificação humana ou grounding via RAG.

**Por que as outras estão erradas:**
- A) Nenhum LLM atual garante exatidão factual perfeita, e eventos futuros estão além do conhecimento de qualquer modelo treinado em dados históricos.
- C) Testes extensivos (incluindo red-teaming e avaliação de qualidade) continuam sendo necessários antes e depois do lançamento de qualquer aplicação de IA generativa.
- D) Guardrails são recomendados justamente por causa dos riscos inerentes (toxicidade, vazamento de PII, respostas fora de escopo) das aplicações de IA generativa.

---

## Questão 20

Um modelo de fundação processa a entrada de um usuário e, internamente, converte cada palavra/subpalavra em um vetor numérico que captura significado semântico antes de gerar uma resposta. Depois de gerar cada token de saída, ele usa esse mesmo processo repetidamente até completar a resposta. Esse processo de gerar a saída token por token, cada um condicionado aos anteriores, é chamado de:

A) Geração autoregressiva (autoregressive generation)
B) Clustering hierárquico
C) Regressão linear múltipla
D) Validação cruzada (cross-validation)

**Resposta correta:** A

**Por que está correta:** Geração autoregressiva é o processo pelo qual muitos LLMs (baseados em Transformer decoder) geram texto: cada novo token é previsto com base em todos os tokens anteriores da sequência (prompt + tokens já gerados), um token de cada vez, até completar a resposta.

**Por que as outras estão erradas:**
- B) Clustering hierárquico é uma técnica de agrupamento não supervisionado, sem relação com geração sequencial de texto.
- C) Regressão linear múltipla é um modelo estatístico para prever um valor contínuo a partir de múltiplas variáveis, não um processo de geração de texto token a token.
- D) Validação cruzada é uma técnica de avaliação de modelos durante o treinamento, não um processo de geração de saída em produção.

---

## 📊 Como Avaliar

- **18-20 corretas:** Domínio sólido dos fundamentos de IA generativa e do Amazon Bedrock.
- **15-17 corretas:** Bom domínio; revise Knowledge Bases, Guardrails e Provisioned Throughput.
- **12-14 corretas:** Revisar terminologia essencial (tokens, embeddings, context window, alucinação).
- **< 12 corretas:** Retomar `dominio2-questoes-basicas.md` e a seção de Domínio 2 do `guia-completo-estudo.md`.
