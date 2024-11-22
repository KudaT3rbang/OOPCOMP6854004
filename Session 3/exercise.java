import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        String[][] users = new String[0][3];
        int userCount = 0;

        do {
            System.out.println("1. Input Data");
            System.out.println("2. Show Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            num = input.nextInt();
            input.nextLine();

            switch (num) {
                case 1:
                    // Input Data
                    System.out.print("How many users do you want to enter? ");
                    userCount = input.nextInt();
                    input.nextLine();

                    users = new String[userCount][3]; // Create array to hold user data

                    for (int i = 0; i < userCount; i++) {
                        System.out.println("User No. " + (i + 1));
                        System.out.print("Name: ");
                        users[i][0] = input.nextLine();
                        System.out.print("Password: ");
                        users[i][1] = input.nextLine();
                        System.out.print("Phone Number: ");
                        users[i][2] = input.nextLine();
                        System.out.println();
                    }
                    break;

                case 2:
                    if (users.length > 0) {
                        System.out.println("User Data:");
                        System.out.printf("%-10s %-15s %-15s %-15s%n", "Index", "Name", "Password", "Phone Number");
                        System.out.println("---------------------------------------------------------");
                        for (int i = 0; i < users.length; i++) {
                            System.out.printf("%-10d %-15s %-15s %-15s%n", i, users[i][0], users[i][1], users[i][2]);
                        }
                        System.out.println();
                    } else {
                        System.out.println("No data available.");
                    }
                    break;

                case 3:
                    if (users.length > 0) {
                        System.out.print("Enter the index of the user to delete (starting from 0): ");
                        int deleteIndex = input.nextInt();
                        input.nextLine();

                        if (deleteIndex >= 0 && deleteIndex < users.length) {
                            String[][] updatedUsers = new String[users.length - 1][3];

                            for (int i = 0, j = 0; i < users.length; i++) {
                                if (i != deleteIndex) {
                                    System.arraycopy(users[i], 0, updatedUsers[j], 0, 3);
                                    j++;
                                }
                            }

                            // Assign the new array back to users
                            users = updatedUsers;

                            System.out.println("User deleted.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("No data to delete.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (num != 4);

        input.close();
    }
}
