import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

//Nick Rolph Ap Computer Programing A Block 3 Origonal design

int y = 0;
public void setup()
{
    size (500,500);
}
public void draw()
{
	background(0, 0, 0);
  text("Click the screen!", 5, 5, width, height);
	rocketShipHead();
  rocketShipTail();
   	if(mousePressed== true)
   	{
   		y = y-1;
      fireboost();
      stars();
   	}
    else if (mousePressed == false && y<0)
    {
      y = y+1; 
      stars();
    }
}
public void rocketShipHead()
{
  stroke(0);
  fill(220);
	quad(250, 355+y, 290, 355+y,305, 325+y, 235, 325+y );
	rect(235, 295+y, 70, 30);
	quad(235, 295+y, 305, 295+y, 290, 265+y, 250, 265+y);
}
public void rocketShipTail()
{
  stroke(0);
  fill(130);
	triangle(242.5f+2, 390-2+y, 235+2, 400-2+y, 250+2, 400-2+y); // side toob r triangle back
  triangle(242.5f+55+2, 390-2+y, 235+55+2, 400-2+y, 250+55+2, 400-2+y);// side toob l triangle back
	rect(235+2, 400-2+y, 15, 100); // side toob r back
  rect(235+55+2, 400-2+y , 15, 100); // side toob l back
  fill(220);
  triangle(270, 465+y, 252, 500+y, 288, 500+y); // booster main
  rect(250, 355+y,40,125); // body
  rect(235, 400+y, 15, 100); // side toob r
  rect(235+55, 400+y, 15, 100); // side toob l
  triangle(242.5f, 390+y, 235, 400+y, 250, 400+y); // side toob r triangle
  triangle(242.5f+55, 390+y, 235+55, 400+y, 250+55, 400+y);// side toob l triangle 

}
public void fireboost()
{
   noStroke();
      fill(255, 3, 11); // red
      triangle(235, 500+y, 235+55+15, 500+y, 315, 570+y);
      triangle(235, 500+y, 235+55+15, 500+y, 225, 570+y);
      triangle(235, 500+y, 235+55+15, 500+y, 270, 580+y);
      fill(255, 95, 3); // orange
      triangle(235, 500+y, 235+55+15, 500+y,300,545+y);
      triangle(235, 500+y, 235+55+15, 500+y,240,545+y);
      triangle(235, 500+y, 235+55+15, 500+y,270,545+y);
      fill(252, 241, 8); //yellow
      triangle(235, 500+y, 235+55+15, 500+y, 290,520+y);
      triangle(235, 500+y, 235+55+15, 500+y, 250,520+y);
      triangle(235, 500+y, 235+55+15, 500+y, 270, 520+y);
}
public void stars()
{
  for (int i = 0; i < 30; ++i) {
    stroke(255, 255, 255);
  ellipse((int)(Math.random()*500),(int)(Math.random()*500), 2, 2);
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
