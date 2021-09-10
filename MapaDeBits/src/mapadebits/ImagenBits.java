package mapadebits;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sinai
 * @author Vanessa
 * 
 */
public class ImagenBits {
    
    public BufferedImage ImagenActual;
    public BufferedImage Imagen(){
      BufferedImage bmp=null;
      JFileChooser selector=new JFileChooser();
      selector.setDialogTitle("Seleccione la Imagen");
      FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP","jpg","gif","bmp");
      selector.setFileFilter(filtroImagen);
      int flag=selector.showOpenDialog(null);
      if(flag==JFileChooser.APPROVE_OPTION){
          try {
              File imagenSeleccionada=selector.getSelectedFile();
              bmp = ImageIO.read(imagenSeleccionada);
          } catch (IOException e){
      }
    }
    ImagenActual =bmp;
    return bmp;
}
    public BufferedImage Bits(){
        //int mediaPixel,
        int colorSRGB;
        Color colorAux;
        int valR,valG,valB;
        
        for( int i = 0; i< ImagenActual.getWidth(); i++){
            for (int j=0; j< ImagenActual.getHeight(); j++){
                colorAux = new Color(this.ImagenActual.getRGB (i,j));
              /*  mediaPixel=(int)((colorAux.getRed()+colorAux.getGreen()+colorAux.getBlue())/3);
                colorSRGB=(mediaPixel << 16)|(mediaPixel << 8) | mediaPixel;*/
              
                       valR= 255-colorAux.getRed();
                       valG= 255-colorAux.getGreen();
                       valB= 255-colorAux.getBlue();
                       colorSRGB=(valR<<16)|(valG<<8)|valB;
                       
                ImagenActual.setRGB(i, j, colorSRGB);
            }
        }
        return ImagenActual;
    }
     
}
