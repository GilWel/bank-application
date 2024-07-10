public enum AgeCategory {
    CHILD(0, 14),
    TEEN(15, 18),
    ADULT(19, 65),
    PENSIONER(66, 85);
    private int startPeriod;
    private int endPeriod;

    AgeCategory(int startPeriod, int endPeriod) {
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;

    }

    public int getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(int startPeriod) {
        this.startPeriod = startPeriod;
    }

    public int getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(int endPeriod) {
        this.endPeriod = endPeriod;
    }

    public static AgeCategory getCategoryByAge(int age) {
        AgeCategory[] categories = AgeCategory.values();
        for (int i = 0; i < categories.length; i++) {
            AgeCategory ageCategory = categories[i];
            if (age >= ageCategory.startPeriod && age < ageCategory.endPeriod)
                return ageCategory;

        }
        return null;
    }

}
