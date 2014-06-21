conta 0 = "0\n"
conta n = (show n) ++ "\n" ++ (conta (n-1))

main = do
       putStrLn $ conta 10
