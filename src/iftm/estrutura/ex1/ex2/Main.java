package iftm.estrutura.ex1.ex2;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PreOrdem 
		 //8  7  3  2  1  5  4  6  9  11  15  12  13  19  18  17  16  20  21 
		
		
		//InOrdem 
		// 1  2  3  4  5  6  7  8  9  11  12  13  15  16  17  18  19  20  21 

	    
		
		//PosOrdem 
		// 1  2  4  6  5  3  7  13  12  16  17  18  21  20  19  15  11  9  8 
		
		Arvore arvore = new Arvore();
	       arvore.insereElemento(8);
	       arvore.insereElemento(9);
	       arvore.insereElemento(11);
	       arvore.insereElemento(15);
	       arvore.insereElemento(19);
	       arvore.insereElemento(20);
	       arvore.insereElemento(21);
	       arvore.insereElemento(7);
	       arvore.insereElemento(3);
	       arvore.insereElemento(2);
	       arvore.insereElemento(1);
	       arvore.insereElemento(5);
	       arvore.insereElemento(12);
	       arvore.insereElemento(18);
	       arvore.insereElemento(17);
	       arvore.insereElemento(16);
	       arvore.insereElemento(6);
	       arvore.insereElemento(4);
	       arvore.insereElemento(13);
	       
	       
	       
	       
	       System.out.println("\n\nPreOrdem ");
	        arvore.preOrdemTransversal();

	        System.out.println("\n\nInOrdem ");
	        arvore.inOrdemTransversal();

	        System.out.println("\n\nPosOrdem ");
	        arvore.posOrdemTransversal();
	    }
	}
