package studio.aroundhub.codeground.solid.lsp;

import java.util.HashSet;
import java.util.LinkedList;

public class WrongCaseSample {
  // Collection
  void myCode() {
    LinkedList list = new LinkedList();
    // ...
    update(list);
  }

  void update(LinkedList list) {
    list.add(new Object());
  }

  // 만약 HashSet으로 변경해야 한다면?
  void newMyCode() {
    HashSet set = new HashSet(); // <<
    // ...
    newUpdate(set);
  }

  void newUpdate(HashSet set) { // << 이 부분이 변경됨으로써 OCP 또한 위배됨
    set.add(new Object()); // << 만약 LSP를 준수하지 않았다면 이 영역도 수정해야 했을 수도 있음
  }
}
