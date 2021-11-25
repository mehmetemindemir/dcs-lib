package com.dcs.lib.user;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public  class Role implements GrantedAuthority, Serializable {
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
