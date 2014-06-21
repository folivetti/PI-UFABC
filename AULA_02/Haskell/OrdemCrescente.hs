inOrder :: (Num a, Show a, Ord a) => a -> a -> a -> String
inOrder a b c
   | a<b && a<c && b<c = (show a) ++ " " ++ (show b) ++ " " ++ (show c)
   | a<b && a<c && c<b = (show a) ++ " " ++ (show c)++ " " ++ (show b)
   | b<c && a<c = (show b) ++ " " ++ (show a) ++ " " ++ (show c)
   | b<c && c<a = (show b) ++ " " ++ (show c)++ " " ++ (show a)
   | a<b = (show c) ++ " " ++ (show a)++ " " ++ (show b)
   | b<a = (show c) ++ " " ++ (show b)++ " " ++ (show a)

main = do
       putStrLn "Entre com os 3 numeros: "
       line <- getLine
       let x = read line
       line <- getLine
       let y = read line
       line <- getLine
       let z = read line
      
       putStrLn $ inOrder x y z
