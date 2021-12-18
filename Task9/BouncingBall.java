package Task9;

import java.awt.*;
import javax.swing.*;


public class BouncingBall extends JPanel {
   // Container box's width and height
   private static final int BOX_WIDTH = 500;
   private static final int BOX_HEIGHT = 500;
  
   // Ball's properties
   private float ballRadius = 20; // Ball's radius
   private float ballX = ballRadius + 50; // Ball's center (x, y)
   private float ballY = ballRadius + 20; 
   private float ballSpeedX = 3;   // Ball's speed for x and y
   private float ballSpeedY = 2;
  
   private static final int UPDATE_RATE = 30; // Number of refresh per second
  
   public BouncingBall() {
      this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
  
      // Start the ball bouncing (in its own thread)
      Thread gameThread = new Thread() {
         public void run() {
            while (true) { // Execute one update step
               // Calculate the ball's new position
               ballX += ballSpeedX;
               ballY += ballSpeedY;
               
               if (ballX - ballRadius < 0) {
                  ballSpeedX = -ballSpeedX; 
                  ballX = ballRadius;
               } else if (ballX + ballRadius > BOX_WIDTH) {
                  ballSpeedX = -ballSpeedX;
                  ballX = BOX_WIDTH - ballRadius;
               }
               
               if (ballY - ballRadius < 0) {
                  ballSpeedY = -ballSpeedY;
                  ballY = ballRadius;
               } else if (ballY + ballRadius > BOX_HEIGHT) {
                  ballSpeedY = -ballSpeedY;
                  ballY = BOX_HEIGHT - ballRadius;
               }
               
               repaint(); 
               
               try {
                  Thread.sleep(1000 / UPDATE_RATE);
               } catch (InterruptedException ex) { }
            }
         }
      };
      gameThread.start();
   }
  
   
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
  
      // Draw the box
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);
  
      // Draw the ball
      g.setColor(Color.BLUE);
      g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius), (int)(2 * ballRadius), (int)(2 * ballRadius));
   }
  
   public static void main(String[] args) {
      
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrame frame = new JFrame("A Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new BouncingBall());
            frame.pack();
            frame.setVisible(true);
         }
      });
   }
}