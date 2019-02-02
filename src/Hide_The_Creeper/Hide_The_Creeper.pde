int creeperX = 900;
int creeperY = 500;
PImage creeper;
void setup() {
  size(240,135);
  PImage minecraft = loadImage("minecraft.png");
  minecraft.resize(240, 135);
background(minecraft);          
creeper=loadImage("creeper.png");
creeper.resize(25, 25); 
}
void draw() {
  image(creeper, mouseX, mouseY);
}