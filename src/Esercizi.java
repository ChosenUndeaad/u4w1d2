public class Esercizio1 {

    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "esempio";
        int anno = 2024;

        System.out.println("La stringa \"" + s + "\" ha lunghezza pari? " + stringaPariDispari(s));
        System.out.println("L'anno " + anno + " è bisestile? " + annoBisestile(anno));
    }
}
