import java.util.*;

public class Main {
    public static void main(String[] args) {

        Job engineer = new Job("Engineer", 500);
        Job pilot = new Job("Pilot", 1000);

        CrewWorker worker1 = new CrewWorker(engineer);
        CrewWorker worker2 = new CrewWorker(pilot);

        System.out.println("CrewWorker Tests:");
        System.out.println(worker1);
        System.out.println(worker2);

        List<CrewWorker> crewWorkers = new ArrayList<>();
        crewWorkers.add(worker1);
        crewWorkers.add(worker2);

        Crew crew = new Crew(crewWorkers);
        System.out.println("\nCrew Tests:");
        System.out.println(crew);

        Job scientistJob = new Job("Scientist", 700);
        CrewWorker worker3 = new CrewWorker(scientistJob);
        crew.addWorker(worker3);
        System.out.println("After adding a worker: " + crew);

        Module habitat = new Module("Habitat", 50.5f);
        Module lab = new Module("Lab", 30.2f);

        System.out.println("\nModule Tests:");
        System.out.println(habitat);
        System.out.println(lab);

        List<Module> modules = new ArrayList<>();
        modules.add(habitat);
        modules.add(lab);

        SpaceStation spaceStation = new SpaceStation(1, "Station1", modules, crew);

        System.out.println("\nSpaceStation Tests:");
        System.out.println(spaceStation);

        System.out.println("Modules: ");
        for (Module m : spaceStation.getModules()) {
            System.out.println("- " + m.getName());
        }
        System.out.println("Crew: " + spaceStation.getCrew());

        System.out.println("\nTesting Ext Save & Load:");
        Ext.save();
        Ext.load();
        System.out.println("Loaded instances: " + Ext.getExt());

        System.out.println("\nException Handling Tests:");
        try {
            Crew emptyCrew = new Crew(new ArrayList<>());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        try {
            Module invalidModule = new Module("", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        try {
            SpaceStation invalidStation = new SpaceStation(2, "", modules, crew);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
