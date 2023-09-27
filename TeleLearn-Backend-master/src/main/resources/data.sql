INSERT INTO public.users (id, enabled, password, username, name, surname, user_role, email)
VALUES (1, true, '$2a$12$QOpC9AXqeKDBcNMWHFr/oOEjcJqxD1IkbZsvshHsTRvsIsLpVbji6', 'admin', 'Administrator', '', 0, '');
INSERT INTO public.users (id, enabled, password, username, name, surname, user_role, email)
VALUES (2, true, '$2a$10$9PxaMwJKB/aZllRiBYkM1ucSG55Gl1FdPMhipdw2CazKrEGpIipbq', 'teacher', 'Anna', 'Teachers',
        1, 'anna@teach.com');
INSERT INTO public.teachers(title, unit, id)
VALUES ('Dr. Eng.', 'taka sobie school', 2);
INSERT INTO public.users (id, enabled, password, username, name, surname, user_role, email)
VALUES (3, true, '$2a$10$9PxaMwJKB/aZllRiBYkM1ucSG55Gl1FdPMhipdw2CazKrEGpIipbq', 'student', 'Peter', 'Student', 2,
        'Peter@student.com');
INSERT INTO public.students(unit, id, daily_learning_time)
VALUES ('taka sobie school', 3, 12600000000000);
INSERT INTO public.users (id, enabled, password, username, name, surname, user_role, email)
VALUES (4, true, '$2a$10$9PxaMwJKB/aZllRiBYkM1ucSG55Gl1FdPMhipdw2CazKrEGpIipbq', 'teacher2', 'Thomas', 'Problem', 1,
        't.problem@teach.com');
INSERT INTO public.teachers(title, unit, id)
VALUES ('Dr. Eng.', 'taka sobie school', 4);
INSERT INTO public.users (id, enabled, password, username, name, surname, user_role, email)
VALUES (5, true, '$2a$10$9PxaMwJKB/aZllRiBYkM1ucSG55Gl1FdPMhipdw2CazKrEGpIipbq', 'student2', 'Atoshka', 'Recorded', 2,
        'atoshka@student.com');
INSERT INTO public.students(unit, id, daily_learning_time)
VALUES ('taka sobie school', 5, 12600000000000);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (1, 'message', false, {ts '2020-09-17 18:47:52.69'}, 2, 3);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (2, 'message2', false, {ts '2020-09-17 18:47:53.69'}, 3, 2);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (3, 'message3', false, {ts '2020-09-17 18:48:52.69'}, 2, 3);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (4, 'message4', false, {ts '2020-09-17 18:49:53.69'}, 3, 2);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (5, 'message5', true, {ts '2020-09-17 18:49:53.69'}, 2, 1);
INSERT INTO public.messages (id, content, read, send_time, receiver_id, sender_id)
values (6, 'message6', false, {ts '2020-09-17 19:49:53.69'}, 1, 2);
INSERT INTO public.global_news (id, brief, publication_date, title, author_id)
values (1,
        'Every now and then, the earth can put its mouth on the earth, the urn of its own protein diam, and no porter dui mauris needs laughter. It is the real estate of my life. Smartphones Until then, it is not a matter of taste. But my grief is done, unless it is a great quiver. Who has a great taste? Aenean should be the main gate now, unless the cartoon is important. But there is no way to decorate that same thing except the laoreet of life. For a soft heart is like an urn for children, and for the children before mourning. Integer mourning, laughter nor vulputate condimentum, just to decorate the mass, or tincidunt tortor leo vitae ex. It is the very god, cartoon in members from, result as before. Even always, just who is mourning the homework, there is no homework before, that time I read the book at the time.',
        {ts '2020-09-17 19:49:53.69'}, 'Article', 1);
INSERT INTO public.global_news (id, brief, publication_date, title, author_id)
values (2,
        'Every now and then, the earth can put its mouth on the earth, the urn of its own protein diam, and no porter dui mauris needs laughter. It is the real estate of my life. Smartphones Until then, it is not a matter of taste. But my grief is done, unless it is a great quiver. Who has a great taste? Aenean should be the main gate now, unless the cartoon is important. But there is no way to decorate that same thing except the laoreet of life. For a soft heart is like an urn for children, and for the children before mourning. Integer mourning, laughter nor vulputate condimentum, just to decorate the mass, or tincidunt tortor leo vitae ex. It is the very god, cartoon in members from, result as before. Even always, just who is mourning the homework, there is no homework before, that time I read the book at the time.',
        {ts '2020-09-18 19:49:53.69'}, 'Article', 1);
INSERT INTO public.global_news (id, brief, publication_date, title, author_id)
values (3,
        'Every now and then, the earth can put its mouth on the earth, the urn of its own protein diam, and no porter dui mauris needs laughter. It is the real estate of my life. Smartphones Until then, it is not a matter of taste. But my grief is done, unless it is a great quiver. Who has a great taste? Aenean should be the main gate now, unless the cartoon is important. But there is no way to decorate that same thing except the laoreet of life. For a soft heart is like an urn for children, and for the children before mourning. Integer mourning, laughter nor vulputate condimentum, just to decorate the mass, or tincidunt tortor leo vitae ex. It is the very god, cartoon in members from, result as before. Even always, just who is mourning the homework, there is no homework before, that time I read the book at the time.',
        {ts '2020-09-19 19:49:53.69'}, 'Article', 1);
INSERT INTO public.global_news (id, brief, publication_date, title, author_id)
values (4,
        'Every now and then, the earth can put its mouth on the earth, the urn of its own protein diam, and no porter dui mauris needs laughter. It is the real estate of my life. Smartphones Until then, it is not a matter of taste. But my grief is done, unless it is a great quiver. Who has a great taste? Aenean should be the main gate now, unless the cartoon is important. But there is no way to decorate that same thing except the laoreet of life. For a soft heart is like an urn for children, and for the children before mourning. Integer mourning, laughter nor vulputate condimentum, just to decorate the mass, or tincidunt tortor leo vitae ex. It is the very god, cartoon in members from, result as before. Even always, just who is mourning the homework, there is no homework before, that time I read the book at the time..',
        {ts '2020-09-11 19:49:53.69'}, 'Article', 1);
INSERT INTO public.global_news (id, brief, publication_date, title, author_id)
values (5,
        'Every now and then, the earth can put its mouth on the earth, the urn of its own protein diam, and no porter dui mauris needs laughter. It is the real estate of my life. Smartphones Until then, it is not a matter of taste. But my grief is done, unless it is a great quiver. Who has a great taste? Aenean should be the main gate now, unless the cartoon is important. But there is no way to decorate that same thing except the laoreet of life. For a soft heart is like an urn for children, and for the children before mourning. Integer mourning, laughter nor vulputate condimentum, just to decorate the mass, or tincidunt tortor leo vitae ex. It is the very god, cartoon in members from, result as before. Even always, just who is mourning the homework, there is no homework before, that time I read the book at the time.',
        {ts '2020-09-12 19:49:53.69'}, 'Article', 1);
INSERT INTO public.courses (id, AUTO_ACCEPT, NAME, PUBLIC_COURSE, STUDENTS_ALLOWED_TO_POST, WELCOME_PAGE_HTML_CONTENT,
                            OWNER_ID)
VALUES (1, true, 'Test course', true, true, '<center><b>Welcome to the course</b></center>', 2);
INSERT INTO public.course_student (accepted, student_id, course_id)
VALUES (true, 3, 1);
INSERT INTO PUBLIC.TASKS (ID, DESCRIPTION, DUE_DATE, LEARNING_TIME, NAME, COURSE_ID)
VALUES (1, 'Test', '2020-11-17', 0, 'excercise 1', 1);
INSERT INTO PUBLIC.TASKS (ID, DESCRIPTION, DUE_DATE, LEARNING_TIME, NAME, COURSE_ID)
VALUES (2, null, '2020-11-26', 1800000000000, 'excercise 2', 1);
INSERT INTO PUBLIC.TASKS (ID, DESCRIPTION, DUE_DATE, LEARNING_TIME, NAME, COURSE_ID)
VALUES (3, null, '2020-11-26', 1800000000000, 'excercise 3', 1);
INSERT INTO PUBLIC.TASKS (ID, DESCRIPTION, DUE_DATE, LEARNING_TIME, NAME, COURSE_ID)
VALUES (4, null, '2020-11-27', 1800000000000, 'excercise 4', 1);
INSERT INTO PUBLIC.TASKS (ID, DESCRIPTION, DUE_DATE, LEARNING_TIME, NAME, COURSE_ID)
VALUES (5, null, '2020-11-28', 1800000000000, 'excercise 5', 1);
INSERT INTO PUBLIC.TASK_LINKS (TASK_ID, PREVIOUS_TASK_ID)
VALUES (2, 1);
INSERT INTO PUBLIC.TASK_LINKS (TASK_ID, PREVIOUS_TASK_ID)
VALUES (3, 2);
INSERT INTO PUBLIC.TASK_LINKS (TASK_ID, PREVIOUS_TASK_ID)
VALUES (4, 2);
INSERT INTO PUBLIC.TASK_LINKS (TASK_ID, PREVIOUS_TASK_ID)
VALUES (5, 3);
INSERT INTO PUBLIC.TASK_LINKS (TASK_ID, PREVIOUS_TASK_ID)
VALUES (5, 4);
INSERT INTO PUBLIC.POSTS (ID, COMMENTING_ALLOWED, CONTENT, POST_VISIBILITY, PUBLICATION_TIME, AUTHOR_ID, COURSE_ID)
VALUES (1, true, 'Test post', 0, '2020-11-18 18:31:44.100628', 2, 1);
INSERT INTO PUBLIC.COMMENTS (ID, CONTENT, PUBLICATION_TIME, AUTHOR_ID, POST_ID)
VALUES (1, 'K1', '2020-11-18 18:31:48.430235', 2, 1);
INSERT INTO PUBLIC.COMMENTS (ID, CONTENT, PUBLICATION_TIME, AUTHOR_ID, POST_ID)
VALUES (2, 'k2', '2020-11-18 18:32:03.538178', 3, 1);
