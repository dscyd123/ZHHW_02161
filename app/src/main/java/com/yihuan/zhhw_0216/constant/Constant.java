package com.yihuan.zhhw_0216.constant;

/**
 * Created by zjb on 2016/6/12.
 */
public class Constant {
    //    http://192.168.1.112:8080/designated/app/customer/sendMessage?phone=15871105320&code=3666
//    public static final String HOST = "http://120.24.46.15:8080/aiton-designated-driver-app-webapp/designated/app/driver";
    public static final String HOST = "http://xmaiton.xicp.net:5560/aiton-designated-driver-app-webapp/designated/app/driver";
    public static final int ABLEVERSION = 0;//可用版x本号
    public static final String APP_ID = "";

    public static class Url {
    }

    public static class PERMISSION {
        public static final int ACCESS_COARSE_LOCATION = 0;
        public static final int ACCESS_FINE_LOCATION = 1;
        public static final int WRITE_EXTERNAL_STORAGE = 2;
        public static final int READ_EXTERNAL_STORAGE = 3;
        public static final int READ_PHONE_STATE = 4;
        public static final int PERMISSION_READ_SMS = 5;
        public static final int RECEIVE_BOOT_COMPLETED = 6;
        public static final int RECEIVE_WRITE_SETTINGS = 7;
        public static final int RECEIVE_VIBRATE = 8;
        public static final int RECEIVE_DISABLE_KEYGUARD = 9;
        public static final int CALL_PHONE = 10;
        public static final int SYSTEM_ALERT_WINDOW = 11;
        public static final int PERMISSION_WRITE_EXTERNAL_STORAGE_SSENGJI = 12;
        public static final int CAMERA = 13;
        public static final int MOUNT_UNMOUNT_FILESYSTEMS = 14;
        public static final int READ_CONTACTS = 15;

    }

    public static class INTENT_KEY {
    }

    public static class REQUEST_RESULT_CODE {
        public static final int CHANGE_END = 1;
        public static final int CHANGE_NAEM = 2;
        public static final int QIAM_MING = 3;
        public static final int USER_INFO = 4;
        public static final int USER_ID = 5;
        public static final int APPLY = 6;
        public static final int CHOSSE_CONTACTS = 7;
        public static final int PICK_CONTACT = 8;
        public static final int EMERGENCY = 9;
    }



    public static class SP {

    }

    public static class ACACHE {


    }

    public static class BROADCASTCODE {
        public static final String SEND_ORDER = "sendOrder";
        public static final String SEND_ORDER_SERVER = "sendOrderServer";
        public static final String CANCEL_ORDER = "cancelOrder";
        public static final String PAY_SUCCESS = "paysuccess";
        public static final String PAY_RECEIVER = "pay_receiver";
        public static final String USER = "user";
        public static final String STOP_GET_ORDER = "stopGetOrder";
        public static final String WALLET = "wallet";
    }

    public static class TYPE {
        public static final String CAR_ID = "carId";
        public static final String CHANGE_NAME = "changeName";
        public static final String EMERGENCY = "emergency";
        public static final String SEX = "sex";
        public static final String ALLORDER = "allorder";
        public static final String APPOINTEDORDER = "appointedorder";
        public static final String LOGIN = "login";
        public static final String WALLET = "wallet";

    }
    public static class auditingstatus{
        public static final String SEX = "sex";

    }
    public static class ORDER_STATUS{
        public static final int  ORDER_COMPLETE = 0;
        public static final int  WAIT_DRIVER_RECEIVE = 1;
        public static final int  ORDER_RECEIVE = 2;
        public static final int  SERVING = 3;
        public static final int  SERVER_COMPLETE = 4;
        public static final int  SETTLEMENT  = 5;
        public static final int  CANCEL = 6;
        public static final int  NO_EVALUATION = 7;
        public static final int  WAIT_CUSTOMER = 8;

    }
}
