
type Linha = [Float]
type Matriz = [Linha]

troca x a b
      | a > b = troca x b a
      | a == b = x
      | a < b = let
              (parte1, parte2) = splitAt a x -- parte2 eh da posicao a em diante
              (parte3, parte4) = splitAt (b-a-1) (tail parte2) -- ajusta o indice
              in parte1 ++ [x!!b] ++ parte3 ++ [x!!a] ++ (tail parte4)

-- reduz as linhas abaixo de r para a forma de Echelon
reduzLinha matriz r = let
                         -- pega a primeira linha, de r ate a ultima, que tem o elemento r diferente de zero
                         naozero = head $ filter (\x -> matriz !! x !! r /= 0) [r..length matriz - 1]
                         matrizS = troca matriz r naozero -- troca a linha r pela linha com elemento nao-nulo
                         linha = map (\x -> x / (matrizS!!r!!r)) (matrizS !! r) -- linha r normalizada
                         sublinha nr = let k = nr !! r       -- subtrai a linha pivot de uma linha abaixo dela, para a forma de Echelon
                                       in zipWith (\a b -> k*a - b) linha nr
                         linhasabaixo = map sublinha $ drop (r+1) matrizS -- drop (r+1) constroi a matriz de r+1 .. n

                      in take r matrizS ++ [linha] ++ linhasabaixo -- pega as r-1 linhas iniciais, concatena com a linha r normalizada e concatena o restante

-- aplica a ultima linha
ultimaLinha matriz = let
                        a = init matriz; linha = last matriz; k = last linha; nk = last (init linha)
                     in a ++ [init (init linha) ++ [1, k/nk]]

gauss :: Matriz-> Matriz
gauss matriz = ultimaLinha $ foldl reduzLinha matriz [0..length matriz-1] -- aplica a reducao de linha cumulativamente ate a ultima linha-1

--Retrosubstituicao
substituir :: Matriz -> Linha
substituir matriz = foldr proximo [last (last matriz)] (init matriz) where -- comecando da ultima linha e ultima coluna, pegando todo restante da matriz
 
  proximo linha solucao = let -- solucao eh as solucoes encontradas ate entao
                      parte = init $ drop (length matriz - length solucao) linha -- pega a parte apos o 1 dessa linha
                      novaSolucao = last linha - sum (zipWith (*) solucao parte) -- b - solucao*parte
                   in novaSolucao : solucao

main = do
         let echelon = gauss [ [1,2,-1,-4], [2,3,-1,-11], [-2,0,-3,22] ]
         putStrLn $ show echelon
         putStrLn $ show (substituir echelon)
