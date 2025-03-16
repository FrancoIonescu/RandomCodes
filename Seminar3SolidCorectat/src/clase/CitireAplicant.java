package clase;

import java.io.*;
import java.util.List;

public interface CitireAplicant {
    List<Aplicant> citesteAplicant(String filePath) throws IOException;
}
