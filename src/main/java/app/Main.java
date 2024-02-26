package app;

import dataobj.Client;
import dataobj.Project;
import dataobj.ProjectWorker;
import dataobj.Worker;
import db.Database;
import services.Init;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.executeUpdate("src/main/java/sql/init_db.sql");

        List<Worker> workers = Init.initializeWorkers();
        Database.getInstance().insertWorker(workers);

        List<Client> clients = Init.initializeClients();
        Database.getInstance().insertClient(clients);


        List<Project> projects = Init.initializeProjects();
        Database.getInstance().insertProject(projects);

        List<ProjectWorker> projectWorkers = Init.initializePrWork();
        Database.getInstance().insertProjectWorkers(projectWorkers);
    }
}
