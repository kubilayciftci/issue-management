package com.kciftci.issuemanagement.util;

public class ApiPaths {

    private static final String API_VERSION = "/v1";
    private static final String BASE_PATH = "/api" + API_VERSION;

    public static final class IssuePaths {
        public static final String ISSUE_PATH = BASE_PATH + "/issue";
    }

    public static final class ProjectPaths {
        public static final String PROJECT_PATH = BASE_PATH + "/project";
    }

    public static final class UserPaths {
        public static final String USER_PATH = BASE_PATH + "/users";
    }

}
