package com.ec.device.service;

import com.ec.base.service.BaseService;
import com.ec.device.entity.Device;

import java.util.List;

/**
 * User: chaocui200783
 * Date: 14-10-30
 * Time: 下午5:25
 */
public interface DeviceService extends BaseService{
    public Device find(long id);
    public List<Device> findAll();
    public long count();
    public Device save(Device demo);
    public void delete(long id);
    public Device findByUsername(String username);
}
