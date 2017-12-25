package chapter04;

import java.util.ArrayList;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 16:52
 */
public class UserEntity implements UserUIModel {
    private String name;
    private String phone;
    private String idCard;
    private String img;
    private String bleAddress;
    private String olNo;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getImg() {
        return img;
    }

    public String getBleAddress() {
        return bleAddress;
    }

    public String getOlNo() {
        return olNo;
    }

    public UserEntity(String name, String phone, String idCard, String img, String bleAddress, String olNo) {
        this.name = name;
        this.phone = phone;
        this.idCard = idCard;
        this.img = img;
        this.bleAddress = bleAddress;
        this.olNo = olNo;
    }

    @Override
    public String imgUrl() {
        return getImg();
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public String phone() {
        return getPhone();
    }

    @Override
    public String idCardNo() {
        return getIdCard();
    }

    static ArrayList<UserUIModel> getTestData(){
        ArrayList<UserUIModel> userEntities = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userEntities.add(new UserEntity("三和大神"+i+"号","1713326558"+i,"43100719930607776"+i,"","",""));
        }
        return userEntities;
    }
}
