package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Remark;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface RemarkService {

    Remark createRemark(Remark remark);

    List<Remark> getAllRemarks();

    Remark getRemarkById(Long id);
}
