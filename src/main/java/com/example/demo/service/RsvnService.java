package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.entity.Rsvn;
import com.example.demo.repo.RsvnRepo;

@Service
public class RsvnService {
    

    @Autowired
    private RsvnRepo rsvnRepo;

    public Rsvn get(){
        Long key =2L;
        return rsvnRepo.findById(key).orElse(null);
    }

    @Transactional
    public Rsvn Save(){


        LocalDateTime now = LocalDateTime.now();
        Timestamp ll = Timestamp.valueOf(now);

        var a = Rsvn.builder().name("asdas").email("jindalre@gmail").checkinTime(now).checkoutTime(now).createTime(now).testTimespan(ll).build();

        return rsvnRepo.save(a);
    }

    public List<Rsvn> Gets(){


        return rsvnRepo.findAll();
        // var results = new ArrayList<Rsvn>();

        // var r = new Rsvn();

        
        // r.setId(234923);

        //     results.add(
        //         r
        //     );
        // return results;
        
    }
}
