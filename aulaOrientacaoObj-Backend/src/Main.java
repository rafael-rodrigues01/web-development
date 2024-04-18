public class Main {
    public static void main(String[] args) {
        AlunoSenaiClasse  kauan = new AlunoSenaiClasse("Eletroeletronica", false, "950");
        System.out.println(kauan.getUniforme());
        kauan.setUniforme("Calça");
        System.out.println(kauan.getUniforme());
    }
}