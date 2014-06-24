dec2bin :: Int -> Int -> Int -> Int
dec2bin 0 i b = b
dec2bin n i b = dec2bin (n `div` 2) (i*10) (b + (n  `rem` 2)*i)

main = do
       n <- fmap read getLine
       putStrLn $ show (dec2bin n 1 0)
