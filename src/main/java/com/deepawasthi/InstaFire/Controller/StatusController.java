package com.deepawasthi.InstaFire.Controller;

import com.deepawasthi.InstaFire.Entity.StatusEntity;
import com.deepawasthi.InstaFire.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/status")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("/createStatus")
    private StatusEntity submitStatus(@RequestBody StatusEntity status) {
        return statusService.createStatus(status);
    }

    @GetMapping("/getStatus")
    private List<StatusEntity> getAllStatus(){
        return statusService.getAllStatus();
    }
}
