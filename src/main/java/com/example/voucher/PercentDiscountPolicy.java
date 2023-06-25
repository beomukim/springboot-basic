package com.example.voucher;

public class PercentDiscountPolicy implements DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent) {
        this.percent = percent;
    }

    @Override
    public void applyDiscount(Voucher voucher) {
        // 할인율 적용 로직 구현
    }
}
