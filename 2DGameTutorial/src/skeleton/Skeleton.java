/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skeleton;

import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class Skeleton extends JFrame{
    
    public Skeleton() {
        add(new Board());
        setTitle("Skeleton");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 280);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new Skeleton();
    }
    
}
