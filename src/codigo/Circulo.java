/*
 * Esta clase dibuja circulos
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author xp
 */
public class Circulo extends Forma    
{   
    public Circulo (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del circulo correctamente para que guarde 100 lados
        super(_posX, _posY, 5000, _color, _relleno);
    }
}
