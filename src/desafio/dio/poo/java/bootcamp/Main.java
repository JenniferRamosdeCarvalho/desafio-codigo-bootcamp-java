package desafio.dio.poo.java.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJennifer = new Dev();
        devJennifer.setNome("Jennifer");
        devJennifer.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJennifer.getConteudosInscritos());
        devJennifer.progredir();
        System.out.print("-");
        System.out.println("Conteúdos inscritos" + devJennifer.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devJennifer.getConteudosConcluidos());
        System.out.println("XP:" + devJennifer.calcularTotalXp());

        System.out.print("------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.print("-");
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
