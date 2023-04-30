package dailyduty.hjson.dailydutyapi.model.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dailyduty.hjson.dailydutyapi.core.exception.ssr.Exception400;
import dailyduty.hjson.dailydutyapi.model.board.Board;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
/**
 * User, UserRepository, UserTable(가능하면 만들어라)
 *@Id,GeneratedValue(),@Colum,@PrePersist,@PreUpdate,@Builder
 *1 id, 이름(unique), 패스워드, 이메일, 권한(판매자,고객,관리자) ,생성,업데이트 자동생성, 계정상태(활성,비활성)
 *2 권한 변경, updateRole(), 권한 삭제 delete() 메서드 추가
 **/

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 칼럼
    //password , email, username, role, profile, status, 생성,업데이트
    //회원정보 수정 엔티티
    @Column(unique = true,nullable = false,length = 60)
    private String email;

    @JsonIgnore
    @Column(nullable = false,length = 60)
    private String password;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 20)
    private String role;

    private String profile; //checkpoint 보류
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }

    public void updateRole(String role){
        if(role.equals("role")){
            throw new Exception400("role", "이미 해당 권한을 가지고 있습니다.");
        }
        this.role = role;
    }
    @Builder
    public User(Long id, String email, String password, String username, String role, String profile, boolean status, Board board, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
        this.profile = profile;
        this.status = status;
        this.board = board;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
