package Online_3;

class ThreadJob implements Runnable {
	 
     int i = 0;
		int num = 0;
		String primeNumbers = "";
    @Override
    public void run() {
        for (int i = 500; i < 600; i++) {
        	int counter = 0;
			for (num = i; num >= 1; num--) {

				if (i % num == 0) {

					counter = counter + 1;
				}
			}

			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println("Prime numbers from 500 to 600 : \n" + primeNumbers);

		System.out.println();
            System.out.println(Thread.currentThread().getName()
                    + ":" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



public class Online_2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadJob());

        t1.start();
 
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main completed");
    }
}
