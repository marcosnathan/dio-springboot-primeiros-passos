package dio.springboot.api.handler;

public class BusinessException extends RuntimeException{
    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object... args){
        super(String.format(mensagem, args));
    }
}
