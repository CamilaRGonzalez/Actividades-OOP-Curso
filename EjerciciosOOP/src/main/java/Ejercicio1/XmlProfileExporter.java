package Ejercicio1;

public class XmlProfileExporter implements IProfileExporter{
    @Override
    public void export(UserProfile profile) {
        String xml = String.format(
                "<user><username>%s</username><email>%s</email></user>",
                profile.getUsername(),
                profile.getEmail()
        );
        System.out.println("Exportando a XML:");
        System.out.println(xml);
    }
}
