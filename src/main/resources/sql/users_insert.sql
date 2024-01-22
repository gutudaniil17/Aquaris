-- Example Data Insertion (You can customize this based on your requirements)
INSERT INTO users (username, password, role) VALUES
                                                 ('ceo1', 'password1', 'CEO'),
                                                 ('manager1', 'password2', 'Manager'),
                                                 ('manager2', 'password3', 'Manager'),
                                                 ('teamlead1', 'password4', 'Team Lead'),
                                                 ('teamlead2', 'password5', 'Team Lead'),
                                                 ('developer1', 'password6', 'Developer'),
                                                 ('developer2', 'password7', 'Developer'),
                                                 ('developer3', 'password8', 'Developer'),
                                                 ('developer4', 'password9', 'Developer'),
                                                 ('developer5', 'password10', 'Developer');

INSERT INTO projects (project_name) VALUES
                                        ('ProjectA'),
                                        ('ProjectB'),
                                        ('ProjectC');

INSERT INTO user_projects (user_id, project_id) VALUES
                                                    (4, 1),  -- Assign teamlead1 to ProjectA
                                                    (5, 2),  -- Assign teamlead2 to ProjectB
                                                    (6, 1),  -- Assign developer1 to ProjectA
                                                    (6, 2),  -- Assign developer1 to ProjectB
                                                    (7, 2),  -- Assign developer2 to ProjectB
                                                    (8, 3);  -- Assign developer3 to ProjectC

INSERT INTO boss_subordinate (boss_id, subordinate_id) VALUES
                                                           (1, 2),  -- CEO1 is the boss of manager1
                                                           (1, 3),  -- CEO1 is the boss of manager2
                                                           (2, 4),  -- Manager1 is the boss of teamlead1
                                                           (3, 5);  -- Manager2 is the boss of teamlead2