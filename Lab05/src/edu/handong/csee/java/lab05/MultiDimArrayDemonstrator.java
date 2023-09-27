class MultiDimArrayDemonstrator {
    public static void main(String[] args) {

        // 정보
        String[][] people = {
                { "Mr.", "Ms." },
                { "Mark Zuckerberg", "Barack Obama", "Bergoglio Sivori", "Angela Merkel", "Donald Trump",
                        "Greta Thunberg", "Joseph Biden", "Kamala Harris" },
                { "1984-05-14", "1961-08-04", "1936-12-17", "1954-07-17", "1946-06-14", "2003-01-03", "1942-11-20",
                        "1964-10-20" }
        };

        // 반목문 + 조건문
        for (int i = 0; i < people[1].length; i++) {
            String title;
            String name = people[1][i];
            String birthdate = people[2][i];

            if (name.equals("Mark Zuckerberg") || name.equals("Barack Obama") || name.equals("Bergoglio Sivori")
                    || name.equals("Donald Trump") || name.equals("Joseph Biden")) {
                title = people[0][0];
            } else {
                title = people[0][1];
            }

            System.out.println(title + " " + name + " " + birthdate);
        }
    }
}
