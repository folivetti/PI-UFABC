import Data.List.Split
import Data.List
import System.IO

main = do
        f <- openFile "lista.csv" ReadMode
        line <- hGetLine f
        let n = read line :: Int
        listaStr <- hGetLine f
        listaStr2 <- hGetLine f
        let lista = map read (splitOn ";" listaStr) :: [Float] 
        let positivo = [ x | x <- lista, x>0 ]
        let negativo = [ x | x <- lista, x<0 ]
        putStrLn $ show positivo
        putStrLn $ show negativo
