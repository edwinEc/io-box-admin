package com.ec.device.service;

import com.ec.device.entity.Device;
import com.ec.device.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-27
 * Time: 下午3:08
 */
@Transactional
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceRepository demoRepository;

    public Device find(long id){
        return demoRepository.findOne(id);
    }
    public Device findByUsername(String username){
        return demoRepository.findByUsername(username);
    }

    public List<Device> findAll(){
        return demoRepository.findAll();
    }
    public long count(){
            return demoRepository.count();
    }
    public Device save(Device demo){
        return demoRepository.save(demo);
    }
    public void delete(long id){
        demoRepository.delete(id);
    }


}
