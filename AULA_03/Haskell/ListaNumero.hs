concatena :: (Show a) => [a] -> String
concatena (h:[]) = show h 
concatena (h:x) = (show h) ++ ", " ++ (concatena x)

main = do
      putStrLn "N = "
      line <- getLine
      let n = read line
      let lista = [show x | x <- [1..n] ]
      let s = concatena lista
      putStrLn s
