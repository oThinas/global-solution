import os

def linha():
  print("-" * 50)

def cls():
    os.system('cls' if os.name=='nt' else 'clear')

# now, to clear the screen
cls()

# 0 - Falta de toner | 1 -  Necessita de limpeza | 2 - Troca de cabo ou conector |  3 - Quebrada ou inutilizada 
problemas = [0, 0, 0, 0]
porcentagem = [0.0, 0.0, 0.0, 0.0]
nomeProblemas = [
  "Falta de toner", "Necessita de limpeza", "Troca de cabo ou conectar", "Quebrada ou inutilizada"
]

problemasTotal = 0
op = 1

while op != 0:
  print("Caso nenhuma impressora esteja com problema, digite 0")
  
  # Delimita as opções
  while True:
    op = int(input("1 - Falta de toner | 2 -  Necessita de limpeza | 3 - Troca de cabo ou conector |  4 - Quebrada ou inutilizada | 0 - Sair\n"))
    if op in range(5):
      break
    cls()
    print("Digite uma opção válida")
    linha()
    
  if op == 0:
    cls()
    linha()
    print("Encerrando programa...\n")
    break
  
  elif op == 1:
    problemas[0] += 1
    
  elif op == 2:
    problemas[1] += 1
  
  elif op == 3:
    problemas[2] += 1
    
  elif op == 4:
    problemas[3] += 1
    
  if op in range(5):
    problemasTotal += 1
    cls()
    print("Impressora cadastrada")
    linha()

# Encerrou o programa
if op == 0:
  exit()

for x in range(len(problemas)):
  porcentagem[x] = (100 * problemas[x]) / problemasTotal
  
maior = problemas[0]

for x in range(len(problemas)):
  if problemas[x] >= maior:
    maior = porcentagem[x]
    maiorIndex = x

espacoNumero = len("3 - Troca de cabo ou conectar ")
espaco = " " * (espacoNumero - len("Situação"))

print("Quantidade de impressoras:", problemasTotal)
print(f"Situação{espaco}  Quantidade   Percentual")

for x in range(len(problemas)):
  espacoNumero = len("3 - Troca de cabo ou conectar ")
  espaco = " " * (espacoNumero - len(f"1 - {nomeProblemas[x]})"))
  print(f'{x + 1} - {nomeProblemas[x]}{espaco}       {problemas[x]}           {round(porcentagem[x])}%')

print(f'\nMaior ocorrência: {nomeProblemas[maiorIndex]} ocorrendo {problemas[maiorIndex]} vezes')
linha()
