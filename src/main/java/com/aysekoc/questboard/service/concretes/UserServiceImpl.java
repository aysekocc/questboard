package com.aysekoc.questboard.service.concretes;


import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.User.request.UserCreateRequestDto;
import com.aysekoc.questboard.dto.User.request.UserLoginRequestDto;
import com.aysekoc.questboard.dto.User.response.UserLoginResponseDto;
import com.aysekoc.questboard.dto.User.response.UserCreateResponseDto;
import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.repository.UserRepository;
import com.aysekoc.questboard.service.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserCreateRequestDto createUserRequestDto;

    @Override
    public UserCreateResponseDto register(UserCreateRequestDto createUserDto) {
        User control = userRepository.findByUsername(createUserDto.getUsername());
        if (control == null) {
            control = new User();
            control.setUsername(createUserDto.getUsername());
            control.setPassword(createUserDto.getPassword());
            control.setRole(createUserDto.getRole());
            userRepository.save(control);
        }
        else{
            throw new RuntimeException("Username already exists");
        }
        return  new UserCreateResponseDto(control.getUsername() + " created successfully");
    }

    @Override
    public UserLoginResponseDto login(UserLoginRequestDto loginUserDto) {
        //bu şifrede bu usernamede biri var mı kontrol et varsa  login ol.
        return null;
    }
        //TODO GERİ DÖNÜŞ TİPİ ASLA USER  GİBİ ENTİTYLER OLAMAMALI HEPSİNE AİT DTO'LAR YAZILMALIDIR.

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public User listUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public TaskCreateResponseDto getTaskStatusId(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

}
