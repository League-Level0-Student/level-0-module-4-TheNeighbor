PImage donkey;
PImage tail;
void setup() {
  size(600,442);
  donkey = loadImage("Donkey.jpg");     
tail = loadImage("Tail.png");
donkey.resize(600,442);
tail.resize(60,153.5);
}
void draw() {
 background (donkey);
image(tail, mouseX, mouseY); 
}