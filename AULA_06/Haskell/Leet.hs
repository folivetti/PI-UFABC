import Data.Char

leet c
    | c=='A' = '4'
    | c=='C' = '('
    | c=='E' = '3'
    | c=='G' = '6'
    | c=='H' = '#'
    | c=='I' = '!'
    | c=='O' = '0'
    | c=='S' = '5'
    | c=='T' = '7'
    | c=='X' = '%'
    | otherwise = c

main = do
       line <- getLine
       putStrLn $ map leet (map toUpper line)
