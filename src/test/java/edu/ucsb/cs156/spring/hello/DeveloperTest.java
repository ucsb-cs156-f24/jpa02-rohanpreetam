package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Rohan", Developer.getName());
    }
    
    @Test
    public void getName_returns_correct_getGithubId() {
        assertEquals("rohanpreetam", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f24-16", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Shriaan"),"Team should contain Shriaan");
        assertTrue(t.getMembers().contains("Jayden"),"Team should contain Jayden");
        assertTrue(t.getMembers().contains("Kelly"),"Team should contain Kelly");
        assertTrue(t.getMembers().contains("Tiffany"),"Team should contain Tiffany");
        assertTrue(t.getMembers().contains("Claire"),"Team should contain Claire");
    }


}
