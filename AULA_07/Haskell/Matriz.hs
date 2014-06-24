import Data.List.Split
import Data.List
import System.IO

somaMatriz m1 m2 = zipWith (\a b -> zipWith (+) a b) m1 m2

transposta :: [[a]] -> [[a]]
transposta ([]:_) = []
transposta x = (map head x) : transposta (map tail x)

prodExt v1 v2 = map (\x -> map (\y -> x*y) v2) v1

main = do
        --f <- openFile "matriz1.csv" ReadMode
        --linhas <- hGetContents f
        linhas1 <- readFile "matriz1.csv"
        linhas2 <- readFile "matriz2.csv"
        linhas3 <- readFile "vetor1.csv"
        linhas4 <- readFile "vetor2.csv"
        let matrizStr x = map (splitOn ";") (lines x)
            matriz1 = map (map read) (matrizStr linhas1) :: [[Int]]
            matriz2 = map (map read) (matrizStr linhas2) :: [[Int]]
            vetor1  = map read (splitOn ";" linhas3) :: [Int]
            vetor2  = map read (splitOn ";" linhas4) :: [Int]
        putStrLn $ show matriz1
        putStrLn $ show matriz2
        putStrLn $ show vetor1 
        putStrLn $ show vetor2
        let matriz3 = somaMatriz matriz1 matriz2
            matrizT = transpose matriz1
            matriz4 = prodExt vetor1 vetor2
        putStrLn $ show matriz3
        putStrLn $ show matrizT
        putStrLn $ show matriz4
