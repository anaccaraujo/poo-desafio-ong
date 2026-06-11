# 🏥 POO - Sistema de Gestão de ONG

Projeto desenvolvido como desafio de **Programação Orientada a Objetos (POO)** em Java.

## 📚 Conceitos aplicados

| Conceito | Onde foi usado |
|---|---|
| **Encapsulamento** | Atributos `private` com Getters e Setters em `MembroONG` |
| **Herança** | `Voluntario` e `Doador` herdam de `MembroONG` |
| **Composição** | `ProjetoSocial` tem um `Voluntario` como líder |
| **Sobrescrita** | `@Override` do método `exibirResumo()` nas subclasses |

## 🗂️ Estrutura dos arquivos

```
poo-desafio-ong/
├── MembroONG.java       → Superclasse base
├── Voluntario.java      → Subclasse (herda MembroONG)
├── Doador.java          → Subclasse (herda MembroONG)
├── ProjetoSocial.java   → Composição com Voluntario
└── SistemaMain.java     → Classe principal (main)
```

## ▶️ Como executar

1. Abra a pasta no VS Code
2. Abra o arquivo `SistemaMain.java`
3. Clique em **Run** (ou pressione `F5`)
