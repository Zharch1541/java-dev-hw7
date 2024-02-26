package db;

import dataobj.Client;
import dataobj.Project;
import dataobj.ProjectWorker;
import dataobj.Worker;
import props.PropertyReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.List;

public class Database {
    private static final Database INSTANCE = new Database();

    private static Connection conn;

    private Database() {
        String url = PropertyReader.getConnectionUrlForH2();

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            throw new RuntimeException("Can not create connection. Reason: " + ex.getMessage());
        }
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public static Connection getConn() {
        return conn;
    }

    public void executeUpdate(String file) {
        try (Statement statement = conn.createStatement()) {
            String content = new String(Files.readAllBytes(Paths.get(file)));
            statement.executeUpdate(content);
        } catch (SQLException e) {
            throw new RuntimeException("Can not run query." + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertWorker(List<Worker> workers) {
        String sql = Queries.INSERT_WORKER;
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            for (Worker worker: workers) {
                statement.setString(1, worker.getName());
                statement.setDate(2, worker.getBirthday());
                statement.setString(3, worker.getLevel());
                statement.setDouble(4, worker.getSalary());
                statement.addBatch();
            }
            statement.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertClient(List<Client> clients) {
        String sql = Queries.INSERT_CLIENT;
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            for (Client client: clients) {
                statement.setString(1, client.getName());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertProject(List<Project> projects) {
        String sql = Queries.INSERT_PROJECT;
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            for (Project project: projects) {
                statement.setInt(1, project.getClient_id());
                statement.setDate(2, project.getStart_date());
                statement.setDate(3, project.getFinish_date());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertProjectWorkers(List<ProjectWorker> projectWorkers) {
        String sql = Queries.INSERT_PR_WOR;
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            for (ProjectWorker projectWorker: projectWorkers) {
                statement.setInt(1, projectWorker.getProjectId());
                statement.setInt(2, projectWorker.getWorkerId());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
