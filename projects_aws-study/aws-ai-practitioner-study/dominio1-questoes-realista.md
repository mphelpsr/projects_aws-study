# Domínio 1: Fundamentos de IA e ML — Questões Estilo Prova Real

**Peso no exame:** 20% | **Formato:** cenários de negócio, incluindo questões "Selecione DUAS respostas"
**Tempo sugerido:** 30 minutos para 20 questões

Este arquivo complementa `dominio1-questoes-fundamentos-ml.md`. Aqui as questões têm contexto de negócio (como na prova real) e cada alternativa — certa e erradas — é explicada.

---

## Questão 1

Uma equipe de dados descreve seu projeto assim: "Estamos construindo um sistema que usa redes neurais com múltiplas camadas para identificar defeitos em fotos de peças na linha de produção." Qual termo descreve melhor a técnica usada?

A) Aprendizado por reforço
B) Deep learning (aprendizado profundo)
C) Regressão linear
D) RPA (automação robótica de processos)

**Resposta correta:** B

**Por que está correta:** Deep learning é o subcampo de ML que usa redes neurais com múltiplas camadas ocultas (deep = profundo) para aprender representações hierárquicas de dados, sendo a abordagem padrão para visão computacional como detecção de defeitos em imagens.

**Por que as outras estão erradas:**
- A) Aprendizado por reforço aprende por tentativa e erro com recompensas; não é descrito no cenário (não há agente recebendo recompensa por ações).
- C) Regressão linear é um algoritmo estatístico simples de uma camada, incapaz de capturar padrões visuais complexos como defeitos em imagens.
- D) RPA automatiza tarefas baseadas em regras (cliques, preenchimento de formulários); não envolve aprendizado a partir de dados.

---

## Questão 2

Uma empresa de e-commerce tem um sistema que ajusta os preços de produtos em tempo real: o sistema testa diferentes preços, observa o impacto nas vendas (recompensa) e ajusta sua estratégia para maximizar o lucro ao longo do tempo, sem receber um conjunto de dados rotulado previamente. Que tipo de aprendizado de máquina é esse?

A) Aprendizado supervisionado
B) Aprendizado não supervisionado
C) Aprendizado por reforço
D) Aprendizado semi-supervisionado

**Resposta correta:** C

**Por que está correta:** O sistema toma ações (definir preços), recebe recompensas (impacto nas vendas/lucro) e ajusta sua política para maximizar a recompensa cumulativa — essa é exatamente a definição de aprendizado por reforço (reinforcement learning).

**Por que as outras estão erradas:**
- A) Supervisionado exige dados rotulados de entrada-saída conhecidos previamente; aqui não há "resposta certa" fornecida antecipadamente.
- B) Não supervisionado busca padrões/agrupamentos em dados sem rótulo, mas não envolve o conceito de recompensa e ação sequencial.
- D) Semi-supervisionado combina uma pequena quantidade de dados rotulados com muitos dados não rotulados; não é o caso descrito.

---

## Questão 3

Uma cientista de dados constrói um modelo para prever o preço de imóveis com base em metragem, localização e idade do imóvel. O modelo atinge 96% de acerto (baixo erro) nos dados de treinamento, mas o erro é muito alto quando testado em imóveis novos que nunca foram vistos. Qual é o problema mais provável?

A) Underfitting
B) Overfitting
C) O modelo está usando aprendizado por reforço incorretamente
D) Falta de poder computacional

**Resposta correta:** B

**Por que está correta:** Overfitting ocorre quando o modelo memoriza padrões e ruídos específicos dos dados de treinamento (alto desempenho neles) mas não generaliza para dados novos (baixo desempenho na produção/teste) — exatamente o padrão descrito.

**Por que as outras estão erradas:**
- A) Underfitting é o oposto: o modelo teria desempenho ruim tanto no treino quanto no teste, por ser simples demais para capturar os padrões.
- C) O cenário é claramente de aprendizado supervisionado (regressão com dados rotulados de preço); reforço não se aplica.
- D) Poder computacional insuficiente causaria falhas de treinamento ou lentidão, não esse padrão específico de alta acurácia no treino e baixa em produção.

---

## Questão 4

Qual é a sequência correta e mais completa das etapas do ciclo de vida de desenvolvimento de ML, da concepção ao uso contínuo em produção?

A) Treinamento → Coleta de dados → Deploy → Monitoramento
B) Definição do problema de negócio → Coleta e preparação de dados → Engenharia de atributos → Treinamento e ajuste → Avaliação → Deploy → Monitoramento contínuo
C) Deploy → Coleta de dados → Avaliação → Treinamento
D) Coleta de dados → Deploy → Treinamento → Avaliação → Monitoramento

**Resposta correta:** B

**Por que está correta:** O ciclo de vida de ML começa entendendo o problema de negócio, segue para dados (coleta, limpeza, preparação), engenharia de atributos, treinamento/ajuste de hiperparâmetros, avaliação contra métricas, e só então deploy em produção com monitoramento contínuo (incluindo retrain quando há drift).

**Por que as outras estão erradas:**
- A) Inverte a ordem lógica: não é possível treinar antes de coletar os dados.
- C) Fazer deploy antes de treinar e avaliar o modelo não faz sentido — não haveria modelo funcional para implantar.
- D) Fazer deploy antes de treinar o modelo é impossível; a ordem está fora de sequência.

---

## Questão 5

Uma seguradora quer treinar um modelo para detectar fraudes em sinistros. Deixar passar uma fraude (falso negativo) custa muito mais à empresa do que investigar um sinistro legítimo por engano (falso positivo). Ao avaliar candidatos a modelo, qual métrica a equipe deve priorizar?

A) Acurácia (accuracy) geral
B) Recall (sensibilidade)
C) Velocidade de inferência apenas
D) Tamanho do modelo em MB

**Resposta correta:** B

**Por que está correta:** Recall mede a proporção de casos positivos reais (fraudes) que o modelo conseguiu identificar corretamente. Como o custo de um falso negativo (fraude não detectada) é alto, maximizar recall reduz a chance de fraudes passarem despercebidas, mesmo que isso gere mais falsos positivos.

**Por que as outras estão erradas:**
- A) Acurácia geral pode ser enganosa em dados desbalanceados (poucas fraudes entre muitos sinistros legítimos) — um modelo que nunca prevê fraude teria acurácia alta, mas seria inútil.
- C) Velocidade de inferência é relevante operacionalmente, mas não resolve o problema de negócio de minimizar fraudes não detectadas.
- D) Tamanho do modelo é uma preocupação de custo/infraestrutura, não de qualidade preditiva para esse objetivo de negócio.

---

## Questão 6

Uma equipe de RH quer agrupar automaticamente currículos em categorias de perfis semelhantes (ex.: "técnico", "vendas", "gestão") sem ter uma lista prévia de rótulos definidos. Qual abordagem de ML é mais apropriada?

A) Classificação supervisionada
B) Regressão
C) Clustering (aprendizado não supervisionado)
D) Aprendizado por reforço

**Resposta correta:** C

**Por que está correta:** Clustering é uma técnica de aprendizado não supervisionado que agrupa dados semelhantes sem rótulos pré-definidos, descobrindo estrutura latente nos dados — exatamente o caso de agrupar currículos por similaridade sem categorias prévias.

**Por que as outras estão erradas:**
- A) Classificação supervisionada exige rótulos conhecidos de antemão (ex.: currículos já marcados como "técnico" ou "vendas") para treinar o modelo, o que não existe aqui.
- B) Regressão prevê valores numéricos contínuos (ex.: salário esperado), não agrupamento em categorias.
- D) Aprendizado por reforço envolve agentes, ações e recompensas; não se aplica a agrupamento de documentos.

---

## Questão 7

Uma fábrica quer identificar automaticamente produtos com defeitos visuais (arranhões, deformações) em fotos tiradas na linha de montagem, em tempo real. Qual serviço AWS gerenciado é o mais adequado para essa tarefa sem que a empresa precise construir um modelo de visão computacional do zero?

A) Amazon Comprehend
B) Amazon Rekognition (Custom Labels)
C) Amazon Polly
D) Amazon Lex

**Resposta correta:** B

**Por que está correta:** Amazon Rekognition é o serviço de visão computacional da AWS; o recurso Custom Labels permite treinar um modelo de detecção de defeitos específico do domínio usando poucas imagens rotuladas, sem precisar construir a arquitetura de rede neural do zero.

**Por que as outras estão erradas:**
- A) Amazon Comprehend é um serviço de NLP (processamento de linguagem natural) para texto, não imagens.
- C) Amazon Polly converte texto em fala (text-to-speech); não tem relação com análise de imagens.
- D) Amazon Lex constrói interfaces conversacionais (chatbots); não processa imagens.

---

## Questão 8

Uma rede de varejo quer sugerir produtos personalizados a cada cliente com base no histórico de navegação e compras, de forma semelhante à Amazon.com. Qual serviço AWS foi desenhado especificamente para esse caso de uso?

A) Amazon Forecast
B) Amazon Personalize
C) Amazon Kendra
D) Amazon Textract

**Resposta correta:** B

**Por que está correta:** Amazon Personalize é um serviço gerenciado de machine learning criado especificamente para gerar recomendações personalizadas em tempo real, usando a mesma tecnologia de recomendação desenvolvida internamente pela Amazon.com.

**Por que as outras estão erradas:**
- A) Amazon Forecast é voltado para previsão de séries temporais (ex.: demanda, estoque), não recomendação de produtos por usuário.
- C) Amazon Kendra é um serviço de busca empresarial inteligente (enterprise search), não um motor de recomendação.
- D) Amazon Textract extrai texto e dados de documentos digitalizados; não gera recomendações.

---

## Questão 9

Uma empresa de logística tem 5 anos de dados históricos de volume de entregas por região e quer prever a demanda para os próximos 3 meses, considerando sazonalidade (feriados, datas comemorativas). Qual serviço AWS é o mais adequado?

A) Amazon Forecast
B) Amazon Rekognition
C) Amazon Comprehend
D) Amazon Translate

**Resposta correta:** A

**Por que está correta:** Amazon Forecast é um serviço de previsão de séries temporais baseado em ML, projetado para lidar com sazonalidade e múltiplas variáveis, adequado para prever demanda futura a partir de dados históricos.

**Por que as outras estão erradas:**
- B) Amazon Rekognition analisa imagens e vídeos; não tem relação com previsão numérica de séries temporais.
- C) Amazon Comprehend extrai insights de texto (sentimento, entidades); não faz previsão de demanda.
- D) Amazon Translate traduz texto entre idiomas; não é uma ferramenta de previsão.

---

## Questão 10

Um hospital precisa digitalizar milhares de formulários de admissão de pacientes preenchidos à mão e em PDFs escaneados, extraindo automaticamente campos como nome, data de nascimento e histórico médico estruturado em tabelas. Qual serviço AWS atende diretamente a essa necessidade?

A) Amazon Comprehend Medical
B) Amazon Textract
C) Amazon Polly
D) Amazon Transcribe

**Resposta correta:** B

**Por que está correta:** Amazon Textract é especializado em OCR avançado: extrai texto, formulários (pares chave-valor) e tabelas de documentos escaneados e PDFs, incluindo manuscritos, sendo a escolha direta para digitalizar formulários de admissão.

**Por que as outras estão erradas:**
- A) Amazon Comprehend Medical extrai entidades clínicas (medicamentos, condições) de texto médico não estruturado, mas não faz a extração inicial de texto de imagens/PDFs escaneados — normalmente é usado depois do Textract.
- C) Amazon Polly converte texto em áudio; não processa documentos.
- D) Amazon Transcribe converte áudio em texto; não processa documentos escaneados.

---

## Questão 11 (Selecione DUAS respostas)

Uma empresa quer criar um assistente de atendimento ao cliente que recebe áudio de chamadas em inglês, gera uma transcrição em texto e depois traduz essa transcrição para português para a equipe de suporte no Brasil. Quais DOIS serviços AWS devem ser combinados para esse pipeline?

A) Amazon Transcribe
B) Amazon Rekognition
C) Amazon Translate
D) Amazon Textract
E) Amazon Forecast

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Amazon Transcribe converte o áudio da chamada em texto (speech-to-text), sendo a primeira etapa necessária do pipeline.
- C) Amazon Translate traduz o texto transcrito de inglês para português, completando o fluxo descrito.

**Por que as outras estão erradas:**
- B) Amazon Rekognition processa imagens e vídeos, não áudio ou texto.
- D) Amazon Textract extrai texto de documentos/imagens escaneadas, não de áudio.
- E) Amazon Forecast faz previsão de séries temporais numéricas; não tem relação com transcrição ou tradução.

---

## Questão 12

O que caracteriza "feature engineering" (engenharia de atributos) dentro do ciclo de vida de ML?

A) O processo de implantar o modelo em um endpoint de produção
B) O processo de criar, transformar ou selecionar variáveis a partir dos dados brutos para melhorar o desempenho do modelo
C) O processo de monitorar o modelo após o deploy
D) O processo de definir o orçamento do projeto de ML

**Resposta correta:** B

**Por que está correta:** Feature engineering é a etapa em que dados brutos são transformados em atributos (features) mais informativos — por exemplo, extrair "dia da semana" de uma data, normalizar escalas ou combinar colunas — o que impacta diretamente a qualidade do modelo treinado.

**Por que as outras estão erradas:**
- A) Isso descreve a etapa de deploy, que ocorre depois do treinamento, não a preparação de atributos.
- C) Isso descreve monitoramento em produção (model monitoring), uma etapa posterior e distinta.
- D) Definição de orçamento é uma atividade de gestão de projeto, não uma etapa técnica do pipeline de dados.

---

## Questão 13

Por que os dados geralmente são divididos em conjuntos de treinamento, validação e teste antes de treinar um modelo de ML?

A) Para reduzir o custo de armazenamento dos dados
B) Para permitir treinar o modelo, ajustar hiperparâmetros de forma imparcial e avaliar a capacidade de generalização em dados nunca vistos
C) Porque a AWS exige essa divisão para usar o SageMaker
D) Para acelerar a etapa de coleta de dados

**Resposta correta:** B

**Por que está correta:** O conjunto de treinamento ajusta os parâmetros do modelo; o de validação ajuda a ajustar hiperparâmetros e escolher entre modelos sem "vazar" informação do teste; o de teste, usado só ao final, estima como o modelo generalizará para dados novos em produção.

**Por que as outras estão erradas:**
- A) A divisão não tem relação com custo de armazenamento; é uma prática metodológica de avaliação.
- C) Não é um requisito técnico imposto pelo SageMaker; é uma boa prática padrão de ML aplicável com qualquer ferramenta.
- D) A divisão ocorre depois da coleta de dados, não a acelera.

---

## Questão 14

Uma startup tem apenas 800 imagens rotuladas de radiografias para treinar um classificador de anomalias, um volume considerado pequeno para treinar uma rede neural do zero. Qual técnica permite aproveitar o conhecimento de um modelo já treinado em milhões de imagens genéricas para acelerar esse projeto com poucos dados?

A) Overfitting intencional
B) Transfer learning
C) Redução de dimensionalidade
D) Regressão logística simples

**Resposta correta:** B

**Por que está correta:** Transfer learning reaproveita um modelo pré-treinado (ex.: em ImageNet) e ajusta suas últimas camadas para uma nova tarefa com um conjunto de dados menor, reduzindo drasticamente a quantidade de dados e tempo de treinamento necessários.

**Por que as outras estão erradas:**
- A) Overfitting não é uma técnica desejável; é um problema a ser evitado, especialmente crítico quando há poucos dados.
- C) Redução de dimensionalidade (ex.: PCA) simplifica variáveis de entrada, mas não resolve o problema de poucos dados rotulados para treinar do zero.
- D) Regressão logística é um algoritmo simples que não tem a capacidade representacional necessária para classificação de imagens médicas complexas, e não resolve a escassez de dados.

---

## Questão 15 (Selecione DUAS respostas)

Uma equipe está descrevendo as etapas iniciais de preparação de dados antes do treinamento de um modelo. Quais DUAS atividades pertencem tipicamente à fase de preparação/pré-processamento de dados no ciclo de vida de ML?

A) Tratar valores ausentes (missing values) e remover duplicatas
B) Publicar o modelo em um endpoint público
C) Normalizar ou padronizar variáveis numéricas
D) Configurar alarmes de monitoramento de drift em produção
E) Definir o SLA de disponibilidade do endpoint

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Tratar dados ausentes e duplicados é uma tarefa clássica de limpeza de dados (data cleaning), essencial antes do treinamento.
- C) Normalizar/padronizar variáveis numéricas evita que atributos em escalas diferentes distorçam o aprendizado do modelo, sendo parte central da preparação de dados.

**Por que as outras estão erradas:**
- B) Publicar em endpoint é uma atividade da fase de deploy, muito posterior à preparação de dados.
- D) Configurar alarmes de drift é uma atividade de monitoramento pós-deploy, não de preparação de dados.
- E) Definir SLA de disponibilidade é uma decisão operacional/de infraestrutura de produção, não de preparação de dados.

---

## Questão 16

O Amazon SageMaker é descrito na documentação da AWS como um serviço "totalmente gerenciado" para ML. O que isso significa na prática para uma equipe de dados?

A) A AWS escolhe automaticamente qual algoritmo de ML a empresa deve usar, sem opção de customização
B) A AWS gerencia a infraestrutura subjacente (provisionamento, escalonamento, patches), permitindo à equipe focar em construir, treinar e implantar modelos
C) O serviço só pode ser usado com os algoritmos pré-construídos da AWS, sem suporte a frameworks próprios
D) Os modelos treinados no SageMaker não podem ser exportados para fora da AWS

**Resposta correta:** B

**Por que está correta:** "Totalmente gerenciado" significa que a AWS cuida do provisionamento, manutenção e escalonamento da infraestrutura de computação necessária (notebooks, treinamento, hospedagem), liberando a equipe de ciência de dados para focar no ciclo de vida do modelo em si.

**Por que as outras estão erradas:**
- A) O SageMaker oferece tanto algoritmos integrados quanto suporte a frameworks customizados (TensorFlow, PyTorch, scikit-learn) e algoritmos próprios via containers — a equipe escolhe.
- C) O SageMaker suporta bring-your-own-algorithm/container, não se limitando aos algoritmos integrados da AWS.
- D) Modelos treinados no SageMaker podem ser exportados (ex.: artefatos de modelo salvos no S3) e usados fora da AWS, dependendo do framework utilizado.

---

## Questão 17

Uma equipe de ciência de dados observa que seu modelo de classificação de crédito tem desempenho ruim tanto no conjunto de treinamento (65% de acurácia) quanto no conjunto de teste (63% de acurácia). Qual é o diagnóstico mais provável?

A) Overfitting
B) Underfitting
C) Data leakage
D) O modelo está perfeito e pronto para produção

**Resposta correta:** B

**Por que está correta:** Underfitting ocorre quando o modelo é simples demais (ou mal treinado) para capturar os padrões dos dados, resultando em desempenho fraco tanto no treinamento quanto no teste — diferente do overfitting, onde o treino tem desempenho muito superior ao teste.

**Por que as outras estão erradas:**
- A) Overfitting apresentaria alta acurácia no treino e baixa no teste, um padrão diferente do descrito (ambos baixos e próximos).
- C) Data leakage (vazamento de dados de teste para o treino) tipicamente infla artificialmente o desempenho no treino/teste, não o reduz.
- D) Um modelo com apenas ~63-65% de acurácia em um problema de classificação binária de crédito geralmente está longe do desempenho aceitável para produção.

---

## Questão 18

Qual das alternativas melhor descreve a diferença fundamental entre Inteligência Artificial (IA), Machine Learning (ML) e Deep Learning (DL)?

A) São sinônimos completos e intercambiáveis
B) IA é o campo mais amplo (sistemas que simulam inteligência humana); ML é um subconjunto de IA que aprende padrões a partir de dados; Deep Learning é um subconjunto de ML que usa redes neurais profundas
C) Deep Learning é mais amplo que IA, que por sua vez contém ML
D) ML só pode ser usado para tarefas de visão computacional, enquanto DL é usado para todo o resto

**Resposta correta:** B

**Por que está correta:** Essa é a hierarquia conceitual padrão: IA (o campo mais amplo) ⊃ ML (subconjunto que aprende com dados em vez de regras explícitas) ⊃ Deep Learning (subconjunto de ML baseado em redes neurais com múltiplas camadas).

**Por que as outras estão erradas:**
- A) Os termos têm relações hierárquicas específicas e não são sinônimos — cada um é mais restrito que o anterior.
- C) Inverte a hierarquia real; Deep Learning é o subconjunto mais restrito, não o mais amplo.
- D) ML é aplicado a uma enorme variedade de tarefas (regressão, classificação, séries temporais, NLP, etc.), não apenas visão computacional, e DL não é usado exclusivamente para "todo o resto".

---

## Questão 19 (Selecione DUAS respostas)

Uma equipe está decidindo se um problema de negócio deve ser resolvido com aprendizado supervisionado. Quais DUAS condições indicam que o aprendizado supervisionado é a abordagem apropriada?

A) Existe um conjunto de dados histórico rotulado, com exemplos de entrada e a resposta/rótulo correto correspondente
B) O objetivo é descobrir agrupamentos ocultos em dados sem nenhum rótulo disponível
C) O objetivo é prever uma variável de saída conhecida (ex.: "este email é spam ou não") a partir de variáveis de entrada
D) Não há nenhum dado histórico disponível, apenas um ambiente de simulação com recompensas
E) O objetivo é reduzir o número de dimensões de um conjunto de dados sem rótulos

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Aprendizado supervisionado depende fundamentalmente de dados rotulados (pares entrada-saída conhecidos) para treinar o modelo.
- C) Prever uma variável de saída conhecida e definida (classificação ou regressão) é a essência do aprendizado supervisionado.

**Por que as outras estão erradas:**
- B) Descobrir agrupamentos sem rótulos é a definição de aprendizado não supervisionado (clustering), não supervisionado.
- D) Ambientes de simulação com recompensas descrevem aprendizado por reforço, não supervisionado.
- E) Redução de dimensionalidade sem rótulos é uma técnica de aprendizado não supervisionado.

---

## Questão 20

Uma empresa de telecomunicações quer transcrever automaticamente as ligações do call center para texto, permitindo busca posterior por palavras-chave nas conversas. Qual serviço AWS resolve diretamente essa necessidade?

A) Amazon Polly
B) Amazon Transcribe
C) Amazon Lex
D) Amazon Kendra

**Resposta correta:** B

**Por que está correta:** Amazon Transcribe é o serviço de reconhecimento automático de fala (ASR) da AWS, convertendo áudio de chamadas em texto (speech-to-text), incluindo funcionalidades como identificação de locutor e timestamps, permitindo busca textual posterior.

**Por que as outras estão erradas:**
- A) Amazon Polly faz o caminho inverso: converte texto em fala (text-to-speech), não áudio em texto.
- C) Amazon Lex constrói chatbots e interfaces conversacionais; não é uma ferramenta de transcrição em lote de chamadas gravadas.
- D) Amazon Kendra é um serviço de busca empresarial sobre documentos/conteúdo já textual; não transcreve áudio — poderia ser usado depois do Transcribe para indexar o texto resultante.

---

## 📊 Como Avaliar

- **18-20 corretas:** Excelente domínio dos fundamentos de IA/ML no nível da prova real.
- **15-17 corretas:** Bom domínio; revise os conceitos de overfitting/underfitting e mapeamento de serviços AWS.
- **12-14 corretas:** Revisar ciclo de vida de ML e diferenças entre tipos de aprendizado.
- **< 12 corretas:** Retomar `dominio1-questoes-fundamentos-ml.md` e a seção de Domínio 1 do `guia-completo-estudo.md`.
