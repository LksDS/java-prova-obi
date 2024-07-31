# Projeto Jogo da Vida de Conway

Um código da fase local da OBI (Olímpiada Brasileira de Informática), onde recria o esquema do jogo da vida de Conway, onde há uma tabela formada por células, e a cada passo, as células, baseado nas células adjacentes, se modificam, passando a ser vivas ou mortas.

## Regras
• se uma célula morta possui exatamente três vizinhas vivas, ela vira uma célula viva;
• se uma célula morta possui uma quantidade de vizinhas vivas diferente de três, ela continua
morta;
• se uma célula viva possui duas ou três vizinhas vivas, ela continua viva;
• se uma célula viva possui menos que duas vizinhas vivas, ela morre;
• se uma célula viva possui mais que três vizinhas vivas, ela morre.

## Entrada
A primeira linha contém dois números inteiros, N e Q, representando, respectivamente, o número
de linhas/colunas da matriz e o número de passos a serem simulados.
As próximas N linhas contém N caracteres cada. O j-ésimo caractere da i-ésima linha representa
o estado inicial da célula na linha i e coluna j. Caso o caractere seja ‘0’, a célula naquela posição
inicia o jogo morta; caso o caractere seja ‘1’, a célula inicia o jogo viva.
