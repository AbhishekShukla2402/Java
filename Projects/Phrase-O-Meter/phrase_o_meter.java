public class phrase_o_meter {
    public static void main(String[] args){
        String[] word_list_1 = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "six-sigma","critical-path", "dynamic"};

        String[] word_list_2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] word_list_3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mind-share", "portal", "space", "vision", "paradigm", "mission"};

        int len1 = word_list_1.length;
        int len2 = word_list_2.length;
        int len3 = word_list_3.length;

        int rand1 = (int)(Math.random()*len1);
        int rand2 = (int)(Math.random()*len2);
        int rand3 = (int)(Math.random()*len3);

        String phrase = word_list_1[rand1] + " " + word_list_2[rand2] + " " + word_list_3[rand3];
        System.out.println("What we need is a " + phrase+"!");
    }
}
