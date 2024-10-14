package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test

    public void hashCode_returns_correct_hashcode(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test

    public void equals_returns_correct_boolean() {
        Team t = new Team();
        t.setName("Rohan");
        t.addMember("Shriaan");
        t.addMember("Jayden");
        t.addMember("Claire");
        t.addMember("Tiffany");
        t.addMember("Kelly");

        Team t2 = new Team();
        t2.setName("Otherteam");
        Team t3 = new Team();
        t3.setName("Team 3");
        t3.addMember("Brian");
        t3.addMember("Kevin");
        assertTrue(t.equals(t));
        assertTrue(t2.equals(t2));
        assertFalse(t.equals(t2));

        
        // t.setMembers(("Shriaan", "Jayden", "Claire", "Tiffany", "Kelly");
        
        assertFalse(t.getName().equals(t3.getName()) && t.getMembers().equals(t3.getMembers()));

    }

    @Test
    public void equals_test_null() {
        assert(!team.equals(null));
    }

    




   


   
  

}
