package leetcode;

	import java.util.*;

	public class printJK {
		public static void main(String[] args) {
			printJK pjk = new printJK();
			for(String s : pjk.printJK("JK??JK??")) {
				System.out.println("answers");
				System.out.println("length: " + s.length() + ", s: "+ s);
			}
			/* JKJJKJ
			 * JKJJKK
			 * JKKJKJ
			 * JKKJKK
			 * */
		}

		public List<String> printJK(String str) {
			List<String> rs = new ArrayList<String>();
			if(str == null || str.length() == 0) {
				return rs;
			}
			helper(rs, new StringBuilder(), str, 0);
			return rs;
		}
		
		private void helper(List<String> rs, StringBuilder sb, String str, int pos) {
			if(pos == str.length()) {
				rs.add(sb.toString());
				return;
			}
			int move = 0;
			while(pos < str.length() && str.charAt(pos) != '?') {
				move += 1;
				sb.append(str.charAt(pos++));
			}
			System.out.println(sb.toString());
			
			sb.append('J');
			helper(rs, sb, str, pos+1);
			//System.out.println(sb.toString());
			
			sb.setCharAt(pos, 'K');
			
			//System.out.println(sb.toString());
			
			helper(rs, sb, str, pos+1);
			sb.delete(pos - move, sb.length()); // delete back to the pos of last level!
			// here the pos we had is for the current level
			//JK?JK?
		}
	}


