int x = 400; 
int y = 600; 

void setup() {

    background(0, 0, 40); size(800, 800);
    fill(250, 250, 250);
    ellipse(60, 60, 100, 100);
    fill(246, 246, 246);
    ellipse (57, 62, 50, 50);

}

void draw() {

    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
y =y-10;
}
