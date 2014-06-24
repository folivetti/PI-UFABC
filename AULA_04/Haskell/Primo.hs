primo :: Int -> Int -> Bool
primo n 1 = True
primo n m = if (n `rem` m) == 0 then False else primo n (m-1)

main = do
       n <- fmap read getLine
       putStrLn $ show (primo n (n-1))
