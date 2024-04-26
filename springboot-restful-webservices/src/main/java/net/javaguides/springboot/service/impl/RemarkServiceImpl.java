package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.Remark;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.RemarksRepository;
import net.javaguides.springboot.service.RemarkService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RemarkServiceImpl implements RemarkService {

    private RemarksRepository remarksRepository;
    @Override
    public Remark createRemark(Remark remark) {
        return remarksRepository.save(remark);
    }

    @Override
    public List<Remark> getAllRemarks() {
        return remarksRepository.findAll();
    }

    @Override
    public Remark getRemarkById(Long id) {
        Optional<Remark> optionalRemark = remarksRepository.findById(id);
        return optionalRemark.get();
    }
}
