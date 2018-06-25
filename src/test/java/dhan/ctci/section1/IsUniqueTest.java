package dhan.ctci.section1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class IsUniqueTest {

  String notUnique = "abracadabra";
  String allUnique = "abcdefghijklmn";

  @Test
  public void isUniqueHashSet() {
    assertFalse(hasAllUniqueHashSet(notUnique));
    assertTrue(hasAllUniqueHashSet(allUnique));

  }

  @Test
  public void isUniqueNoDatastructres() {
    assertFalse(hasAllUniqueSorting(notUnique));
    assertTrue(hasAllUniqueSorting(allUnique));
  }

  public List<Character> toList(String s) {
    List<Character> list = new ArrayList<Character>();
    char[] charArray = s.toCharArray();

    for (char c : charArray)
      list.add(c);

    return list;
  }

  public boolean hasAllUniqueSorting(String s) {
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);

    for (int i = 1; i < charArray.length; i++) {
      if (charArray[i - 1] == charArray[i]) {
        return false;
      }
    }
    return true;
  }

  public boolean hasAllUniqueHashSet(String s) {
    char[] chars = s.toCharArray();
    HashSet<Character> charSet = new HashSet<Character>();

    for (char c : chars)
      charSet.add(c);

    if (charSet.size() != chars.length)
      return false;
    return true;
  }

}
