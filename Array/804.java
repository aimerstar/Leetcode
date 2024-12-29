/*
 * 輸入幾組文字，找出不同的摩斯密碼有幾組
 */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set set = new HashSet();
		Map<String,String> letter = new HashMap<String,String>(){
	        {
	            put("a", ".-");
	            put("b", "-...");
	            put("c", "-.-.");
	            put("d", "-..");
	            put("e", ".");
	            put("f", "..-.");
	            put("g", "--.");
	            put("h", "....");
	            put("i", "..");
	            put("j", ".---");
	            put("k", "-.-");
	            put("l", ".-..");
	            put("m", "--");
	            put("n", "-.");
	            put("o", "---");
	            put("p", ".--.");
	            put("q", "--.-");
	            put("r", ".-.");
	            put("s", "...");
	            put("t", "-");
	            put("u", "..-");
	            put("v", "...-");
	            put("w", ".--");
	            put("x", "-..-");
	            put("y", "-.--");
	            put("z", "--..");
	        }
	    };
		for (int i = 0; i < words.length; i++) {
			String mos = "";
			for (int j = 0; j < words[i].length(); j++) {
				mos += letter.get(words[i].substring(j, j + 1));
			}
			set.add(mos);
		}
        return set.size();
    }
}
