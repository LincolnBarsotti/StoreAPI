CREATE TABLE if not exists customers (
   id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
   user_id UUID UNIQUE REFERENCES users(id) ON DELETE CASCADE,
   name VARCHAR(255) NOT NULL,
   address TEXT,
   phone VARCHAR(20)
);