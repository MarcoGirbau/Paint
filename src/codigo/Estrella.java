/*
 * Esta clase dibuja Estrellas
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Marco Girbau
 */
public class Estrella extends Forma
{
    public Estrella (int _posX, int _posY, Color _color, boolean _relleno)
    {
        //Inicializa el  contrusctor del triangulo correctamente para que guarde 3 lados
        super(_posX, _posY, 512, _color, _relleno);
    }
    @Override
    public void calculaVertices(int _radio, double _giro)
    {
        int n = 20;
        for(int i = 0; i < npoints; i++)
        {
            this.xpoints[i] = (int) (x + (_radio/(i%n +1))*Math.cos((2*Math.PI * i + _giro/(i%n +1))/npoints));
//            this.xpoints[i + 1] = (int) (x + (_radio/2)*Math.cos((2*Math.PI*i + _giro/2)/npoints));
            
            this.ypoints[i] = (int) (y + (_radio/(i%n +1))*Math.sin((2*Math.PI * i + _giro/(i%n +1))/npoints));
//            this.ypoints[i + 1] = (int) (y + (_radio/2)*Math.sin((2*Math.PI*i + _giro/2)/npoints));
//            i++;
        }
    }
}
//Parecido a shuriken(dentro de CalculaVertices)(24 dentro del super)
//for(int i = 0; i < npoints; i++)
//        {
//            this.xpoints[i] = (int) (x + _radio*Math.cos((2*Math.PI*i + _giro)/npoints));
//            this.xpoints[i + 1] = (int) (x + (_radio/2)*Math.cos((2*Math.PI*i + _giro)/npoints));
//            
//            this.ypoints[i] = (int) (y + _radio*Math.sin((2*Math.PI*i + _giro)/npoints));
//            this.ypoints[i + 1] = (int) (y + (_radio/2)*Math.sin((2*Math.PI*i + _giro)/npoints));
//            i++;
//        }
