package com.loha.flippedclassroom.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
/**
 * POJO
 *
 * @author zhoujian
 * @date 2018/12/16
 */
@Getter
@Setter
public class KlassSeminar {
    private Integer id;
    private Integer klassId;
    private Integer seminarId;
    private Date reportDdl;
    private Integer status;

    private Klass klass;
    private Seminar seminar;
}
