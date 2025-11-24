public class CounterSynchronized {
        private final Object lock = new Object();
        private int count = 0;

        public void increment() {
            int i=0;
            while (i<5000) {
                i++;
                synchronized (lock) {
                    count++;
                }
            }
            System.out.println("count: " + count);
        }
        public int getCount() {
            return count;
        }

    }


