class Solution {
  public boolean isNumber(String s) {
    s = s.trim();
    if (s.isEmpty())
      return false;

    boolean sN = false;
    boolean sD = false;
    boolean sE = false;

    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
        case '.':
          if (sD || sE)
            return false;
          sD= true;
          break;
        case 'e':
        case 'E':
          if (sE || !sN)
            return false;
          sE = true;
          sN = false;
          break;
        case '+':
        case '-':
          if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
            return false;
          sN = false;
          break;
        default:
          if (!Character.isDigit(s.charAt(i)))
            return false;
          sN = true;
      }
    }

    return sN;
  }
}
