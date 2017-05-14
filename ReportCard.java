public class ReportCard {

    private static final String UNIVERCITY = "Politechnika Lubelska";
    private double math;
    private double biology;
    private double chemistry;
    private double foreignLanguage;
    private double art;
    private double averageGrade;

    public ReportCard(double math, double biology, double chemistry, double foreignLanguage, double art) {
        this.math = math;
        this.biology = biology;
        this.chemistry = chemistry;
        this.foreignLanguage = foreignLanguage;
        this.art = art;
    }

    public double getAverageGrade() {
        averageGrade = (math + biology + chemistry + foreignLanguage + art) / 5;
        return averageGrade;
    }

    public static String getUNIVERCITY() {
        return UNIVERCITY;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getBiology() {
        return biology;
    }

    public void setBiology(double biology) {
        this.biology = biology;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(double foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public double getArt() {
        return art;
    }

    public void setArt(double art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "ReportCard for " + UNIVERCITY +
                " math=" + math +
                ", biology=" + biology +
                ", chemistry=" + chemistry +
                ", foreignLanguage=" + foreignLanguage +
                ", art=" + art +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
