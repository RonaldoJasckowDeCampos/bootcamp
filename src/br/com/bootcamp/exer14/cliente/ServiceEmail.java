package br.com.bootcamp.exer14.cliente;

public interface ServiceEmail {
    Boolean enviar(Email email);
    Email ler(Email email);
    Email receber(Email email);
}
