package me.zhengjie.modules.wechat.vo;


import lombok.Data;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class QuerryData {

    private String serviceId;

    private String userName;

    private String productName;

    private String serviceName;

    private Long isDispatch;

    private String progressState;

    private String userPhone;



}
