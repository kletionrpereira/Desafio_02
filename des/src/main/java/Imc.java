public class Imc {
    public static void main(String[] args) {


        String nome1 = "Kleiton Rodrigues,";
        int idade1 = 27;
        double peso1 = 68;
        float altura1 = 1.65f;
        boolean Ehdev1 = false;

        String nome2 = "Joao Silva,";
        int idade2 = 25;
        double peso2 = 60;
        float altura2 = 1.70f;
        boolean Ehdev2 = true;

        String nome3 = "Maria Silva";
        int idade3 = 65;
        double peso3 = 75;
        float altura3 = 1.80f;
        boolean Ehdev3 = false;

        int somaIdade;
        somaIdade = idade1 + idade2 + idade3;
        System.out.println("A soma das idades é" + somaIdade);

        double imc1 = peso1 / (altura1 * altura1);
        double imc2 = peso2 / (altura2 * altura2);
        double imc3 = peso3 / (altura3 * altura3);

        double somaImc = imc1 + imc2 + imc3;
        double mediaImc = somaImc / 3;
        System.out.format("A media dos imc é % .2f\n", mediaImc);


        String nomeAlunos;
        nomeAlunos = nome1 + nome2 + nome3;
        System.out.println("Os nomes dos alunos são " + nomeAlunos);

        boolean[] EhDev = new boolean[3];
        EhDev[0] = Ehdev1;
        EhDev[1] = Ehdev2;
        EhDev[2] = Ehdev3;

        int totalEhDev = 0;
        for (int count = 0; count < 3; count++) {
            if (EhDev[count] == true) {
                totalEhDev++;
            }

        }
        System.out.println("A quantidade de Ubuntu que são dev são = " + String.valueOf(totalEhDev));

        String[]grupoNome= new String[3];
        grupoNome[0] = nome1;
        grupoNome[1] = nome2;
        grupoNome[2] = nome3;

        System.out.println("Ubuntus que tem Silva no nome");
        for (int count = 0; count < 3; count++){

            String s1 = grupoNome[count];
            String s2 = "Silva";
            boolean b = s1.contains(s2);
            if (b == true)
            {
                System.out.println(grupoNome [count]);
            }

        }
    }
}
