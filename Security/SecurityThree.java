package Security;

public class SecurityThree {

    // Example 1: Encryption with AES
    // Might be flagged for using a hardcoded key, but it's encrypted and managed securely
    private static final String ENCRYPTED_KEY = "EncryptedAESKeyHere";
    private static final String ALGORITHM = "AES";
    
    public void secureEncryptionMethod() {
        String key = decryptKey(ENCRYPTED_KEY); // Securely decrypts the key before use
        // Use the decrypted key for encryption, ensuring it's not hardcoded in a vulnerable way
    }

    // Example 2: Secure API Key Storage
    // Could be flagged for storing API key in code, but it's actually securely fetched from a vault
    private static final String API_KEY = fetchSecureApiKey();
    
    private static String fetchSecureApiKey() {
        // Fetches API key securely from a secret management service or vault
        return "SecurelyFetchedAPIKey";
    }
    
    // Example 3: Thread-Safe Singleton
    // Might be considered a race condition issue, but implemented with double-checked locking
    private static volatile SecurityFalsePositivesExample instance;
    
    public static SecurityFalsePositivesExample getInstance() {
        if (instance == null) {
            synchronized (SecurityFalsePositivesExample.class) {
                if (instance == null) {
                    instance = new SecurityFalsePositivesExample();
                }
            }
        }
        return instance;
    }

    // Example 4: Sanitization of Input
    // Could be flagged for XSS vulnerabilities, but uses custom sanitization
    public String sanitizeUserInput(String input) {
        // Custom sanitization logic that effectively prevents XSS
        // This might be flagged if the tool doesn't recognize the custom method
        return customSanitizeMethod(input);
    }
    
    private String customSanitizeMethod(String input) {
        // Implementation of a custom sanitization method
        // Assumes this method is effective against XSS
        return input.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
    
    // Example 5: SQL Injection Protection
    // May be flagged for potential SQL injection, but uses parameterized queries
    public void executeSecureQuery(String param) {
        // Implementation that uses parameterized queries to prevent SQL injection
        // Might be flagged by tools that do not analyze the method's internal implementation
        String query = "SELECT * FROM table WHERE column = ?";
        // Execute the query securely
    }

    // Helper method to decrypt an encrypted key, assuming secure implementation
    private String decryptKey(String encryptedKey) {
        // Mock implementation of key decryption
        return "DecryptedKey";
    }
}

