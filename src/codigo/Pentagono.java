/*
 * Esta clase dibuja Pentagonos (intento)
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Pentagono extends Forma
{
    public Pentagono (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 5 lados
        super(_posX, _posY, 5, _color, _relleno);
    }
}
