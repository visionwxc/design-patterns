package service.impl;

import entity.ScheduleJob;
import entity.User;
import mapper.ScheduleJobMapper;
import service.ScheduleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.StringUtils;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;
    @Autowired
    private ScheduleJobMapper scheduleJobMapper;

    @Override
    public void initScheduleJob() {
        List<ScheduleJob> scheduleJobs = scheduleJobMapper.findList();
        if(StringUtils.isEmpty(scheduleJobs)){
            return;
        }
        //初始化定时调度任务
        for(ScheduleJob scheduleJob : scheduleJobs){

        }

    }

    @Override
    public PageInfo<ScheduleJob> findPage(Integer pageNum, Integer pageSize, String jobName, String startTime, String endTime) {
        return null;
    }

    @Override
    public void saveScheduleJob(ScheduleJob scheduleJob, User user) {

    }

    @Override
    public void updateScheduleJob(ScheduleJob scheduleJob, User user) {

    }

    @Override
    public void deleteScheduleJob(Long jobIds) {

    }

    @Override
    public void pauseJob(Long jobId) {

    }

    @Override
    public void resumeJob(Long jobId) {

    }

    @Override
    public void runOnce(Long jobId) {

    }

    @Override
    public ScheduleJob findByJobNameAndJobGroup(String jobName, String jobGroup) {
        return null;
    }

    @Override
    public void pauseAllJob() {

    }

    @Override
    public void resumAllJob() {

    }

    @Override
    public void manualRunScheduleJobs() throws Exception {

    }
}
