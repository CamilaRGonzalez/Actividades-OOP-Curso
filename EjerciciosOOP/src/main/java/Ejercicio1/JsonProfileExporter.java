package Ejercicio1;

public class JsonProfileExporter implements IProfileExporter{
    @Override
    public void export(UserProfile profile) {
        String json = String.format(
                "{\"username\": \"%s\", \"email\": \"%s\"}",
                profile.getUsername(),
                profile.getEmail()
        );
        System.out.println("Exportando a JSON:");
        System.out.println(json);
    }
}
