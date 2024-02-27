package app;

import dataobj.*;
import db.DatabaseQueryService;

import java.util.List;

public class SelectQueries {
    public static void main(String[] args) {
        List<MaxProjectsCountClient> maxProjectsCountClients = DatabaseQueryService.findMaxProjectsCountClient();
        System.out.println(maxProjectsCountClients);
        List<MaxSalaryWorker> maxSalaryWorkers = DatabaseQueryService.findMaxSalaryWorker();
        System.out.println(maxSalaryWorkers);
        List<LongestProject> longestProject = DatabaseQueryService.findLongestProject();
        System.out.println(longestProject);
        List<ProjectPrices> projectPrices = DatabaseQueryService.findProjectPrices();
        System.out.println(projectPrices);
        List<YoungestEldestWorkers> youngestEldestWorkers = DatabaseQueryService.findYoungestEldestWorkers();
        System.out.println(youngestEldestWorkers);
    }
}
