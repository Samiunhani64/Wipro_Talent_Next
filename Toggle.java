class Toggle {
    public static void main(String[] args) {
        

        String str = "MY NAME"; // Example string
        StringBuilder toggledStr = new StringBuilder(); 
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch); // Non-alphabetic characters remain unchanged
            }
            
        }
        System.out.println("Toggled character: " + str + " to " + toggledStr.toString() 
                           + " (case toggled)"  );
    }
}
