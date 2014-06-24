mdc :: Int -> Int -> Int -> Int
mdc m n 0 = n
mdc m n r = mdc n r (n `rem` r)

main = do
       m <- fmap read getLine
       n <- fmap read getLine
       putStrLn $ show (mdc m n (m `rem` n))
