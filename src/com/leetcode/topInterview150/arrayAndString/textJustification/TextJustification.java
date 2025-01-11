package com.leetcode.topInterview150.arrayAndString.textJustification;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> curWords = new ArrayList<>();
        int curLen = 0;
        for (String word : words) {
            if (curLen + word.length() + curWords.size() > maxWidth) {
                int totalSpaces = maxWidth - curLen;
                int gaps = curWords.size() - 1;
                if (gaps == 0) {
                    res.add(curWords.get(0) + " ".repeat(totalSpaces));
                } else {
                    int gapPerSpace = totalSpaces / gaps;
                    int extraSpaces = totalSpaces % gaps;
                    StringBuilder line = new StringBuilder();
                    for (int i = 0; i < curWords.size(); i++) {
                        line.append(curWords.get(i));

                        if (i < gaps) {
                            line.append(" ".repeat(gapPerSpace));

                            if (i < extraSpaces) {
                                line.append(' ');
                            }
                        }

                    }
                    res.add(line.toString());
                }
                curWords.clear();
                curLen = 0;
            }
            curWords.add(word);
            curLen += word.length();
        }

        StringBuilder lastLine = new StringBuilder(String.join(" ", curWords));
        while (lastLine.length() < maxWidth) {
            lastLine.append(' ');
        }
        res.add(lastLine.toString());
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        System.out.println(fullJustify(words, maxWidth));
    }
}
