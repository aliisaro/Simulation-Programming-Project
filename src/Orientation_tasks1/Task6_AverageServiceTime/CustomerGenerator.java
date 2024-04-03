package Orientation_tasks1.Task6_AverageServiceTime;

public  class CustomerGenerator {
    private static int nextCustomerId = 1;
    public static void generateCustomers(ServicePoint servicePoint, int numCustomers) {
        System.out.println("Creating " + numCustomers + " customers and adding them to the queue.");
        for (int i = 0; i < numCustomers; i++) {
            servicePoint.addToQueue(new Customer(System.currentTimeMillis(), nextCustomerId));
            nextCustomerId++;
        }
    }
}
