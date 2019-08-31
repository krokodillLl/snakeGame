import javax.swing.*;
import java.io.IOException;

 class MainWindow extends JFrame {
     MainWindow() throws IOException {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(336, 365);
        setLocation(MainMenu.locationWindow); // распологаем по последним координатам окна
        add(new GameField());
        setVisible(true);
    }
}
