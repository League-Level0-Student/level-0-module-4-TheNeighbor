void setup() {
  size (600,325);
  PImage face = loadImage("spongebob.jpg");
  background(face);
}
void draw() {
  fill(#FFFFFF);
  ellipse(280,130,80,78);
   ellipse(350,139,80,85);
   fill(#000000);
   ellipse(mouseX+280,mouseY+130,20,20);
   ellipse(mouseX+,20,20);
}