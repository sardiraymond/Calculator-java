package org.juaracoding.calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
//    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
//    By btnDua = By.id("com.google.android.calculator:id/digit_2");
//    By btnTambah = By.id("com.google.android.calculator:id/op_add");
//    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
//    By hasil = By.id("com.google.android.calculator:id/result_final");
    /* web: xpath = //taghtml[contains(@attr, value)] */

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1") //ambil dari resource id
    private MobileElement btnSatu;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    private MobileElement btnTiga;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private MobileElement btnTambah;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnSub;
    
    @AndroidFindBy(id = "com.google.android.calculator:id/op_Mul")
    private MobileElement btnMul;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;


    //Methodtes
    public void calcAdd() {
        btnSatu.click();
        btnTambah.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calcsub() {
        btnTiga.click();
        btnSub.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    //
    public String getTxtResult() {
        return hasil.getText();
    }

}
