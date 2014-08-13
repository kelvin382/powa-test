package com.powa.test.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.powa.test.service.api.UserService;

@SuppressWarnings("serial")
@Stateless
@Remote(UserService.class)
public class UserServiceImpl implements UserService {

}
