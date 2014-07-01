f :: Float -> Float -> Float -> Float
f x y n = x**n - y

df :: Float -> Float -> Float
df x n = n * (x ** (n-1))

raiz x x0 y n
         | abs(x-x0) > 0.01 = raiz ( x - (f x y n) / (df x n) ) x y n
         | otherwise = x

main = do
       y <- fmap read getLine
       n <- fmap read getLine
       let r = raiz 1.0 2.0 y n
       putStrLn $ show r
