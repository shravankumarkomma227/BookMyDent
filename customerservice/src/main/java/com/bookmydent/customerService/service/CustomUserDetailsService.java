package com.bookmydent.customerService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookmydent.customerService.entity.Customer;
import com.bookmydent.customerService.repository.CustomerRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Customer> optional = customerRepository.findByMobileNumber(username);
		
	    return optional.orElseThrow(()->new UsernameNotFoundException("User Not Found"));

		}
	}
	
	

