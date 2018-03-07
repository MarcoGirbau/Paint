/*
 * Esta clase dibuja Trinagulos
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Hexagono extends Forma
{
    public Hexagono (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 3 lados
        super(_posX, _posY, 6, _color, _relleno);
    }
}
