package com.scaler.academy.hashing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("abbbaabbbabbbbabababbbbbbbaabaaabbaaababbabbabbaababbbaaabbabaabbaabbabbbbbababbbababbbbaabababba", "abaaabbbabaaabbbbabaabbabaaaababbbbabbbaaaabaababbbbaaaabbbaaaabaabbaaabbaabaaabbabbaaaababbabbaa", "babbabbaaabbbbabaaaabaabaabbbabaabaaabbbbbbabbabababbbabaabaabbaabaabaabbaabbbabaabbbabaaaabbbbab", "bbbabaaabaaaaabaabaaaaaaabbabaaaabbababbabbabbaabbabaaabaabbbabbaabaabaabaaaabbabbabaaababbaababb", "abbbbbbbbbbbbabaabbbbabababaabaabbbababbabbabaaaabaabbabbaaabbaaaabbaabbbbbaaaabaaaaababababaabab", "aabbbbaaabbaabbbbabbbbbaabbababbbbababbbabaabbbbbbababaaaabbbabaabbbbabbbababbbaaabbabaaaabaaaaba", "abbaaababbbabbbbabababbbababbbaaaaabbbbbbaaaabbaaabbbbbbabbabbabbaabbbbaabaabbababbbaabbbaababbaa", "aabaaabaaaaaabbbbaabbabaaaabbaababaaabbabbaaaaababaaabaabbbabbababaabababbaabaababbaabbabbbaaabbb");

		//List<String> list = List.of("cat", "dog", "god", "tca");
		
		Anagrams anagrams = new Anagrams();
		ArrayList<ArrayList<Integer>> result = anagrams.anagrams(list);
		System.out.println(result);
	}

	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		Map<List<Integer>,ArrayList<Integer>> freMap = new HashMap<>();
		
		
		for(int i=0;i<A.size();i++) {
			
			int []indArr = new int[26];
			
			
			for(char c:A.get(i).toCharArray()) {
				int index=c-97;
				indArr[index]++;
			}
			
			List<Integer> indList = Arrays.stream(indArr)        // IntStream
                    .boxed()          // Stream<Integer>
                    .collect(Collectors.toList());

			ArrayList<Integer> list = freMap.getOrDefault(indList, new ArrayList<Integer>());
			list.add(i+1);
			freMap.put(indList, list);
        }
		
		result.addAll(freMap.values());
		
		return result;
	}
}
