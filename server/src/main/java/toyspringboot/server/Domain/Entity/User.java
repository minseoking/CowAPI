package toyspringboot.server.Domain.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;
import org.jetbrains.annotations.NotNull;
import toyspringboot.server.Domain.Dto.UserDto;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
public class User {
    @Id
    private String email;

    @Column
    @NotNull
    private String password;

    @Column
    @NotNull
    private Boolean admin;

    @Column
    @NotNull
    private Boolean isDeleted;

    @Column
    @NotNull
    private Timestamp createdDate;

    @Column
    private Timestamp updatedDate;

    @Column
    private Timestamp deletedDate;

    @Column
    @NotNull
    private String creator;

    @Column
    private String updater;



    public static User of(UserDto userDto) {
        return User.builder()
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .admin(userDto.getAdmin())
                .isDeleted(userDto.getIsDeleted())
                .createdDate(userDto.getCreatedDate())
                .updatedDate(userDto.getUpdatedDate())
                .deletedDate(userDto.getDeletedDate())
                .creator(userDto.getCreator())
                .updater(userDto.getUpdater())
                .build();
    }

    public void setNotNull(UserDto userDto) {
        if(userDto.getPassword() != null) password = userDto.getPassword();
        if(userDto.getAdmin() != null) admin = userDto.getAdmin();
        if(userDto.getIsDeleted() != null) isDeleted = userDto.getIsDeleted();
        if(userDto.getCreatedDate() != null) createdDate = userDto.getCreatedDate();
        if(userDto.getUpdatedDate() != null) updatedDate = userDto.getUpdatedDate();
        if(userDto.getDeletedDate() != null) deletedDate = userDto.getDeletedDate();
        if(userDto.getCreator() != null) creator = userDto.getCreator();
        if(userDto.getUpdater() != null) updater = userDto.getUpdater();
    }
}
