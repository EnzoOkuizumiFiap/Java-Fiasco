package br.com.movieflix.exception;

/* #P110 11 Exceptions - Refatorando o projeto */
public class UsernameOrPasswordInvalidException extends RuntimeException{
    public UsernameOrPasswordInvalidException(String message){
        super(message);
    }
}
