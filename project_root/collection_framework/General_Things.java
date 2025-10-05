import java.util.*;

//============================================MindMap=================================================
// MindMap: General Things -> Collection Interface or Collection (List, Set, Map, Queue)
// to implement a collection, we can use classes like ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue etc.
// -> Collections class : it is a utility class that provides static methods to operate on collections 


//============================================Notes=================================================
// -> Collection Interface : It is the root interface in the collection hierarchy. It has three main sub-interfaces: List, Set, and Queue.
// 1. List Interface : It is an ordered collection (also known as a sequence). It allows duplicate elements. 
//    Common implementations: ArrayList, LinkedList.
// 2. Set Interface : It is a collection that does not allow duplicate elements. 
//    Common implementations: HashSet (no order), TreeSet (sorted order).
// 3. Map Interface : It is an object that maps keys to values. It does not allow duplicate keys.
//    Common implementations: HashMap (no order), TreeMap (sorted order).
// 4. Queue Interface : It is a collection used to hold multiple elements prior to processing. It follows FIFO (First In First Out) order.
//    Common implementations: LinkedList, PriorityQueue.
// -> Collections Class : It is a utility class that provides static methods to operate on collections (like sorting, searching, reversing, etc.).
// -> Iterators : They are used to traverse a collection. The Iterator interface provides methods like hasNext(), next(), and remove().
// -> Generics : They enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. 

//============================================Syntax=================================================
// syntax to create a collection : Collection<Type> name = new ImplementationClass<Type>();
// ArrayList : List<Type> arr = new ArrayList<Type>(); or ArrayList<Type> arr = new ArrayList<Type>();
// LinkedList : List<Type> ll = new LinkedList<Type>(); or LinkedList<Type> ll = new LinkedList<Type>();
// HashSet : Set<Type> set = new HashSet<Type>(); or HashSet<Type> set = new HashSet<Type>();
// TreeSet : Set<Type> set = new TreeSet<Type>(); or TreeSet<Type> set = new TreeSet<Type>();
// HashMap : Map<KeyType, ValueType> map = new HashMap<KeyType, ValueType>(); 
// or HashMap<KeyType, ValueType> map = new HashMap<KeyType, ValueType>();
// TreeMap : Map<KeyType, ValueType> map = new TreeMap<KeyType, ValueType>(); 
// or TreeMap<KeyType, ValueType> map = new TreeMap<KeyType, ValueType>();
// PriorityQueue : Queue<Type> pq = new PriorityQueue<Type>(); or PriorityQueue<Type> pq = new PriorityQueue<Type>();
