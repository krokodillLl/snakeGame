import javax.swing.*;
import java.io.IOException;

public class MainWindow extends JFrame {
    public MainWindow() throws IOException {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(336, 357);
        setLocation(MainMenu.locationWindow); // распологаем по последним координатам окна
        add(new GameField());
        setFocusable(true);
        setVisible(true);
    }
}
