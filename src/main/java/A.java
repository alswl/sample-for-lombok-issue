import lombok.Setter;

public class A {
  @Setter
  private String field;

  void aFunction() {
    if (this.field == null) {
      return;
    }
  }

}
