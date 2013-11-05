package com.beyond.pocketNews.model.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
public class Role{
    public  static  int ROLE_AUTHORITY_TRUE = 1;
    public  static  int ROLE_AUTHORITY_FALSE = 0;

    private String roleName;
    private int roleId;
    private int roleStatus;
    private Set<User> roleUsers = new HashSet<User>();
    private int contentSelect;
    private int contentInsert;
    private int contentUpdate;
    private int contentDelete;
    private int contentClassifySelect;
    private int contentClassifyInsert;
    private int contentClassifyUpdate;
    private int contentClassifyDelete;
    private int contentVerifySelect;
    private int contentVerifyPass;
    private int contentVerifyBack;
    private int userSelect;
    private int userInsert;
    private int userUpdate;
    private int userDelete;
    private int roleSelect;
    private int roleInsert;
    private int roleUpdate;
    private int roleDelete;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getContentSelect() {
        return contentSelect;
    }

    public void setContentSelect(int contentSelect) {
        this.contentSelect = contentSelect;
    }

    public int getContentInsert() {
        return contentInsert;
    }

    public void setContentInsert(int contentInsert) {
        this.contentInsert = contentInsert;
    }

    public int getContentUpdate() {
        return contentUpdate;
    }

    public void setContentUpdate(int contentUpdate) {
        this.contentUpdate = contentUpdate;
    }

    public int getContentDelete() {
        return contentDelete;
    }

    public void setContentDelete(int contentDelete) {
        this.contentDelete = contentDelete;
    }

    public int getContentClassifySelect() {
        return contentClassifySelect;
    }

    public void setContentClassifySelect(int contentClassifySelect) {
        this.contentClassifySelect = contentClassifySelect;
    }

    public int getContentClassifyInsert() {
        return contentClassifyInsert;
    }

    public void setContentClassifyInsert(int contentClassifyInsert) {
        this.contentClassifyInsert = contentClassifyInsert;
    }

    public int getContentClassifyUpdate() {
        return contentClassifyUpdate;
    }

    public void setContentClassifyUpdate(int contentClassifyUpdate) {
        this.contentClassifyUpdate = contentClassifyUpdate;
    }

    public int getContentClassifyDelete() {
        return contentClassifyDelete;
    }

    public void setContentClassifyDelete(int contentClassifyDelete) {
        this.contentClassifyDelete = contentClassifyDelete;
    }

    public int getContentVerifySelect() {
        return contentVerifySelect;
    }

    public void setContentVerifySelect(int contentVerifySelect) {
        this.contentVerifySelect = contentVerifySelect;
    }

    public int getContentVerifyPass() {
        return contentVerifyPass;
    }

    public void setContentVerifyPass(int contentVerifyPass) {
        this.contentVerifyPass = contentVerifyPass;
    }

    public int getContentVerifyBack() {
        return contentVerifyBack;
    }

    public void setContentVerifyBack(int contentVerifyBack) {
        this.contentVerifyBack = contentVerifyBack;
    }

    public int getUserSelect() {
        return userSelect;
    }

    public void setUserSelect(int userSelect) {
        this.userSelect = userSelect;
    }

    public int getUserInsert() {
        return userInsert;
    }

    public void setUserInsert(int userInsert) {
        this.userInsert = userInsert;
    }

    public int getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(int userUpdate) {
        this.userUpdate = userUpdate;
    }

    public int getUserDelete() {
        return userDelete;
    }

    public void setUserDelete(int userDelete) {
        this.userDelete = userDelete;
    }

    public int getRoleSelect() {
        return roleSelect;
    }

    public void setRoleSelect(int roleSelect) {
        this.roleSelect = roleSelect;
    }

    public int getRoleInsert() {
        return roleInsert;
    }

    public void setRoleInsert(int roleInsert) {
        this.roleInsert = roleInsert;
    }

    public int getRoleUpdate() {
        return roleUpdate;
    }

    public void setRoleUpdate(int roleUpdate) {
        this.roleUpdate = roleUpdate;
    }

    public int getRoleDelete() {
        return roleDelete;
    }

    public void setRoleDelete(int roleDelete) {
        this.roleDelete = roleDelete;
    }

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Set<User> getRoleUsers() {
        return roleUsers;
    }

    public void setRoleUsers(Set<User> roleUsers) {
        this.roleUsers = roleUsers;
    }
}
