public class CollectionJava8 {
  
  public void exercise1() {
    List<Student> students  = getStudents();
    List<Student> studentsIdsGreater5 = getStudentWithIdGreaterThan5(students);
    int sumIds = calculateSumStudentIds(students);
    List<String> studentNames = getStudentNames(students);
    Map<String, List<Student>> studentsByAddress = groupStudentByAddress(students);
  }
  
  public List<Student> getStudentWithIdGreaterThan5(List<Student> input){
    //use input.toStream().filter(.....)
    return input;
  }
  public int calculateSumStudentIds(List<Student> input) {
    //use input.toStream().reduce(..........) or sum()
    return 1;
  }
  
  public List<String> getStudentNames(List<Student> input){
    //use input.toStream().map(.....)
    return new ArrayList<>();
  }
  
  public Map<String, List<Student>> groupStudentByAddress(List<Student> input){
    //use input.toStream().collect(Collectors.groupBy...)
    return new HashMap<>();
  }
  
  public static List<Student> getStudents() {
    Student s1 = new Student(1, "David", "London");
    Student s2 = new Student(3, "John", "Paris");
    Student s3 = new Student(5, "Alice", "Madrid");
    Student s4 = new Student(2, "Laura", "Madrid");
    Student s5 = new Student(4, "Anna", "London");
    Student s6 = new Student(10, "Jack", "Paris");
    Student s7 = new Student(12, "Robert", "Paris");
    Student s8 = new Student(9, "Timo", "Madrid");
    Student s9 = new Student(8, "Luna", "Paris");
    return Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9);
  }
  
  
}

public class Student {
    private int id;
    private String name;
    private String address;
    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
