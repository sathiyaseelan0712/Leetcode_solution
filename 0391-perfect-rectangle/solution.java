class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        if (rectangles == null || rectangles.length == 0) return false;

        int x1 = Integer.MAX_VALUE, y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE, y2 = Integer.MIN_VALUE;
        int area = 0;

        Set<String> set = new HashSet<>();

        for (int[] rect : rectangles) {
            int a = rect[0], b = rect[1], c = rect[2], d = rect[3];

            x1 = Math.min(x1, a);
            y1 = Math.min(y1, b);
            x2 = Math.max(x2, c);
            y2 = Math.max(y2, d);

            area += (c - a) * (d - b);

            String[] points = {
                a + " " + b,
                a + " " + d,
                c + " " + b,
                c + " " + d
            };

            for (String p : points) {
                if (!set.add(p)) {
                    set.remove(p);
                }
            }
        }

        int expectedArea = (x2 - x1) * (y2 - y1);
        if (area != expectedArea) return false;

        if (set.size() != 4 ||
            !set.contains(x1 + " " + y1) ||
            !set.contains(x1 + " " + y2) ||
            !set.contains(x2 + " " + y1) ||
            !set.contains(x2 + " " + y2)) {
            return false;
        }

        return true;
    }
}

