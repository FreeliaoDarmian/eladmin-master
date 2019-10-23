package me.zhengjie.modules.wechat.rest.server;

import me.zhengjie.modules.wechat.entity.Tech;
import me.zhengjie.modules.wechat.service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//员工
@RequestMapping("/tech")
@RestController
public class TechController {

    @Autowired
    TechService techService;

    //查询所有员工信息
    @PostMapping("/list")
    public ResponseEntity listTech(@RequestParam(value="limit",defaultValue = "0")String limit,
                                   @RequestParam(value="offset",defaultValue = "10") String offset,
                                   @RequestAttribute Long adminId
                                   ){
        return techService.list(limit,offset,adminId);
    }

    //员工详细信息
    @PostMapping("/{techId}")
    public ResponseEntity detailTech(@PathVariable(value = "techId")Integer techId,@RequestAttribute Long adminId){
        return techService.findOne(techId,adminId);
    }


    //禁制某个员工
    @DeleteMapping("/kickOut/{techId}")
    public ResponseEntity kickOut(@PathVariable(value = "techId")Integer techId,@RequestAttribute Long adminId){
        return techService.kickOut(techId,adminId);
    }


    //添加员工
    @PostMapping("/add")
    public ResponseEntity addTech(@RequestBody Tech tech,@RequestAttribute Long adminId){
        return techService.insert(tech,adminId);
    }




}
