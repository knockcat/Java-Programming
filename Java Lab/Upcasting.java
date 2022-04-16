class Upcasting {
    public static void main(String[] args) {
        Bank a = new Bank();
        System.out.println("Bank Interest : " + a.getROI());

        a = new HDFC();
        System.out.println("HDFC Bank Interest : " + a.getROI());

        a = new PNB();
        System.out.println("PNB Bank Interest : " + a.getROI());

        a = new SBI();
        System.out.println("SBI Bank Interest : " + a.getROI());
    }
}

class Bank {
    float getROI() {
        return 0;
    }
}

class HDFC extends Bank {
    float getROI() {
        return 4.0f;
    }
}

class PNB extends Bank {
    float getROI() {
        return 4.5f;
    }
}

class SBI extends Bank {
    float getROI() {
        return 5.0f;
    }
}
