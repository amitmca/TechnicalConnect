package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.entity.Remark;

public interface RemarksRepository extends JpaRepository<Remark, Long> {
}
