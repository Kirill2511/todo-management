package ru.kirill.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kirill.todomanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
