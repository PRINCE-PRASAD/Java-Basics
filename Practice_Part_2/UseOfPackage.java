// import Packageee.Main1;
// import Packageee.Main4;
// import Packageee.Tools.Main2;
// import Packageee.Tools.InsideTools.Main3;

import Packageee.*; // this means we can acess all files under packageee but not folder
import Packageee.Tools.*;
import Packageee.Tools.InsideTools.*;;

public class UseOfPackage {
   public static void main(String[] args) {
      Main1 obj1 = new Main1();
      Main2 obj2 = new Main2();
      Main3 obj3 = new Main3();
      Main4 obj4 = new Main4();
      obj1.show();
      obj2.show();
      obj3.show();
      obj4.show();
   }
}