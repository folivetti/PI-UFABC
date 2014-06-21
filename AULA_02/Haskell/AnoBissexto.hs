main = do
       putStrLn "Qual ano? "
       line <- getLine
       let ano = read line :: Int 
       let bis = ((ano `rem` 400) == 0) || ((ano `rem` 4) == 0) && ((ano `rem` 100) /= 0)
       putStrLn $ show bis 
