vencedor a b
      | a>b || (a==0 && b==2) = "Jogador1 venceu"
      | b>a || (a==2 && b==0) = "Jogador2 venceu"
      | otherwise = "Empate"

main = do
       putStrLn "Pedra (0), Papel (1), Tesoura (2)"
       line <- getLine
       let jogador1 = read line

       putStrLn "Pedra (0), Papel (1), Tesoura (2)"
       line <- getLine
       let jogador2 = read line

       putStrLn $ vencedor jogador1 jogador2
