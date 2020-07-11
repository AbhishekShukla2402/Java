public class launcher {
    public static void main(String[] args)
    {
        take_player_names tpn = new take_player_names();
        who_goes_first w = new who_goes_first();
        guess_game gg = new guess_game();

        gg.start_game(w.decide(tpn.enter_names()));

    }
}
