### **`ProviderManager`의 역할**

📌 **Spring Security에서 인증(Authentication)을 처리하는 핵심 클래스**  
📌 여러 개의 **AuthenticationProvider**를 관리하며, **사용자의 인증 요청을 적절한 Provider에 위임**

---

## ✅ **1. ProviderManager란?**

- `AuthenticationManager`의 구현체 중 하나로, **여러 개의 `AuthenticationProvider`를 관리**하는 역할
- 사용자의 인증 요청을 받아서 적절한 `AuthenticationProvider`에게 위임하여 인증 수행
- 만약 하나의 `AuthenticationProvider`에서 인증이 실패하면, 다음 `AuthenticationProvider`에게 넘겨서 인증을 시도

---

## ✅ **2. 동작 방식**

1️⃣ 사용자가 **아이디 & 비밀번호, JWT 토큰 등**으로 로그인 요청을 보냄  
2️⃣ `UsernamePasswordAuthenticationFilter` 또는 `JwtAuthenticationFilter`가 요청을 가로챔  
3️⃣ **`ProviderManager`가 `AuthenticationProvider` 리스트를 확인하며 인증 시도**  
4️⃣ 적절한 `AuthenticationProvider`가 사용자 정보를 검증하여 인증 성공 또는 실패 결정  
5️⃣ 인증 성공 시 `SecurityContextHolder`에 저장하여 **이후 요청에서 사용자의 인증 정보를 유지**

---

## ✅ **3. ProviderManager 예제**

예를 들어, **DB 기반 인증과 OAuth2 인증을 함께 사용하는 경우**를 가정해 보자!  
각각을 처리할 두 개의 `AuthenticationProvider`를 만들고 `ProviderManager`에서 관리하도록 설정할 수 있어.

### ① **두 개의 AuthenticationProvider 생성**

```java
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        // DB에서 사용자 인증 (예제)
        if ("user".equals(username) && "password".equals(password)) {
            return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
        }

        throw new BadCredentialsException("Invalid username or password");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
```

```java
@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String token = authentication.getCredentials().toString();
        
        // JWT 검증 (예제)
        if (token.equals("valid-token")) {
            return new UsernamePasswordAuthenticationToken("jwtUser", null, new ArrayList<>());
        }

        throw new BadCredentialsException("Invalid JWT token");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
```

### ② **ProviderManager에서 두 개의 Provider 등록**

```java
@Bean
public AuthenticationManager authenticationManager() {
    List<AuthenticationProvider> providers = List.of(
        new CustomAuthenticationProvider(),  // DB 기반 인증
        new JwtAuthenticationProvider()      // JWT 기반 인증
    );
    return new ProviderManager(providers);
}
```

---

## ✅ **4. `ProviderManager`의 주요 기능**

|기능|설명|
|---|---|
|여러 `AuthenticationProvider` 관리|여러 개의 인증 방식을 처리 가능 (예: DB 인증, OAuth2 인증, JWT 인증 등)|
|순차적 인증 시도|한 `AuthenticationProvider`에서 실패하면 다음 `AuthenticationProvider`로 넘어감|
|`SecurityContextHolder`에 인증 정보 저장|인증이 성공하면 사용자 정보를 `SecurityContextHolder`에 저장하여 이후 요청에서도 인증 유지|

---

## ✅ **5. 정리**

✔ **ProviderManager**는 Spring Security에서 **인증(Authentication)을 총괄하는 관리자 역할**  
✔ 여러 개의 **AuthenticationProvider**를 관리하면서 적절한 Provider에게 인증을 위임  
✔ **다중 인증 방식(DB, JWT, OAuth 등)**을 유연하게 지원

---
