import com.faas.spi.Printer;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Printer> printers = ServiceLoader.load(Printer.class);

        Iterator<Printer> iterator = printers.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }
}
