# Domínio 4: Diretrizes para IA Responsável — Questões Estilo Prova Real

**Peso no exame:** 14% | **Formato:** cenários de negócio, incluindo questões "Selecione DUAS respostas"
**Tempo sugerido:** 20 minutos para 20 questões

Este arquivo complementa `dominio4-questoes-responsible-ai.md`. Aqui as questões têm contexto de negócio e cada alternativa — certa e errada — é explicada.

---

## Questão 1

Um banco descobre que seu modelo de aprovação de crédito rejeita candidatos de um determinado bairro com taxa muito maior do que outros bairros com perfil de renda semelhante, mesmo sem usar CEP diretamente como variável — o modelo aparentemente aprendeu esse padrão através de variáveis correlacionadas. Qual princípio de IA responsável está sendo violado?

A) Explicabilidade
B) Fairness (equidade/justiça)
C) Sustentabilidade ambiental
D) Governança de custos

**Resposta correta:** B

**Por que está correta:** Fairness trata de garantir que um modelo não discrimine ou prejudique injustamente grupos específicos, mesmo indiretamente via variáveis correlacionadas (proxy) com atributos sensíveis como localização/raça/renda — exatamente o padrão de viés descrito no cenário.

**Por que as outras estão erradas:**
- A) Explicabilidade refere-se a entender COMO o modelo chega a uma decisão, não diretamente à existência de discriminação nos resultados (embora a explicabilidade ajude a detectar o problema de fairness).
- C) Sustentabilidade ambiental refere-se ao impacto de consumo de energia/recursos do treinamento de modelos, sem relação com discriminação de candidatos a crédito.
- D) Governança de custos trata de controle financeiro sobre o uso de recursos de ML/IA, sem relação com viés discriminatório.

---

## Questão 2

Qual serviço da AWS foi projetado especificamente para detectar viés (bias) potencial nos dados de treinamento e nas previsões de modelos de machine learning, além de fornecer explicações sobre as previsões do modelo?

A) AWS CloudTrail
B) Amazon SageMaker Clarify
C) AWS KMS
D) Amazon Macie

**Resposta correta:** B

**Por que está correta:** Amazon SageMaker Clarify foi desenvolvido especificamente para detectar viés em dados de treinamento e em previsões de modelos (antes e depois do deploy), além de gerar explicações sobre a importância de cada atributo nas previsões (explicabilidade).

**Por que as outras estão erradas:**
- A) AWS CloudTrail registra chamadas de API para fins de auditoria de segurança, sem relação com detecção de viés em modelos.
- C) AWS KMS gerencia chaves de criptografia, sem qualquer função de análise de viés ou explicabilidade de modelos.
- D) Amazon Macie identifica dados sensíveis (PII) armazenados no S3, sem relação com detecção de viés em modelos de ML.

---

## Questão 3

Um hospital quer implementar um sistema de IA que sugere diagnósticos preliminares, mas a política interna exige que nenhuma decisão final de tratamento seja tomada sem revisão de um médico humano antes de ser comunicada ao paciente. Esse princípio de design é conhecido como:

A) Data augmentation
B) Human-in-the-loop (HITL)
C) Overfitting prevention
D) Auto-scaling

**Resposta correta:** B

**Por que está correta:** Human-in-the-loop (HITL) é o princípio de manter um humano revisando, validando ou aprovando decisões críticas geradas por um sistema de IA antes que sejam finalizadas ou comunicadas, especialmente importante em aplicações de alto risco como diagnósticos médicos.

**Por que as outras estão erradas:**
- A) Data augmentation é uma técnica de aumentar artificialmente dados de treinamento; não tem relação com supervisão humana de decisões.
- C) Prevenção de overfitting é uma prática técnica de generalização de modelos, sem relação com supervisão humana de decisões de negócio.
- D) Auto-scaling é uma capacidade de infraestrutura para ajustar recursos computacionais conforme a demanda, sem relação com governança de decisões de IA.

---

## Questão 4

Uma empresa de recrutamento publica um "model card" (cartão de modelo) para seu sistema de triagem de currículos baseado em IA. O que tipicamente é documentado em um model card?

A) Apenas o preço de licenciamento do modelo
B) Informações como propósito do modelo, dados de treinamento, limitações conhecidas, métricas de desempenho e considerações éticas
C) Apenas o código-fonte completo do modelo, sem qualquer outra informação
D) Exclusivamente os nomes dos desenvolvedores do modelo

**Resposta correta:** B

**Por que está correta:** Model cards são documentos padronizados de transparência que descrevem o propósito do modelo, dados e metodologia de treinamento, métricas de desempenho, limitações conhecidas, casos de uso pretendidos/não pretendidos e considerações éticas — fornecendo contexto essencial para uso responsável do modelo.

**Por que as outras estão erradas:**
- A) Preço de licenciamento não é o foco de um model card; o documento é voltado para transparência técnica e ética, não informações comerciais.
- C) Model cards não são documentação de código-fonte; são documentos de transparência de alto nível sobre comportamento e limitações do modelo.
- D) Embora possam mencionar responsáveis, o foco central não são apenas nomes de desenvolvedores, mas sim as características e limitações do modelo.

---

## Questão 5

Qual das alternativas melhor descreve o conceito de "explicabilidade" (explainability) em IA responsável?

A) A capacidade de um modelo gerar respostas mais rápido
B) A capacidade de entender e comunicar como e por que um modelo chegou a uma determinada previsão ou decisão
C) A capacidade de reduzir o tamanho do modelo em disco
D) A capacidade de criptografar os dados de entrada do modelo

**Resposta correta:** B

**Por que está correta:** Explicabilidade refere-se à capacidade de interpretar e comunicar de forma compreensível os fatores que levaram um modelo a uma previsão ou decisão específica — essencial para construir confiança, permitir auditoria e detectar comportamentos indesejados (como viés).

**Por que as outras estão erradas:**
- A) Velocidade de geração de resposta é uma característica de performance/latência, sem relação com a interpretabilidade das decisões do modelo.
- C) Redução de tamanho do modelo é uma técnica de otimização/compressão, sem relação com explicar decisões do modelo.
- D) Criptografia de dados é uma medida de segurança, uma preocupação totalmente diferente de explicabilidade.

---

## Questão 6

Uma empresa de seguros percebe que seu modelo de precificação de apólices resulta em preços sistematicamente mais altos para um grupo demográfico específico, mesmo controlando por fatores de risco legítimos. Qual das seguintes ações é a mais alinhada com os princípios de IA responsável para mitigar esse problema?

A) Ignorar o problema, já que o modelo já está em produção e funcionando
B) Usar ferramentas como SageMaker Clarify para investigar e medir o viés, e reavaliar/reajustar o modelo ou seus dados de treinamento antes de continuar usando-o
C) Aumentar apenas a velocidade de processamento do modelo
D) Remover toda a documentação do modelo para evitar questionamentos

**Resposta correta:** B

**Por que está correta:** A prática responsável diante de viés identificado é investigar formalmente a causa (com ferramentas de detecção de viés como SageMaker Clarify), e então corrigir os dados, features ou o próprio modelo antes de continuar usando-o em decisões que afetam pessoas — mitigando o dano e cumprindo princípios de fairness.

**Por que as outras estão erradas:**
- A) Ignorar viés identificado é contrário aos princípios de IA responsável e pode gerar consequências legais/reputacionais e discriminação continuada.
- C) Velocidade de processamento não tem relação nenhuma com correção de viés discriminatório nas previsões.
- D) Remover documentação é o oposto de transparência, um pilar central de IA responsável, e pode configurar má prática de governança.

---

## Questão 7

O que significa "robustez" (robustness) como princípio de IA responsável aplicado a um modelo de fundação?

A) O modelo nunca precisa ser atualizado
B) O modelo mantém desempenho estável e confiável mesmo diante de entradas levemente diferentes, ruidosas ou adversariais, sem falhas ou comportamentos inesperados drásticos
C) O modelo é fisicamente resistente a quedas e danos de hardware
D) O modelo sempre gera a resposta mais longa possível

**Resposta correta:** B

**Por que está correta:** Robustez refere-se à capacidade do modelo de manter desempenho consistente e confiável mesmo diante de variações na entrada (ruído, pequenas perturbações, tentativas adversariais de manipulação), evitando falhas catastróficas ou comportamentos imprevisíveis.

**Por que as outras estão erradas:**
- A) Modelos robustos ainda podem (e geralmente devem) ser reavaliados e atualizados ao longo do tempo; robustez não significa ausência de manutenção.
- C) Robustez em IA é um conceito de comportamento do modelo diante de dados de entrada, não uma propriedade física de hardware.
- D) Gerar respostas mais longas não tem relação com estabilidade ou confiabilidade do modelo diante de variações de entrada.

---

## Questão 8

Uma equipe de produto quer garantir que os usuários finais de um chatbot de IA generativa entendam que estão interagindo com um sistema de IA, e não com um humano. Isso está mais diretamente relacionado a qual princípio de IA responsável?

A) Eficiência computacional
B) Transparência
C) Redução de custo de infraestrutura
D) Velocidade de resposta

**Resposta correta:** B

**Por que está correta:** Transparência envolve comunicar claramente aos usuários que estão interagindo com um sistema de IA (e não um humano), além de explicitar limitações e a natureza automatizada da interação — essencial para consentimento informado e confiança do usuário.

**Por que as outras estão erradas:**
- A) Eficiência computacional refere-se a otimização de recursos de processamento, sem relação com comunicar a natureza da interação ao usuário.
- C) Redução de custo é uma preocupação financeira/operacional, não um princípio de comunicação transparente com o usuário.
- D) Velocidade de resposta é uma métrica de performance, sem relação direta com o princípio de transparência sobre a natureza do sistema.

---

## Questão 9

Uma equipe de dados observa que seu conjunto de treinamento de reconhecimento facial contém predominantemente rostos de um único grupo demográfico, resultando em desempenho pior para outros grupos. Qual é a causa raiz mais provável desse problema de fairness?

A) O modelo tem parâmetros insuficientes
B) Viés representacional nos dados de treinamento (dados de treinamento não representativos da diversidade da população real)
C) O modelo está usando muita energia computacional
D) O modelo foi implantado na região AWS errada

**Resposta correta:** B

**Por que está correta:** Viés representacional ocorre quando os dados de treinamento não refletem adequadamente a diversidade da população em que o modelo será usado, fazendo com que grupos sub-representados tenham desempenho pior — uma das causas mais comuns e bem documentadas de discriminação em sistemas de reconhecimento facial.

**Por que as outras estão erradas:**
- A) Número insuficiente de parâmetros é um problema de capacidade do modelo (underfitting), não a causa típica de disparidade de desempenho entre grupos demográficos.
- C) Consumo de energia computacional é uma preocupação de sustentabilidade, sem relação causal com viés nos dados de treinamento.
- D) A região AWS de deploy é uma decisão de infraestrutura/latência, sem relação com a composição demográfica dos dados de treinamento.

---

## Questão 10 (Selecione DUAS respostas)

Quais DUAS práticas ajudam a promover fairness (equidade) em um sistema de IA usado para decisões de contratação de funcionários?

A) Usar SageMaker Clarify (ou ferramenta equivalente) para medir métricas de viés entre diferentes grupos demográficos antes e depois do deploy
B) Garantir que o conjunto de dados de treinamento seja representativo da diversidade de candidatos qualificados, evitando sub-representação de grupos
C) Usar exclusivamente dados históricos de contratações passadas sem qualquer auditoria, mesmo que reflitam discriminação histórica
D) Aumentar o valor de temperature do modelo para gerar decisões mais aleatórias
E) Remover toda documentação sobre como o modelo toma decisões

**Resposta correta:** A e B

**Por que estão corretas:**
- A) Medir métricas de viés (como disparidade de taxa de aprovação entre grupos) com ferramentas como SageMaker Clarify permite identificar e corrigir discriminação antes que cause dano em produção.
- B) Garantir representatividade dos dados de treinamento reduz a chance de o modelo aprender e perpetuar padrões discriminatórios contra grupos sub-representados.

**Por que as outras estão erradas:**
- C) Usar dados históricos sem auditoria é um risco conhecido: se as contratações passadas refletiam viés humano, o modelo aprenderá e perpetuará esse mesmo viés.
- D) Temperature é um parâmetro de geração de texto de LLMs; não tem relação com fairness em decisões de classificação/triagem, e "aleatoriedade" não é sinônimo de equidade.
- E) Remover documentação reduz transparência e auditabilidade, dificultando (não promovendo) a detecção e correção de discriminação.

---

## Questão 11

Uma startup de saúde quer usar um modelo de fundação para sugerir possíveis condições médicas com base em sintomas relatados por pacientes. Qual é a consideração de IA responsável MAIS crítica antes de lançar essa aplicação ao público?

A) Escolher a cor da interface do aplicativo
B) Garantir supervisão humana qualificada (human-in-the-loop) e comunicar claramente as limitações do sistema, já que erros em diagnósticos podem causar dano real à saúde
C) Maximizar exclusivamente a velocidade de resposta do modelo
D) Reduzir o número de perguntas feitas ao paciente ao mínimo possível

**Resposta correta:** B

**Por que está correta:** Em aplicações de alto risco como saúde, onde erros podem causar dano físico real, a supervisão humana qualificada e a comunicação clara de limitações (o sistema não substitui diagnóstico médico profissional) são consideradas essenciais nos princípios de IA responsável, indo além de qualquer preocupação puramente técnica ou de UX.

**Por que as outras estão erradas:**
- A) Escolhas visuais de interface não têm relação com os riscos de segurança/saúde do paciente associados ao uso do sistema.
- C) Priorizar apenas velocidade, sem considerar segurança e supervisão adequada, pode aumentar o risco de decisões prejudiciais não revisadas.
- D) Reduzir perguntas ao paciente pode piorar a qualidade da triagem, aumentando o risco de sugestões incorretas — não é uma prioridade de responsabilidade nesse contexto.

---

## Questão 12

O que caracteriza "veracidade" (veracity) como uma dimensão de IA responsável, especialmente relevante para IA generativa?

A) A velocidade com que o modelo gera respostas
B) O grau em que as saídas do modelo são factualmente corretas e não contêm alucinações ou desinformação
C) O tamanho do modelo em número de parâmetros
D) O custo por token de inferência

**Resposta correta:** B

**Por que está correta:** Veracidade refere-se à correção factual das saídas geradas pelo modelo, sendo uma preocupação central em IA generativa devido ao risco de alucinações — informações inventadas mas apresentadas com aparência de fato, que podem enganar usuários se não forem mitigadas.

**Por que as outras estão erradas:**
- A) Velocidade de geração é uma métrica de performance/latência, não relacionada à correção factual do conteúdo.
- C) O número de parâmetros é uma característica arquitetural do modelo, sem relação direta e garantida com veracidade das respostas.
- D) Custo por token é uma consideração financeira/operacional, sem relação com a dimensão de veracidade.

---

## Questão 13

Uma empresa de mídia social usa um modelo de IA generativa para moderar automaticamente comentários, mas quer evitar que o modelo gere ou permita a passagem de discurso de ódio, mesmo que usuários tentem contornar os filtros com frases disfarçadas. Qual recurso do Amazon Bedrock apoia diretamente esse objetivo de segurança de conteúdo?

A) Bedrock Knowledge Bases
B) Bedrock Guardrails
C) Bedrock Provisioned Throughput
D) SageMaker Ground Truth

**Resposta correta:** B

**Por que está correta:** Bedrock Guardrails permite configurar políticas de segurança de conteúdo, incluindo filtros de conteúdo nocivo (como discurso de ódio, violência), bloqueio de tópicos indesejados e detecção de tentativas de prompt injection, ajudando a proteger tanto entradas quanto saídas do modelo.

**Por que as outras estão erradas:**
- A) Bedrock Knowledge Bases implementa RAG para consulta a documentos externos, sem relação direta com filtragem de conteúdo nocivo.
- C) Provisioned Throughput garante capacidade de inferência dedicada, uma preocupação de performance, não de segurança de conteúdo.
- D) SageMaker Ground Truth é uma ferramenta de rotulagem de dados para treinamento de modelos, sem relação com moderação de conteúdo em tempo real.

---

## Questão 14

Qual das alternativas descreve corretamente a relação entre "interpretabilidade" e a complexidade de um modelo de machine learning?

A) Modelos mais complexos (como deep learning com milhões de parâmetros) são sempre mais fáceis de interpretar do que modelos simples como árvores de decisão
B) Geralmente existe um trade-off: modelos mais simples (árvores de decisão, regressão linear) tendem a ser mais interpretáveis, enquanto modelos mais complexos (deep learning) tendem a ser mais precisos, porém mais "caixa-preta"
C) Interpretabilidade não tem nenhuma relação com a complexidade do modelo
D) Todos os modelos de IA são igualmente interpretáveis, independentemente da arquitetura

**Resposta correta:** B

**Por que está correta:** Existe um trade-off amplamente reconhecido entre interpretabilidade e desempenho: modelos simples (árvores de decisão curtas, regressão linear) são naturalmente mais fáceis de explicar, enquanto modelos complexos como redes neurais profundas frequentemente atingem maior precisão à custa de serem mais difíceis de interpretar diretamente (exigindo técnicas de explicabilidade pós-hoc, como as fornecidas pelo SageMaker Clarify).

**Por que as outras estão erradas:**
- A) Inverte a relação real: modelos mais complexos são tipicamente mais difíceis (não mais fáceis) de interpretar diretamente.
- C) Existe sim uma relação bem documentada entre complexidade da arquitetura e dificuldade de interpretação direta do modelo.
- D) Modelos diferem significativamente em interpretabilidade — uma árvore de decisão rasa é objetivamente mais fácil de interpretar que uma rede neural profunda com milhões de parâmetros.

---

## Questão 15 (Selecione DUAS respostas)

Uma empresa de tecnologia está definindo sua política interna de "IA responsável" para o uso de modelos de fundação em produtos voltados ao consumidor. Quais DUAS práticas refletem diretamente os princípios de IA responsável amplamente reconhecidos pela indústria e pela AWS?

A) Testar o modelo quanto a vieses e riscos de segurança antes do lançamento, e continuar monitorando após o deploy
B) Lançar o produto o mais rápido possível, sem qualquer teste de segurança de conteúdo, para ganhar vantagem competitiva
C) Documentar as limitações conhecidas do modelo e comunicá-las de forma transparente aos usuários finais
D) Nunca revisar ou atualizar o modelo após o primeiro lançamento, independentemente de novos riscos identificados
E) Restringir o acesso à documentação do modelo apenas à equipe de marketing

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Testes pré-lançamento de viés e segurança, seguidos de monitoramento contínuo, são práticas centrais recomendadas para IA responsável, permitindo identificar e corrigir problemas antes e depois do deploy.
- C) Documentar e comunicar limitações de forma transparente (como em um model card) constrói confiança e permite que usuários usem o sistema de forma informada e segura.

**Por que as outras estão erradas:**
- B) Pular testes de segurança para lançar mais rápido é uma prática de alto risco, diretamente contrária aos princípios de IA responsável.
- D) Nunca reavaliar o modelo ignora que riscos podem ser descobertos após o lançamento (novos vieses, vulnerabilidades, mudanças no uso); monitoramento contínuo é a prática recomendada.
- E) Restringir documentação técnica/ética apenas ao marketing vai contra o princípio de transparência, que deve alcançar equipes técnicas, de compliance e, quando apropriado, usuários finais.

---

## Questão 16

O que é "governança de IA" (AI governance), no contexto de uma organização que implanta múltiplos modelos de machine learning e IA generativa?

A) Apenas o processo de compra de licenças de software de IA
B) O conjunto de políticas, processos e controles organizacionais para gerenciar riscos, garantir conformidade e supervisionar o ciclo de vida de sistemas de IA de forma responsável
C) Exclusivamente a escolha da região AWS onde os modelos são hospedados
D) O processo de otimizar o custo de infraestrutura de GPU

**Resposta correta:** B

**Por que está correta:** Governança de IA abrange as políticas, papéis, processos de revisão, controles de risco e supervisão organizacional que garantem que sistemas de IA sejam desenvolvidos, implantados e monitorados de forma responsável, segura e em conformidade com regulamentações — indo muito além de uma única decisão técnica ou de compra.

**Por que as outras estão erradas:**
- A) Compra de licenças é apenas uma atividade administrativa pontual, não o conjunto abrangente de políticas e controles que definem governança.
- C) A escolha de região AWS é uma decisão técnica de infraestrutura/residência de dados, apenas um componente possível dentro de uma governança mais ampla, não a governança em si.
- D) Otimização de custo de GPU é uma preocupação financeira/operacional isolada, não o escopo completo de governança de IA.

---

## Questão 17

Uma empresa quer reduzir o impacto ambiental do treinamento de seus modelos de IA. Qual das alternativas é uma prática reconhecida para tornar o desenvolvimento de IA mais sustentável?

A) Sempre treinar modelos do zero, mesmo quando um modelo pré-treinado já atende à necessidade
B) Reaproveitar modelos de fundação pré-treinados (via fine-tuning ou RAG) em vez de treinar grandes modelos do zero sempre que possível, reduzindo o consumo computacional
C) Aumentar deliberadamente o número de vezes que o modelo é retreinado, sem necessidade
D) Ignorar completamente considerações de eficiência energética no design do sistema

**Resposta correta:** B

**Por que está correta:** Reaproveitar modelos de fundação já treinados (adaptando-os via fine-tuning eficiente ou RAG) evita o enorme custo computacional e energético de treinar grandes modelos do zero, sendo uma prática recomendada de sustentabilidade em IA, alinhada também a menor custo financeiro.

**Por que as outras estão erradas:**
- A) Treinar do zero desnecessariamente desperdiça recursos computacionais e energia, sendo o oposto de uma prática sustentável.
- C) Retreinar sem necessidade real aumenta o consumo de recursos sem benefício correspondente, contrariando o objetivo de sustentabilidade.
- D) Ignorar eficiência energética é diretamente contrário ao objetivo de reduzir impacto ambiental declarado no cenário.

---

## Questão 18

Em um sistema de IA generativa usado para gerar relatórios financeiros resumidos, qual prática ajuda a aumentar a "controlabilidade" (controllability) do sistema, garantindo que ele opere dentro de limites aceitáveis definidos pela empresa?

A) Não aplicar nenhum filtro ou restrição ao conteúdo gerado, confiando inteiramente no modelo
B) Configurar guardrails que restringem tópicos permitidos, formatos de saída e bloqueiam a geração de conteúdo fora do escopo definido pela empresa
C) Aumentar ao máximo a temperature para maximizar a criatividade das respostas
D) Remover qualquer limite de tokens da resposta gerada

**Resposta correta:** B

**Por que está correta:** Controlabilidade refere-se à capacidade de restringir e direcionar o comportamento de um sistema de IA dentro de limites definidos; configurar guardrails (bloqueio de tópicos, formatos de saída, filtros de conteúdo) é uma forma direta e prática de aumentar essa controlabilidade em uma aplicação de geração de relatórios.

**Por que as outras estão erradas:**
- A) Não aplicar nenhuma restrição reduz a controlabilidade do sistema, aumentando o risco de saídas fora do escopo desejado.
- C) Maximizar temperature aumenta a aleatoriedade/imprevisibilidade das respostas, o oposto de aumentar controle sobre o comportamento do sistema.
- D) Remover limites de tokens pode gerar respostas excessivamente longas e menos previsíveis, não contribuindo para maior controle sobre a saída.

---

## Questão 19

Qual é a diferença central entre "fairness" (equidade) e "privacidade" (privacy) como princípios de IA responsável?

A) São exatamente o mesmo conceito com nomes diferentes
B) Fairness trata de evitar tratamento discriminatório ou injusto entre grupos; privacidade trata de proteger dados pessoais e sensíveis de uso ou exposição indevida
C) Fairness só se aplica a modelos de visão computacional; privacidade só se aplica a modelos de texto
D) Privacidade é um subconjunto de fairness, sem nenhuma distinção prática entre eles

**Resposta correta:** B

**Por que está correta:** São princípios distintos e complementares: fairness foca em garantir que decisões/previsões do modelo não discriminem injustamente grupos específicos; privacidade foca em proteger informações pessoais/sensíveis dos indivíduos contra coleta, uso ou exposição inadequados, incluindo em dados de treinamento e nas saídas do modelo.

**Por que as outras estão erradas:**
- A) Embora relacionados dentro do guarda-chuva de IA responsável, são conceitos distintos com focos e mitigações diferentes (viés discriminatório vs. exposição de dados sensíveis).
- C) Ambos os princípios se aplicam a qualquer tipo de modelo (texto, imagem, tabular), não são restritos a uma única modalidade.
- D) Não há uma relação de subconjunto entre eles; um sistema pode ser justo mas violar privacidade (ou vice-versa) — são dimensões independentes a serem avaliadas separadamente.

---

## Questão 20

Uma equipe de IA quer usar dados de pacientes para treinar um modelo, mas antes de usá-los quer garantir que nenhuma informação de identificação pessoal (PII) sensível esteja presente sem o devido tratamento (anonimização/mascaramento). Essa preocupação está mais diretamente ligada a qual princípio de IA responsável?

A) Explicabilidade
B) Privacidade e proteção de dados
C) Eficiência de custo
D) Velocidade de inferência

**Resposta correta:** B

**Por que está correta:** Garantir que dados de treinamento não exponham informações de identificação pessoal sensível sem tratamento adequado é uma preocupação central de privacidade e proteção de dados, um dos pilares fundamentais de IA responsável, especialmente crítico em domínios sensíveis como saúde.

**Por que as outras estão erradas:**
- A) Explicabilidade trata de entender as decisões do modelo, não da proteção de dados pessoais usados no treinamento.
- C) Eficiência de custo é uma preocupação financeira/operacional, sem relação com proteção de dados sensíveis de pacientes.
- D) Velocidade de inferência é uma métrica de performance, sem relação com privacidade de dados de treinamento.

---

## 📊 Como Avaliar

- **18-20 corretas:** Excelente domínio de IA responsável — fairness, transparência, HITL e ferramentas de detecção de viés bem consolidados.
- **15-17 corretas:** Bom domínio; revise SageMaker Clarify e a diferença entre fairness e privacidade.
- **12-14 corretas:** Revisar conceitos de explicabilidade, robustez e controlabilidade.
- **< 12 corretas:** Retomar `dominio4-questoes-responsible-ai.md` e a seção de Domínio 4 do `guia-completo-estudo.md`.
