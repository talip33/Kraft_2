package W_7_D_3_Encapsulation;

import java.util.Random;

public class KraftBankCunstomer {
///KraftBank adında bir class oluşturun, customerId, customerFullName,
// isSms, customerAccount, customerToken, adında fields tanımlayın,
//1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
// 3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in
// ilk iki harfi+1000-9999 rasında random bir sayı ile otomatik oluşturulacak.
//4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için
// class içerisinde addMoney adında bir metot yazılacak.******************************
//5-Dışardan isSms dışındaki verilere sadece okuma yetkisi verilecek, isSms
// okuma ve yazma yetkisi verilebilecek.******************************************
//6- customerFullName’in değiştirilmesi için token zorunlu kılınacak,
// hatalı token girilirse uyarı verilecek.


    private int customerId;
    private   String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;


    public KraftBankCunstomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2)+(12);

    }

    public void addMoney(double money){

        this.customerAccount+=money;

    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getCustomerFullName() {
        return this.customerFullName;
    }

    public void setCustomerFullName(String customerFullName,String customerToken) {
        if (this.customerToken.equals(customerToken)){
            this.customerFullName = customerFullName;
        }else{
            System.out.println("yetkisiz giriş\nNot authorized");
        }

    }

    public double getCustomerAccount() {
        return this.customerAccount;
    }

    public String getCustomerToken() {
        return this.customerToken;
    }

    public boolean isSms() {
        return this.isSms;
    }

    public void setSms(boolean sms) {
       this.isSms = sms;
    }



}
