from random import randint

markovChain = {}

def adicionaPalavras( sentenca ):
    palavras = sentenca.split()
    tamanho = len(palavras)
    for i,palavra in enumerate(palavras):

        if i==0:
            markovChain["_inicio"].append(palavra)
            if i!= tamanho-1:
                if palavra not in markovChain:
                    markovChain[palavra]=[]
                markovChain[palavra].append(palavras[i+1])
        if i == tamanho-1:
            markovChain["_fim"].append(palavra)

        if 0 < i < tamanho-1:
            if palavra not in markovChain:
                markovChain[palavra]=[]
            markovChain[palavra].append(palavras[i+1])

def geraSentenca( ):
    novaFrase = []
    listaPalavras = markovChain["_inicio"]
    proxima = listaPalavras[randint(0,len(listaPalavras)-1)]
    novaFrase.append(proxima)

    while proxima in markovChain and (len(novaFrase)<5 or proxima not in markovChain["_fim"]):
        listaPalavras = markovChain[proxima]
        proxima = listaPalavras[randint(0,len(listaPalavras)-1)]
        novaFrase.append(proxima)
    print ' '.join(novaFrase)

markovChain["_inicio"]=[]
markovChain["_fim"]=[]

f = open("texto.txt")
for l in f:
    adicionaPalavras(l)
geraSentenca()
