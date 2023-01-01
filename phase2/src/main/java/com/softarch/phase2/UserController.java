package com.softarch.phase2;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController
{
    public Startup s = new Startup();

    @PostMapping(value = "/users/signUp")
    public String signUp(@RequestBody Users users)
    {

        return s.SignUpChecker(users);
    }
    @PostMapping(value = "/users/signIn")
    public String signIn(@RequestBody Users users)
    {
        return s.SignInChecker(users);
    }

    @GetMapping(value = "/users/{Email}")
    public String getUser(@PathVariable ("Email") String Email)
    {
        return s.checkUser(Email);
    }
}
