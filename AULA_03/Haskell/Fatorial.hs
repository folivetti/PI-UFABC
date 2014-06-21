fat 0 = 1
fat 1 = 1
fat n = n * fat (n-1)

main = do
       putStrLn "N = "
       line <- getLine
       let n = read line
       putStrLn $ show (fat n)
