package entity;

public class User {

        private Long id;
        private String login;
        private String password;

        public User(Long id, String login, String password){
            this.id = id;
            this.login = login;
            this.password = password;
        }

        public final static String USER_SEPARATOR = "#";

        public Long getId(){
            return id;
        }

        public String getLogin(){
            return login;
        }

        public String getPassword(){
            return password;
        }

        @Override
        public String toString(){
            return "Product.User {" +
                    "id =" + id +
                    ", login ='" + login + '\'' +
                    ", password ='" + password + '\'' +
                    '}';

        }
}
