package day0123;

class WorkVO {
    private String name;
    private int javaScore;
    private int oracleScore;

    public WorkVO(String name, int javaScore, int oracleScore) {
        this.name = name;
        this.javaScore = javaScore;
        this.oracleScore = oracleScore;
    }

    public String getName() {
        return name;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public int getOracleScore() {
        return oracleScore;
    }

    // 총점 계산 메서드
    public int getTotal() {
        return javaScore + oracleScore;
    }
}
