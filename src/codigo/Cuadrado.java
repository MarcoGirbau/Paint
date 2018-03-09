/*
 * Esta clase dibuja cuadrados
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author xp
 */
public class Cuadrado extends Forma
{
    public Cuadrado (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del cuadrado correctamente para que guarde 4 lados
        super(_posX, _posY, 4, _color, _relleno);
    }
}
