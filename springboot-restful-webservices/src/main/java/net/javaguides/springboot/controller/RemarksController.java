package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.Remark;
import net.javaguides.springboot.service.RemarkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@AllArgsConstructor
@RequestMapping("api/remarks")
public class RemarksController {

    private RemarkService remarkService;

    @PostMapping
    public ResponseEntity<Remark> createRemark(@RequestBody Remark remark){
        Remark savedRemark = remarkService.createRemark(remark);
        return new ResponseEntity<>(savedRemark, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Remark> getRemarkById(@PathVariable("id") Long id){
        Remark remark = remarkService.getRemarkById(id);
        return new ResponseEntity<>(remark, HttpStatus.OK);
    }

}
