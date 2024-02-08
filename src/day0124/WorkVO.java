package day0124;


class WorkVO {
	private int number;
    private String name;
    public int getNumber() {
		return number;
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



	private int javaScore;
    private int oracleScore;

    public WorkVO(int number, String name, int javaScore, int oracleScore) {
    	this.number = number;
        this.name = name;
        this.javaScore = javaScore;
        this.oracleScore = oracleScore;
    }
    
    

    // 총점 계산 메서드
    public int getTotal() {
        return javaScore + oracleScore;
    }
}
