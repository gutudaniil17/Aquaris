-- Table for Users (CEOs, Managers, Team Leads, Developers)
CREATE TABLE users (
                       user_id INT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(50) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       role VARCHAR(50) NOT NULL
);

-- Table for Projects
CREATE TABLE projects (
                          project_id INT PRIMARY KEY AUTO_INCREMENT,
                          project_name VARCHAR(100) NOT NULL
);

-- Table for User-Project Assignments
CREATE TABLE user_projects (
                               user_id INT,
                               project_id INT,
                               PRIMARY KEY (user_id, project_id),
                               FOREIGN KEY (user_id) REFERENCES users(user_id),
                               FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

-- Table for Boss-Subordinate Relationships
CREATE TABLE boss_subordinate (
                                  boss_id INT,
                                  subordinate_id INT,
                                  PRIMARY KEY (boss_id, subordinate_id),
                                  FOREIGN KEY (boss_id) REFERENCES users(user_id),
                                  FOREIGN KEY (subordinate_id) REFERENCES users(user_id)
);