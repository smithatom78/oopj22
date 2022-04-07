package module3;
public class AgeException extends Exception
{
private String message;
public AgeException(String msg) 
{message=msg;
	}
public String getMessage()
{return message;
	}
}
