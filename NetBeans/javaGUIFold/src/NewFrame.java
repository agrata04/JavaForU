/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asd
 */
public class NewFrame extends java.awt.Frame {

    /**
     * Creates new form NewFrame
     */
    public NewFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
