# Domínio 5: Segurança, Conformidade e Governança para Soluções de IA — Questões Estilo Prova Real

**Peso no exame:** 14% | **Formato:** cenários de negócio, incluindo questões "Selecione DUAS respostas"
**Tempo sugerido:** 20 minutos para 20 questões

Este arquivo complementa `dominio5-questoes-seguranca-governanca.md`. Aqui as questões têm contexto de negócio e cada alternativa — certa e errada — é explicada.

---

## Questão 1

Uma empresa quer garantir que apenas usuários e serviços especificamente autorizados possam invocar um modelo de fundação no Amazon Bedrock, seguindo o princípio de menor privilégio (least privilege). Qual serviço AWS é usado para definir e aplicar essas permissões granulares?

A) Amazon Macie
B) AWS IAM (Identity and Access Management)
C) Amazon CloudWatch
D) AWS KMS

**Resposta correta:** B

**Por que está correta:** AWS IAM é o serviço responsável por gerenciar identidades, usuários, papéis (roles) e políticas de permissão, permitindo definir exatamente quais principals podem invocar ações específicas (como `bedrock:InvokeModel`) em quais recursos, seguindo o princípio de menor privilégio.

**Por que as outras estão erradas:**
- A) Amazon Macie identifica e classifica dados sensíveis (PII) armazenados no S3; não gerencia permissões de acesso a serviços.
- C) Amazon CloudWatch é usado para monitoramento, métricas e logs operacionais; não define ou aplica políticas de controle de acesso.
- D) AWS KMS gerencia chaves de criptografia; controla acesso às chaves, mas não é o serviço central de gerenciamento de identidades e permissões de uso de serviços como o Bedrock.

---

## Questão 2

Uma empresa de saúde precisa garantir que os dados de pacientes armazenados no Amazon S3, usados para treinar um modelo de ML, estejam protegidos contra acesso não autorizado mesmo se o armazenamento físico subjacente for comprometido. Qual prática protege diretamente os dados "em repouso" (at rest)?

A) Usar apenas HTTPS para todas as chamadas de API
B) Criptografar os dados em repouso usando AWS KMS
C) Aumentar o número de réplicas do bucket S3
D) Reduzir o tamanho dos arquivos armazenados

**Resposta correta:** B

**Por que está correta:** Criptografia em repouso (at rest), tipicamente usando chaves gerenciadas pelo AWS KMS, garante que os dados armazenados permaneçam ilegíveis sem a chave de descriptografia apropriada, mesmo que o meio de armazenamento físico seja comprometido — a prática correta para proteger dados parados no S3.

**Por que as outras estão erradas:**
- A) HTTPS protege dados "em trânsito" (durante a transmissão pela rede), não os dados já armazenados (em repouso) no S3.
- C) Aumentar réplicas melhora durabilidade/disponibilidade dos dados, mas não impede acesso não autorizado a um conteúdo não criptografado.
- D) Reduzir o tamanho dos arquivos não tem relação alguma com proteção contra acesso não autorizado.

---

## Questão 3

Qual serviço AWS é usado especificamente para registrar e auditar todas as chamadas de API feitas na conta AWS — incluindo quem invocou um modelo do Bedrock, quando e de onde — para fins de conformidade e investigação de incidentes?

A) AWS CloudTrail
B) Amazon Rekognition
C) Amazon Polly
D) AWS Glue

**Resposta correta:** A

**Por que está correta:** AWS CloudTrail registra continuamente todas as chamadas de API feitas na conta (quem, quando, de onde, e qual ação), fornecendo uma trilha de auditoria essencial para investigações de segurança, conformidade regulatória e rastreamento de uso de serviços como o Bedrock.

**Por que as outras estão erradas:**
- B) Amazon Rekognition é um serviço de análise de imagem/vídeo, sem função de auditoria de chamadas de API.
- C) Amazon Polly converte texto em fala; não tem relação com registro de auditoria.
- D) AWS Glue é um serviço de ETL (extração, transformação e carga de dados); não é a ferramenta de auditoria de chamadas de API da AWS.

---

## Questão 4

Uma empresa de e-commerce armazena grandes volumes de dados de clientes no Amazon S3 e precisa identificar automaticamente arquivos que contenham informações de identificação pessoal (PII), como números de cartão de crédito ou CPF, para aplicar controles de proteção adicionais. Qual serviço AWS foi desenhado especificamente para essa descoberta automatizada de dados sensíveis?

A) Amazon Macie
B) AWS Trusted Advisor
C) Amazon Comprehend Medical
D) AWS Config

**Resposta correta:** A

**Por que está correta:** Amazon Macie usa machine learning e reconhecimento de padrões para descobrir, classificar e alertar automaticamente sobre dados sensíveis (como PII, números de cartão de crédito, CPF) armazenados em buckets S3, ajudando a aplicar controles de segurança e conformidade apropriados.

**Por que as outras estão erradas:**
- B) AWS Trusted Advisor fornece recomendações gerais de custo, segurança e performance da conta, mas não é especializado em descoberta de PII em dados armazenados.
- C) Amazon Comprehend Medical extrai entidades clínicas de texto médico não estruturado; não é a ferramenta padrão de descoberta de PII genérica em buckets S3.
- D) AWS Config avalia e monitora a conformidade de configurações de recursos AWS (não o conteúdo dos dados armazenados neles) em relação a regras definidas.

---

## Questão 5

Qual é a finalidade principal do AWS PrivateLink ao ser usado com o Amazon Bedrock em uma arquitetura de aplicação de IA generativa corporativa?

A) Aumentar a criatividade das respostas geradas pelo modelo
B) Permitir que o tráfego entre a VPC do cliente e o Bedrock ocorra pela rede privada da AWS, sem passar pela internet pública, aumentando a segurança de rede
C) Reduzir o custo por token de inferência do modelo
D) Melhorar a acurácia factual das respostas do modelo

**Resposta correta:** B

**Por que está correta:** AWS PrivateLink permite estabelecer conectividade privada entre uma VPC e serviços como o Amazon Bedrock através da rede interna da AWS, evitando exposição do tráfego à internet pública — uma prática de segurança de rede importante para empresas com requisitos rígidos de conformidade e proteção de dados.

**Por que as outras estão erradas:**
- A) PrivateLink é uma solução de conectividade de rede; não tem qualquer efeito sobre a criatividade ou comportamento do modelo em si.
- C) PrivateLink não altera o modelo de precificação por token do Bedrock; seu benefício é de segurança/rede, não de custo direto de inferência.
- D) PrivateLink não tem relação com a qualidade ou precisão factual das respostas geradas pelo modelo; atua na camada de rede.

---

## Questão 6

Uma empresa multinacional opera na União Europeia e precisa garantir que seu uso de IA generativa, incluindo o tratamento de dados pessoais de cidadãos europeus, esteja em conformidade com a regulamentação de proteção de dados aplicável. Qual regulamentação é essa?

A) HIPAA
B) GDPR (Regulamento Geral de Proteção de Dados)
C) SOC 2
D) PCI-DSS

**Resposta correta:** B

**Por que está correta:** GDPR (General Data Protection Regulation) é a regulamentação da União Europeia que rege a coleta, processamento e proteção de dados pessoais de cidadãos europeus, sendo diretamente aplicável a qualquer empresa (dentro ou fora da UE) que processe dados desses indivíduos, incluindo em sistemas de IA.

**Por que as outras estão erradas:**
- A) HIPAA é uma regulamentação dos EUA voltada especificamente para proteção de informações de saúde, não a regulamentação geral de dados pessoais da UE.
- C) SOC 2 é um padrão de auditoria de controles de segurança organizacional (principalmente usado por provedores de serviços), não uma regulamentação de proteção de dados pessoais como o GDPR.
- D) PCI-DSS é um padrão de segurança para dados de cartão de pagamento, não a regulamentação geral de proteção de dados pessoais da UE.

---

## Questão 7

Uma empresa da área de saúde nos EUA quer usar IA generativa para resumir prontuários eletrônicos de pacientes. Qual regulamentação dos EUA é a mais diretamente relevante para garantir a conformidade no tratamento dessas informações de saúde protegidas (PHI)?

A) GDPR
B) HIPAA (Health Insurance Portability and Accountability Act)
C) LGPD
D) ISO 9001

**Resposta correta:** B

**Por que está correta:** HIPAA é a legislação dos EUA que estabelece padrões para proteção de informações de saúde protegidas (PHI - Protected Health Information), sendo diretamente relevante para qualquer aplicação, incluindo de IA generativa, que processe prontuários e dados de saúde de pacientes americanos.

**Por que as outras estão erradas:**
- A) GDPR é a regulamentação de proteção de dados da União Europeia, não a legislação de saúde específica dos EUA.
- C) LGPD é a Lei Geral de Proteção de Dados do Brasil, não a regulamentação de saúde dos EUA.
- D) ISO 9001 é um padrão internacional de gestão de qualidade geral, não uma regulamentação específica de dados de saúde.

---

## Questão 8

Qual é a diferença central entre criptografia "em trânsito" (in transit) e "em repouso" (at rest) no contexto de segurança de dados em aplicações de IA?

A) São exatamente a mesma coisa, apenas com nomes diferentes
B) Criptografia em trânsito protege dados enquanto estão sendo transmitidos pela rede (ex.: via TLS/HTTPS); criptografia em repouso protege dados enquanto estão armazenados (ex.: em disco, S3, banco de dados)
C) Criptografia em trânsito só se aplica a imagens; em repouso só se aplica a texto
D) Criptografia em repouso é sempre opcional e nunca recomendada pela AWS

**Resposta correta:** B

**Por que está correta:** São duas camadas complementares de proteção: em trânsito protege dados durante a movimentação entre sistemas/pela rede (tipicamente via TLS/HTTPS), enquanto em repouso protege dados armazenados persistentemente (tipicamente via chaves gerenciadas pelo AWS KMS) — ambas recomendadas simultaneamente para proteção completa.

**Por que as outras estão erradas:**
- A) São conceitos distintos que protegem os dados em estados diferentes (em movimento vs. armazenados), não sinônimos.
- C) Ambos os tipos de criptografia se aplicam a qualquer tipo de dado (texto, imagem, tabular), independentemente do formato.
- D) A AWS recomenda ativamente criptografia em repouso como boa prática de segurança padrão, especialmente para dados sensíveis; não é considerada opcional em contextos regulados.

---

## Questão 9

Uma empresa de tecnologia financeira (fintech) quer demonstrar a clientes corporativos que seus controles internos de segurança, disponibilidade e confidencialidade — incluindo os relacionados a sistemas de IA — foram auditados de forma independente. Qual tipo de relatório de conformidade é comumente solicitado nesse contexto?

A) Relatório SOC 2 (System and Organization Controls)
B) Um simples e-mail interno de aprovação
C) Um post em rede social da empresa
D) O código-fonte completo do sistema, sem qualquer relatório formal

**Resposta correta:** A

**Por que está correta:** Relatórios SOC 2 são auditorias independentes amplamente reconhecidas que avaliam os controles de uma organização relacionados a segurança, disponibilidade, integridade de processamento, confidencialidade e privacidade — comumente exigidos por clientes corporativos (especialmente no setor financeiro) como evidência formal de práticas de segurança robustas.

**Por que as outras estão erradas:**
- B) Um e-mail interno não constitui uma auditoria formal e independente, não atendendo aos requisitos de conformidade corporativa esperados por clientes.
- C) Publicações em redes sociais não têm qualquer valor como evidência formal de auditoria de segurança.
- D) Compartilhar código-fonte não substitui uma auditoria formal de controles organizacionais e processos, além de apresentar riscos de segurança próprios.

---

## Questão 10 (Selecione DUAS respostas)

Uma empresa está implementando controles de segurança para uma aplicação de IA generativa que processa dados sensíveis de clientes. Quais DUAS práticas ajudam a proteger esses dados de acordo com as boas práticas de segurança da AWS?

A) Aplicar o princípio de menor privilégio usando políticas IAM granulares para controlar quem pode acessar os dados e invocar os modelos
B) Armazenar as credenciais de acesso (chaves de API) diretamente no código-fonte da aplicação, em texto simples
C) Criptografar os dados sensíveis tanto em trânsito (TLS) quanto em repouso (KMS)
D) Conceder permissões de administrador total (`*:*`) a todos os desenvolvedores para simplificar o desenvolvimento
E) Desativar todos os logs de auditoria para reduzir custos de armazenamento

**Resposta correta:** A e C

**Por que estão corretas:**
- A) O princípio de menor privilégio, aplicado via políticas IAM granulares, garante que cada usuário/serviço tenha apenas o acesso estritamente necessário, reduzindo a superfície de ataque.
- C) Criptografar dados tanto em trânsito quanto em repouso é uma prática fundamental de defesa em profundidade para proteger dados sensíveis em qualquer estado.

**Por que as outras estão erradas:**
- B) Armazenar credenciais em texto simples no código-fonte é uma vulnerabilidade grave e amplamente reconhecida (deveriam usar serviços como AWS Secrets Manager ou variáveis de ambiente seguras).
- D) Conceder permissões de administrador total a todos viola diretamente o princípio de menor privilégio, aumentando drasticamente o risco de uso indevido ou comprometimento.
- E) Desativar logs de auditoria elimina a capacidade de detectar e investigar incidentes de segurança, sendo uma prática de alto risco e contrária à conformidade regulatória.

---

## Questão 11

O que representa o "AWS Shared Responsibility Model" (Modelo de Responsabilidade Compartilhada) no contexto de segurança de aplicações de IA construídas sobre serviços como o Amazon Bedrock?

A) A AWS é totalmente responsável por toda a segurança, incluindo a configuração de permissões IAM feitas pelo cliente
B) A AWS é responsável pela segurança "da nuvem" (infraestrutura subjacente, hardware, isolamento de rede dos serviços gerenciados), enquanto o cliente é responsável pela segurança "na nuvem" (configuração de IAM, dados, criptografia aplicada, guardrails configurados)
C) O cliente é totalmente responsável por toda a segurança, incluindo a infraestrutura física dos data centers da AWS
D) Não existe divisão de responsabilidade; a AWS e o cliente compartilham exatamente as mesmas tarefas de forma idêntica

**Resposta correta:** B

**Por que está correta:** O Shared Responsibility Model divide claramente as responsabilidades: a AWS protege a infraestrutura física, hardware, rede e o isolamento dos serviços gerenciados ("segurança da nuvem"), enquanto o cliente é responsável por configurar corretamente permissões, proteger seus dados, ativar criptografia adequada e configurar controles como guardrails ("segurança na nuvem").

**Por que as outras estão erradas:**
- A) A AWS não assume responsabilidade por erros de configuração feitos pelo cliente, como políticas IAM mal configuradas — essa é uma responsabilidade do cliente.
- C) O cliente não é responsável pela infraestrutura física dos data centers da AWS; essa responsabilidade pertence à própria AWS.
- D) As responsabilidades são divididas de forma específica e diferenciada, não são idênticas nem compartilhadas de forma indistinta entre AWS e cliente.

---

## Questão 12

Uma empresa quer implementar um registro centralizado e versionado de todos os modelos de ML treinados, incluindo metadados como versão, métricas de avaliação e status de aprovação para produção, como parte de sua governança de ML. Qual recurso do Amazon SageMaker atende a essa necessidade?

A) SageMaker Model Registry
B) SageMaker Ground Truth
C) SageMaker Data Wrangler
D) SageMaker Studio Lab

**Resposta correta:** A

**Por que está correta:** SageMaker Model Registry é o recurso específico para catalogar, versionar e gerenciar o ciclo de vida de modelos de ML, incluindo metadados, métricas de avaliação e status de aprovação, sendo uma peça central de governança de modelos em produção.

**Por que as outras estão erradas:**
- B) SageMaker Ground Truth é usado para rotulagem de dados de treinamento, não para registro e versionamento de modelos.
- C) SageMaker Data Wrangler é uma ferramenta de preparação e transformação visual de dados, não um catálogo de modelos.
- D) SageMaker Studio Lab é um ambiente de notebook gratuito para experimentação de ML, sem funcionalidade de registro/governança de modelos.

---

## Questão 13

Uma empresa de varejo online quer garantir que apenas tráfego legítimo alcance sua aplicação web que expõe uma API pública consumindo um modelo de fundação no backend, protegendo-a contra ataques comuns como SQL injection e bots maliciosos na camada de aplicação web. Qual serviço AWS é mais indicado para essa proteção?

A) AWS WAF (Web Application Firewall)
B) Amazon Bedrock Guardrails
C) Amazon Macie
D) AWS Config

**Resposta correta:** A

**Por que está correta:** AWS WAF protege aplicações web contra explorações comuns na camada de aplicação, como SQL injection, cross-site scripting (XSS) e tráfego de bots maliciosos, sendo o serviço apropriado para proteger a camada de API/web que expõe a aplicação de IA generativa, complementando (não substituindo) os guardrails de conteúdo do modelo.

**Por que as outras estão erradas:**
- B) Bedrock Guardrails protege contra conteúdo indesejado gerado ou recebido pelo modelo (toxicidade, tópicos bloqueados), não contra ataques de infraestrutura web como SQL injection.
- C) Amazon Macie identifica dados sensíveis armazenados no S3; não protege contra ataques na camada de aplicação web.
- D) AWS Config avalia conformidade de configuração de recursos AWS; não é um firewall de aplicação web.

---

## Questão 14

Qual das seguintes é uma preocupação de segurança específica e amplamente discutida em aplicações de IA generativa, na qual um usuário mal-intencionado tenta manipular o modelo através do próprio texto de entrada para ignorar suas instruções originais ou guardrails configurados?

A) Overfitting
B) Prompt injection
C) Data leakage durante o treinamento
D) Underfitting

**Resposta correta:** B

**Por que está correta:** Prompt injection é um ataque específico de aplicações baseadas em LLM em que um usuário insere instruções maliciosas no prompt (diretamente ou embutidas em dados/documentos processados) tentando fazer o modelo ignorar suas instruções originais, revelar informações confidenciais ou contornar guardrails configurados.

**Por que as outras estão erradas:**
- A) Overfitting é um problema de generalização de modelos preditivos durante o treinamento, sem relação com manipulação maliciosa de prompts em tempo de inferência.
- C) Data leakage refere-se a vazamento de dados de teste para o treinamento (afetando avaliação de métricas), um conceito diferente de manipulação de entrada por um usuário malicioso.
- D) Underfitting é um problema de modelo simples demais para capturar padrões dos dados, sem relação com ataques de manipulação de prompt.

---

## Questão 15

Uma empresa de tecnologia quer restringir o acesso a um modelo de fundação no Bedrock de forma que apenas aplicações rodando dentro de uma VPC específica da empresa, sem exposição à internet pública, possam invocá-lo. Além do AWS PrivateLink, qual controle de rede adicional reforça esse isolamento?

A) Security Groups e Network ACLs configurados na VPC para restringir tráfego de entrada/saída
B) Aumentar o valor de temperature do modelo
C) Reduzir o número de guardrails configurados
D) Desativar a criptografia em trânsito para simplificar a configuração

**Resposta correta:** A

**Por que está correta:** Security Groups (controle de acesso em nível de instância/interface) e Network ACLs (controle em nível de sub-rede) são mecanismos padrão de rede da AWS para restringir precisamente quais origens/destinos de tráfego são permitidos dentro de uma VPC, complementando o PrivateLink para reforçar o isolamento de rede de uma aplicação que acessa o Bedrock.

**Por que as outras estão erradas:**
- B) Temperature é um parâmetro de geração de texto do modelo, sem qualquer relação com controles de rede ou isolamento de acesso.
- C) Reduzir guardrails diminuiria a segurança de conteúdo, e não tem relação com controles de rede/isolamento de VPC.
- D) Desativar criptografia em trânsito reduziria a segurança geral da solução, sendo o oposto de uma prática recomendada.

---

## Questão 16

Qual é o papel do AWS Config em uma estratégia de governança de recursos usados por aplicações de IA na AWS?

A) Treinar modelos de machine learning automaticamente
B) Avaliar continuamente se as configurações dos recursos AWS (como buckets S3, roles IAM, endpoints do Bedrock) estão em conformidade com regras definidas pela empresa, alertando sobre desvios
C) Traduzir texto entre diferentes idiomas
D) Gerar embeddings de documentos para uso em RAG

**Resposta correta:** B

**Por que está correta:** AWS Config monitora continuamente as configurações dos recursos AWS e as avalia contra regras de conformidade definidas (ex.: "todo bucket S3 deve ter criptografia habilitada"), alertando sobre desvios — uma ferramenta central para governança e auditoria contínua de configuração de infraestrutura, incluindo a usada por aplicações de IA.

**Por que as outras estão erradas:**
- A) AWS Config não treina modelos de ML; essa é uma função de serviços como SageMaker.
- C) Tradução de idiomas é função do Amazon Translate, sem relação com AWS Config.
- D) Geração de embeddings é realizada por modelos de embedding (via Bedrock, por exemplo), não pelo AWS Config, que é uma ferramenta de conformidade de configuração.

---

## Questão 17

Uma empresa quer garantir que, mesmo que uma chave de API de um desenvolvedor seja comprometida, o dano potencial seja limitado, pois essa chave só tem permissão para invocar um modelo específico do Bedrock em modo de leitura de resultados, sem poder alterar configurações de segurança ou acessar outros recursos da conta. Esse design reflete qual princípio de segurança?

A) Princípio de menor privilégio (least privilege)
B) Princípio de máxima permissividade
C) Criptografia de ponta a ponta
D) Redundância geográfica

**Resposta correta:** A

**Por que está correta:** O princípio de menor privilégio estabelece que cada identidade (usuário, aplicação, chave) deve ter apenas as permissões mínimas necessárias para realizar sua função — nesse caso, apenas invocar um modelo específico, sem acesso a outras ações ou recursos — limitando o dano potencial em caso de comprometimento das credenciais.

**Por que as outras estão erradas:**
- B) "Máxima permissividade" não é um princípio de segurança reconhecido; é o oposto do que se busca em segurança, aumentando (não limitando) o risco em caso de comprometimento.
- C) Criptografia de ponta a ponta protege a confidencialidade dos dados em trânsito, mas não é o conceito relacionado a restringir permissões de uma credencial.
- D) Redundância geográfica refere-se à disponibilidade e recuperação de desastres, sem relação com controle de permissões de acesso.

---

## Questão 18 (Selecione DUAS respostas)

Uma equipe de governança está definindo controles para o uso de IA generativa em uma empresa regulada pelo setor financeiro. Quais DUAS ações refletem boas práticas de governança e conformidade para essa organização?

A) Manter um inventário centralizado (como SageMaker Model Registry) de todos os modelos em uso, incluindo status de aprovação e versão
B) Permitir que qualquer funcionário implante modelos em produção sem qualquer processo de revisão ou aprovação
C) Habilitar AWS CloudTrail para manter uma trilha de auditoria de todas as chamadas de API relacionadas aos modelos de IA
D) Evitar documentar quais dados foram usados para treinar ou ajustar os modelos, para simplificar o processo
E) Usar as mesmas credenciais de administrador para todos os sistemas, incluindo os de IA, para reduzir a complexidade de gestão de acessos

**Resposta correta:** A e C

**Por que estão corretas:**
- A) Um inventário centralizado e versionado de modelos é uma prática essencial de governança, permitindo rastrear o que está em produção, seu status de aprovação e histórico de mudanças — especialmente crítico em setores regulados.
- C) Habilitar CloudTrail garante uma trilha de auditoria completa das ações relacionadas aos sistemas de IA, um requisito comum em auditorias de conformidade no setor financeiro.

**Por que as outras estão erradas:**
- B) Permitir deploys sem revisão/aprovação é uma falha grave de governança, especialmente em setores regulados que exigem controles de mudança rigorosos.
- D) Não documentar a proveniência dos dados de treinamento viola princípios de transparência e dificulta auditorias de conformidade e investigação de vieses.
- E) Usar credenciais compartilhadas de administrador viola o princípio de menor privilégio e elimina a rastreabilidade individual de ações, sendo uma prática de segurança inadequada especialmente em ambientes regulados.

---

## Questão 19

Qual é a finalidade de um "AWS AI Service Card" (cartão de serviço de IA da AWS) publicado para serviços como Amazon Rekognition ou modelos disponíveis no Bedrock?

A) Fornecer o preço detalhado de cada chamada de API em tempo real
B) Documentar de forma transparente o propósito pretendido, limitações conhecidas, considerações de design responsável e casos de uso recomendados/não recomendados de um serviço de IA da AWS
C) Servir como um cartão de crédito virtual para pagar pelo uso do serviço
D) Substituir completamente a necessidade de testes internos da empresa antes de usar o serviço

**Resposta correta:** B

**Por que está correta:** AWS AI Service Cards são documentos de transparência publicados pela AWS para determinados serviços de IA/ML, descrevendo o propósito pretendido, limitações conhecidas, considerações de IA responsável e diretrizes de uso apropriado — ajudando clientes a tomar decisões informadas sobre onde e como usar o serviço com segurança.

**Por que as outras estão erradas:**
- A) Informações de preço são disponibilizadas na página de precificação do serviço, não no AI Service Card, cujo foco é transparência sobre comportamento e limitações.
- C) Não tem qualquer relação com métodos de pagamento; é um documento informativo, não uma ferramenta financeira.
- D) Os AI Service Cards complementam, mas não substituem, a responsabilidade da empresa de testar e validar o serviço para seu caso de uso específico antes do uso em produção.

---

## Questão 20

Uma empresa brasileira que processa dados pessoais de clientes em uma aplicação de IA generativa precisa estar em conformidade com qual legislação brasileira de proteção de dados?

A) GDPR
B) LGPD (Lei Geral de Proteção de Dados)
C) HIPAA
D) CCPA

**Resposta correta:** B

**Por que está correta:** A LGPD é a legislação brasileira que rege a coleta, tratamento e proteção de dados pessoais no Brasil, sendo diretamente aplicável a qualquer empresa que processe dados pessoais de residentes brasileiros, incluindo em sistemas de IA generativa.

**Por que as outras estão erradas:**
- A) GDPR é a regulamentação de proteção de dados da União Europeia, aplicável a dados de cidadãos europeus, não a legislação brasileira.
- C) HIPAA é a legislação de proteção de informações de saúde dos EUA, não a legislação geral de dados pessoais do Brasil.
- D) CCPA (California Consumer Privacy Act) é a legislação de privacidade de dados do estado da Califórnia, EUA, não a legislação brasileira.

---

## 📊 Como Avaliar

- **18-20 corretas:** Excelente domínio de segurança e governança de IA — IAM, criptografia, auditoria e conformidade bem consolidados.
- **15-17 corretas:** Bom domínio; revise a diferença entre GDPR, HIPAA e LGPD, e o Shared Responsibility Model.
- **12-14 corretas:** Revisar CloudTrail, Macie, Config e princípio de menor privilégio.
- **< 12 corretas:** Retomar `dominio5-questoes-seguranca-governanca.md` e a seção de Domínio 5 do `guia-completo-estudo.md`.
