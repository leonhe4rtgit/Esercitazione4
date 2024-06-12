package com.esercitazionequattro;

import javax.swing.JOptionPane;

public class Esercizio4 {

	/*
	 * Testo dell'Esercizio 3: Realizzare un programma che, prese come input due
	 * stringhe rappresentanti nome e cognome, stampi le iniziali facendo uso del
	 * metodo concat.
	 * 
	 * Esercizio 4: Ripetere l’esercizio 3 effettuando dapprima la conversione dei
	 * caratteri in maiuscolo e poi la concatenazione.
	 */

	public static void main(String[] args) {

		// Input di Nome e Cognome
		String nome = JOptionPane.showInputDialog("Inserire il Nome");

		String cognome = JOptionPane.showInputDialog("Inserire il Nome");

		// Conversione in Maiuscolo
		String nomeMaiusc = nome.toUpperCase();

		String cognomeMaiusc = cognome.toUpperCase();

		// Memorizzazione delle Iniziale
		String inizialeNome = nomeMaiusc.substring(0, 1);

		String inizialeCognome = cognomeMaiusc.substring(0, 1);

		// Stampa delle Iniziali con "concat"

		String inizialiConcatenate = inizialeNome.concat(inizialeCognome);

		System.out.println(inizialiConcatenate);

	}

}
