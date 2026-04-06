# 🚀 Reescritor de Textos com IA Groq

Um programa Java que reescreve textos usando múltiplos modos e inteligência artificial gratuita.

## ✨ Funcionalidades

- 🔧 **CORRIGIR** - Corrige erros gramaticais e abreviações
- 📝 **FORMAL** - Converte para linguagem profissional
- 💬 **INFORMAL** - Converte para linguagem casual
- 📌 **RESUMIR** - Resume o texto mantendo o essencial
- 📖 **EXPANDIR** - Expande com mais detalhes
- ✨ **CLARO** - Melhora a clareza e legibilidade
- 🤖 **Modo IA** - Usa a IA Groq para reescritas mais inteligentes

## ✅ Configuração Segura da API Groq

### Para usar a IA, configure a variável de ambiente:

**Windows (PowerShell):**
```powershell
$env:GROQ_API_KEY = "sua_chave_aqui"
java Main
```

**Windows (CMD):**
```cmd
set GROQ_API_KEY=sua_chave_aqui
java Main
```

**Linux/Mac (Bash):**
```bash
export GROQ_API_KEY=sua_chave_aqui
java Main
```

## 🔑 Como obter a chave Groq

1. Acesse https://console.groq.com/
2. Crie uma conta (gratuita)
3. Vá em "API Keys" e gere uma chave
4. Use a chave na variável de ambiente `GROQ_API_KEY`

## 🔧 Como Compilar

```bash
cd Rewriter
javac *.java
```

## ▶️ Como Executar

**Teste sem IA (local):**
```bash
java MainTeste
java DemoTeste
```

**Interface interativa com IA:**
```bash
# Configure a chave primeiro!
$env:GROQ_API_KEY = "sua_chave"
java Main
```

## 📝 Exemplo de Uso

```
Texto original: "vc tb vai pra reunião? pq eu num sei q hora é"

Corrigido (local):      "você também vai pra reunião? porque eu não sei que hora é"
Corrigido (com IA):     "você também vai para a reunião? porque eu não estou ciente do horário"
Formal (com IA):        "Você também participará da reunião? Porque eu não tenho ciência do horário"
```

## 🏗️ Arquitetura

- **Rewriter.java** - Interface base
- **RewriteMode.java** - Enum com 6 modos
- **RewriterFactory.java** - Factory Pattern
- **6 Rewriters** - Implementações
- **AIService.java** - API Groq (usa variável de ambiente)
- **AIRewriter.java** - Rewriter com IA + fallback
- **Main.java** - CLI interativa
- **MainTeste.java** - Teste unitário
- **DemoTeste.java** - Demonstração
- **TestIA.java** - Teste IA

## 🔒 Segurança

- ✅ Chave API **nunca** hardcoded no código-fonte
- ✅ Usa **variável de ambiente** `GROQ_API_KEY`
- ✅ Arquivos `.class` ignorados do git
- ✅ Seguro para repositórios públicos

## 📌 Notas

- Se `GROQ_API_KEY` não estiver definida, o programa usa "" e a IA não funcionará
- O fallback automático usa rewriter local sem IA
- Compilação: 0 erros, 1 warning (API deprecated - normal)
