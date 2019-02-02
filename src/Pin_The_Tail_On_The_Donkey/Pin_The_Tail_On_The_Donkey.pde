import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true; 
boolean mouseClick;
int x;
int y;
PImage donkey;
PImage tail;
void setup() {
  Minim minim = new Minim(this);    
woohooSound = minim.loadSample("homer-woohoo.wav"); 
  size(600,442);
  donkey = loadImage("Donkey.jpg");     
  tail = loadImage("Tail.png");
  donkey.resize(600,442);
  tail.resize(30,77);
}
void draw() {
  if(mouseX>500 && mouseY>100 && mouseX<540 && mouseY<140 && mouseClick) {
    if (playSound == true) {
     woohooSound.trigger();
     playSound = false;
}
  }
  rect(0,0,600,442);//background
  if(dist(0, 0, mouseX, mouseY) < 1) {
    background (donkey);
  }
  if(mouseClick) {
     background (donkey);
    image(tail, x, y);
  }
  else {
    image(tail, mouseX-25, mouseY-5);
  }
  if(mousePressed && !mouseClick) {
    mouseClick=true;
    x = mouseX-25;
    y = mouseY-5;
  }
}