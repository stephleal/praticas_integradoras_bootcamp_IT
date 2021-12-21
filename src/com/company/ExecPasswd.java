package com.company;

public class ExecPasswd {

    public static void main(String[] args) {

        PasswdFraca senha = new PasswdFraca();
        PasswdFraca senha2 = new PasswdFraca();

        PasswdMedia senha3 = new PasswdMedia();
        PasswdMedia senha4 = new PasswdMedia();

        PasswdForte senha5 = new PasswdForte();
        PasswdForte senha6 = new PasswdForte();

        try {
            senha.setValue("aaZZa44");
        } catch (Exception e) {
            System.out.println("Senha 1 inválida");
        }

        try {
            senha2.setValue("aaaaaaaa");
        } catch (Exception e) {
            System.out.println("Senha 2 inválida");
        }

        try {
            senha3.setValue("aazza44@");
        } catch (Exception e) {
            System.out.println("Senha 3 inválida");
        }

        try {
            senha4.setValue("aaZZa44@");
        } catch (Exception e) {
            System.out.println("Senha 4 inválida");
        }

        try {
            senha5.setValue("aaZZa44o");
        } catch (Exception e) {
            System.out.println("Senha 5 inválida");
        }

        try {
            senha6.setValue("aaZZa44@");
        } catch (Exception e) {
            System.out.println("Senha 6 inválida");
        }

    }
}
