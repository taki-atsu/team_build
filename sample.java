import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class sample {

    // 画像表示用のフレームを作るメソッド
    public static void showImageWindow() {
        JFrame frame = new JFrame("画像表示");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 4000);
        frame.setLocationRelativeTo(null);

        // 画像ファイルのパスを指定してください
        ImageIcon icon = new ImageIcon("image.jpg");

        JLabel label = new JLabel(icon);
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        String word_na = "「なあなあ、さやって知ってる？」";
        String word_ni = "２千年前の記憶が蘇る、、";
        String word_nu = "濡れたあの子に傘をさす";
        String word_ne = "「ねぇねぇ、一緒にねるねるねるねのうえでおねんねしない？」";
        String word_no = "のんびりと過ごして楽しかった";

        Scanner sc = new Scanner(System.in);

        // 「な」の行をコンソールに表示
        System.out.println("な：" + word_na);
        System.out.println("画像を表示するにはEnterキーを押してください...");
        sc.nextLine();  // Enterキーで待つ

        // Swingの画像表示ウィンドウを表示（イベントディスパッチスレッド上で起動）
        SwingUtilities.invokeLater(() -> showImageWindow());

        // 「に」以降の行を表示（必要なら）
        System.out.println("に：" + word_ni);
        System.out.println("ぬ：" + word_nu);
        System.out.println("ね：" + word_ne);
        System.out.println("の：" + word_no);

        sc.close();
    }
}
