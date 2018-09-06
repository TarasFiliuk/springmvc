package ua.com.owu.models;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "books")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "people"
    )

    private List<Books> books;
    public List<Books> getBooks() {
        return books;
    }

    private Role role = Role.ROLE_USER;
    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(role.name()));
        return authorities;
    }



    private String password;
    @Override
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



    private String username;
    @Override
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }



    private boolean isAccountNonExpired = true;
    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }
    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }



    private boolean isAccountNonLocked=true;
    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }
    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }


    private boolean isCredentialsNonExpired = true;
    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }


    private boolean isEnabled = true;
    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
