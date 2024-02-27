package db;

import dataobj.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public static List<MaxProjectsCountClient> findMaxProjectsCountClient()  {
        List<MaxProjectsCountClient> resultList = new ArrayList<>();
        try {
            ResultSet resultSet = Database.executeResult("src/main/java/sql/find_max_projects_client.sql");
            while (resultSet.next()) {
                MaxProjectsCountClient maxProjectsCountClient = new MaxProjectsCountClient(
                        resultSet.getString("name"),
                        resultSet.getInt("PROJECT_COUNT"));
                resultList.add(maxProjectsCountClient);
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return resultList;
    }

    public static List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> resultList = new ArrayList<>();
        try {
            ResultSet resultSet = Database.executeResult("src/main/java/sql/find_max_salary_worker.sql");
            while (resultSet.next()) {
                MaxSalaryWorker maxSalaryWorker = new MaxSalaryWorker(
                        resultSet.getString("name"),
                        resultSet.getInt("salary"));
                resultList.add(maxSalaryWorker);
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return resultList;
    }

    public static List<LongestProject> findLongestProject() {
        List<LongestProject> resultList = new ArrayList<>();
        try {
            ResultSet resultSet = Database.executeResult("src/main/java/sql/find_longest_project.sql");
            while (resultSet.next()) {
                LongestProject longestProject = new LongestProject(
                        resultSet.getInt("id"),
                        resultSet.getInt("month_count"));
                resultList.add(longestProject);
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return resultList;
    }

    public static List<ProjectPrices> findProjectPrices() {
        List<ProjectPrices> resultList = new ArrayList<>();
        try {
            ResultSet resultSet = Database.executeResult("src/main/java/sql/print_project_prices.sql");
            while (resultSet.next()) {
                ProjectPrices projectPrices = new ProjectPrices(
                        resultSet.getInt("project_id"),
                        resultSet.getInt("price"));
                resultList.add(projectPrices);
            }
            return resultList;
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<YoungestEldestWorkers> findYoungestEldestWorkers() {
        List<YoungestEldestWorkers> resultList = new ArrayList<>();
        try {
            ResultSet resultSet = Database.executeResult("src/main/java/sql/find_youngest_eldest_workers.sql");
            while (resultSet.next()) {
                YoungestEldestWorkers youngestEldestWorkers = new YoungestEldestWorkers(
                        resultSet.getString("type"),
                        resultSet.getString("name"),
                        LocalDate.parse(resultSet.getString("birthday")));
                resultList.add(youngestEldestWorkers);
            }
            return resultList;
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
