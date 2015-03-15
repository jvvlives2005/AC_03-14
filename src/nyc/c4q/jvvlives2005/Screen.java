package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/14/15.
 */
public class Screen {

    // this function returns enough blank lines to clear the console

    public static String clearScreen() {

        String blank = "";

        for (int i = 0; i < 50; i++) {
            blank = blank + "\n";
        }

        return blank;
    }


    // title art

    public static String title() {

        return (        "                                           \n" +
                "           d8P                             \n" +
                "        d888888P                           \n" +
                " .d888b,  ?88'   d888b8b    88bd88b .d888b,\n" +
                " ?8b,     88P   d8P' ?88    88P'  ` ?8b,   \n" +
                "   `?8b   88b   88b  ,88b  d88        `?8b \n" +
                "`?888P'   `?8b  `?88P'`88bd88'     `?888P' \n" +
                "                                           \n" +
                "                                           ");
    }

    public static String byline() {

        return ("                                                                \n" +
                " _    _  _  _  _  |_      _ _  _  _  _  _   |_  _  _ _. _ _  _  \n" +
                "(_|  (_)(_||||(-  |_)\\/  | (_||||(_)| )(_|  | )(_|| | |_)(_)| ) \n" +
                "     _/              /                                          \n\n\n");
    }

    // scene art

    public static String firstScene() {

        return ("                                                            ☆                                        \n" +
                "                                                                                                      \n" +
                "            ☆                              ˳✧༚                          ☆                             \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                          •ི   •ྀ     - beep beep       \n" +
                "                                                                        (⊙ ﹏ ⊙ ✿)                    \n" +
                "                                                                         ૮[ ♡   ]ა                    \n" +
                "y o u    a r e    l o s t    i n    t h e    u n i v e r s e              ~~~~~~                      \n" +
                "                                                                           ミ ミ                       \n" +
                "            ☆                                                        ☆                        ˳✧༚     \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                                                      \n");
    }

    public static String help() {
        return("\n\n  [help menu]\n\n" +
                "commands:\n\n" +
                "~ \"go to \" + location\n" +
                "~ \"pick up \" + object\n" +
                "~ \"look at \" + object\n" +
                "~ \"use the \" + object (you will be prompted for what you would like to use the object on)\n" +
                "~ \"map\" to view map\n" +
                "~ \"inventory\" to view inventory\n\n");
    }

    public static String map() {
        return("\n\n" +
                "+-------------------------------------+\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:| [rocky outcrop]   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:| [spaceship]       |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "| [gas station] |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:| [home]            |\n" +
                "|               |:| 4.5E9 light years |\n" +
                "|               |:| ----------->      |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "|               |:|                   |\n" +
                "+-------------------------------------+\n" +
                "\n");
    }

    public static String spaceShip() {
        return("                                               \n" +
                "  \\\\\\          .-'~~~~'-.        ///          \n" +
                "           .-~´          `~-.                 \n" +
                "         .-~                 ~-.              \n" +
                "        (_______________________)             \n" +
                "   _.-~`                         `~-._        \n" +
                "  /♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡=♡\\      \n" +
                "  \\___________________________________/      \n" +
                "             \\~ ~ ~ ~ ~ ~ ~/                 \n" +
                "              \\~_~_~_~_~_~/                  \n" +
                "                                              \n" +
                "                                              \n");
    }

    public static String lastScene() {

        return ("                                                            ☆                                        \n" +
                "                                                                                                      \n" +
                "            ☆                              ˳✧༚                          ☆                             \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                          •ི   •ྀ     - beep beep       \n" +
                "                                                                        (◕ ‿ ◕ ✿)                    \n" +
                "                                                                         ૮[ ♡   ]ა                    \n" +
                "y o u    a r e    h o m e                                                 ~~~~~~                      \n" +
                "                                                                           ミ ミ                       \n" +
                "            ☆                                                        ☆                        ˳✧༚     \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                                                      \n");
    }

    public static String heart() {
        return(
                "        ...e$e.$...e$                 ...e$e.$...e\n" +
                        "     !$6lkasd!$6lkasd!$6l          !$6lkasd!$6lkasd!\n" +
                        "   ;,a1wert;,a1wert;,a1wert     ;,a1wert;,a1wert;,a1we\n" +
                        " .asxzcvb.asxzcvb.asxzcvb.as   .asxzcvb.asxzcvb.asxzcvb.\n" +
                        "1qaswedfqas1wedfqas1wedfqas1wedfqas1wedfqas1edfqas1ewdfqa\n" +
                        ":lkjhgfdlkj:hgfdlkj:hgfdlkj:hgfdlkj:hgfdlkj:gfdhlkj:gfdhlk\n" +
                        "3edcvfr4edc3vfr4edc3vfr4edc3vfr4edc3vfr4edc3fr4vedc3fr4ved\n" +
                        "1234ewqa2341ewqa2341ewqa2341ewqa2341ewqa2341wqa2341weqa234\n" +
                        "o[piuytr[piouytr[piouytr[piouytr[piouytr[pioytru[pioytru[p\n" +
                        "z/xcvbnm/xczvbnm/xczvbnm/xczvbnm/xczvbnm/xczbnmv/xczbnmv/x\n" +
                        " `1qazxs`1qazxs`1wqazs`1wqazxs`1qazwxs1qa`zws1qa`zwsx1qa`\n" +
                        "  mznxbcvfmznxbcvfmzxbcnvfzxbmcnfzxvbmnfzcxvbmnfzcxvbmnf\n" +
                        "   %t^y&ujm%t^y&ujm%^y&tuj%^ym&tu%^yj&tum%^yj&tum%^yj&t\n" +
                        "     )oiuytre)oiuytr)oieuyr)otieur)oyieutr)oyieutr)oyi\n" +
                        "      z.xcvgy7z.xcvg7z.yxcg7zv.yxc7zv.ygxc7zv.ygxc7z\n" +
                        "        q[wertyuq[weryuq[wertyuq[wetyurq[wetyurq[w\n" +
                        "           a;sdfghja;sdfghja;sdfghja;sdfghja;sdf\n" +
                        "              qmprootiqmprootimprootqimproot\n" +
                        "                 mtu1qaz@mtu1qa@mtuz1qa@m             •ི   •ྀ           \n" +
                        "                    !qwe$rty!qwe$rty!q            -  (◕ ‿ ◕ ✿)        \n" +
                        "                       -p=oiuyt-p=o                   ૮[ ♡   ]ა        \n" +
                        "                           asdfg                       ~~~~~~          \n" +
                        "                             l                          ミ ミ           \n");
    }

    public static String theEnd() {
        return(
                "\n\n\n" +
                        "                    ___                  \n" +
                        "                     | |_  _     _ __  _|\n" +
                        "                     | | |(/_   (/_| |(_|");
    }


}
