import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int[] sort_heights = Arrays.copyOf(heights,heights.length);
        int area = 0;
        Arrays.sort(sort_heights);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int temp = 0;

        for(int i = 0; i < sort_heights.length; i++){
            if(sort_heights[i] != temp)
            {
                array.add(sort_heights[i]);
                temp = sort_heights[i];
            }
        }

        for(int i = 0 ; i < array.size() ; i++){
            // system.out.println(list.get(i));　
            int temp_height = array.get(i);



            int temp_width = 0;
            int width = 0;
            int temp_area = 0;
            for(int j = 0; j < heights.length; j++){
                if(heights[j] >= temp_height)
                {

                    temp_width ++;

                }
                else
                {
                    if (temp_width > width)
                        width = temp_width;
                    temp_width = 0;
                }
                if(j == heights.length)
                {
                    width = temp_width;
                }
            }

            temp_area = temp_height*width;
            if(area < temp_area)
            {
                area = temp_area;
            }


        }

    }



}
