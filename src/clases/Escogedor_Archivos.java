/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package clases;

import java.awt.Font;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author LENOVO
 */
public class Escogedor_Archivos extends JFileChooser{
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Escogedor_Archivos(){
        super();
        
        Font fuente = new Font("Segoe UI", Font.BOLD, 16);
        this.setFont(fuente);
        this.setDialogTitle("Seleccionar Archivo(s) A Subir");
        this.setFileSystemView(FileSystemView.getFileSystemView());
        
        ImagePreview previsualizacion = new ImagePreview(this);
        
        //Add the preview pane.
        this.setAccessory(previsualizacion);
        
        Locale local = new Locale("es", "MX");
        this.setLocale(local);
        
        this.setup(FileSystemView.getFileSystemView());
        
        this.setFileSelectionMode(JFileChooser.FILES_ONLY);
        this.setApproveButtonText("Subir Archivo(s)");
        this.setMultiSelectionEnabled(true);
        
    }
    
}
