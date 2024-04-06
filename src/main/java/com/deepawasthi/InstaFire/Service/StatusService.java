package com.deepawasthi.InstaFire.Service;

import com.deepawasthi.InstaFire.Entity.StatusEntity;
import com.deepawasthi.InstaFire.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Autowired
    UserService userService;

    public StatusEntity createStatus(StatusEntity status){
        return statusRepository.save(status);
    }

    public List<StatusEntity> getAllStatus(){
        List<StatusEntity> statusList = statusRepository.findAll();

        for(int i = 0; i<statusList.size(); i++){
            StatusEntity status = statusList.get(i);
            status.setUserName(userService.getUserDetail(status.getUserId()).getUserName());
        }
        return statusList;
    }
}
