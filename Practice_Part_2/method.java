class computer{

    public void PlayMusic() {
        System.out.println("Music is Playing");
    }

    public String getmepen(int cost)
    {
        if(cost >= 10)
        return "Pen is yours";
        else
        return "Increase Your Cost";
    }
}

public class method {
    public static void main(String[] args) {
        computer comp = new computer();
        comp.PlayMusic();

       String str = comp.getmepen(10);

       System.out.println(str);
    }
    
}
