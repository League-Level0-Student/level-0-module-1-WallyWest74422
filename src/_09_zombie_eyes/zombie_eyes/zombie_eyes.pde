
void setup() {
PImage face = loadImage("acePic.jpg");
size(500, 500);
face.resize(width, height);
image(face, 0, 0);
noStroke();
}
void draw() {
println(mouseX + "    " + mouseY);
  
 fill(mouseX, mouseY, 0);
  ellipse(224, 122, 30, 30);
  fill(mouseY, mouseX, 0);
 ellipse(273, 122, 30, 30);
 
 fill(0,0,0);
   ellipse(224, 122, 17, 17);
   ellipse(273, 122, 17, 17);

}
