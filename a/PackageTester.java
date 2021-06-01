package a;

/**
* This class is used to test accessing classes
* and members from the same package
*/

class PackageTester {
  // extend a package-access class to test accessing
  // private methods within the package
  static class PublicClassDecendent extends a.PackageRestrictedClass {};

  public static void main(String args[]) {
    a.PackageRestrictedClass myClass = null;

    // test accessing package-access class
    // expect it to succeed
    try {
      myClass = new a.PackageRestrictedClass();
    } catch (Exception e) {
      System.err.println("Unable to access class" + e);
      System.exit(1);
    }

    // test accessing package-access class > public-access method
    // expect it to succeed
    try {
      myClass.publicCall();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }

    // test accessing package-access class > private-access method
    // expect it to fail
    try {
      PublicClassDecendent myClass4 = new PublicClassDecendent();
      myClass4.privateCall();
    } catch (Exception e) {
      System.err.println("Unable to access method" + e);
    }
  }
}
