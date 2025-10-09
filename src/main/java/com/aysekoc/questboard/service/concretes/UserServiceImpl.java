package com.aysekoc.questboard.service.concretes;
import com.aysekoc.questboard.config.JwtToken;
import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.User.request.UserCreateRequestDto;
import com.aysekoc.questboard.dto.User.request.UserLoginRequestDto;
import com.aysekoc.questboard.dto.User.response.UserAllListResponseDto;
import com.aysekoc.questboard.dto.User.response.UserCreateResponseDto;
import com.aysekoc.questboard.dto.User.response.UserLoginResponseDto;
import com.aysekoc.questboard.dto.User.response.UserUsernameListResponseDto;
import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.entity.UserTask;
import com.aysekoc.questboard.repository.UserRepository;
import com.aysekoc.questboard.repository.UserTaskRepository;
import com.aysekoc.questboard.service.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserCreateRequestDto createUserRequestDto;
    private final PasswordEncoder passwordEncoder;
    private final JwtToken jwtToken;
    private final UserTaskRepository userTaskRepository;

    @Override
    public UserCreateResponseDto register(UserCreateRequestDto createUserDto) {
        User user = new User();
        user.setUsername(createUserRequestDto.getUsername());
        user.setPassword(createUserRequestDto.getPassword());
        user.setRole(createUserRequestDto.getRole() = USER);

        userRepository.save(user);

        UserCreateResponseDto response = new UserCreateResponseDto();
        response.setMessage("Register successfully");
        return response;
    }

    @Override
    public UserLoginResponseDto login(UserLoginRequestDto loginUserDto) {
        Optional<User> user = userRepository.findByUsername(loginUserDto.getUsername());
        if (user.isEmpty() || !passwordEncoder.matches(loginUserDto.getPassword(), user.get().getPassword())) {
            throw new BadCredentialsException("Invalid username or password");
        }
        return jwtToken.generateToken(user.get().getUsername(), user.get().getRole().name());
    }

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


        // userıd parametresi ile görevleri listeleme
        List<UserTask> liste = userTaskRepository.findByUserId(id);
        liste.getFirst().getTaskId();
        return null;
    }

    @Override
    public void delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

}
