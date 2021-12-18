import java.awt.*;
import java.io.Serializable;
public class FirstBean extends Canvas
  implements Serializable{

//Constructor sets inherited properties
  public FirstBean(){
    setSize(60,40);
    setBackground(Color.red);
  }
}