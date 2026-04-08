package com.pipeline.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:candidate_tracker.db";
    private Connection connection;

    // TODO: Define HashMaps here for in-memory caching of different workflows
    // Example: private final Map<LocalDate, ReqData> reqCache = new HashMap<>();

    public DatabaseManager() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            
            // Execute the schema scripts here
            // stmt.execute(SQL_SCHEMA_STRINGS);
            
            System.out.println("SQLite Database initialized successfully.");
            
            // TODO: Load existing data into HashMaps during startup for O(1) access
            loadCacheFromDb();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DB_URL);
        }
        return connection;
    }

    private void loadCacheFromDb() {
        // TODO: Implement logic to populate your HashMaps from the database.
        // This ensures subsequent "Get" operations are O(1) throughout the session.
    }
}