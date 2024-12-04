package Übungsaufgaben.Kreatur;

public enum Type {
    MONSTER("Monster"),
    SKELETON("Skeleton"),
    VAMPIRE("Vampire"),
    ZOMBIE("Zombie");

    private final String displayName;

    Type(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
