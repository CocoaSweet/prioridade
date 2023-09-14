package prioridade;

public class Steam extends Executavel {

	String padrao() {
		programas = "1- Counter-Strike: Global Offensive, 20ms\n2- Escape the Backrooms, 25ms\n3- Muse Dash, 15ms\n"
				+ "4- GrandChase, 12ms\n5- Food Comes From Above, 8ms\n6- Phasmophobia, 35ms\n"
				+ "7- Doki Doki Literature Club, 14ms\n8- Aimlabs, 17ms\n9- Wallpaper Engine, 5ms\n10- Path of Exile, 21ms";
		return programas;
	}
	
	public String nomePrograma(int numero) {
		switch(numero) {
		case 1:
			this.nome = "Counter-Strike: Global Offensive";
			break;
		case 2:
			this.nome = "Escape the Backrooms";
			break;
		case 3:
			this.nome = "Muse Dash";
			break;
		case 4:
			this.nome = "GrandChase";
			break;
		case 5:
			this.nome = "Food Comes From Above";
			break;
		case 6:
			this.nome = "Phasmophobia";
			break;
		case 7:
			this.nome = "Doki Doki Literature Club";
			break;
		case 8:
			this.nome = "Aimlabs";
			break;
		case 9:
			this.nome = "Wallpaper Engine";
			break;
		case 10:
			this.nome = "Path of Exile";
			break;
		}
		return this.nome;
	}
	
}
