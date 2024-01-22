-- Table for Work Hours
CREATE TABLE work_hours (
                            work_hours_id INT PRIMARY KEY AUTO_INCREMENT,
                            user_id INT,
                            project_id INT,
                            start_time DATETIME NOT NULL,
                            end_time DATETIME,
                            hours_worked DECIMAL(5,2),  -- Using DECIMAL for precision (adjust as needed)
                            PRIMARY KEY (work_hours_id),
                            FOREIGN KEY (user_id) REFERENCES users(user_id),
                            FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

-- Example Data Insertion
INSERT INTO work_hours (user_id, project_id, start_time, end_time, hours_worked) VALUES
                                                                                     (6, 1, '2024-01-23 09:00:00', '2024-01-23 17:00:00', 8.0),
                                                                                     (7, 2, '2024-01-24 10:00:00', '2024-01-24 18:30:00', 8.5),
                                                                                     (8, 3, '2024-01-25 08:30:00', '2024-01-25 16:45:00', 8.25);
