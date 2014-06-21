fizzBuzz x
      | (x `rem` 15)==0 = "FizzBuzz"
      | (x `rem` 3)==0 = "Fizz"
      | (x `rem` 5)==0 = "Buzz"
      | otherwise = show x

main = do
       let lista = [fizzBuzz x | x <- [1..100]]
       putStrLn $ show lista
