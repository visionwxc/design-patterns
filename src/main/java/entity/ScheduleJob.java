package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;

@Data
@ApiModel
@EqualsAndHashCode(callSuper = true,  exclude = {"cron"})
public class ScheduleJob extends BaseEntity {

	private static final long serialVersionUID = -7646410378374725909L;

	/** 任务调度的参数key */
	@ApiModelProperty(value = "任务调度的参数key",notes = "任务调度的参数key")
	public static final String JOB_PARAM_KEY    = "jobParam";

	/**
	 * 任务名称
     */
	@ApiModelProperty(value = "任务名称",notes = "任务名称")
	private String jobName;

	/**
	 * 任务分组
     */
	@ApiModelProperty(value = "任务分组",notes = "任务分组")
	private String jobGroup;

	/**
	 * 任务分组
	 */
	@ApiModelProperty(value = "任务描述",notes = "任务描述")
	private String jobDescription;

	/**
	 * 执行计划
     */
	@ApiModelProperty(value = "执行计划",notes = "执行计划")
	private String cron;

	/**
	 * 调度方式 false 远程 true 本地
     */
	@ApiModelProperty(value = "调度方式",notes = "调度方式")
	private Boolean isLocal;

	/**
	 * 远程请求方式 只支持POST
     */
	@ApiModelProperty(value = "远程请求方式 只支持post",notes = "远程请求方式 只支持post")
	private String remoteRequestMethod;

	/**
	 * 远程执行url
     */
	@ApiModelProperty(value = "远程执行url",notes = "远程执行url")
	private String remoteUrl;

	/**
	 * 执行类名称 包名+类名
     */
	@ApiModelProperty(value = "执行类名称 包名+类名",notes = "执行类名称 包名+类名")
	private String beanClass;

	/**
	 * 执行方法名称
	 */
	@ApiModelProperty(value = "执行方法名称",notes = "执行方法名称")
	private String methodName;

	/**
	 * 参数
	 */
	@ApiModelProperty(value = "参数",notes = "参数")
	private String params;

	/**
	 * 是否异步  0否 1是
     */
	@ApiModelProperty(value = "是否异步  0否 1是",notes = "是否异步  0否 1是")
	private Boolean isAsync;

	/**
	 * 是否异步  0否 1是
	 */
	@ApiModelProperty(value = "是否运行  0否 1是",notes = "是否运行  0否 1是")
	private Boolean running;

	/**
	 * 任务状态 0禁用 1启用
     */
	@ApiModelProperty(value = "任务状态 0禁用 1启用",notes = "任务状态 0禁用 1启用")
	private Integer status;

	/**
	 * 描述
     */
	@ApiModelProperty(value = "描述",notes = "描述")
	private String remarks;

	/**
	 * 创建者
     */
	@ApiModelProperty(value = "创建者",notes = "创建者")
	private Long createBy;

	/**
	 * 修改者
     */
	@ApiModelProperty(value = "修改者",notes = "修改者")
	private Long modifyBy;

	/**
	 * 创建者姓名
     */
	@ApiModelProperty(value = "创建者姓名",notes = "创建者姓名")
	@Transient
	private String createByName;


	@ApiModelProperty(value = "创建者时间",notes = "创建者时间")
	@Transient
	private String createTime;

	/**
	 * 修改者姓名
	 */
	@ApiModelProperty(value = "修改者姓名",notes = "修改者姓名")
	@Transient
	private String modifyByName;

}
