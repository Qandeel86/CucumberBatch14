package utils;

import org.json.JSONObject;

public class APIPayloadConstant {

    public static String createEmployeePayload(){
        String createEmployeePayload =
                "{\n" +
                        "  \"emp_firstname\": \"Qandeel\",\n" +
                        "  \"emp_lastname\": \"Wasim\",\n" +
                        "  \"emp_middle_name\": \"MS\",\n" +
                        "  \"emp_gender\": \"F\",\n" +
                        "  \"emp_birthday\": \"1986-01-01\",\n" +
                        "  \"emp_status\": \"confirmed\",\n" +
                        "  \"emp_job_title\": \"QA Engineer\"\n" +
                        "}";
        return createEmployeePayload;
    }

    public static String createEmployeeJsonBody(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname","Qandeel");
        obj.put("emp_lastname","Wasim");
        obj.put("emp_middle_name","MS");
        obj.put("emp_gender","F");
        obj.put("emp_birthday","1986-01-01");
        obj.put("emp_status","confirmed");
        obj.put("emp_job_title","QA Engineer");
        return obj.toString();
    }

    public static String adminPayload(){
        String adminPayload =
                "{\n" +
                        "  \"email\": \"qwasim123@test.com\",\n" +
                        "  \"password\": \"Test@123\"\n" +
                        "}";
        return adminPayload;
    }


}
