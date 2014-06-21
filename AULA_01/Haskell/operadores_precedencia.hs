main = do
       let a = 20
       let b = 10
       let c = 15
       let d = 5

       putStrLn $ show (a+b*c-a+b*d)
       putStrLn $ show (a+(b*c)-a+(b*d))

       let e = (a+b)*c/d
       putStrLn $ "(a+b)*c/d = " ++ show e
       let e = ((a+b)*c)/d
       putStrLn $ "((a+b)*c)/d = " ++ show e
       let e = (a+b)*(c/d)
       putStrLn $ "(a+b)*(c/d) = " ++ show e
       let e = a+(b*c/d)
       putStrLn $ "a + (b*c/d) = " ++ show e
