package demo.aihomepage.repository;

import demo.aihomepage.entity.myText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBSubmitTestRepository extends JpaRepository<myText, Long> {
}
