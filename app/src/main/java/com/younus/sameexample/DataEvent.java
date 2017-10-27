package com.younus.sameexample;

/**
 * Created by younus on 17.10.2017.
 */

public class DataEvent {

    static class sendUser{
        private User user;
        public sendUser(User user) {
            this.user=user;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }
}
