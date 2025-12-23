import java.util.Scanner;

public class RockPaperScissor {

    public static String computerChoice() {
        int num = (int)(Math.random() * 3);
        if (num == 0) return "rock";
        if (num == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";

        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("rock") && comp.equals("paper")) return "computer";

        if (user.equals("paper") && comp.equals("rock")) return "user";
        if (user.equals("paper") && comp.equals("scissors")) return "computer";

        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("scissors") && comp.equals("rock")) return "computer";

        return "invalid";
    }

    public static String[][] calculateStats(int userWin, int compWin, int total) {

        String[][] stats = new String[2][3];

        double userPercent = (userWin * 100.0) / total;
        double compPercent = (compWin * 100.0) / total;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    public static void displayResult(String[][] games, String[][] stats) {

        System.out.println("Game  User      Computer  Winner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1)+"     "+games[i][0]+"     "+games[i][1]+"     "+games[i][2]);
        }

        System.out.println();
        System.out.println("Player     Wins     Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0]+"     "+stats[i][1]+"        "+stats[i][2]+"%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[][] games = new String[n][3];

        int userWin = 0;
        int compWin = 0;

        for (int i = 0; i < n; i++) {

            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = winner;

            if (winner.equals("user")) userWin++;
            if (winner.equals("computer")) compWin++;
        }

        String[][] stats = calculateStats(userWin, compWin, n);
        displayResult(games, stats);
    }
}
