package services;

import dataobj.Client;
import dataobj.Project;
import dataobj.ProjectWorker;
import dataobj.Worker;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Init {
    public static List<Worker> initializeWorkers() {
        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker("Gregor", Date.valueOf("2000-01-01"), "Trainee", 600));
        workers.add(new Worker("Max", Date.valueOf("1998-11-30"), "Junior", 1000));
        workers.add(new Worker("Genry", Date.valueOf("1994-12-15"), "Middle", 3500));
        workers.add(new Worker("John", Date.valueOf("1987-03-24"), "Senior", 5200));
        workers.add(new Worker("Charity", Date.valueOf("1999-02-11"), "Middle", 4000));
        workers.add(new Worker("Ann", Date.valueOf("1995-10-14"), "Senior", 4800));
        workers.add(new Worker("Kolya", Date.valueOf("1984-09-23"), "Junior", 1500));
        workers.add(new Worker("Oleh", Date.valueOf("2001-01-31"), "Junior", 1200));
        workers.add(new Worker("Andreas", Date.valueOf("1997-07-09"), "Middle", 3800));
        workers.add(new Worker("Antonio", Date.valueOf("1990-08-20"), "Middle", 3200));
        workers.add(new Worker("Olha", Date.valueOf("1980-07-05"), "Senior", 5000));

        return workers;
    }

    public static List<Client> initializeClients() {
        List<Client> clients = new ArrayList<>();

        clients.add(new Client("Rey"));
        clients.add(new Client("Victor"));
        clients.add(new Client("Jerry"));
        clients.add(new Client("Boris"));
        clients.add(new Client("Vlad"));
        clients.add(new Client("Sam"));

        return clients;
    }

    public static List<Project> initializeProjects() {
        List<Project> projects = new ArrayList<>();

        projects.add(new Project(2, Date.valueOf("2024-01-25"), Date.valueOf("2024-08-20")));
        projects.add(new Project(4, Date.valueOf("2024-02-01"), Date.valueOf("2025-09-16")));
        projects.add(new Project(3, Date.valueOf("2024-02-15"), Date.valueOf("2028-10-10")));
        projects.add(new Project(1, Date.valueOf("2024-03-03"), Date.valueOf("2025-09-09")));
        projects.add(new Project(2, Date.valueOf("2024-01-29"), Date.valueOf("2030-05-15")));
        projects.add(new Project(5, Date.valueOf("2024-05-04"), Date.valueOf("2026-01-01")));
        projects.add(new Project(6, Date.valueOf("2024-06-20"), Date.valueOf("2024-09-02")));
        projects.add(new Project(6, Date.valueOf("2025-05-15"), Date.valueOf("2028-03-14")));
        projects.add(new Project(1, Date.valueOf("2026-03-08"), Date.valueOf("2027-04-18")));
        projects.add(new Project(2, Date.valueOf("2024-07-24"), Date.valueOf("2028-06-19")));
        projects.add(new Project(3, Date.valueOf("2024-02-06"), Date.valueOf("2029-07-15")));
        projects.add(new Project(3, Date.valueOf("2024-08-17"), Date.valueOf("2025-02-02")));

        return projects;
    }

    public static List<ProjectWorker> initializePrWork() {
        List<ProjectWorker> projectWorkers = new ArrayList<>();

        projectWorkers.add(new ProjectWorker(1, 3));
        projectWorkers.add(new ProjectWorker(1, 4));
        projectWorkers.add(new ProjectWorker(2, 2));
        projectWorkers.add(new ProjectWorker(2, 5));
        projectWorkers.add(new ProjectWorker(2, 10));
        projectWorkers.add(new ProjectWorker(3, 8));
        projectWorkers.add(new ProjectWorker(3, 6));
        projectWorkers.add(new ProjectWorker(4, 4));
        projectWorkers.add(new ProjectWorker(5, 10));
        projectWorkers.add(new ProjectWorker(5, 8));
        projectWorkers.add(new ProjectWorker(6, 3));
        projectWorkers.add(new ProjectWorker(6, 4));
        projectWorkers.add(new ProjectWorker(6, 5));
        projectWorkers.add(new ProjectWorker(7, 10));
        projectWorkers.add(new ProjectWorker(8, 4));
        projectWorkers.add(new ProjectWorker(8, 5));
        projectWorkers.add(new ProjectWorker(8, 10));
        projectWorkers.add(new ProjectWorker(8, 6));
        projectWorkers.add(new ProjectWorker(8, 11));
        projectWorkers.add(new ProjectWorker(9, 4));
        projectWorkers.add(new ProjectWorker(9, 3));
        projectWorkers.add(new ProjectWorker(10, 4));
        projectWorkers.add(new ProjectWorker(10, 1));
        projectWorkers.add(new ProjectWorker(11, 11));
        projectWorkers.add(new ProjectWorker(12, 2));

        return projectWorkers;
    }
}
