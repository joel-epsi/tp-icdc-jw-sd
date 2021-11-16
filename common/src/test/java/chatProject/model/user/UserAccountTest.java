package chatProject.model.user;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountTest {

    @Test
    public void getUsername() {

        final String username = "joel";
        final UserAccount user = new UserAccount(1, username);

        assertEquals("The username should be the one set in the constructor",
                username, user.getUsername());
    }

    @Test
    public void testEquals() {

        final UserAccount joel = new UserAccount(1, "joel");
        final UserAccount sylvain = new UserAccount(2, "joel");

        assertEquals("2 accounts are equal if they have the same username",
                joel.getUsername(), sylvain.getUsername());
    }

    @Test
    public void testHashCode() {

        final UserAccount user1 = new UserAccount(1, "joel");
        final UserAccount user2 = new UserAccount(1, "joel");

        assertEquals("2 accounts with the same username should have the same hashcode",
                user1.hashCode(), user2.hashCode());
    }

    @Test
    public void testToString() {

        final UserAccount user = new UserAccount(0, "MyUser");
        assertEquals("The toString() method of a UserAccount should print the username",
                "MyUser", user.toString());
    }
}