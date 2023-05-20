/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_swing;

import javax.swing.*;

public class Tarea_Swing {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Programa");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(450, 500);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));

        JLabel etiqueta = new JLabel("Etiqueta");
        JButton boton = new JButton("Botón");
        JTextField textField = new JTextField(20);
        JCheckBox checkBox = new JCheckBox("Casilla de verificación");
        JRadioButton radioButton1 = new JRadioButton("Casilla 1");
        JRadioButton radioButton2 = new JRadioButton("Casilla 2");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Opción 1", "Opción 2", "Opción 3"});
        JList<String> lista = new JList<>(new String[]{"Objeto 1", "Objeto 2", "Objeto 3"});
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollBar scrollBar = new JScrollBar();
        JPanel panel = new JPanel();

        panel.add(etiqueta);
        panel.add(boton);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(comboBox);
        panel.add(lista);
        panel.add(scrollPane);
        panel.add(scrollBar);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}