/*
 * Permite definir trazos con grosor
 */
package codigo;

import java.awt.BasicStroke;

/**
 *
 * @author xp
 */
public class Trazo extends BasicStroke
{
    public Trazo (int _grosor)
    {
        super(_grosor);
    }
    
    public Trazo (int _grosor, float valor1, float valor2)
    {
        super(_grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, valor1, new float[]{valor2},0.0f);
    }
}
