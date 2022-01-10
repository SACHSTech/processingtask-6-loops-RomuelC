import processing.core.PApplet;

public class Sketch extends PApplet {
  int tall = 400;
  int fat = 400;
	
  public void settings() {
    size(tall, fat);
  }

  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {  
    // Quadrant 1
    stroke(0);

    for (int i = tall/20; i <= tall/2; i += tall/20) {
      line(i, 0, i, tall/2);
      line(0, i, fat/2, i);
    }

    // Quadrant 2
    stroke(0);
    fill(115, 56, 33);
    for (int circleY = tall/12; circleY <= tall/2 - tall/12; circleY += tall/12) {
      for (int circleX = fat/2 + fat/12; circleX <= fat - fat/12; circleX += fat/12) {
        ellipse(circleX, circleY, 20, 20);
      }

    // Quadrant 3

    stroke(0);
    for (int i = 0; i <= tall/2; i++) {
      stroke(i, i, i);
      line(i, tall/2, i, tall);
    }

    // Quadrant 4
    for (int Ang = 0; Ang < 360; Ang += 45) {
      stroke(0, 0, 0);
      strokeWeight(1);
      fill(255, 255, 0);

      pushMatrix();
      translate(fat * 3 / 4, tall * 3 / 4);
      rotate(radians(Ang));
      ellipse(0, 0, fat / 20, tall / 3);
      popMatrix();

    }

    noStroke();
    fill(115, 56, 33);
    ellipse(fat * 3 / 4, tall * 3 / 4, 40, 40);

  }
}
}