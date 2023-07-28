package studio.aroundhub.codeground.solid.lsp;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Sample {
  // Collection
  void myCode() {
    Collection list = new LinkedList();
    // ...
    update(list);
  }

  void update(Collection list){
    list.add(new Object());
  }

  // 만약 HashSet으로 변경해야 한다면?
  void newMyCode() {
    Collection set = new HashSet(); // <<
    // ...
    newUpdate(set);
  }

  void newUpdate(Collection set){
    set.add(new Object());
  }
}
