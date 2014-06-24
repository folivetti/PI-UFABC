import Data.Char
import Data.List

inverso [] r = r
inverso (h:s) r = inverso s (h:r)

pangram s = null $ ['A'..'Z'] \\ s  -- \\ é a diferença entre as listas

entropy s = sum . map lg' . fq' . map genericLength . group . sort $ s
          where lg' c = (c * ) . logBase 2 $ 1.0/c
                fq' c = map (\x -> x/(sum c)) c

main = do
       line <- getLine
       putStrLn $ show (inverso line [])
       let upLine = map toUpper line
       putStrLn $ show (pangram upLine)
       putStrLn $ show (entropy line)
