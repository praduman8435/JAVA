public class patternproblem {
    public static void hollow_rectangle(int totrow, int totcol) {
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //inverted and rotaterd half pyramid
    public static void halfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //inverted half pyramid
    public static void inverted_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //floyd's triangle
    public static void floyds(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    //0-1 triangle
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    //butterfly pattern
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=1;x<=n;x++){
            for (int y=1;y<=n-x;y++){
                System.out.print("*");
                }
            for (int y=1;y<=x;y++){
                System.out.print(" ");
            }
            for (int y=1;y<=x;y++){
                System.out.print(" ");
            }
            for (int y=1;y<=n-x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
            }


            //solid rhombus
    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hollow rhombus
    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {
for (int j=1;j<=n-i;j++){
    System.out.print(" ");
}
for (int j=1;j<=n;j++){
   if(i==1 || i==n ||j==1 ||j==n){
       System.out.print("*");
    }
   else {
       System.out.print(" ");
   }
}
            System.out.println();
        }
    }


    //diamond pattern
    public static void diamond(int n){
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n ;i>=1;i--){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
        public static void main (String[]args){
            hollow_rectangle(10, 7);
            System.out.println();
            halfpyramid(5);
            System.out.println();
            inverted_half_pyramid(7);
            System.out.println();
            floyds(3);
            triangle(6);
            butterfly(6);
            solid_rhombus(9);
            hollow_rhombus(7);
            diamond(7);
        }
    }
