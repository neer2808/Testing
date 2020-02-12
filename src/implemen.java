import java.util.Random;

public class implemen {
  public static void main(String[] args) {


    Mystack st1 = new Mystack();
    Mystack st2 = new Mystack();
    for (int i = 0; i < 5; i++) {
      st1.push(new Random().nextInt(100));
    }

    for(int j =0;j<5;j++)
    {
      Node ele = st1.pop();
      st2.push(ele.getData());
    }
    st2.myprint();

  }
}

