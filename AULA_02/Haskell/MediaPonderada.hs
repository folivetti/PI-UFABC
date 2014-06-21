main = do
       putStrLn "Entre com x e y e w: "
       line <- getLine
       let x = read line
       line <- getLine
       let y = read line 
       line <- getLine
       let w = read line
       putStrLn $ "Média = " ++ show ( w*x + (1.0-w)*y )
