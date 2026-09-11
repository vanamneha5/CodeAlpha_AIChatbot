import java.util.Scanner;

public class AIChatbot {

    // Method to generate chatbot responses
    public static String getResponse(String message) {

        message = message.toLowerCase().trim();

        // Greetings
        if (message.contains("hello") ||
            message.contains("hi") ||
            message.contains("hey")) {

            return "Hello! 😊 How can I help you?";
        }

        // Name
        else if (message.contains("your name") ||
                 message.contains("who are you")) {

            return "I am CodeBot, a simple Java AI chatbot.";
        }

        // Java
        else if (message.contains("java")) {

            return "Java is a popular object-oriented programming language.";
        }

        // Programming
        else if (message.contains("programming")) {

            return "Programming is the process of creating instructions for computers.";
        }

        // Internship
        else if (message.contains("internship")) {

            return "Internships help students gain practical skills and industry experience.";
        }

        // CodeAlpha
        else if (message.contains("codealpha")) {

            return "CodeAlpha provides internship opportunities for students to improve their technical skills.";
        }

        // College
        else if (message.contains("college")) {

            return "College is a great place to learn, practice skills and build projects.";
        }

        // Help
        else if (message.contains("help")) {

            return "Sure! You can ask me about Java, programming, internships or CodeAlpha.";
        }

        // Thanks
        else if (message.contains("thank")) {

            return "You're welcome! 😊";
        }

        // Goodbye
        else if (message.contains("bye") ||
                 message.contains("goodbye")) {

            return "Goodbye! Have a great day! 👋";
        }

        // Default response
        else {

            return "Sorry, I don't understand that yet. "
                    + "Please ask me something about Java, "
                    + "programming or internships.";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       CODEBOT - AI CHATBOT");
        System.out.println("====================================");
        System.out.println("Type 'bye' to exit.");
        System.out.println();

        while (true) {

            System.out.print("You: ");

            String userMessage = scanner.nextLine();

            String response = getResponse(userMessage);

            System.out.println("CodeBot: " + response);

            if (userMessage.equalsIgnoreCase("bye") ||
                userMessage.equalsIgnoreCase("goodbye")) {

                break;
            }
        }

        scanner.close();

        System.out.println("\nChatbot session ended.");
    }
}