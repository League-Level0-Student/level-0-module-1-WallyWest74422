
void setup() {
PImage face = loadImage("acePic.jpg");
size(500, 500);
face.resize(width, height);
image(face, 0, 0);
noStroke();
}
void draw() {
println(mouseX + "    " + mouseY);
  
  ellipse(224, 122, 30, 30);
 ellipse(273, 122, 30, 30);

}
