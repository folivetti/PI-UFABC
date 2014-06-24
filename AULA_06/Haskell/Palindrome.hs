import Data.Char

palindrome [] r = False 
palindrome (h:s) r = if (s==r) || (h:s == r) then True else palindrome s (h:r)

main = do
       line <- getLine
       putStrLn $ show (palindrome (map toUpper line) [])
