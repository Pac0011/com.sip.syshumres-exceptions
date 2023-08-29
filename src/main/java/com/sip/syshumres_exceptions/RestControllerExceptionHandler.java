package com.sip.syshumres_exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MaxUploadSizeExceededException;


/**
 * Clase Exception. Manejo de excepciones globales
 * 
 * @author Prong
 * @version 2.0
 */
@PropertySource("classpath:uploadfile.properties")
@RestControllerAdvice
public class RestControllerExceptionHandler {
	
	@Value("${spring.servlet.multipart.max-file-size}")
	private String maxFileSize;
	
	//When param type not match with value send
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ErrorMessage handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
	    String description = String.format("'%s' debe ser '%s' y no '%s'", 
	    		ex.getName(), ex.getRequiredType().getSimpleName(), ex.getValue());
	    MethodArgumentTypeMismatchCustomException exCustom = new MethodArgumentTypeMismatchCustomException(description);
	    
	    return new ErrorMessage(exCustom, "");
	}
	
	//When uploap file exceeds the limit
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MaxUploadSizeExceededException.class)
    public ErrorMessage handleMaxUploadException(MaxUploadSizeExceededException ex){
	    String description = String.format("El archivo debe ser menor a '%s' bytes", this.maxFileSize);
	    MaxUploadSizeExceededCustomException  exCustom = new MaxUploadSizeExceededCustomException(description);
	    
	    return new ErrorMessage(exCustom, "");
    }
	
	//When missing param in request
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ErrorMessage handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
	    return new ErrorMessage(ex, "");
    }
    
    //Custom Exceptions
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({EntityIdNotFoundException.class, UserSessionNotFoundException.class, BranchOfficeUserNotFoundException.class, 
    	StatusCatalogNotFoundException.class, UsernameNotFoundException.class, EmailUserNotFoundException.class})
    @ResponseBody
    public ErrorMessage notFoundRequest(HttpServletRequest request, Exception ex) {
	    return new ErrorMessage(ex, request.getRequestURI());
    }
    
    //Cualquier error que se escape se maneja con Exception.class
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class, IdsEntityNotEqualsException.class, EmployeeFieldsAlreadyExistException.class, 
    	ProspectFieldsAlreadyExistException.class, CreateEmployeeProfileException.class, FatherAssignException.class,
    	UploadFormatsAllowException.class, CreateRegisterException.class, SendEmailException.class, UrlInvalidException.class, 
    	InvalidFieldException.class, ChangePasswordException.class, UploadFileException.class, UnknownOptionException.class, 
    	MalFormedHeaderException.class})
    @ResponseBody
    public ErrorMessage badRequest(Exception ex) {
	    return new ErrorMessage(ex, "");
    }
    
    //{ForbiddenException.class
    /*@ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({org.springframework.security.access.AccessDeniedException.class})
    @ResponseBody
    public ErrorMessage forbiddenRequest(Exception ex) {
    	return new ErrorMessage(ex, "");
    }*/
    
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({UnauthorizedException.class})
    public void unauthorizedRequest(Exception ex) {
    }
    
    //@ResponseStatus(HttpStatus.BAD_GATEWAY)
    //@ExceptionHandler({BadGatewayException.class})
    //public void badGateway(Exception ex) {
        //return new ErrorMessage(ex, HttpStatus.BAD_GATEWAY.toString());
    //}
    
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    //@ExceptionHandler({Exception.class})
    //public ErrorMessage exception(Exception ex) {
    //	ex.printStackTrace();//No Production
    	//return new ErrorMessage(ex, HttpStatus.INTERNAL_SERVER_ERROR.toString());
    //}

}
