/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javaapplication1.ArvoreB.NoDaArvoreB;

/**
 *
 * @author julio
 */
public class Printada {
    public void printTree(NoDaArvoreB raiz) {
        printTreeRecursivo(raiz);
    }

    private void printTreeRecursivo(NoDaArvoreB node) {
        if (node != null) {
            int i;
            for (i = 0; i < node.chaves.size(); i++) {
                // Imprime a chave atual
                System.out.print(node.chaves.get(i) + " ");
                
                // Se não for folha, imprime as subárvores
                if (!node.folhinha) {
                    printTreeRecursivo(node.filhotes.get(i));
                }
            }
            
            // Imprime a última subárvore (se houver)
            if (!node.folhinha) {
                printTreeRecursivo(node.filhotes.get(i));
            }
            
        }
    }
    public void printTree(ArvoreB arvore) {
        printTreeRecursivo(arvore.getRaiz());
    }
}