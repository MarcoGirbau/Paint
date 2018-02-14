/*
 * Esta clase dibuja Pentagonos (intento)
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Marco Girbau
 */
public class Pentagono extends Polygon
{
    public Color color = null;
    public boolean relleno = false;
    //coordenadas del centro del pentágono
    public int x = 0;
    public int y = 0;
    
    public Pentagono (int _posX, int _posY,int _altura, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del pentagono correctamente para que guarde 5 lados
        super(new int[5], new int[5], 5);
        //guardo el centro del pentagono
        this.x = _posX;
        this.y = _posY;
        
        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate (Graphics2D g2, int _posY)
    {
        //redibujas el Pentagono (TODO)
        int radio = y - _posY;
        for(int i = 0; i < 5; i++)
        {
            this.xpoints[i] = (int) (x + radio*Math.cos(2*Math.PI*(i + 40)/npoints));
            this.ypoints[i] = (int) (y + radio*Math.sin(2*Math.PI*(i + 40)/npoints));
        }
        g2.setColor(color);
        if(relleno)
        {
            g2.fill(this);
        }
        else
        {
            g2.draw(this);
        }
    }
}
