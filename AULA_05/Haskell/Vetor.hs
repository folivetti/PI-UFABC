import Data.List.Split
import Data.List
import System.IO

maior (v,i,j) (h:[]) = if h>v then (h,j) else (v,i)
maior (v,-1,0) (h:x) = maior (h,0,1) x
maior (v,i,j) (h:x) = if h > v then maior (h,j,j+1) x else maior (v,i,j+1) x

menor (v,i,j) (h:[]) = if h<v then (h,j) else (v,i)
menor (v,-1,0) (h:x) = menor (h,0,1) x
menor (v,i,j) (h:x) = if h < v then menor (h,j,j+1) x else menor (v,i,j+1) x

busca (v,i) (h:[]) = if v==h then (v,i) else (v,-1)
busca (v,0) (h:x) = if v==h then (v,0) else busca (v,1) x
busca (v,i) (h:x) = if v==h then (v,i) else busca (v,i+1) x

main = do
        f <- openFile "lista.csv" ReadMode
        line <- hGetLine f
        let n = read line :: Int
        listaStr <- hGetLine f
        listaStr2 <- hGetLine f
        let lista = map read (splitOn ";" listaStr) :: [Float] 
        putStrLn $ show lista
        let media = ((sum lista) / (genericLength lista))
        let var = (sum (map (\x -> (x-media)**2) lista)) / (genericLength lista)
        let desvpad = sqrt var
        putStrLn $ (show media) ++ " " ++ (show var) ++ " " ++ (show desvpad)
        let x = maior (0,-1,0) lista
        putStrLn $ "maior = " ++ (show x)
        let x = menor (0,-1,0) lista
        putStrLn $ "menor = " ++ (show x)
        n <- fmap read getLine :: IO Float
        let x = busca (n,0) lista
        putStrLn $ "elemento = " ++ (show x)
