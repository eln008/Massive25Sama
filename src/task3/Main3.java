package task3;

public class Main3 {
    public static void main(String[] args) {
/*3.	Даны температуры воздуха за неделю. Определить среднюю
температуру за неделю и сколько раз температура опускалась ниже 0º.*/
        int[] temp = {3,-5,2,6,-1,9};
        int sum = 0;
        int nizhe = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            if(temp[i]<0){
                nizhe++;
            }
        }
        System.out.println("средняя температура за неделю  "+sum);
        System.out.println(nizhe+ " раз температура опускалась ниже 0º");
    }
}
