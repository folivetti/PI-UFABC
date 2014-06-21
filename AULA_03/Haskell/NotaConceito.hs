conceito :: Bool -> Bool -> String
conceito _ True = "O"
conceito True False = "A"
conceito False False  = "R"

pegaAluno x n limiar maxFaltas  
       | x==n = do putStrLn ""
       | x<n = do
               putStrLn "Entre com a nota:  "
               line <- getLine
               let nota  = read line
               putStrLn "Entre com as faltas: "
               line <- getLine
               let faltas  = read line
              
               let c = conceito ((nota :: Float) > (limiar :: Float))  ((faltas :: Int) > (maxFaltas :: Int))
               putStrLn $ "Aluno " ++ (show x) ++ " conceito: " ++ c
               pegaAluno (x+1) n limiar maxFaltas

main = do
       putStrLn "Entre com limiar: "
       line <- getLine
       let limiar  = read line
       putStrLn "Entre com max. faltas: "
       line <- getLine
       let maxFaltas  = read line
       putStrLn "Numero de alunos: "
       line <- getLine
       let alunos = read line
       pegaAluno 0 alunos limiar maxFaltas

