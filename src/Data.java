class Data {
    private int dia;
    private int mes;
    private int ano;
    private final int[] DIASMESES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] WEEKDAYS = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

    public Data() {
        this.ano = 2023;
        this.mes = 8;
        this.dia = 29;
    }

    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public int diasNoMes() {
        int plusFevBi = this.mes == 2 && eAnoBisexto() ? 1 : 0;
        return DIASMESES[this.mes - 1] + plusFevBi;
    }

    public String diaDaSemana() {
        if (this.ano == 2024) {
            if (this.mes == 1) {
                int firstWeek = this.dia < 7 ? 1 : 0;
                return WEEKDAYS[this.dia % 7 - firstWeek];
            }
            int dia = this.dia + getDays2024(this.mes);
            return WEEKDAYS[dia % 7];
        }
        int dias = 0;
        dias += getDays2024(this.mes, this.ano);
        for (int i = 0; i < this.ano - 2024; i++) {
        }
        if (this.ano > 2024) {
            dias += this.dia;
            System.out.println(dias);
            return WEEKDAYS[dia % 7];
        } else {
            dias = dias - this.dia + 5;
            return WEEKDAYS[dia % 7];
        }
    }

    public boolean eAnoBisexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0;
    }

    public void proximoDia() {
        if (this.mes == 12 && this.dia == 31) {
            this.ano++;
            this.mes = 1;
            this.dia = 1;
        } else if (this.dia == diasNoMes()) {
            this.mes++;
            this.dia = 1;
        } else {
            this.dia++;
        }
    }

    public String porExtenso() {
        return  String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    @Override
    public String toString() {
        return porExtenso();
    }

    // Helper
    private int getDays2024(int month, int year) {
        int quantDay = 0;
        for (int i = 1; i < month; i++) {
            quantDay+= DIASMESES[i - 1] + i == 2 ? 1 : 0;
            System.out.println(quantDay);
        }
        return quantDay;
    }
}