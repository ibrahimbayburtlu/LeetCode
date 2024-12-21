import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mapAnagram = new HashMap<>();
        HashMap<Character, Integer> mapAnagramSecondWord = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mapAnagram.put(ch, mapAnagram.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mapAnagramSecondWord.put(ch, mapAnagramSecondWord.getOrDefault(ch, 0) + 1);
        }


        for (char ch : mapAnagram.keySet()) {
            if (!mapAnagramSecondWord.containsKey(ch) || 
                !mapAnagramSecondWord.get(ch).equals(mapAnagram.get(ch))) {
                return false;
            }
        }

        return true;
    }
}

/*
Anagram demek aslında aynı karakterlerden oluşan başka bir kelime demektir.
Soruyu anlamak için birkaç şey netleştirilebilir:
- Verilen iki kelime (s ve t) mi?
- Uzunluk sınırları nedir?
- Sadece küçük harfler mi içeriyorlar?
Bu durumda test edilen karakterler sadece İngilizce küçük harflerden oluşuyor.
*/
