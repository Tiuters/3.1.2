package kata.boot.service;

import kata.boot.entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
//    Role getRoleByName(String roleName);
    void saveRole(Role role);
    List<Role> getAllRoles();
    Role getRoleById(Long id);
//    Set<Role> stringToSet(String[] role);
}
