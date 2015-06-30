package com.innovez.sample.core.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author zakyalvan
 */
@Service("userService")
@Validated
@Transactional(readOnly = true)
public class JpaRepositoryUserService implements UserService {
}
