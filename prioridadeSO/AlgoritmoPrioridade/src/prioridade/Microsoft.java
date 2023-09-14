package prioridade;

public class Microsoft extends Executavel {

	String padrao() {
		programas = "1- Microsoft Teams, 15ms\n2- Microsoft Edge, 10ms\n3- Microsoft To Do, 12ms\n"
				+ "4- Microsoft Clipchamp, 8ms\n5- Microsoft 365, 15ms\n6- Outlook, 3ms\n7- OneDrive, 6ms\n"
				+ "8- Fotos, 3ms\n9- WordPad, 7ms";
		return programas;
	}
	
	public String nomePrograma(int numero) {
		switch(numero) {
		case 1:
			this.nome = "Microsoft Teams";
			break;
		case 2:
			this.nome = "Microsoft Edge";
			break;
		case 3:
			this.nome = "Microsoft To Do";
			break;
		case 4:
			this.nome = "Microsoft Clipchamp";
			break;
		case 5:
			this.nome = "Microsoft 365";
			break;
		case 6:
			this.nome = "Outlook";
			break;
		case 7:
			this.nome = "OneDrive";
			break;
		case 8:
			this.nome = "Fotos";
			break;
		case 9:
			this.nome = "WordPad";
			break;
		}
		return this.nome;
	}
	
	
}
