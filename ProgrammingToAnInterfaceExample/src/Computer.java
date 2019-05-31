package ProgrammingToAnInterfaceExample.src;
// Interface we're programming to
interface displayModule {
  public void display ();
}

// Implements Interface
class Monitor implements displayModule {
  public void display () {
    System.out.println( "Display through a monitor" );
  }
}

// Implements Interface
class Projector implements displayModule {
  public void display () {
    System.out.println( "Display through projector" );
  }
}

// Class that includes objects we've created to
// implement displayModule
public class Computer {
  displayModule displayModule;

  public void setDisplayModule ( displayModule dm ) {
    this.displayModule = dm;
  }

  public void display () {
    this.displayModule.display();
  }

  public static void main(String args[]) {
    Computer computer = new Computer();
    // Client doesn't care about child class type
    displayModule displayModuleOne = new Monitor();
    displayModule displayModuleTwo = new Projector();

    // Show different display types
    computer.setDisplayModule( displayModuleOne );
    computer.display();

    computer.setDisplayModule( displayModuleTwo );
    computer.display();
  }
}