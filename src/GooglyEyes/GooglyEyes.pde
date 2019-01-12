PImage face;
void setup() {
  size (600,325);
  face = loadImage("spongebob.jpg");
  background(face);
}
void draw() {
  background(face);
  fill(#FFFFFF);
  if(mouseX>320) {
  mouseX=320;
}
if(mouseY>170) {
  mouseY=170;
}
if(mouseY<90) {
  mouseY=90;
}
if(mouseX<240) {
  mouseX=240;
}
  ellipse(280,130,80,80);//left iris
   ellipse(350,139,80,80);//right iris
   fill(#000000);
   ellipse(mouseX,mouseY,20,20);
   ellipse(mouseX+60,mouseY,20,20);
}