void setup() {
  size(1300,651);
      PImage waldo = loadImage("Where's Waldo.jpeg"); // 5. Change this to match your file name.
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      //println(mouseX,mouseY);

      // 7. If the mouse is on Waldo, print “Waldo found!”
  if (mousePressed) {
      if(mouseX>329 && mouseX<389 && mouseY>216 && mouseY<266) {
        playWoohoo();
        println("Waldo Found!");
      }
      else {
   playDoh(); 
  }
  }
// 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;