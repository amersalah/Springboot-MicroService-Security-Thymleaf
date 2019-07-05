package com.frankmoley.security.app.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LondonUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AuthGroupRepository groupRepository;

    public LondonUserDetailsService(UserRepository userRepository, AuthGroupRepository groupRepository) {
        super();
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("can't find username " + username);
        }
        List<AuthGroup> authGroupList = this.groupRepository.findByUsername(username);
        return new LondonUserPrinciple(user , authGroupList);
    }
}
