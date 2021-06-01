package a;

/**
* This class is only visible within its package
* because it is not declared with public
*/
class PackageRestrictedClass {
  private final String RETURN_STR = this.getClass() + " called";

  /**
  * This method is only visible within the package of its class
  * because its class has package level visibility
  */
  public String publicCall() {
    return RETURN_STR;
  }

  /**
  * This method is only visible within the package of its class
  * because its class has package level visibility
  */
  protected String protectedCall() {
    return RETURN_STR;
  }

  /**
  * This method is only visible within the class
  */
  private String privateCall() {
    return RETURN_STR;
  }
}
