public class Chapter07 {
    public static void main(String[] args) {
        int num = 2; 
        if (num <= 5) {
            System.out.println("very near");
        } else if (num <= 10) {
            System.out.println("near");
         } else if (num <= 15) {
            System.out.println("far");
        } else {
            System.out.println("very far");
        }

        String color = "yellow";
        switch(color) {
          case "red" :
            System.out.println("aka");
            break;
          case "yellow" :
            System.out.println("ki");
            break;
          case "blue" :
            System.out.println("ao");
            break;
          default:
            System.out.println("no color");
        }
    }

}