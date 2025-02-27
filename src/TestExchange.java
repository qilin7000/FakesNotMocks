class TestExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        if (origin.equals("USD") && target.equals("EUR")) {
            return 0.90f;
        } else if (origin.equals("USD") && target.equals("JPY")) {
            return 130.5f;
        } else if (origin.equals("USD") && target.equals("INR")) {
            return 75.0f;
        }
        return 1.0f;
    }
}
