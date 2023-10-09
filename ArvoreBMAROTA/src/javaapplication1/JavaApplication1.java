/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author julio
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    ArvoreB bTree = new ArvoreB(4); // Árvore B de ordem 3

    // Inserção de chaves
    bTree.insert("cu");
    bTree.insert("pau");
    bTree.insert("meu");
    bTree.insert("nó");
    bTree.insert("pega");
    bTree.insert("mama");
    bTree.insert("me");
    bTree.insert("vala");

    // Imprima a árvore B
    Printada printer = new Printada();
    printer.printTree(bTree);

    // Busca por uma chave
    boolean found = bTree.search("uva");
    System.out.println("Encontrado: " + found); // Deve imprimir "Encontrado: true"
}
    
}
