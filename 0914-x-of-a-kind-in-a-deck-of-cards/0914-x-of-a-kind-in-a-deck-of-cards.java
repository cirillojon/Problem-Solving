class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    int max = deck[0];
    int num = 0;
    HashSet<Integer> set = new HashSet<Integer>();

    if(deck.length <= 1)
    return false;

    for(int i = 0; i < deck.length; i++)
    {
        set.add(deck[i]);
        if(!map.containsKey(deck[i])) 
        {
             map.put(deck[i],1);
        }
        else {
             map.put(deck[i], map.get(deck[i])+1);
        }
    }

    for(int i = 0; i < deck.length; i++)
    {
        if(map.get(deck[i]) > max)
        max = map.get(deck[i]);
    }

    //System.out.println(map);
    //System.out.println(max);

    int count = max;
    ArrayList<Integer> list = new ArrayList<Integer>(set);
    for(int j = 0; j < count-1; j++)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(map.get(list.get(i)) + " "+ max);
            if(map.get(list.get(i)) % max == 0)
            {
            num++;
            continue;
            }
            num = 0;
        }
        if(num == list.size())
        return true;

        num = 0;
        max--;

        //System.out.println("END OF LOOP"+" "+max);
    }
  
    //System.out.println(list);
    return false;

        
    }
}