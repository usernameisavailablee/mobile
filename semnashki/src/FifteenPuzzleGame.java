import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FifteenPuzzleGame extends JFrame {
    private static final int GRID_SIZE = 4; // Размер сетки (4x4)
    private JButton[][] buttons; // Массив кнопок
    private JPanel panel; // Панель для размещения кнопок

    public FifteenPuzzleGame() {
        setTitle("Игра 'Пятнашки'");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));

        buttons = new JButton[GRID_SIZE][GRID_SIZE];

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                int number = i * GRID_SIZE + j + 1;
                buttons[i][j] = new JButton(String.valueOf(number));
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 24));
                buttons[i][j].addActionListener(new ButtonClickListener());
                panel.add(buttons[i][j]);
            }
        }

        // Пустая кнопка
        buttons[GRID_SIZE - 1][GRID_SIZE - 1].setText("");
        buttons[GRID_SIZE - 1][GRID_SIZE - 1].setEnabled(false);

        add(panel);
        shuffleButtons(); // Перемешиваем кнопки
    }

    // Перемешивание кнопок
    private void shuffleButtons() {
        for (int i = 0; i < 1000; i++) {
            int randomX1 = (int) (Math.random() * GRID_SIZE);
            int randomY1 = (int) (Math.random() * GRID_SIZE);
            int randomX2 = (int) (Math.random() * GRID_SIZE);
            int randomY2 = (int) (Math.random() * GRID_SIZE);

            swapButtons(randomX1, randomY1, randomX2, randomY2);
        }
    }

    // Обработчик нажатия кнопки
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();

            int x = -1, y = -1;
            // Находим координаты нажатой кнопки
            for (int i = 0; i < GRID_SIZE; i++) {
                for (int j = 0; j < GRID_SIZE; j++) {
                    if (buttons[i][j] == clickedButton) {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }

            // Проверяем, можно ли переместить кнопку
            if (x > 0 && buttons[x - 1][y].getText().equals("")) {
                swapButtons(x, y, x - 1, y);
            } else if (x < GRID_SIZE - 1 && buttons[x + 1][y].getText().equals("")) {
                swapButtons(x, y, x + 1, y);
            } else if (y > 0 && buttons[x][y - 1].getText().equals("")) {
                swapButtons(x, y, x, y - 1);
            } else if (y < GRID_SIZE - 1 && buttons[x][y + 1].getText().equals("")) {
                swapButtons(x, y, x, y + 1);
            }

            // Проверяем, выиграли ли игру
            if (isGameWon()) {
                JOptionPane.showMessageDialog(FifteenPuzzleGame.this, "Поздравляем, вы выиграли!");
                System.exit(0);
            }
        }
    }

    // Проверка на выигрыш
    private boolean isGameWon() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                int number = i * GRID_SIZE + j + 1;
                if (!buttons[i][j].getText().equals("") && Integer.parseInt(buttons[i][j].getText()) != number) {
                    return false;
                }
            }
        }
        return true;
    }

    // Метод для обмена местами двух кнопок
    private void swapButtons(int x1, int y1, int x2, int y2) {
        String tempText = buttons[x1][y1].getText();
        buttons[x1][y1].setText(buttons[x2][y2].getText());
        buttons[x2][y2].setText(tempText);
        buttons[x1][y1].setEnabled(!tempText.equals(""));
        buttons[x2][y2].setEnabled(!tempText.equals(""));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FifteenPuzzleGame game = new FifteenPuzzleGame();
            game.setVisible(true);
        });
    }
}
