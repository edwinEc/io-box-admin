package com.ec.device.controller;

import com.ec.device.entity.Device;
import com.ec.device.service.DeviceService;
import com.ec.exception.BusinessException;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-22
 * Time: 上午11:27
 */
@RestController
@RequestMapping("/demo")
public class DeviceController {

    @Autowired
    private DeviceService demoService;

    @RequestMapping("/save")
    @JsonView(Device.DemoView.class)
    public Device save(@ModelAttribute Device demo) {
        return demoService.save(demo);
    }

    @RequestMapping("/delete/{id}")
    @JsonView(Device.DemoView.class)
    public void delete(@PathVariable int id) {
        demoService.delete(id);
    }

    @RequestMapping("/find/{id}")
    @JsonView(Device.DemoView.class)
    public Device find(@PathVariable int id) {
        return demoService.find(id);
    }

    @RequestMapping("/findByUsername/{username}")
    @JsonView(Device.DemoView.class)
    public Device find(@PathVariable String username) {
        return demoService.findByUsername(username);
    }

    @RequestMapping("/findAll")
    @JsonView(Device.DemoView.class)
    public List<Device> findAll() throws BusinessException {
        return demoService.findAll();
    }

    @RequestMapping("/count")
    @JsonView(Device.DemoView.class)
    public long count() {
        return demoService.count();
    }

}
