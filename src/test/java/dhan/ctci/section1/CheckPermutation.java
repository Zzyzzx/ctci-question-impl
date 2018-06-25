package dhan.ctci.section1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CheckPermutation {

  @Test
  public void testPermutation() {
    assertTrue(isPermutationSorting("abcde", "edcba"));
    assertFalse(isPermutationSorting("abcde", "efghi"));
  }

  public boolean isPermutationSorting(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    for (int i = 0; i < s1Array.length; i++) {
      if (s1Array[i] != s2Array[i]) {
        return false;
      }
    }
    return true;
  }
}
