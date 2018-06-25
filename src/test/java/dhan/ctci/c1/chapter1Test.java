package dhan.ctci.c1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;

public class chapter1Test {

  @Test
  public void isUnique1() {
    String test = "abracadabra";
    assertFalse(hasAllUniqueHashSet(test));
  }

  @Test
  public void isUnique2() {
    String test = "abcdefghijklmn";
    assertTrue(hasAllUniqueHashSet(test));
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
