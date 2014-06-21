fib 0 = 1
fib 1 = 1
fib n = fib (n-1) + fib (n-2)

main = do
       putStrLn "N = "
       line <- getLine
       let n = read line
       putStrLn $ show (fib n)
