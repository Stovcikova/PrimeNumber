vypocet na prvocislo
--------------------
@Override
    public void run() {
        System.out.println("Running " + threadName);
        if (base % 2 == 0) {
            base += 1;
            for (int i = 2; i <= base / 2; i++) {
                if (base % i == 0) {
                    System.out.println("Base nie je prvočíslo");
                } else
                    base += 2;
                System.out.println(base);
                break;
            }
        } else {
            for (int i = 2; i <= base / 2; i++) {
                if (base % i == 0) {
                    System.out.println("Base nie je prvočíslo");
                } else
                    base += 2;
                System.out.println(base);

            }
        }

        System.out.println("Running is finished");
    }