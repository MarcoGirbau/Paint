/*
 * Esta clase dibuja Triangulos
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Triangulo extends Forma
{
    public Triangulo (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 3 lados
        super(_posX, _posY, 3, _color, _relleno);
    }
}
