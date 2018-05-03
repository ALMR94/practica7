package ejercicio3;

public class MiExcepcion extends Exception
{
    public MiExcepcion (String mensaje, Throwable causa)
    {
        super(mensaje, causa);
    }
}
