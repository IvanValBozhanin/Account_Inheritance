/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.company;

import com.company.entites.Account;
import com.company.entites.CheckingAccount;
import com.company.entites.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        generateTestsNormal();
        generateTestsSavings();
        generateTestsChecking();
    }

    public static void generateTestsChecking(){
        CheckingAccount ca = new CheckingAccount(0007, 1000, 10000);
        ca.withdraw(1500);
        ca.deposit(20000);
    }

    public static void generateTestsSavings(){
        SavingsAccount sa = new SavingsAccount(0007, 1000);
        sa.withdraw(20000);
        sa.deposit(20000);
        System.out.println(sa.toString());
    }

    public static void generateTestsNormal(){
        Account.setYearInterestRate(4.5);
        Account a1 = new Account(1122, 20000);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1.toString());
    }
}
