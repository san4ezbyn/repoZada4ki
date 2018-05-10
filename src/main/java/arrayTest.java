public class arrayTest {
    //заполнение массива
    public static void main ( String args[] ) {
     /*   int t, i;
        int table[][] = new int[3][4];
        for (t = 0; t < 3; ++t)

        {
            for (i = 0; i < 4; ++i) {
                table[t][i] = ( t * 4 ) + i + 1;
                System.out.print ( table[t][i] + " " );
            }
            System.out.println ();
        }*/


  /*   //Два способа отображения содержания массива
        // First способ отображения содержания массива
        int []myList={1,6,4,8,5};
        for (int i=0; i<myList.length; i++){
            System.out.println(myList[i]);
        }
//Second способ отображения содержания массива
        System.out.println("А это nums:\n");
        int []mySecondList={100,70,50,25,5,0};
        for (int nums : mySecondList){

            System.out.println( nums);
        }*/



        // Присваивание ссылок на массивы,

            /*    int i;
                int numsl[] = new int[10];
                int nums2[] = new int [10];
                for(i=0; i < 10; i++)
                    numsl[i] = i;

                for(i=0; i < 10; i++)
                    nums2[i] = -i;
                System.out.print("Here is numsl: ");
                for(i=0; i < 10; i++)
                    System.out.print(numsl[i] + " ");
                System.out.println() ;
                System.out.print("Here is nums2: ");
                for(i=0; i < 10; i++)
                    System.out.print(nums2[i] + " ");
                System.out.println();*/


// division by zero - exception catch
       /* public static int div (int x, int y){

            if (y==0) {
                throw new ArithmeticException();
            }
            return x/y;
        }

        @Test (expected = ArithmeticException.class)
        public void DivByZero (){


            Assert.assertEquals ("Division by Zero", 6, noFileError.div ( 36,0));
        }
*/

       /* String sql;
        sql = "SELECT type, name, weight from sweets";
        CharSequence cs1      = "type";
        boolean      retvalue = sql.contains ( "type, name" );

        System.out.println ( "Method returns : " + retvalue );*/









    }
}
