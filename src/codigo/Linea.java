/*
 * Esta clase dibuja Lineas
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Linea extends Forma
{
    public Linea (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 3 lados
        super(_posX, _posY, 2, _color, _relleno);
    }
}
