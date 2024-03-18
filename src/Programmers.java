public class Programmers {
    public static void main(String[] args) {
        String s = "  try    hello   world  ";
        s=s.trim();
        String[] words = s.split("\\s+"); //단어 분리

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray(); //단어에서 문자 분리

            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0) ch[j] = Character.toUpperCase(ch[j]); //짝수이면 대문자
                else ch[j] = Character.toLowerCase(ch[j]); //홀수 소문자
            }
            words[i] = new String(ch);

        }
        String result = String.join(" ", words);


    }
}