import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
   public static void main(String[] args) {
    Curso curso= new Curso();
    curso.setTitulo("Curso Java");
    curso.setDescricao("descricao");
    curso.setCargaHoraria(5);
    
    Curso curso2= new Curso();
    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("descricao");
    curso2.setCargaHoraria(5);

    Mentoria mentoria= new Mentoria();
    mentoria.setTitulo("Mentoria dio");
    mentoria.setDescricao("Descricao mentoria");
    mentoria.setData(LocalDate.now());

/* 
    System.out.println(curso);
    System.out.println(curso2);
    System.out.println(mentoria); */

    Bootcamp bootcamp=new Bootcamp();
    bootcamp.setNome("Boocamp Java Develope");
    bootcamp.setDescricao("Descricao Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila=new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo isncritos" +devCamila.getConteudosInscritos());
    devCamila.progredir();
    System.out.println("Conteudo concluidos" +devCamila.getConteudosInscritos());
    System.out.println("Conteudo isncritos" +devCamila.getConteudosInscritos());
    System.out.println("XP "+ devCamila.calcularTotalXp());
    
    System.out.println("----------------------");;

    Dev devJean= new Dev();
    devJean.setNome("Jean");
    devJean.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo isncritos" +devJean.getConteudosInscritos());
    devJean.progredir();
    devJean.progredir();
    devJean.progredir();
    System.out.println("Conteudo concluidos" +devJean.getConteudosInscritos());
    System.out.println("Conteudo isncritos" +devJean.getConteudosInscritos());
    System.out.println("XP "+ devJean.calcularTotalXp());
    
   } 
   
}
