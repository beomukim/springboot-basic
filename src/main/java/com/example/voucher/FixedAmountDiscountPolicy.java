package com.example.voucher;

public class FixedAmountDiscountPolicy implements DiscountPolicy {
    private double fixedAmount;

    public FixedAmountDiscountPolicy(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public void applyDiscount(Voucher voucher) {
        // 고정 금액 할인 적용 로직 구현
    }
}
