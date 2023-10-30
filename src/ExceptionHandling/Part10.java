package ExceptionHandling;

public class Part10 {
    public static void main(String[] args) {
        // custom exception

        AppUser appUser = new AppUser("Anik","131032");
        try{
            logIn(appUser);

        }catch (UserNotFoundException e){
            System.out.println("sign up before log in");
            System.out.println(e);
        }catch (RuntimeException e){
            System.out.println(e);
        }


    }


    static boolean logIn(AppUser appUser) throws UserNotFoundException {
        // operation
        String password="1234";
        if(appUser.getPassword().equals(password)){
            return true;
        }
        throw new UserNotFoundException("user not found by username("+appUser.getName()+")");
    }
}
class AppUser {
    String name,password;
    AppUser(String name, String password){
        this.name=name;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

class UserNotFoundException extends Exception{ /// create a custom checked exception class

    public UserNotFoundException(String s) {
        super(s); // super("user not found");
    }
}
