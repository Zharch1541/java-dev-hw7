package db;

public class Queries {
    public static final String INSERT_WORKER = "INSERT INTO worker (name, birthday, level, salary) VALUES (?, ?, ?, ?)";
    public static final String INSERT_CLIENT = "INSERT INTO client (name) VALUES (?)";
    public static final String INSERT_PROJECT = "INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE) VALUES (?, ?, ?)";
    public static final String INSERT_PR_WOR = "INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES (?, ?)";
}
