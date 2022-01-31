package StreamAPIs.Class2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamUserExample {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Gagan","gagan@gmail.com","gs123"));
        userList.add(new User(2,"Akshay","akshay@gmail.com","as123"));
        userList.add(new User(3,"Rahul","rahul@gmail.com","rs123"));
        userList.add(new User(4,"Happy","happy@gmail.com","hs123"));
        userList.add(new User(5,"Mohit","mohit@gmail.com","ms123"));


       /* List<UserDTO> userDTOList = new ArrayList<>();
        for(User user : userList)
        {
            userDTOList.add(new UserDTO(user.getId(),user.getName(),user.getEmail()));
        }

        for(UserDTO userDTO : userDTOList)
        {
            System.out.println(userDTO);
        }*/

//        Using Stream.map
       // userList.stream().map((user)-> new UserDTO(user.getId(), user.getName(), user.getEmail())).forEach(System.out::println);

        List<UserDTO> userDTOList = userList.stream().map((user)-> new UserDTO(user.getId(), user.getName(), user.getEmail())).collect(Collectors.toList());
        userDTOList.forEach(System.out::println);
    }
}
class UserDTO{
    private int id;
    private String name;
    private String email;

    public UserDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
