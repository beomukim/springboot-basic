package com.example.voucher.ui;

import com.example.voucher.domain.Voucher;
import java.util.List;

public class Output {

    public static void printProgramInfo() {
        System.out.println("=== Voucher Program ===");
        System.out.println("Type **exit** to exit the program.");
        System.out.println("Type **create** to create a new voucher.");
        System.out.println("Type **list** to list all vouchers.");
    }

    public void printVoucherInfo(Voucher voucher) {
        System.out.println("Voucher ID: " + voucher.getVoucherId());
        System.out.println("Amount: " + voucher.getAmount());
        System.out.println("----------------------------");
    }

    public void printVoucherInfoList(List<Voucher> vouchers) {
        vouchers.forEach(this::printVoucherInfo);
    }
}
