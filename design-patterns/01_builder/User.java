package br.com.ada.designpattern.builder_1;

import java.time.LocalDate;

public class User {

    //Passo 1: Declara as variáveis
    //Passo 2: Faz os construtores
    //Passo 3: getters e setters
    //Passo 4: Constrói a CLASSE Builder
    //As variáveis também são declaradas no Builder (pq?)
    //Passo 5: Faz o construtor do Builder
    //Passo 6: Faz o build

    //Passo 1: Declara as variáveis

    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataNascimento;
    private boolean userAtivo;
    private int id;
    private String isUserAtivo;

    //Passo 2: Faz os construtores
    //Alt + insert = Constructor
    //Esse constructor é private
    private User(String nome, String sobrenome, String email, LocalDate dataNascimento, boolean userAtivo, int id, String isUserAtivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.userAtivo = userAtivo;
        this.id = id;
        this.isUserAtivo = isUserAtivo;
    }

    //Passo 3: getters e setters
    //Alt+ins de novo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIsUserAtivo(String isUserAtivo) {
        return isUserAtivo;
    }

    public String getIsUserAtivo() {
        return isUserAtivo;
    }

    public void setUserAtivo(boolean userAtivo) {
        this.userAtivo = userAtivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //Método toString
    @Override
    public String toString() {
        return String.format(
                "==== CADASTRO DE USUÁRIO ====" +

                        "\nUsuário ID: " + String.format("%03d", id) + //formata o id para ter 3 caracteres +
                        "\nNome: " + nome +
                        "\nSobrenome: " + sobrenome +
                        "\nEmail: " + email +
                        "\nData de Nascimento: " + dataNascimento +
                        "\nStatus da Conta: " + isUserAtivo + "\n"
        );
    }

    //Passo 4: Constrói a CLASSE Builder
    public static class UserBuilder {
        //As variáveis também são declaradas no Builder (pq?)

        private String nome;
        private String sobrenome;
        private String email;
        private LocalDate dataNascimento;
        private boolean userAtivo;
        private int id;
        private String isUserAtivo;

        //Passo 5: Faz o construtor do Builder

        public UserBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public UserBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public UserBuilder userAtivo(boolean userAtivo) {
            this.userAtivo = userAtivo;
            return this;
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        //Passo 6: Faz o build
        public User build() {
            if (userAtivo) {
                isUserAtivo = "Usuário Ativo";
            } else {
                isUserAtivo = "Usuário Inativo";
            }
            return new User(nome, sobrenome, email, dataNascimento, userAtivo, id, isUserAtivo);
        }
    }

    public static class TesteUser {
        public static void main(String[] args) {
            User user = new UserBuilder()
                    .nome("Nicole")
                    .sobrenome("Brito")
                    .userAtivo(true)
                    .dataNascimento(LocalDate.of(2001, 06, 15))
                    .id(001)
                    .email("nicolem.britto@gmail.com")
                    .build();

            User user2 = new UserBuilder()
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
}
