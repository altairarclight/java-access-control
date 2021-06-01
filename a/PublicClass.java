package a;

/**
* This class is visible to all packages
*/
public class PublicClass {
  private final String RETURN_STR = this.getClass() + " called";

  /**
  * This method is visible to all packages
  */
  public String publicCall() {
    return RETURN_STR;
  }

  /**
  * This method is visible within the package of its class
  * and a subclass of its class in another package
  */
  protected String protectedCall() {
    return RETURN_STR;
  }

  /**
  * This method is visible to only the package of this class
  * because it is not declared with public
  */
  String noModifierCall() {
    return RETURN_STR;
  }

  /**
  * This method is only visible within the class
  */
  private String privateCall() {
    return RETURN_STR;
  }
}
