CREATE TABLE users_role (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID REFERENCES users(id),
    role_id UUID REFERENCES role(id)
);