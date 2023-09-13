// code here

double width = 30
double depth = 70
double height = 3

println "width is "+width
println "height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height) . toCSG()

return nameTagBase