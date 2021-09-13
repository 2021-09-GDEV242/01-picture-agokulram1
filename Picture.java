/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).Added 2 boys(person),
 * chimney (Square),ball(circle),and mountain(triangle). This is a setting of two kids playing outside in 
 * a sunny day. Also added a new color orange to color panels.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Gokul Ram
 * @version 2021.09.12
 */
public class Picture 
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle ball;
    private Person boy;
    private Person boy2;
    private Square chimney;
    private Triangle mount;
    private Triangle mount2;
    private boolean drawn;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        boy = new Person();
        ball = new Circle();
        boy2 = new Person();
        chimney = new Square();
        mount = new Triangle();
        mount2 = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            mount.changeSize(400, 410);
            mount.moveHorizontal(-100);
            mount.moveVertical(-50);
            mount.changeColor("orange");
            mount.makeVisible();
            
            mount2.changeSize(400, 410);
            mount2.moveHorizontal(200);
            mount2.moveVertical(30);
            mount2.changeColor("orange");
            mount2.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-10);
            roof.makeVisible();
            
            ball.moveHorizontal(-150);  
            ball.moveVertical(175);
            ball.changeColor("magenta");
            ball.changeSize(25);
            ball.makeVisible();
            
            boy2.moveHorizontal(45);
            boy2.moveVertical(60);
            boy2.changeSize(80,40);
            boy2.changeColor("blue");
            boy2.makeVisible();
            
            boy.moveHorizontal(-160);
            boy.moveVertical(60);
            boy.changeSize(80,40);   
            boy.changeColor("blue");
            boy.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(60);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(75);
            window.changeSize(40);
            window.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-50);
            sun.changeSize(80);
            sun.makeVisible();
            
            chimney.moveHorizontal(-65);
            chimney.moveVertical(25);
            chimney.changeSize(40);
            chimney.changeColor("red");
            chimney.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        mount.changeColor("black");
        mount2.changeColor("black");
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        ball.changeColor("black");
        boy.changeColor("white");
        boy2.changeColor("black");
        chimney.changeColor("white");
       
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        mount.changeColor("orange");
        mount2.changeColor("orange");
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        ball.changeColor("magenta");
        boy.changeColor("blue");
        boy2.changeColor("blue");
        chimney.changeColor("red");
    }
}
