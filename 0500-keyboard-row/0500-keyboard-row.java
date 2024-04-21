class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 ="zxcvbnmZXCVBNM";
        List<String> ans = new ArrayList<String>();
        int j = 0;
        for(int i = 0; i < words.length; i++)
        {
            String d = words[i];
            if (isInRow(d, row1))
            {
               ans.add(d);
               j++;
            }

             if (isInRow(d, row2))
            {
               ans.add(d);
               j++;
            }

             if (isInRow(d, row3))
            {
               ans.add(d);
               j++;
            }

        }
        String[] arr = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);

        return arr;
        
    }

    Boolean isInRow(String d, String row1)
    {
        int count = 0;
        for(int i = 0; i < d.length(); i++)
        {
            char r = d.charAt(i);
            if(row1.contains(""+r))
            {
                count++;
            }
        }
        if(count == d.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//     Boolean isInRow2(String d, String row2)
//     {
//         int count = 0;
//         for(int i = 0; i < d.length(); i++)
//         {
//             char  r = d.charAt(i);
//             if(row2.contains(""+r))
//             {
//                 count++;
//             }
//         }
//         if(count == d.length())
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }

//      Boolean isInRow3(String d, String row3)
//     {
//         int count = 0;
//         for(int i = 0; i < d.length(); i++)
//         {
//             char  r = d.charAt(i);
//             if(row3.contains(""+r))
//             {
//                 count++;
//             }
//         }
//         if(count == d.length())
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
    // }
}