import Data.List.Split
import Data.List
import System.IO

transposta :: [[a]] -> [[a]]
transposta ([]:_) = []
transposta x = (map head x) : transposta (map tail x)

maior [x,y,z]  
     | (x>=y) && (x>=z) = x
     | (y>=x) && (y>=z) = y
     | otherwise = z

argmax t = do
           let (x,y) = foldl (\ (x,i) (y,j) -> if x>y then (x,i) else (y,j) ) (-1,-1) (zip t [0..6])
           y+1

maiorCaloria t = argmax $ map maior t

acimaMedia t medias = map ( filter (\(x,y) -> y>x) ) (map (zip medias) t)

main = do
        linhas1 <- readFile "calorias.csv"
        let matrizStr x = map (splitOn ";") (lines x)
            calorias = map (map read) (matrizStr linhas1) :: [[Float]]
            mediaPeriodo = map (foldl (\acc x -> acc + x/7.0) 0) calorias
            mediaDia = map (foldl (\acc x -> acc + x/3.0) 0) (transposta calorias)
            tabela = zipWith (\x y -> x ++ [y]) calorias mediaPeriodo
            tabelaStr = zipWith (:) ["Manhã","Tarde","Noite"] (map (map show) tabela)
            acima = acimaMedia (transposta tabela) mediaPeriodo
        putStrLn "\tSeg.\tTer.\tQua.\tQui.\tSex.\tSab.\tDom.\tMedia"
        putStrLn $ (unlines (map (intercalate "\t") tabelaStr))
        putStrLn $ "\t" ++ (intercalate "\t" (map show mediaDia))
        putStrLn $ "Dia de maior caloria: " ++ (show (maiorCaloria (transposta tabela)))
        --putStrLn $ show (acimaMedia (transposta tabela) mediaPeriodo)
        let texto = filter (\(x,y) -> not (null x)) (zip (map (\t -> if null t then "" else " acima da média" ) acima) [1..7])
        putStrLn $ unlines (map (\(x,y) -> "Dia " ++ (show y) ++ x) texto)
