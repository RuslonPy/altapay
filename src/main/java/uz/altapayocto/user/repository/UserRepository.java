package uz.altapayocto.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.altapayocto.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
