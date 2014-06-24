import System.Random

adivinhe x n = do
               if n==x
                   then putStrLn "Acertou!"
                   else if n<x
                        then do putStrLn $ "Ele é maior que "  ++ (show n)
                                n <- fmap read getLine                                
                                adivinhe x n
                   else do putStrLn $ "Ele é menor que " ++ (show n)
                           n <- fmap read getLine                                
                           adivinhe x n

main = do
  g <- getStdGen
  let x = head $ take 1 (randomRs (1,100) g :: [Int])
  adivinhe x 0
