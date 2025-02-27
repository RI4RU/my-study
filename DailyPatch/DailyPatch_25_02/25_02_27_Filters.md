## 1️⃣ **`CsrfFilter` (CSRF 필터)**

📌 **CSRF(Cross-Site Request Forgery) 공격을 방지하는 필터**

### ✅ 역할

- CSRF 공격을 방지하기 위해 요청에 **CSRF 토큰이 포함되어 있는지 확인**
- 만약 토큰이 없거나 유효하지 않으면 요청을 차단

### ✅ 동작 방식

1. 사용자가 로그인하면 CSRF 토큰을 생성하고 HTML 폼이나 헤더에 포함
2. 클라이언트가 요청을 보낼 때 CSRF 토큰도 함께 전송
3. `CsrfFilter`가 CSRF 토큰을 검증하여 유효하면 요청 허용, 아니면 차단

### ✅ 비활성화 방법

CSRF 보호가 필요하지 않은 경우(예: REST API 사용) 다음과 같이 비활성화 가능

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable()) // CSRF 필터 비활성화
            .build();
    }
}
```

---

## 2️⃣ **`UsernamePasswordAuthenticationFilter` (사용자 로그인 필터)**

📌 **사용자의 아이디와 비밀번호를 인증하는 필터**

### ✅ 역할

- 기본적으로 `/login` 경로로 들어오는 **로그인 요청을 가로채서** 인증 수행
- `UsernamePasswordAuthenticationToken`을 생성하여 `AuthenticationManager`에게 전달
- 인증이 성공하면 `SecurityContextHolder`에 인증 정보를 저장

### ✅ 동작 방식

1. 사용자가 `/login` 엔드포인트로 **아이디와 비밀번호**를 전송
2. `UsernamePasswordAuthenticationFilter`가 요청을 가로채서 아이디, 비밀번호 확인
3. `AuthenticationManager`가 `UserDetailsService`를 이용해 아이디와 비밀번호 검증
4. 인증이 성공하면 **JWT 토큰 발급 또는 세션 저장** 후 로그인 완료

### ✅ 커스텀 로그인 필터 적용 예제

- 기본적으로 Spring Security가 자동으로 등록하지만, 커스텀 필터를 만들 수도 있음

```java
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
        .formLogin(login -> login.disable()) // 기본 로그인 비활성화
        .addFilter(new UsernamePasswordAuthenticationFilter(authenticationManager())) // 커스텀 필터 추가
        .build();
}
```

---

## 3️⃣ **`AuthorizationFilter` (인가 필터)**

📌 **사용자의 권한을 검사하는 필터**

### ✅ 역할

- 인증된 사용자가 특정 리소스에 접근할 **권한이 있는지 확인**
- 보통 JWT 토큰을 이용해 권한을 검사하는 **JWT 기반 인증 시스템에서 사용됨**

### ✅ 동작 방식

1. 요청의 `Authorization` 헤더에서 JWT 토큰을 가져옴
2. JWT 토큰을 검증하고, 유효한 경우 **사용자의 권한 정보(SecurityContext)에 저장**
3. 사용자의 권한을 검사하여 리소스 접근 여부 결정

### ✅ JWT 기반 `AuthorizationFilter` 예제

```java
public class JwtAuthorizationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        String token = request.getHeader("Authorization");
        
        if (token != null && token.startsWith("Bearer ")) {
            // JWT 토큰 검증 및 유저 정보 설정
            Authentication auth = getAuthentication(token);
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        
        chain.doFilter(request, response);
    }
}
```

---

|필터|역할|주요 기능|
|---|---|---|
|`CsrfFilter`|CSRF 공격 방지|요청에 CSRF 토큰이 있는지 확인|
|`UsernamePasswordAuthenticationFilter`|사용자 로그인 처리|아이디 & 비밀번호로 인증 수행|
|`AuthorizationFilter`|사용자의 권한 검증|JWT 토큰을 검사하고 권한 확인|
