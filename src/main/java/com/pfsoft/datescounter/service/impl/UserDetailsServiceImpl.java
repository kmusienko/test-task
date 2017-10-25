package com.pfsoft.datescounter.service.impl;

import com.pfsoft.datescounter.entity.Role;
import com.pfsoft.datescounter.entity.User;
import com.pfsoft.datescounter.repository.UserRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private UserRepository userRepository;

  @Autowired
  public void setUserRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * This is an obligatory method that implements the similar method of the
   * UserDetailsService interface. Here we get a user from the repository by
   * user's name, then get his role and then we return a value of UserDetails type,
   * which is actually provided by the framework itself. It's basically the
   * procedure of user authorization.
   *
   * @param username String value
   * @return UserDetails with user permission
   * @throws UsernameNotFoundException if there is no such user in the database
   */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User user = userRepository.findByUsername(username);
    Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
    Role role = user.getRole();
    grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
    return new org.springframework.security.core.userdetails.User(user.getUsername(),
        user.getPassword(), grantedAuthorities);
  }
}
