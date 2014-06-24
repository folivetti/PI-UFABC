somadig :: Int -> Int -> Int
somadig 0 soma = soma
somadig n soma = somadig (n `div` 10) (soma + (n `rem` 10))

main = do
       n <- fmap read getLine
       putStrLn $ show (somadig n 0)
