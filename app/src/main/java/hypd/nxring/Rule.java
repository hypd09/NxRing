package hypd.nxring;

/**
 * Not sure about this yet
 */
public class Rule {
    public long uId = -1;
    public String label, description;
    public RuleType type;
    public String phoneNumber;
    public String contactId;
    public int numOfCalls;
    public int distanceBetweenCalls;

    public enum RuleType {
        NCALLS, SMS
    }
}
