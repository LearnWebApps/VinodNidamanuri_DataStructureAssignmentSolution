package question1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class getfloors 
{
	public static void unblocked(int size, List<Integer> floors) 
	{
        Set<Integer> buffer = new HashSet<>();

        for (int i = 0, waiting = size; i< floors.size(); i++) 
        {
            if (floors.get(i) == waiting) 
            {
                buffer.add(floors.get(i));
                waiting = checkOther(waiting, buffer, i);
            } else 
            {
                System.out.printf("Day %s : \n", i + 1);
                buffer.add(floors.get(i));
            }
        }

    }

    private static int checkOther(int waiting, Set<Integer> buffer, int i) 
    {
        StringBuilder builder = new StringBuilder();
        while (!buffer.isEmpty() && buffer.remove(waiting)) 
        {
            builder.append(" "+ waiting--);
        }
        System.out.printf("Day %s : %s%n", i+1, builder.toString());
        return waiting;
    }

}
