
public class ProjetoYoutube {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1");
		v[1] = new Video("Aula 2");
		v[2] = new Video("Aula 3");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Livinho", 20, "M", "Livis");
		g[1] = new Gafanhoto("Joana", 21, "F", "Joaninha");
		
		Visualizacao vis[] = new Visualizacao[3];
		vis[0] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar();
		vis[1] = new Visualizacao(g[1], v[1]);
		vis[1].avaliar(9);
		
		System.out.println(vis[1].toString());
	}
}
