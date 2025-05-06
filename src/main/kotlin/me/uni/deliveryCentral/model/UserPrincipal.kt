package me.uni.deliveryCentral.model

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserPrincipal(private val user: User) : UserDetails{
    override fun getAuthorities(): Collection<GrantedAuthority> {
        return user.role.map { SimpleGrantedAuthority("ROLE_$it") }
    }

    override fun getPassword(): String {
        return user.password
    }

    override fun getUsername(): String {
        return user.username
    }

    override fun isAccountNonExpired(): Boolean = true;
    override fun isAccountNonLocked(): Boolean = true;
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isEnabled(): Boolean = true
}