package cm.code;
/*
    1 一種引用型態
    2 可以放多個data，但型態必須統一
    3 array在執行程式時，長度不變

    常見的初始化
    1 動態初始化 (指定長度)
        數據型態[] array名稱 = new 數據型態[array長度]
    2 靜態初始化 (指定內容)
        數據型態[] array名稱 = new 數據型態[]{元素1,元素2, ...}

    array如果沒有給定初始值，系統會依據型態賦值
    int           0
    float/double  0.0
    char          '\u0000'
    boolean       false
    引用型態        null
*/
public class Array {
    public static void main(String[] args) {

        //動態初始化 (指定長度)
        int[] new_array = new int[300];

        //靜態初始化 (指定內容)
        //int[] new_array2= new int[]{5,10,15};與下相同
        /* int[] new_array2;
        new_array2=new int[]{5,10,15};*/

        //也可以省略右邊的 new int[]
        int[] new_array2={5,10,15};
        /*
            但是
            int[] new_array2;
            new_array2={5,10,15};
            是錯誤的
        */

        System.out.println(new_array2+"<此為array存取的位置");

        //以下為回傳陣列之實做
        int [] answer = cal(3,1);
        System.out.println("a+b= "+answer[0]);
        System.out.println("a-b= "+answer[1]);

    }

    public static int [] cal (int a, int b){//[] 函式名稱 <<函式返回微陣列型態
        /*
        int [] output =new int[2];
        output[0]=a+b;
        output[1]=a-b;
        */

        int []  output ={a+b,a-b};


        return output;
    }


}
