inverso :: Integer -> Integer -> Integer
inverso 0 inv = inv
inverso n inv = inverso (n `div` 10) (inv*10 + (n `rem` 10))

geraPal :: Integer -> Integer -> (Integer,Integer)
geraPal n y = do
            if (ePalindrome n) || (y>100) then
                  (n,y)
            else 
                  geraPal (n + inverso n 0) (y+1)

ePalindrome :: Integer -> Bool
ePalindrome n = n == (inverso n 0)

main = do
       n <- fmap read getLine 
       putStrLn $ show (inverso n 0)
       putStrLn $ show (geraPal n 0)
