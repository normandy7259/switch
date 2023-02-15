public class Main {
    public static void main(String[] args) {
        var number = 2;
        switch (number) {
            case 1, 2, 3 -> number *= 3;
            case 7 -> number *= 4;
            case 4 -> number *= 5;
            default -> {
                System.out.println("out of range");
                number += 100;
            }
        }
        System.out.println(number);

    }
}




/*public static int defineLevel (String Role) {
    int level;
    switch(role){
        case "guest":   level = 0;
        break;
        case "client":  level = 1;
        break;
        case "moderator": level = 2;
        break;
        case "admin":   level = 3;
        break;
        default: throw new illegalArgumentException("non-authentic role");
        }
        return level;
        }*/
