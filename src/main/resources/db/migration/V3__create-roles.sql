CREATE TABLE role (
   id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
   name VARCHAR(255) UNIQUE NOT NULL,
   description varchar(255)
);