import java.util.ArrayList;
import java.util.HashMap;

// MOV function not processing negative numbers



public class FIVE_simple_assembler_interpreter {

    static void MOV(HashMap<String, Integer> reg_map, String[] tmp)
    {
        if(tmp[0].equals("mov"))
        {
            if(!reg_map.containsKey(tmp[1]) && Character.isDigit(tmp[2].charAt(0)))
            {
                reg_map.put(tmp[1],Integer.parseInt(tmp[2]));
            }
            else if(!reg_map.containsKey(tmp[1]) && !Character.isDigit(tmp[2].charAt(0)))
            {
                reg_map.put(tmp[1], reg_map.get(tmp[2]));
            }
            else if(reg_map.containsKey(tmp[1]) && Character.isDigit(tmp[2].charAt(0)))
            {
                reg_map.put(tmp[1], Integer.parseInt(tmp[2]));
            }
            else if(reg_map.containsKey(tmp[1]) && !Character.isDigit(tmp[2].charAt(0)))
            {
                reg_map.put(tmp[1], reg_map.get(tmp[2]));
            }
        }
    }


    static void INC(HashMap<String, Integer> reg_map, String[] tmp)
    {
        reg_map.put(tmp[1], reg_map.get(tmp[1])+1);
    }

    static void DEC(HashMap<String, Integer> reg_map, String[] tmp)
    {
        reg_map.put(tmp[1], reg_map.get(tmp[1])-1);
    }

    static void JNZ(String[] arr, int i, String reg_const, String num)
    {
        int index = -1;
        if(Integer.parseInt(num)<0)
        {
            index = i-Integer.parseInt(num);
        }
        else
        {
            index = i+Integer.parseInt(num);
        }


    }




    public static void main(String[] args)
    {
        String[] arr = {"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"};

        HashMap<String, Integer> reg_map = new HashMap<>();

        int i=0;

        while(i<arr.length)
        {
            System.out.println(i);
            String[] tmp = arr[i].split(" ");
            if(tmp[0].equals("mov"))
            {
                MOV(reg_map, tmp);
                i++;
            }
            else if(tmp[0].equals("inc"))
            {
                INC(reg_map, tmp);
                i++;
            }
            else if(tmp[0].equals("dec"))
            {
                DEC(reg_map, tmp);
                i++;
            }
            else if(tmp[0].equals("jnz"))
            {
               if(Character.isDigit(tmp[1].charAt(0)) && Integer.parseInt(tmp[1])!=0)
                {
                    if(Integer.parseInt(tmp[2])<0)
                    {
                        i = i-Math.abs(Integer.parseInt(tmp[2]));
                    }
                    else
                    {
                        i = i+Integer.parseInt(tmp[2]);
                    }
                }
               else if(!Character.isDigit(tmp[1].charAt(0)) && reg_map.get(tmp[1])!=0)
               {
                   if(Integer.parseInt(tmp[2])<0)
                   {
                       i = i-Math.abs(Integer.parseInt(tmp[2]));
                   }
                   else
                   {
                       i = i+Integer.parseInt(tmp[2]);
                   }
               }
               else
               {
                   i++;
               }

            }

            System.out.println(reg_map);
        }



    }

}
