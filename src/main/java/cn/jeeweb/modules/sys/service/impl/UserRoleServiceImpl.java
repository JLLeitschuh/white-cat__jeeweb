package cn.jeeweb.modules.sys.service.impl;

import cn.jeeweb.core.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.sys.entity.UserRole;
import cn.jeeweb.modules.sys.service.IUserRoleService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl extends CommonServiceImpl<UserRole> implements IUserRoleService {

}