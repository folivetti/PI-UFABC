conceito :: Bool -> Bool -> String
conceito _ True = "O"
conceito True False = "A"
conceito False False  = "R"

main = do
       putStrLn "Entre com a nota:  "
       line <- getLine
       let nota  = read line
       putStrLn "Entre com limiar: "
       line <- getLine
       let limiar  = read line
       putStrLn "Entre com as faltas: "
       line <- getLine
       let faltas  = read line
       putStrLn "Entre com max. faltas: "
       line <- getLine
       let maxFaltas  = read line
       let c = conceito ((nota :: Float) > (limiar :: Float))  ((faltas :: Int) > (maxFaltas :: Int))
       putStrLn c
