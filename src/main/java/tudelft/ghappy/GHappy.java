package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str != null;
        Boolean g = false; //em

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                g = true;//em
                if (i > 0 && str.charAt(i - 1) == 'g') { continue; }
                if (i + 1 < str.length() && str.charAt(i + 1) == 'g') { continue; }
                return false;
            }
        }
        return g; //em
    }
}
