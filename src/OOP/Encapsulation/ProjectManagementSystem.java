package OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class untuk merepresentasikan tugas dalam proyek
class Task {
  private String name;
  private String description;
  private boolean completed;

  // Konstruktor
  public Task(String name, String description, boolean completed) {
    this.name = name;
    this.description = description;
    this.completed = false;
  }

  // Getter dan setter untuk atribut name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter dan setter untuk atribut description
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // Getter dan setter untuk atribut completed
  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  // Method untuk menampilkan informasi tugas
  public void displayInfo() {
    System.out.println("Task Name: " + name);
    System.out.println("Description: " + description);
    System.out.println("Completed: " + completed);
  }
}

// Class untuk merepresentasikan sumber daya dalam proyek
class Resource {
  private String name;
  private String description;

  // Konstruktor
  public Resource(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Getter dan setter untuk atribut name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter dan setter untuk atribut description
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // Method untuk menampilkan informasi sumber daya
  public void displayInfo() {
    System.out.println("Resource Name: " + name);
    System.out.println("Description: " + description);
  }
}

// Class untuk merepresentasikan tim dalam proyek
class TeamMember {
  private String name;
  private String role;

  // Konstruktor
  public TeamMember(String name, String role) {
    this.name = name;
    this.role = role;
  }

  // Getter dan setter untuk atribut name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter dan setter untuk atribut role
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  // Method untuk menampilkan informasi anggota tim
  public void displayInfo() {
    System.out.println("Team Member Name: " + name);
    System.out.println("Role: " + role);
  }
}

// Class untuk mengelola proyek
class ProjectManager {
  private List<Task> tasks;
  private List<Resource> resources;
  private List<TeamMember> teamMembers;

  // Konstruktor
  public ProjectManager() {
    tasks = new ArrayList<>();
    resources = new ArrayList<>();
    teamMembers = new ArrayList<>();
  }

  // Method untuk menambahkan tugas ke proyek
  public void addTask(Task task) {
    tasks.add(task);
  }

  // Method untuk menambahkan sumber daya ke proyek
  public void addResource(Resource resource) {
    resources.add(resource);
  }

  // Method untuk menambahkan anggota tim ke proyek
  public void addTeamMember(TeamMember teamMember) {
    teamMembers.add(teamMember);
  }

  // Method untuk menampilkan semua tugas dalam proyek
  public void displayAllTasks() {
    System.out.println("Tasks in the Project:");
    for (Task task : tasks) {
      task.displayInfo();
      System.out.println();
    }
  }

  // Method untuk menampilkan semua sumber daya dalam proyek
  public void displayAllResources() {
    System.out.println("Resources in the Project:");
    for (Resource resource : resources) {
      resource.displayInfo();
      System.out.println();
    }
  }

  // Method untuk menampilkan semua anggota tim dalam proyek
  public void displayAllTeamMembers() {
    System.out.println("Team Members in the Project:");
    for (TeamMember teamMember : teamMembers) {
      teamMember.displayInfo();
      System.out.println();
    }
  }
}

public class ProjectManagementSystem {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    ProjectManager project = new ProjectManager();

    // Untuk menambahkan fungsi pengulangan di mana pengguna dapat menambahkan data
    // berkali-kali dan kemudian memutuskan untuk berhenti
    boolean addMoreData = true;

    while (addMoreData) {
      // Menambahkan tugas
      System.out.println("Enter Task Details:");
      System.out.print("Task Name: ");
      String taskName = scanner.nextLine();
      System.out.print("Description: ");
      String taskDescription = scanner.nextLine();
      System.out.print("Completed Status: ");
      boolean taskCompleted = scanner.nextBoolean();
      scanner.nextLine();
      Task task = new Task(taskName, taskDescription, taskCompleted);
      project.addTask(task);

      // Menambahkan sumber daya
      System.out.println("\nEnter Resource Details:");
      System.out.print("Resource Name: ");
      String resourceName = scanner.nextLine();
      System.out.print("Description: ");
      String resourceDescription = scanner.nextLine();
      Resource resource = new Resource(resourceName, resourceDescription);
      project.addResource(resource);

      // Menambahkan anggota tim
      System.out.println("\nEnter Team Member Details:");
      System.out.print("Team Member Name: ");
      String teamMemberName = scanner.nextLine();
      System.out.print("Role: ");
      String teamMemberRole = scanner.nextLine();
      TeamMember teamMember = new TeamMember(teamMemberName, teamMemberRole);
      project.addTeamMember(teamMember);

      // Menanyakan apakah pengguna ingin menambahkan lebih banyak data
      System.out.print("\nDo you want to add more data? (yes/no): ");
      String choice = scanner.nextLine();
      addMoreData = choice.equalsIgnoreCase("yes");
    }

    // Menampilkan informasi tentang tugas, sumber daya, dan anggota tim dalam
    // proyek
    System.out.println("\nAll Project Data:");

    // Create lines
    for (int i = 0; i <= 35; i++) {
      System.out.print("-");
    }
    System.out.println();

    // Display ALl tasks
    project.displayAllTasks();

    // Create lines
    for (int i = 0; i <= 35; i++) {
      System.out.print("-");
    }
    System.out.println();

    // Display ALl resources
    project.displayAllResources();

    // Create lines
    for (int i = 0; i <= 35; i++) {
      System.out.print("-");
    }
    System.out.println();

    // Display ALl members
    project.displayAllTeamMembers();

  }
}