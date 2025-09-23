package com.aysekoc.questboard.service.concretes;


import com.aysekoc.questboard.dto.Task.response.TaskStatusResponseDto;
import com.aysekoc.questboard.dto.User.request.CreateUserRequestDto;
import com.aysekoc.questboard.dto.User.request.LoginUserRequestDto;
import com.aysekoc.questboard.dto.User.LoginUserResponseDto;
import com.aysekoc.questboard.dto.User.response.CreateUserResponseDto;
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
    private final CreateUserRequestDto createUserRequestDto;

    @Override
    public CreateUserResponseDto register(CreateUserRequestDto createUserDto) {
        User control = userRepository.findByUsername(createUserDto.getUsername());
        if (control == null) {
            control = new User();
            control.setUsername(createUserDto.getUsername());
            control.setEmail(createUserDto.getEmail());
            control.setPasswordHash(createUserDto.getPasswordHash());
            control.setLevel(createUserDto.getLevel());
            control.setRole(createUserDto.getRole());
            control.setDisplayName(createUserDto.getDisplayName());
            control.setTotalPoints(createUserDto.getTotalPoints());
            userRepository.save(control);
        }
        else{
            throw new RuntimeException("Username already exists");
        }
        return  new CreateUserResponseDto(control.getUsername() + " created successfully");
    }

    @Override
    public LoginUserResponseDto login(LoginUserRequestDto loginUserDto) {
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
    public TaskStatusResponseDto getTaskStatusId(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

}
