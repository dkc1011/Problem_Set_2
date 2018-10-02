package ProblemSet2_Q2;

public class Message {
        private String sender;
        private String recipient;
        private String message;

        public void setSender(String sender)
        {
            this.sender = sender;
        }

        public String getSender()
        {
            return this.sender;
        }

        public void setRecipient(String recipient)
        {
            this.recipient = recipient;
        }

        public String getRecipient()
        {
            return this.recipient;
        }

        public void setMessage(String message)
        {
            this.message = message;
        }

        public String getMessage()
        {
            return this.message;
        }

        public Message() {
            this.sender = "No Sender";
            this.recipient = "No Recipient";
            this.message = "No Message";
        }

        public Message(String sender, String recipient, String message)
        {
            this.sender = sender;
            this.recipient = recipient;
            this.message = message;
        }

        public String toString()
        {
            return "From: " + this.sender + "\nRecipient: " + this.recipient + "\nMessage:\n" + this.message;
        }
}
