main = do
       let x = 10
       let y = 3

       putStrLn $ show x ++ " + " ++ show y ++  " = " ++ show (x+y) 
       putStrLn $ show x ++ " - " ++ show y ++  " = " ++ show (x-y) 
       putStrLn $ show x ++ " * " ++ show y ++  " = " ++ show (x*y) 
       putStrLn $ show x ++ " `div` " ++ show y ++  " = " ++ show (x `div` y) 
       putStrLn $ show x ++ " `rem` " ++ show y ++  " = " ++ show (x `rem` y) 
       putStrLn $ show x ++ "^" ++ show y ++  " = " ++ show (x^y) 

       putStrLn $ show x ++ " == " ++ show y ++  " ? " ++ show (x==y) 
       putStrLn $ show x ++ " /= " ++ show y ++  " ? " ++ show (x/=y) 
       putStrLn $ show x ++ " > " ++ show y ++  " ? " ++ show (x<y) 
       putStrLn $ show x ++ " < " ++ show y ++  " ? " ++ show (x>y) 
       putStrLn $ show x ++ " >= " ++ show y ++  " ? " ++ show (x>=y) 
       putStrLn $ show x ++ " <= " ++ show y ++  " ? " ++ show (x<=y) 

       let x = 10.0 :: Float
       let y = 3.0 :: Float

       putStrLn $ show x ++ " + " ++ show y ++  " = " ++ show (x+y) 
       putStrLn $ show x ++ " - " ++ show y ++  " = " ++ show (x-y) 
       putStrLn $ show x ++ " * " ++ show y ++  " = " ++ show (x*y) 
       putStrLn $ show x ++ " / " ++ show y ++  " = " ++ show (x/y) 
       putStrLn $ show x ++ "**" ++ show y ++  " = " ++ show (x**y) 

       putStrLn $ " 5>2 E 5<10? " ++ show ( (5>2) && (5<10) )
       putStrLn $ " 5>2 OU 5<10? " ++ show ( (5>2) || (5<10) )
       putStrLn $ " 5>2 E NÃO 5<3? " ++ show ( (5>2) && not (5<3) )
