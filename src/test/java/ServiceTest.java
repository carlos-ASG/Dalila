import com.dalila.compiler.service.LerxerService;
public class ServiceTest {
    private static void AnalizarCodigoTest(){
       System.out.print(LerxerService.AnalizarCodigo("src/test/java/codigo.txt"));
    }

    public static void main(String[] args) {
        AnalizarCodigoTest();
    }
}
