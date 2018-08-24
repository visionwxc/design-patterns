package mapper;


import entity.ScheduleJob;

import java.util.List;

public interface ScheduleJobMapper {
    /**
     * 注:通用mapper 不支持@PostConstruct
     * 查询所有任务
     * @return
     */
    List<ScheduleJob> findList();

}
