# 🚀 Projeto de automação de testes para simular a compra de passagem no site BlazeDemo (https://www.blazedemo.com)

## 🛠️ Tecnologias utilizadas:
* ☕ **Java**
* 🚗 **Selenium WebDriver**
* ✅ **JUnit**
* 🔄 **Hamcrest**
* 🌐 **ChromeDriver**

## 💻 Configurações de ambiente:
- Instalação de dependências no `pom.xml`.
- Utilização do Selenium WebDriver para controlar o navegador Chrome.
- Maximização da janela do navegador.

## 🛒 Automação do fluxo de compra:
- Seleção de origem e destino nos menus suspensos (Dropdown).
- Navegação entre páginas.
- Preenchimento de formulário com dados (FAKE).
- Validação de mensagens e elementos.

## ✅ Uso do JUnit para testes:
- Uso de asserções (`assertEquals`) para validação dos dados.
- Organização do código com anotações `@BeforeEach`, `@AfterEach` e `@Test`.

## 🔍 Localização de elementos:
- Utilização de diferentes métodos de localização de elementos na página (`By.xpath`, `By.cssSelector`, `By.id`).

## 📈 Conclusão:
Ao escrever meu primeiro código de automação de testes, utilizei JUnit e Selenium para criar um teste simples, automatizando interações com o site. Preenchendo formulários e validando mensagens com `assertEquals`, consegui entender mais profundamente como os testes automatizados funcionam e uma visão clara de como interagir com os elementos do DOM.
