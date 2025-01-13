CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL
);

CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    date DATETIME NOT NULL,
    status ENUM('ACTIVE', 'INACTIVE', 'RESOLVED') NOT NULL,
    author_id BIGINT,
    course VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (author_id) REFERENCES usuarios(id)
);

CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    creationDate DATETIME NOT NULL,
    solution TEXT NOT NULL,
    author BIGINT,
    topico BIGINT,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (author) REFERENCES usuarios(id),
    FOREIGN KEY (topico) REFERENCES topicos(id)
);
