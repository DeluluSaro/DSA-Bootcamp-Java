class Pattern{
    public static void main(String[] args) {
        trianglePat(3,5);
    }

    public static void trianglePat(int row,int col){


        if(row==0){
            return ;
        }

        if(col<row){
            System.out.print("*"+' ');
            trianglePat(row, col+1);
        }else{
            System.out.println();
            trianglePat(row-1, 0);
        }
    }
}