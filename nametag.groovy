
CSG text = CSG.text("Ray",5)

CSG rotatedText = text.rotz(90)

double distanceyCenter = rotatedText.getCenterY()

println "Center of Word "+distanceyCenter

CSG centeredText = rotatedText.movey(-distanceyCenter)

double width = 30
double depth = 70
double height = 3
double widthOfText = centeredText.getTotalY()+5.0

double scale = depth/widthOfText

CSG scaledText = centeredText.scaley(scale)

double distanceInX = scaledText.getCenterX()
CSG textCenterInX = scaledText.movex(-distanceInX)

println " scale for text "+scale
println "width of text "+widthOfText
println "width is "+width
println "height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height) . toCSG()

return [nameTagBase,textCenterInX]