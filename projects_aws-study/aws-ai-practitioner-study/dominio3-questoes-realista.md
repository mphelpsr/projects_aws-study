# Domínio 3: Aplicações de Modelos de Fundação — Questões Estilo Prova Real

**Peso no exame:** 28% (o maior domínio) | **Formato:** cenários de negócio, incluindo questões "Selecione DUAS respostas"
**Tempo sugerido:** 35 minutos para 20 questões

Este arquivo complementa os 4 arquivos de sub-tópicos do Domínio 3 (prompt engineering, RAG/fine-tuning, métricas, inferência). Aqui as questões têm contexto de negócio e cada alternativa — certa e errada — é explicada.

---

## Questão 1

Uma empresa jurídica quer que um modelo de fundação responda perguntas sobre seus próprios contratos internos, que não fazem parte dos dados de treinamento do modelo, e precisa que as respostas citem trechos exatos dos documentos-fonte para fins de auditoria. O orçamento é limitado e a base de contratos é atualizada semanalmente. Qual abordagem é mais adequada?

A) Fine-tuning completo do modelo toda semana com os novos contratos
B) Retrieval-Augmented Generation (RAG), buscando trechos relevantes dos contratos e citando a fonte no prompt
C) Aumentar apenas o valor de temperature do modelo
D) Usar exclusivamente zero-shot prompting sem qualquer acesso aos documentos

**Resposta correta:** B

**Por que está correta:** RAG permite recuperar trechos relevantes de uma base de conhecimento externa (os contratos) em tempo de consulta e incluí-los no prompt, possibilitando citar a fonte exata — e como a base é só atualizada (não o modelo), o custo é muito menor que retreinar semanalmente, além de resolver diretamente o requisito de citação/auditoria.

**Por que as outras estão erradas:**
- A) Fine-tuning completo semanal seria caro, lento e não resolve naturalmente o requisito de citar a fonte exata do trecho usado na resposta.
- C) Ajustar temperature controla apenas a aleatoriedade da geração; não dá ao modelo acesso a nenhum conteúdo novo dos contratos.
- D) Zero-shot sem acesso aos documentos não permite ao modelo responder com informações que não estavam em seu treinamento original.

---

## Questão 2

Um desenvolvedor quer que o modelo classifique o sentimento de comentários de clientes como "positivo", "negativo" ou "neutro", sem fornecer nenhum exemplo rotulado, apenas a instrução da tarefa. Qual técnica de prompt engineering está sendo usada?

A) Few-shot prompting
B) Zero-shot prompting
C) Fine-tuning supervisionado
D) RLHF (Reinforcement Learning from Human Feedback)

**Resposta correta:** B

**Por que está correta:** Zero-shot prompting consiste em pedir ao modelo que execute uma tarefa apenas com uma instrução clara, sem fornecer nenhum exemplo de entrada-saída — exatamente o cenário descrito.

**Por que as outras estão erradas:**
- A) Few-shot exigiria fornecer alguns exemplos rotulados de comentários e seus sentimentos antes da tarefa real, o que não ocorre aqui.
- C) Fine-tuning supervisionado envolveria retreinar os pesos do modelo com um dataset rotulado, um processo totalmente diferente de apenas escrever um prompt.
- D) RLHF é uma técnica usada pelos provedores de modelo durante o treinamento/alinhamento do modelo base, não algo que o usuário final faz ao escrever um prompt.

---

## Questão 3

Um engenheiro de prompt quer que um modelo resolva um problema de lógica complexo e inclui a instrução: "Pense passo a passo antes de dar a resposta final." Essa técnica busca melhorar a precisão em tarefas de raciocínio ao:

A) Reduzir o número de tokens processados pelo modelo
B) Fazer o modelo explicitar etapas intermediárias de raciocínio antes da conclusão, reduzindo erros lógicos
C) Ativar automaticamente o fine-tuning do modelo
D) Substituir a necessidade de um prompt de sistema

**Resposta correta:** B

**Por que está correta:** Essa é a técnica de chain-of-thought (CoT) prompting: instruir o modelo a expor seu raciocínio passo a passo antes de concluir tende a melhorar o desempenho em tarefas que exigem lógica ou matemática, pois reduz saltos de raciocínio implícitos que geram erros.

**Por que as outras estão erradas:**
- A) CoT tipicamente aumenta o número de tokens gerados (pois o modelo escreve o raciocínio), não reduz.
- C) CoT é uma técnica de prompting em tempo de inferência; não ativa nem substitui qualquer processo de fine-tuning.
- D) CoT é complementar a um prompt de sistema, não um substituto dele.

---

## Questão 4

Uma equipe quer que o modelo sempre responda no formato JSON com campos específicos, e forneça alguns pares de pergunta/resposta em JSON como exemplo antes da pergunta real do usuário. Quais DUAS técnicas de prompt engineering estão sendo combinadas nesse cenário? (Selecione DUAS respostas)

A) Few-shot prompting
B) Format specification (especificação de formato de saída)
C) Fine-tuning
D) RLHF
E) Aumento do context window do modelo

**Resposta correta:** A e B

**Por que estão corretas:**
- A) Fornecer pares de exemplo pergunta/resposta antes da pergunta real caracteriza few-shot prompting.
- B) Instruir explicitamente o formato de saída desejado (JSON com campos específicos) é a técnica de format specification.

**Por que as outras estão erradas:**
- C) Fine-tuning envolveria retreinar os pesos do modelo; o cenário descreve apenas engenharia de prompt em tempo de inferência.
- D) RLHF é uma técnica de alinhamento usada no treinamento do modelo base pelo provedor, não uma técnica de prompting do usuário.
- E) O tamanho do context window é uma característica fixa do modelo escolhido; não é uma técnica de prompt engineering.

---

## Questão 5

Qual é a principal razão pela qual uma empresa escolheria fine-tuning em vez de RAG para adaptar um modelo de fundação a uma nova aplicação?

A) Fine-tuning é sempre mais barato que RAG em qualquer cenário
B) A empresa precisa que o modelo aprenda um novo estilo, tom ou formato de resposta consistente, ou uma habilidade especializada, e não apenas ter acesso a fatos externos atualizáveis
C) Fine-tuning elimina completamente qualquer risco de alucinação
D) RAG não pode ser usado com o Amazon Bedrock

**Resposta correta:** B

**Por que está correta:** Fine-tuning é mais indicado quando o objetivo é ensinar o modelo a se comportar de uma forma específica (estilo, tom, formato, terminologia de domínio, habilidade especializada) de forma consistente e internalizada nos pesos do modelo, diferente de RAG, que é melhor para fornecer conhecimento factual atualizável sem alterar o comportamento do modelo.

**Por que as outras estão erradas:**
- A) Fine-tuning geralmente tem custo inicial de treinamento mais alto que configurar RAG; a relação de custo depende do caso de uso, não é uma regra absoluta.
- C) Nenhuma técnica (fine-tuning, RAG ou ambas) elimina completamente o risco de alucinação; apenas reduzem sua probabilidade em contextos específicos.
- D) RAG é totalmente suportado no Amazon Bedrock, através do recurso Knowledge Bases.

---

## Questão 6

Uma empresa está avaliando um modelo de resumo automático de textos e quer comparar os resumos gerados pelo modelo com resumos escritos por humanos, medindo a sobreposição de n-gramas entre eles. Qual métrica de avaliação é mais apropriada para essa tarefa?

A) BLEU
B) ROUGE
C) Pass@K
D) Perplexidade

**Resposta correta:** B

**Por que está correta:** ROUGE (Recall-Oriented Understudy for Gisting Evaluation) foi projetada especificamente para avaliar tarefas de resumo (summarization), medindo a sobreposição de n-gramas, sequências e pares de palavras entre o resumo gerado e uma referência humana, com foco em recall.

**Por que as outras estão erradas:**
- A) BLEU foi projetada originalmente para avaliar qualidade de tradução automática, com foco em precisão de n-gramas, sendo menos adequada como métrica padrão de resumo.
- C) Pass@K é usada para avaliar geração de código, verificando se pelo menos uma entre K amostras geradas passa nos testes funcionais.
- D) Perplexidade mede o quão bem um modelo de linguagem prevê uma sequência de texto (relacionada à fluência/probabilidade), não a qualidade de um resumo comparado a uma referência.

---

## Questão 7

Uma equipe de engenharia de software está avaliando um modelo de geração de código, testando se pelo menos uma entre várias soluções geradas pelo modelo passa nos testes unitários automatizados. Qual métrica eles estão usando?

A) ROUGE
B) BLEU
C) Pass@K
D) BERTScore

**Resposta correta:** C

**Por que está correta:** Pass@K é a métrica padrão para avaliar geração de código: mede a probabilidade de que pelo menos uma entre K amostras de código geradas pelo modelo passe nos testes funcionais/unitários da tarefa.

**Por que as outras estão erradas:**
- A) ROUGE é voltada para avaliação de tarefas de resumo de texto, não geração de código executável.
- B) BLEU é voltada para avaliação de tradução automática, comparando n-gramas de texto, não execução de testes de código.
- D) BERTScore avalia similaridade semântica entre textos usando embeddings contextuais, não execução funcional de código.

---

## Questão 8

Um parâmetro de inferência controla a aleatoriedade da saída de um LLM: valores próximos de 0 tornam a saída mais determinística e focada (ideal para respostas factuais), enquanto valores próximos de 1 (ou mais) tornam a saída mais criativa e variada (ideal para brainstorming). Qual é esse parâmetro?

A) Top-K
B) Temperature
C) Max tokens
D) Context window

**Resposta correta:** B

**Por que está correta:** Temperature ajusta a distribuição de probabilidade usada para amostrar o próximo token: valores baixos tornam a saída mais previsível e "segura" (boa para tarefas factuais), enquanto valores altos aumentam a diversidade/criatividade (boa para geração criativa), ao custo de maior risco de imprecisão.

**Por que as outras estão erradas:**
- A) Top-K limita a amostragem aos K tokens mais prováveis, sendo um parâmetro relacionado mas distinto de temperature; sozinho não é a descrição clássica de "de 0 a 1 controla determinismo vs. criatividade".
- C) Max tokens define o limite de comprimento da resposta gerada, não a aleatoriedade/criatividade do conteúdo.
- D) Context window é o limite total de tokens (entrada + saída) que o modelo pode processar, não um parâmetro de controle de aleatoriedade.

---

## Questão 9

Um parâmetro de inferência chamado "top_p" (nucleus sampling) com valor 0.9 significa que:

A) O modelo sempre escolhe exatamente os 9 tokens mais prováveis, sem exceção
B) O modelo considera o menor conjunto de tokens cuja probabilidade cumulativa atinge 90%, e amostra a partir desse subconjunto
C) O modelo gera no máximo 90 tokens de resposta
D) O modelo usa 90% da capacidade da context window

**Resposta correta:** B

**Por que está correta:** Top-p (nucleus sampling) seleciona dinamicamente o menor conjunto de tokens cuja soma de probabilidades atinge o limiar p (nesse caso, 90%), e a amostragem do próximo token ocorre dentro desse subconjunto — o número de tokens considerados varia conforme a distribuição de probabilidade em cada etapa.

**Por que as outras estão erradas:**
- A) Isso descreveria top-k com k=9, um parâmetro diferente que fixa um número absoluto de tokens candidatos, não uma porcentagem cumulativa.
- C) O parâmetro top_p não controla o comprimento da resposta; isso é função do parâmetro max_tokens.
- D) Top_p não tem relação com o uso da context window; opera na etapa de amostragem de cada token individual.

---

## Questão 10

Uma empresa de mídia quer avaliar a similaridade semântica entre um resumo gerado por IA e um resumo de referência escrito por humanos, mesmo quando as palavras exatas usadas são diferentes mas o significado é equivalente (paráfrase). Qual métrica é mais apropriada, por usar embeddings contextuais em vez de sobreposição literal de palavras?

A) BLEU
B) ROUGE
C) BERTScore
D) Exact match

**Resposta correta:** C

**Por que está correta:** BERTScore usa embeddings contextuais (derivados de modelos tipo BERT) para comparar a similaridade semântica entre textos, token a token, capturando equivalência de significado mesmo quando as palavras exatas diferem — superando limitações de métricas puramente lexicais como BLEU/ROUGE em casos de paráfrase.

**Por que as outras estão erradas:**
- A) BLEU compara sobreposição literal de n-gramas; não captura bem paráfrases com vocabulário diferente mas mesmo significado.
- B) ROUGE também se baseia em sobreposição lexical (n-gramas/sequências), sofrendo da mesma limitação com paráfrases.
- D) Exact match exige correspondência exata de texto, sendo a métrica menos tolerante a variações de vocabulário entre todas as opções.

---

## Questão 11 (Selecione DUAS respostas)

Uma empresa está implementando um pipeline RAG para seu chatbot de suporte técnico. Quais DUAS etapas fazem parte do pipeline RAG padrão?

A) Gerar embeddings dos documentos da base de conhecimento e armazená-los em um banco de dados vetorial
B) Retreinar todos os pesos do modelo de fundação com os documentos da empresa
C) Recuperar (retrieve) os trechos mais relevantes com base na similaridade semântica com a pergunta do usuário
D) Descartar completamente a pergunta original do usuário antes de gerar a resposta
E) Reduzir permanentemente o tamanho do modelo de fundação usado

**Resposta correta:** A e C

**Por que estão corretas:**
- A) A indexação da base de conhecimento (gerar embeddings e armazená-los em um vector database) é uma etapa fundamental de preparação do pipeline RAG.
- C) A etapa de retrieval busca, por similaridade semântica, os trechos mais relevantes da base vetorial para a pergunta feita, antes de compor o prompt aumentado.

**Por que as outras estão erradas:**
- B) RAG é definido justamente por NÃO exigir retreinamento do modelo; ele injeta conhecimento externo via prompt em tempo de consulta.
- D) A pergunta original do usuário é essencial tanto para a etapa de retrieval (buscar contexto relevante) quanto para compor o prompt final enviado ao modelo — ela não é descartada.
- E) RAG não envolve reduzir o tamanho do modelo (isso seria uma técnica de compressão/otimização de modelo, sem relação com RAG).

---

## Questão 12

Qual é a ordem correta e completa das etapas de um pipeline RAG típico, da pergunta do usuário até a resposta final?

A) Geração da resposta → Busca de embeddings → Pergunta do usuário → Recuperação
B) Pergunta do usuário → Geração do embedding da pergunta → Busca por similaridade na base vetorial (retrieval) → Aumento do prompt com os trechos recuperados (augmentation) → Geração da resposta pelo modelo (generation)
C) Recuperação → Aumento do prompt → Pergunta do usuário → Embedding → Geração
D) Geração do embedding → Geração da resposta → Pergunta do usuário → Recuperação

**Resposta correta:** B

**Por que está correta:** O fluxo RAG segue essa ordem lógica: a pergunta do usuário é convertida em embedding, esse embedding é usado para buscar os trechos mais similares na base vetorial (retrieval), esses trechos são inseridos no prompt (augmentation), e finalmente o modelo gera a resposta final (generation) considerando esse contexto adicional.

**Por que as outras estão erradas:**
- A) Coloca a geração da resposta antes mesmo da pergunta do usuário ser processada, o que é logicamente impossível.
- C) Recupera informações antes mesmo de ter a pergunta do usuário ou seu embedding, invertendo a sequência causal necessária.
- D) Gera a resposta final antes de sequer ter a pergunta do usuário, o que não é uma sequência funcional válida.

---

## Questão 13

Um modelo de fundação passa por um processo adicional de treinamento após seu pré-treinamento inicial, no qual anotadores humanos avaliam e classificam diferentes respostas do modelo, e essa preferência humana é usada para treinar um modelo de recompensa que orienta o ajuste fino do modelo original. Como esse processo é chamado?

A) Zero-shot learning
B) RLHF (Reinforcement Learning from Human Feedback)
C) Retrieval-Augmented Generation
D) Data augmentation

**Resposta correta:** B

**Por que está correta:** RLHF é o processo em que feedback humano sobre a qualidade/preferência de respostas do modelo é usado para treinar um modelo de recompensa, que por sua vez orienta o ajuste fino do modelo de linguagem via aprendizado por reforço — uma técnica central usada por provedores de LLM para alinhar modelos com preferências humanas (ex.: ser mais útil e menos prejudicial).

**Por que as outras estão erradas:**
- A) Zero-shot learning é uma técnica de prompting em tempo de inferência, sem qualquer processo de treinamento adicional envolvido.
- C) RAG é uma arquitetura de recuperação de conhecimento em tempo de consulta, não um processo de treinamento com feedback humano.
- D) Data augmentation é a técnica de gerar variações artificiais de dados de treinamento existentes, sem relação com feedback humano ou aprendizado por reforço.

---

## Questão 14

Uma empresa quer adicionar conhecimento a um modelo de fundação de forma mais leve que um fine-tuning completo, ajustando apenas um pequeno número adicional de parâmetros (ex.: usando técnicas como LoRA) em vez de todos os pesos do modelo. Que categoria de técnica é essa?

A) RAG
B) Parameter-efficient fine-tuning (PEFT)
C) Zero-shot prompting
D) Data governance

**Resposta correta:** B

**Por que está correta:** Parameter-efficient fine-tuning (PEFT), da qual LoRA (Low-Rank Adaptation) é um exemplo popular, ajusta apenas um pequeno subconjunto ou uma camada adicional de parâmetros, mantendo a maior parte dos pesos originais do modelo congelados — reduzindo drasticamente o custo computacional comparado ao fine-tuning completo (full fine-tuning).

**Por que as outras estão erradas:**
- A) RAG não altera nenhum parâmetro do modelo; injeta conhecimento externo via prompt em tempo de consulta, uma abordagem totalmente diferente.
- C) Zero-shot prompting não envolve qualquer treinamento ou ajuste de parâmetros; é puramente uma técnica de formulação de prompt.
- D) Data governance refere-se a políticas de gestão e controle de dados, sem relação com técnicas de ajuste de modelo.

---

## Questão 15

Um agente conversacional construído com Amazon Bedrock Agents precisa, além de responder perguntas, executar ações reais como consultar o status de um pedido em uma API interna e atualizar um registro em um banco de dados. Qual capacidade dos Bedrock Agents permite isso?

A) Apenas geração de texto estático, sem qualquer interação externa
B) Orquestração de tarefas com chamadas a APIs/ações externas (function calling) com base no raciocínio do modelo sobre a solicitação do usuário
C) Redução automática do tamanho do modelo
D) Substituição obrigatória do modelo de fundação por um banco de dados relacional

**Resposta correta:** B

**Por que está correta:** Bedrock Agents permite que um modelo de fundação decomponha uma solicitação em etapas, decida quando chamar APIs ou ações externas (function calling) — como consultar um sistema de pedidos ou atualizar um banco de dados — e combine os resultados dessas chamadas na resposta final ao usuário.

**Por que as outras estão erradas:**
- A) Contradiz diretamente a proposta central dos Agents, que é justamente permitir ações além da geração de texto.
- C) Bedrock Agents não realiza compressão ou redução do modelo; foca em orquestração de tarefas e integrações.
- D) Agents não substituem o modelo de fundação por um banco de dados; eles coordenam o uso do modelo junto com ferramentas externas, incluindo bancos de dados quando necessário.

---

## Questão 16

Uma empresa está comparando dois modelos candidatos para uma tarefa de tradução automática de manuais técnicos, comparando a saída do modelo com traduções humanas de referência através da sobreposição de n-gramas, com ênfase em precisão. Qual métrica é a mais tradicionalmente associada a essa tarefa específica?

A) BLEU
B) ROUGE
C) Pass@K
D) F1-score de classificação binária

**Resposta correta:** A

**Por que está correta:** BLEU (Bilingual Evaluation Understudy) foi desenvolvida especificamente para avaliar qualidade de tradução automática, comparando a sobreposição de n-gramas entre a tradução gerada pela máquina e uma ou mais traduções de referência humanas, com foco em precisão.

**Por que as outras estão erradas:**
- B) ROUGE foi desenvolvida com foco em tarefas de resumo (recall sobre n-gramas), sendo menos tradicionalmente associada à avaliação de tradução.
- C) Pass@K avalia geração de código executável, uma tarefa completamente diferente de tradução de texto.
- D) F1-score é uma métrica de classificação (equilíbrio entre precisão e recall em rótulos discretos), não uma métrica de comparação de texto gerado como tradução.

---

## Questão 17

Um time de produto quer que um LLM sempre gere respostas concisas, com no máximo um parágrafo curto, mesmo em perguntas complexas. Qual parâmetro de inferência controla diretamente o limite superior de tamanho da resposta gerada?

A) Temperature
B) Top-p
C) Max tokens (comprimento máximo de saída)
D) Top-k

**Resposta correta:** C

**Por que está correta:** Max tokens define o limite máximo de tokens que o modelo pode gerar na resposta, controlando diretamente o comprimento da saída — o parâmetro correto para forçar respostas mais concisas.

**Por que as outras estão erradas:**
- A) Temperature controla a aleatoriedade/criatividade da escolha de palavras, não o comprimento da resposta.
- B) Top-p controla quais tokens são elegíveis para amostragem em cada etapa (diversidade), não o comprimento total da saída.
- D) Top-k limita o número de tokens candidatos considerados a cada passo de geração, também não controlando diretamente o comprimento total da resposta.

---

## Questão 18 (Selecione DUAS respostas)

Uma equipe está decidindo se deve combinar RAG e fine-tuning para sua aplicação de FAQ interno de uma empresa farmacêutica. Quais DUAS situações justificam usar as duas técnicas em conjunto, em vez de apenas uma delas?

A) A empresa precisa que o modelo use terminologia técnica e tom específicos do domínio farmacêutico de forma consistente (justifica fine-tuning) E também precisa responder com base em documentos regulatórios que mudam com frequência (justifica RAG)
B) A empresa quer economizar 100% do custo de infraestrutura, não usando nenhuma técnica adicional
C) A empresa quer que o modelo tenha um vocabulário e estilo de resposta específico do domínio, adaptado ao longo do tempo com novos exemplos (fine-tuning), enquanto documentos legais mais recentes são recuperados dinamicamente via RAG
D) A empresa não tem nenhum documento próprio e não se importa com o estilo de resposta
E) A empresa quer eliminar totalmente a necessidade de escrever qualquer prompt

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Esse é o caso clássico de combinar as duas técnicas: fine-tuning para comportamento/estilo/terminologia consistente, e RAG para conhecimento factual atualizável sem retreinar o modelo.
- C) Reforça a mesma lógica: fine-tuning molda a "personalidade"/vocabulário do modelo, enquanto RAG mantém o acesso a informação regulatória atualizada.

**Por que as outras estão erradas:**
- B) Não usar nenhuma técnica adicional não resolveria nem a necessidade de tom específico nem a de conhecimento atualizado — contradiz o objetivo descrito.
- D) Se não há documentos próprios nem exigência de estilo, não há justificativa para usar RAG nem fine-tuning; o cenário não se aplica.
- E) Mesmo com fine-tuning e RAG implementados, ainda é necessário escrever prompts para orientar o modelo em tempo de execução; nenhuma das técnicas elimina essa necessidade.

---

## Questão 19

Ao testar um novo prompt, um desenvolvedor observa que instruções contraditórias ou ambíguas no início do prompt fazem o modelo ignorar parte do pedido do usuário. Qual prática de prompt engineering ajuda a evitar esse problema?

A) Remover todo o contexto do prompt para simplificar
B) Usar delimitadores claros (como tags XML, aspas triplas ou marcadores) para separar instruções, contexto e dados de entrada de forma inequívoca
C) Sempre aumentar a temperature para 1.0
D) Nunca especificar o formato de saída desejado

**Resposta correta:** B

**Por que está correta:** Usar delimitadores claros para separar instruções do sistema, contexto/documentos e a pergunta do usuário reduz ambiguidade, ajudando o modelo a entender exatamente qual parte do prompt é instrução e qual é dado, diminuindo a chance de ele ignorar ou confundir partes do pedido.

**Por que as outras estão erradas:**
- A) Remover contexto tende a piorar a qualidade da resposta, já que o modelo teria menos informação relevante para trabalhar.
- C) Aumentar temperature afeta a aleatoriedade da geração, não a clareza estrutural do prompt; não resolve ambiguidade de instrução.
- D) Não especificar o formato de saída tende a aumentar a inconsistência das respostas, sendo o oposto de uma boa prática.

---

## Questão 20

Uma empresa de suporte técnico quer avaliar de forma automatizada e escalável a qualidade de milhares de respostas geradas por seu chatbot, sem poder revisar manualmente cada uma. Além de métricas automáticas como ROUGE/BLEU, qual abordagem adicional é recomendada para capturar nuances de qualidade (tom, utilidade, correção) que métricas puramente estatísticas podem não capturar bem?

A) Ignorar completamente a avaliação de qualidade após o deploy
B) Usar avaliação humana amostral (human evaluation) ou um LLM avaliador (LLM-as-a-judge) sobre uma amostra representativa das respostas, complementando as métricas automáticas
C) Confiar apenas na velocidade de resposta do modelo como indicador de qualidade
D) Aumentar apenas o valor de max_tokens do modelo

**Resposta correta:** B

**Por que está correta:** Métricas automáticas (ROUGE, BLEU, BERTScore) são úteis para sinalizar tendências em escala, mas não capturam totalmente nuances como tom apropriado, utilidade real ou correção factual; por isso é recomendado complementar com avaliação humana amostral ou um modelo avaliador (LLM-as-a-judge) para validar a qualidade percebida.

**Por que as outras estão erradas:**
- A) Ignorar a avaliação de qualidade pós-deploy é uma prática de risco, indo contra as boas práticas de monitoramento contínuo de qualidade de modelos.
- C) Velocidade de resposta é uma métrica de performance operacional, não um indicador da qualidade/correção do conteúdo gerado.
- D) Aumentar max_tokens apenas permite respostas mais longas; não tem relação com a avaliação ou melhoria da qualidade do conteúdo gerado.

---

## 📊 Como Avaliar

- **18-20 corretas:** Excelente domínio do maior bloco da prova (28%) — RAG, fine-tuning, prompting e métricas bem consolidados.
- **15-17 corretas:** Bom domínio; revise a diferença entre PEFT/LoRA, RLHF e RAG.
- **12-14 corretas:** Revisar métricas de avaliação (ROUGE vs BLEU vs Pass@K vs BERTScore) e parâmetros de inferência.
- **< 12 corretas:** Retomar os 4 arquivos de sub-tópicos do Domínio 3 e a seção correspondente do `guia-completo-estudo.md`.
