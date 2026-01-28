Como instalar o mod no servidor Hytale local (instruções genéricas):

- Compile o projeto com `./gradlew build` para gerar o JAR em `build/libs`.
- Copie o JAR para a pasta do servidor `base-server-att28-01/Server/mods/`.
- Reinicie o servidor. O `PluginManager` carregará JARs em `mods` e deverá invocar a classe `main` do `mod.json`.

Observações:
- O servidor oficial utiliza `PluginManager` interno. Se a versão do servidor requer um formato de manifesto diferente, substitua o `mod.json` pelo manifesto exigido.
- Eu adaptei o mod para expor uma interface mínima `HytalePlugin` com `onLoad()`, `onEnable()` e `onDisable()`; o carregador do servidor precisa invocar esses métodos.
