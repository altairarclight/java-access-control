package b;

/**
* This class is used to test accessing classes
* and members from another package
*/
class PublicTester {
  // extend a public class to test accessing
  // protected methods within the class
  static class PublicClassDecendent extends a.PublicClass {
      public String protectedCallFromDecendent() {
        return this.protectedCall();
      }
  }

  public static void main(String args[]) {
    a.PackageRestrictedClass myClass = null;

    // test accessing different package >
    // public-access class > protected-access method
    // expect it to succeed
    try {
      PublicClassDecendent myClass3 = new PublicClassDecendent();
      myClass3.protectedCallFromDecendent();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }

    // test accessing different package >
    // public-access class > package-access method
    // expect it to fail
    try {
      a.PublicClass myClass2 = new a.PublicClass();
      myClass2.noModifierCall();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }

    // test accessing different package >
    // public-access class > private-access method
    // expect it to fail
    try {
      PublicClassDecendent myClass4 = new PublicClassDecendent();
      myClass4.privateCall();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }

    // test accessing different package > package-access class
    // expect it to fail
    try {
      myClass = new a.PackageRestrictedClass();
    } catch (Exception e) {
      System.err.println("Unable to access class" + e);
      System.exit(1);
    }

    // test accessing different package > package-access class
    // > public-access method
    // expect it to fail
    try {
      myClass.publicCall();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }
  }
}
