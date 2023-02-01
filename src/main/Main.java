package main;


import Entity.Person;
import Repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static PersonRepository rp = new PersonRepository();
    public static void main(String[] args) {

        System.out.println("====Ação 1 - Adicionar pessoa ====");
        popularArray();System.out.println("Adicionando...");

        System.out.println("====Ação 2 - Listar pessoas ====");
        listPerson();
        System.out.println();

        System.out.println("====Ação 3 - Excluir pessoa de Id(2)====");
        rp.deleteById(2);
        System.out.println();

        System.out.println("====Ação 4 - Listar pessoas ====");
        listPerson();
        System.out.println();

        System.out.println("====Ação 5 - Alterando Pessoa de id(3) ====");
        alterar();
        System.out.println();

        System.out.println("====Ação 6 - Listar pessoas ====");
        listPerson();

    }

    public static void alterar(){
        Person person = new Person();
        person.setId(3);
        person.setCpf("09069833598");
        person.setNome("Marcos Rafael");
        person.setSexo("M");
        person.setProfissao("Motorista");
        rp.change(person);
        System.out.println();
    }

    public static void popularArray(){
        Person person = new Person();
        person.setId(1);
        person.setNome("Marcio Rodrigo");
        person.setSexo("M");
        person.setProfissao("Desenvolvedor");
        person.setCpf("08059615325");
        rp.save(person);
        System.out.println();

        Person person2 = new Person();
        person2.setId(2);
        person2.setNome("Carlos Eduardo");
        person2.setSexo("M");
        person2.setProfissao("Professor");
        person2.setCpf("3691581475");
        rp.save(person2);
        System.out.println();

        Person person3 = new Person();
        person3.setId(3);
        person3.setNome("Karine lima");
        person3.setSexo("F");
        person3.setProfissao("Farmaceutica");
        person3.setCpf("96835721546");
        rp.save(person3);
        System.out.println();
    }

    public static void listPerson(){
        List<Person> lista = new ArrayList<Person>();
        lista = rp.listPerson();

        for (Person person : lista) {

            System.out.println("Id : " + person.getId());
            System.out.println("Nome : " + person.getNome());
            System.out.println("Cpf : " + person.getCpf());
            System.out.println("Sexo : " + person.getSexo());
            System.out.println("Profissao : " + person.getProfissao());
        }
    }
}