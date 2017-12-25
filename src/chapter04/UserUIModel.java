package chapter04;

import chapter01.MyUtils;

import java.util.ArrayList;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 16:50
 */
public interface UserUIModel {
    String imgUrl();
    String name();
    String phone();
    String idCardNo();

    public static void main(String[] args) {
        ArrayList<UserUIModel> userUIModels = UserEntity.getTestData();
        for (UserUIModel userUIModel : userUIModels) {
            System.out.println(MyUtils.getCurrentTime() + "userUIModel = " + userUIModel.name()+" "+userUIModel.idCardNo());
        }
    }
//2017-12-25 17:03:20:975  userUIModel = 三和大神0号
//2017-12-25 17:03:20:975  userUIModel = 三和大神1号
//2017-12-25 17:03:20:975  userUIModel = 三和大神2号
//2017-12-25 17:03:20:976  userUIModel = 三和大神3号
//2017-12-25 17:03:20:976  userUIModel = 三和大神4号
//2017-12-25 17:03:20:976  userUIModel = 三和大神5号
//2017-12-25 17:03:20:976  userUIModel = 三和大神6号
//2017-12-25 17:03:20:976  userUIModel = 三和大神7号
//2017-12-25 17:03:20:976  userUIModel = 三和大神8号
//2017-12-25 17:03:20:976  userUIModel = 三和大神9号
}
