main = do
       putStrLn "Entre com x e y: "
       line <- getLine
       let x = read line
       line <- getLine
       let y = read line 
       putStrLn $ "Média = " ++ show ( (x+y)/2 )
