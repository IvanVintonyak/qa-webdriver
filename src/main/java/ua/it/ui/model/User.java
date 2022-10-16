//package ua.it.ui.model;
//
//public class User {
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String userName;
//
//    public User(String firstName, String lastName, String email, String userName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.userName = userName;
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
//
//    public static class Builder {
//        private String userName;
//        private String firstName;
//        private String lastName;
//        private String email;
//
//
//        public Builder setFirstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public Builder setLastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//        public Builder setEmail(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public Builder setUserName(String userName) {
//            this.userName = userName;
//            return this;
//        }
//
//        public User build() {
//            return new User(firstName, lastName, email, userName);
//        }
//    }
//}
