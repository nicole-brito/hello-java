package br.com.ada.designpattern.builder_1;

import java.time.LocalDate;
import java.time.Month;

public class TesteUser {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .nome("Nicole")
                .sobrenome("Brito")
                .userAtivo(true)
                .dataNascimento(LocalDate.of(2001, 06, 15))
                .id(001)
                .email("nicolem.britto@gmail.com")
                .build();

        User user2 = new User.UserBuilder()
                .nome("Keven")
                .sobrenome("Kniggendorf")
                .userAtivo(false)
                .dataNascimento(LocalDate.of(2000, 07, 06))
                .id(002)
                .email("kev@gmail.com")
                .build();

        System.out.println(user);
        System.out.println(user2);
    }
}


