package head.first.in.java.practise;

public class Examples {
    public void practise() {
        String[] wordListNull = {"1", "2", "3", "4", "5"};
        String[] wordListOne = {"cool", "perfect", "unbelievable", "kind", "hopeless",
                "funny", "fry", "honest", "great", "shy"};
        String[] wordListTwo = {"red", "blue", "green", "grey", "brown", "black", "yellow",
                "purple"};
        String[] wordListThree = {"car", "horse", "pen", "kitchen", "home", "PC", "paper", "mouse"};
        int nullLenght = wordListNull.length;
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        int rand0 = (int) (Math.random() * nullLenght);
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);
        String phrase = wordListNull[rand0] + " " + wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Everything you need is " + phrase);
    }
}