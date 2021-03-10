# Summary
<h3>
<p>
As you learned in this chapter, Java methods start with an access modifi er of public,
private, protected or blank (default access). This is followed by an optional specifi er such
as static, final, or abstract. Next comes the return type, which is void or a Java type.
The method name follows, using standard Java identifi er rules. Zero or more parameters go
in parentheses as the parameter list. Next come any optional exception types. Finally, zero
or more statements go in braces to make up the method body.
Using the private keyword means the code is only available from within the same class.
Default (package private) access means the code is only available from within the same
package. Using the protected keyword means the code is available from the same package
or subclasses. Using the public keyword means the code is available from anywhere.
</p>
<p> Static
methods and static variables are shared by the class. When referenced from outside the
class, they are called using the classname—for example, StaticClass.method(). Instance
members are allowed to call static members, but static members are not allowed to call
instance members. Static imports are used to import static members.
Java uses pass-by-value, which means that calls to methods create a copy of the parameters.
Assigning new values to those parameters in the method doesn’t affect the caller’s variables.
216 Chapter 4 ■ Methods and Encapsulation
Calling methods on objects that are method parameters changes the state of those objects and
is refl ected in the caller.</p>
<p>
Overloaded methods are methods with the same name but a different parameter list.
Java calls the most specifi c method it can fi nd. Exact matches are preferred, followed by
wider primitives. After that comes autoboxing and fi nally varargs.
Constructors are used to instantiate new objects. The default no-argument constructor
is called when no constructor is coded. Multiple constructors are allowed and can call each
other by writing this(). If this() is present, it must be the fi rst statement in the constructor.</p>
<p>
Constructors can refer to instance variables by writing this before a variable name to indicate
they want the instance variable and not the method parameter with that name. The order
of initialization is the superclass (which we will cover in Chapter 5); static variables and static
initializers in the order they appear; instance variables and instance initializers in the order
they appear; and fi nally the constructor.
Encapsulation refers to preventing callers from changing the instance variables directly.
</p>
<p>
This is done by making instance variables private and getters/setters public. Immutability
refers to preventing callers from changing the instance variables at all. This uses several
techniques, including removing setters. JavaBeans use methods beginning with is and get
for boolean and non-boolean property types, respectively. Methods beginning with set are
used for setters.
Lambda expressions, or lambdas, allow passing around blocks of code. The full syntax
looks like (String a, String b) -> { return a.equals(b); }. The parameter types can
be omitted. When only one parameter is specifi ed without a type, the parentheses can also
be omitted. The braces and return statement can be omitted for a single statement, making
the short form (a -> a.equals(b). Lambdas are passed to a method expecting an interface
with one method. Predicate is a common interface. It has one method named test
that returns a boolean and takes any type. The removeIf() method on ArrayList takes a
Predicate.
</p>
</h3>