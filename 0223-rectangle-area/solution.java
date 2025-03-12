class Solution {
    public int areaRectangle(int x1,int x2,int y1, int y2){
        int len = x2-x1;
        int bre = y2-y1;
        return len * bre;
    }

    public int overLapArea(int a1,int a2,int b1,int b2,int x1, int x2,int y1,int y2){
        int c1 = Math.max(a1,x1);
        int c2 = Math.min(a2,x2);
        int d1 = Math.max(b1,y1);
        int d2 = Math.min(b2,y2);

        return Math.max(0,c2-c1) * Math.max(0,d2-d1);
    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = areaRectangle(ax1,ax2,ay1,ay2);
        int area2 = areaRectangle(bx1,bx2,by1,by2);
        int totalArea = area1 + area2;
        int overArea = overLapArea(ax1,ax2,ay1,ay2,bx1,bx2,by1,by2);
        return totalArea - overArea;
    }
}
