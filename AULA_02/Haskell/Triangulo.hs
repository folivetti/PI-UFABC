triangulo x y z
         | not ((x+y)>z && (x+z)>y && (y+z)>x) = "Não é triângulo"
         | x==y && y==z = "Equilatero"
         | x==y || y==z = "Isóceles"
         | otherwise = "Escaleno"

main = do
      putStrLn "Digite as dimensões: "
      line <- getLine
      let x = read line
      line <- getLine
      let y = read line
      line <- getLine
      let z = read line

      putStrLn $ triangulo x y z
