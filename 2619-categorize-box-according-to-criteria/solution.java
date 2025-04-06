class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        String category = new String();

        long bL = (long) Math.pow(10, 4);
        long vL = (long) Math.pow(10, 9);
        boolean isHeavy = (m >= 100);
        boolean isBulky = false;

        if ((long) l * w * h >= vL) isBulky = true;
        if (l >= bL || w >= bL || h >= bL) isBulky = true;

        if (isHeavy && isBulky) category = "Both";
        else if (!isHeavy && !isBulky) category = "Neither";
        else if (isBulky) category = "Bulky";
        else category = "Heavy";

        return category;
    }
}
