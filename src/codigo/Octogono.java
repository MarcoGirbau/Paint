/*
 * Esta clase dibuja Trinagulos
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Octogono extends Forma
{
    public Octogono (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 3 lados
        super(_posX, _posY, 8, _color, _relleno);
    }
}
