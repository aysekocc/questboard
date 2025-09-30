package com.aysekoc.questboard.service.concretes;


import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.User.request.UserCreateRequestDto;
import com.aysekoc.questboard.dto.User.request.UserLoginRequestDto;
import com.aysekoc.questboard.dto.User.response.UserAllListResponseDto;
import com.aysekoc.questboard.dto.User.response.UserLoginResponseDto;
import com.aysekoc.questboard.dto.User.response.UserCreateResponseDto;
import com.aysekoc.questboard.dto.User.response.UserUsernameListResponseDto;
import com.aysekoc.questboard.entity.Task;
import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.repository.UserRepository;
import com.aysekoc.questboard.service.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserCreateRequestDto createUserRequestDto;

    @Override
    public UserCreateResponseDto register(UserCreateRequestDto createUserDto) {
        User user = new User();
        user.setUsername(createUserRequestDto.getUsername());
        user.setPassword(createUserRequestDto.getPassword());
        user.setRole(createUserRequestDto.getRole());

        userRepository.save(user);

        UserCreateResponseDto response = new UserCreateResponseDto();
        response.setMessage("Register successfully");
        return response;
    }

    @Override
    public UserLoginResponseDto login(UserLoginRequestDto loginUserDto) {
        User user = userRepository.findByUsername(loginUserDto.getUsername());
        if(user.isEmpty() || !p)

        //bu şifrede bu usernamede biri var mı kontrol et varsa  login ol.
        return null;
    }
        //TODO GERİ DÖNÜŞ TİPİ ASLA USER  GİBİ ENTİTYLER OLAMAMALI HEPSİNE AİT DTO'LAR YAZILMALIDIR.

    @Override
    public List<UserAllListResponseDto> listAll() {
        List<User> liste =userRepository.findAll();
        List <UserAllListResponseDto> response = new ArrayList<>();
        for(int i =0;i<liste.size();i++){
            UserAllListResponseDto response2 = new UserAllListResponseDto();
            response2.setId(liste.get(i).getId());
            response2.setUsername(liste.get(i).getUsername());
            response2.setRole(liste.get(i).getRole());
            response2.setPassword(liste.get(i).getPassword());
            response2.setCreatedAt(liste.get(i).getCreatedAt());
            response.add(response2);
        }
        return response;
    }

    @Override
    public List<UserUsernameListResponseDto> findAllUsername() {
        List<User> liste =userRepository.findAllUsername();
        List<UserUsernameListResponseDto> response = new ArrayList<>();
        for(int i =0;i<liste.size();i++){
            UserUsernameListResponseDto response2 = new UserUsernameListResponseDto();
            response2.setCreatedAt(liste.get(i).getCreatedAt());
            response2.setRole(liste.get(i).getRole());
            response.add(response2);
        }
        return response;
    }

    @Override
    public TaskCreateResponseDto getTaskStatusId(Long id) {
        List<Task> liste = userRepository.findAllTask();
        List<TaskAllListResponseDto> response = new ArrayList<>();
        for(int i =0;i<liste.size();i++){
            TaskCreateResponseDto response2 = new TaskCreateResponseDto();
            response2.
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

}
