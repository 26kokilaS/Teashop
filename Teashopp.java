package pratice;

import java.util.*;

class TeaShop {
    String shopName;
    String ownerName;
    String famousItem;
    int servantCount;

   TeaShop(String shopName, String ownerName, String famousItem, int servantCount) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.famousItem = famousItem;
        this.servantCount = servantCount;
    }

    public String toString() {
        return "Shop Name: " + shopName + ", Owner Name: " + ownerName +
               ", Famous Item: " + famousItem + ", Servant Count: " + servantCount;
    }

    public void List() {
        System.out.println("[Shop Name    : " + shopName);
        System.out.println("Owner Name   : " + ownerName);
        System.out.println("Famous Item  : " + famousItem);
        System.out.println("Servant Count: " + servantCount+"]");
    }
}

public class Teashopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TeaShop> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Insert Details");
            System.out.println("2. Display in for loop");
            System.out.println("3. Display in List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if(choice == 1) {
                System.out.print("Enter Shop Name: ");
                String shopName = sc.nextLine();
                System.out.print("Enter Owner Name: ");
                String ownerName = sc.nextLine();
                System.out.print("Enter Famous Item: ");
                String famousItem = sc.nextLine();
                System.out.print("Enter Servant Count: ");
                int servantCount = sc.nextInt();
                sc.nextLine(); 

                list.add(new TeaShop(shopName, ownerName, famousItem, servantCount));
                System.out.println("Details added successfully!");
            }

            else if(choice == 2) {
                System.out.println("\n---> Tea Shop Details (Display in for loop) <---");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).toString());
                }
            }

            else if(choice == 3) {
                System.out.println("\n---> Tea Shop Details (Display in List) <---");
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).List();
                }
            }

            else if(choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            else {
                System.out.println("Invalid choice! Please enter the choice 1 to 4.");
            }
        }

        sc.close();
    }
}
