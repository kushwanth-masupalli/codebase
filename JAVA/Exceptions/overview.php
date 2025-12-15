An exception is an event that disrupts the normal flow of the
program. It is an object that is thrown at runtime when an
error occurs.


java.lang.Object
   └── java.lang.Throwable
         ├── java.lang.Error            (Serious system errors, usually unrecoverable)
         └── java.lang.Exception
               ├── Checked Exceptions (must be handled or declared)
               │      ├── IOException
               │      ├── SQLException
               │      ├── ClassNotFoundException
               │      └── ... others
               └── java.lang.RuntimeException (Unchecked Exceptions)
                      ├── NullPointerException
                      ├── ArithmeticException
                      ├── ArrayIndexOutOfBoundsException
                      ├── IllegalArgumentException
                      └── ... others
