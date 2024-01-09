package _9;

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static class Service implements _9.Priceable {
        private String name;
        private double hourlyRate;
        private int hours;

        public Service(String name, double hourlyRate, int hours) {
            this.name = name;
            this.hourlyRate = hourlyRate;
            this.hours = hours;
        }

        @Override
        public double getPrice() {
            return hourlyRate * hours;
        }
    }
}