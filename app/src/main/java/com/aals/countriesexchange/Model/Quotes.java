package com.aals.countriesexchange.Model;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity(tableName = "rates")
public class Quotes implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private Date timestamp;
    private String base;
    @Ignore
    private Map<String, Double> currenciesList;

    @SerializedName("USDAED")
    @Expose
    private double AED;
    @SerializedName("USDAFN")
    @Expose
    private double AFN;
    @SerializedName("USDALL")
    @Expose
    private double ALL;
    @SerializedName("USDAMD")
    @Expose
    private double AMD;
    @SerializedName("USDANG")
    @Expose
    private double ANG;
    @SerializedName("USDAOA")
    @Expose
    private double AOA;
    @SerializedName("USDARS")
    @Expose
    private double ARS;
    @SerializedName("USDAUD")
    @Expose
    private double AUD;
    @SerializedName("USDAWG")
    @Expose
    private double AWG;
    @SerializedName("USDAZN")
    @Expose
    private double AZN;
    @SerializedName("USDBAM")
    @Expose
    private double BAM;
    @SerializedName("USDBBD")
    @Expose
    private double BBD;
    @SerializedName("USDBDT")
    @Expose
    private double BDT;
    @SerializedName("USDBGN")
    @Expose
    private double BGN;
    @SerializedName("USDBHD")
    @Expose
    private double BHD;
    @SerializedName("USDBIF")
    @Expose
    private double BIF;
    @SerializedName("USDBMD")
    @Expose
    private double BMD;
    @SerializedName("USDBND")
    @Expose
    private double BND;
    @SerializedName("USDBOB")
    @Expose
    private double BOB;
    @SerializedName("USDBRL")
    @Expose
    private double BRL;
    @SerializedName("USDBSD")
    @Expose
    private double BSD;
    @SerializedName("USDBTC")
    @Expose
    private double BTC;
    @SerializedName("USDBTN")
    @Expose
    private double BTN;
    @SerializedName("USDBWP")
    @Expose
    private double BWP;
    @SerializedName("USDBYN")
    @Expose
    private double BYN;
    @SerializedName("USDBYR")
    @Expose
    private double BYR;
    @SerializedName("USDBZD")
    @Expose
    private double BZD;
    @SerializedName("USDCAD")
    @Expose
    private double CAD;
    @SerializedName("USDCDF")
    @Expose
    private double CDF;
    @SerializedName("USDCHF")
    @Expose
    private double CHF;
    @SerializedName("USDCLF")
    @Expose
    private double CLF;
    @SerializedName("USDCLP")
    @Expose
    private double CLP;
    @SerializedName("USDCNY")
    @Expose
    private double CNY;
    @SerializedName("USDCOP")
    @Expose
    private double COP;
    @SerializedName("USDCRC")
    @Expose
    private double CRC;
    @SerializedName("USDCUC")
    @Expose
    private double CUC;
    @SerializedName("USDCUP")
    @Expose
    private double CUP;
    @SerializedName("USDCVE")
    @Expose
    private double CVE;
    @SerializedName("USDCZK")
    @Expose
    private double CZK;
    @SerializedName("USDDJF")
    @Expose
    private double DJF;
    @SerializedName("USDDKK")
    @Expose
    private double DKK;
    @SerializedName("USDDOP")
    @Expose
    private double DOP;
    @SerializedName("USDDZD")
    @Expose
    private double DZD;
    @SerializedName("USDEGP")
    @Expose
    private double EGP;
    @SerializedName("USDERN")
    @Expose
    private double ERN;
    @SerializedName("USDETB")
    @Expose
    private double ETB;
    @SerializedName("USDEUR")
    @Expose
    private double EUR;
    @SerializedName("USDFJD")
    @Expose
    private double FJD;
    @SerializedName("USDFKP")
    @Expose
    private double FKP;
    @SerializedName("USDGBP")
    @Expose
    private double GBP;
    @SerializedName("USDGEL")
    @Expose
    private double GEL;
    @SerializedName("USDGGP")
    @Expose
    private double GGP;
    @SerializedName("USDGHS")
    @Expose
    private double GHS;
    @SerializedName("USDGIP")
    @Expose
    private double GIP;
    @SerializedName("USDGMD")
    @Expose
    private double GMD;
    @SerializedName("USDGNF")
    @Expose
    private double GNF;
    @SerializedName("USDGTQ")
    @Expose
    private double GTQ;
    @SerializedName("USDGYD")
    @Expose
    private double GYD;
    @SerializedName("USDHKD")
    @Expose
    private double HKD;
    @SerializedName("USDHNL")
    @Expose
    private double HNL;
    @SerializedName("USDHRK")
    @Expose
    private double HRK;
    @SerializedName("USDHTG")
    @Expose
    private double HTG;
    @SerializedName("USDHUF")
    @Expose
    private double HUF;
    @SerializedName("USDIDR")
    @Expose
    private double IDR;
    @SerializedName("USDILS")
    @Expose
    private double ILS;
    @SerializedName("USDIMP")
    @Expose
    private double IMP;
    @SerializedName("USDINR")
    @Expose
    private double INR;
    @SerializedName("USDIQD")
    @Expose
    private double IQD;
    @SerializedName("USDIRR")
    @Expose
    private double IRR;
    @SerializedName("USDISK")
    @Expose
    private double ISK;
    @SerializedName("USDJEP")
    @Expose
    private double JEP;
    @SerializedName("USDJMD")
    @Expose
    private double JMD;
    @SerializedName("USDJOD")
    @Expose
    private double JOD;
    @SerializedName("USDJPY")
    @Expose
    private double JPY;
    @SerializedName("USDKES")
    @Expose
    private double KES;
    @SerializedName("USDKGS")
    @Expose
    private double KGS;
    @SerializedName("USDKHR")
    @Expose
    private double KHR;
    @SerializedName("USDKMF")
    @Expose
    private double KMF;
    @SerializedName("USDKPW")
    @Expose
    private double KPW;
    @SerializedName("USDKRW")
    @Expose
    private double KRW;
    @SerializedName("USDKWD")
    @Expose
    private double KWD;
    @SerializedName("USDKYD")
    @Expose
    private double KYD;
    @SerializedName("USDKZT")
    @Expose
    private double KZT;
    @SerializedName("USDLAK")
    @Expose
    private double LAK;
    @SerializedName("USDLBP")
    @Expose
    private double LBP;
    @SerializedName("USDLKR")
    @Expose
    private double LKR;
    @SerializedName("USDLRD")
    @Expose
    private double LRD;
    @SerializedName("USDLSL")
    @Expose
    private double LSL;
    @SerializedName("USDLTL")
    @Expose
    private double LTL;
    @SerializedName("USDLVL")
    @Expose
    private double LVL;
    @SerializedName("USDLYD")
    @Expose
    private double LYD;
    @SerializedName("USDMAD")
    @Expose
    private double MAD;
    @SerializedName("USDMDL")
    @Expose
    private double MDL;
    @SerializedName("USDMGA")
    @Expose
    private double MGA;
    @SerializedName("USDMKD")
    @Expose
    private double MKD;
    @SerializedName("USDMMK")
    @Expose
    private double MMK;
    @SerializedName("USDMNT")
    @Expose
    private double MNT;
    @SerializedName("USDMOP")
    @Expose
    private double MOP;
    @SerializedName("USDMRO")
    @Expose
    private double MRO;
    @SerializedName("USDMUR")
    @Expose
    private double MUR;
    @SerializedName("USDMVR")
    @Expose
    private double MVR;
    @SerializedName("USDMWK")
    @Expose
    private double MWK;
    @SerializedName("USDMXN")
    @Expose
    private double MXN;
    @SerializedName("USDMYR")
    @Expose
    private double MYR;
    @SerializedName("USDMZN")
    @Expose
    private double MZN;
    @SerializedName("USDNAD")
    @Expose
    private double NAD;
    @SerializedName("USDNGN")
    @Expose
    private double NGN;
    @SerializedName("USDNIO")
    @Expose
    private double NIO;
    @SerializedName("USDNOK")
    @Expose
    private double NOK;
    @SerializedName("USDNPR")
    @Expose
    private double NPR;
    @SerializedName("USDNZD")
    @Expose
    private double NZD;
    @SerializedName("USDOMR")
    @Expose
    private double OMR;
    @SerializedName("USDPAB")
    @Expose
    private double PAB;
    @SerializedName("USDPEN")
    @Expose
    private double PEN;
    @SerializedName("USDPGK")
    @Expose
    private double PGK;
    @SerializedName("USDPHP")
    @Expose
    private double PHP;
    @SerializedName("USDPKR")
    @Expose
    private double PKR;
    @SerializedName("USDPLN")
    @Expose
    private double PLN;
    @SerializedName("USDPYG")
    @Expose
    private double PYG;
    @SerializedName("USDQAR")
    @Expose
    private double QAR;
    @SerializedName("USDRON")
    @Expose
    private double RON;
    @SerializedName("USDRSD")
    @Expose
    private double RSD;
    @SerializedName("USDRUB")
    @Expose
    private double RUB;
    @SerializedName("USDRWF")
    @Expose
    private double RWF;
    @SerializedName("USDSAR")
    @Expose
    private double SAR;
    @SerializedName("USDSBD")
    @Expose
    private double SBD;
    @SerializedName("USDSCR")
    @Expose
    private double SCR;
    @SerializedName("USDSDG")
    @Expose
    private double SDG;
    @SerializedName("USDSEK")
    @Expose
    private double SEK;
    @SerializedName("USDSGD")
    @Expose
    private double SGD;
    @SerializedName("USDSHP")
    @Expose
    private double SHP;
    @SerializedName("USDSLL")
    @Expose
    private double SLL;
    @SerializedName("USDSOS")
    @Expose
    private double SOS;
    @SerializedName("USDSRD")
    @Expose
    private double SRD;
    @SerializedName("USDSTD")
    @Expose
    private double STD;
    @SerializedName("USDSVC")
    @Expose
    private double SVC;
    @SerializedName("USDSYP")
    @Expose
    private double SYP;
    @SerializedName("USDSZL")
    @Expose
    private double SZL;
    @SerializedName("USDTHB")
    @Expose
    private double THB;
    @SerializedName("USDTJS")
    @Expose
    private double TJS;
    @SerializedName("USDTMT")
    @Expose
    private double TMT;
    @SerializedName("USDTND")
    @Expose
    private double TND;
    @SerializedName("USDTOP")
    @Expose
    private double TOP;
    @SerializedName("USDTRY")
    @Expose
    private double TRY;
    @SerializedName("USDTTD")
    @Expose
    private double TTD;
    @SerializedName("USDTWD")
    @Expose
    private double TWD;
    @SerializedName("USDTZS")
    @Expose
    private double TZS;
    @SerializedName("USDUAH")
    @Expose
    private double UAH;
    @SerializedName("USDUGX")
    @Expose
    private double UGX;
    @SerializedName("USDUSD")
    @Expose
    private double USD;
    @SerializedName("USDUYU")
    @Expose
    private double UYU;
    @SerializedName("USDUZS")
    @Expose
    private double UZS;
    @SerializedName("USDVEF")
    @Expose
    private double VEF;
    @SerializedName("USDVND")
    @Expose
    private double VND;
    @SerializedName("USDVUV")
    @Expose
    private double VUV;
    @SerializedName("USDWST")
    @Expose
    private double WST;
    @SerializedName("USDXAF")
    @Expose
    private double XAF;
    @SerializedName("USDXAG")
    @Expose
    private double XAG;
    @SerializedName("USDXAU")
    @Expose
    private double XAU;
    @SerializedName("USDXCD")
    @Expose
    private double XCD;
    @SerializedName("USDXDR")
    @Expose
    private double XDR;
    @SerializedName("USDXOF")
    @Expose
    private double XOF;
    @SerializedName("USDXPF")
    @Expose
    private double XPF;
    @SerializedName("USDYER")
    @Expose
    private double YER;
    @SerializedName("USDZAR")
    @Expose
    private double ZAR;
    @SerializedName("USDZMK")
    @Expose
    private double ZMK;
    @SerializedName("USDZMW")
    @Expose
    private double ZMW;
    @SerializedName("USDZWL")
    @Expose
    private double ZWL;

    public Quotes() {

    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAED() {
        return AED;
    }

    public void setAED(double AED) {
        this.AED = AED;
    }

    public double getAFN() {
        return AFN;
    }

    public void setAFN(double AFN) {
        this.AFN = AFN;
    }

    public double getALL() {
        return ALL;
    }

    public void setALL(double ALL) {
        this.ALL = ALL;
    }

    public double getAMD() {
        return AMD;
    }

    public void setAMD(double AMD) {
        this.AMD = AMD;
    }

    public double getANG() {
        return ANG;
    }

    public void setANG(double ANG) {
        this.ANG = ANG;
    }

    public double getAOA() {
        return AOA;
    }

    public void setAOA(double AOA) {
        this.AOA = AOA;
    }

    public double getARS() {
        return ARS;
    }

    public void setARS(double ARS) {
        this.ARS = ARS;
    }

    public double getAUD() {
        return AUD;
    }

    public void setAUD(double AUD) {
        this.AUD = AUD;
    }

    public double getAWG() {
        return AWG;
    }

    public void setAWG(double AWG) {
        this.AWG = AWG;
    }

    public double getAZN() {
        return AZN;
    }

    public void setAZN(double AZN) {
        this.AZN = AZN;
    }

    public double getBAM() {
        return BAM;
    }

    public void setBAM(double BAM) {
        this.BAM = BAM;
    }

    public double getBBD() {
        return BBD;
    }

    public void setBBD(double BBD) {
        this.BBD = BBD;
    }

    public double getBDT() {
        return BDT;
    }

    public void setBDT(double BDT) {
        this.BDT = BDT;
    }

    public double getBGN() {
        return BGN;
    }

    public void setBGN(double BGN) {
        this.BGN = BGN;
    }

    public double getBHD() {
        return BHD;
    }

    public void setBHD(double BHD) {
        this.BHD = BHD;
    }

    public double getBIF() {
        return BIF;
    }

    public void setBIF(double BIF) {
        this.BIF = BIF;
    }

    public double getBMD() {
        return BMD;
    }

    public void setBMD(double BMD) {
        this.BMD = BMD;
    }

    public double getBND() {
        return BND;
    }

    public void setBND(double BND) {
        this.BND = BND;
    }

    public double getBOB() {
        return BOB;
    }

    public void setBOB(double BOB) {
        this.BOB = BOB;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getBSD() {
        return BSD;
    }

    public void setBSD(double BSD) {
        this.BSD = BSD;
    }

    public double getBTC() {
        return BTC;
    }

    public void setBTC(double BTC) {
        this.BTC = BTC;
    }

    public double getBTN() {
        return BTN;
    }

    public void setBTN(double BTN) {
        this.BTN = BTN;
    }

    public double getBWP() {
        return BWP;
    }

    public void setBWP(double BWP) {
        this.BWP = BWP;
    }

    public double getBYN() {
        return BYN;
    }

    public void setBYN(double BYN) {
        this.BYN = BYN;
    }

    public double getBYR() {
        return BYR;
    }

    public void setBYR(double BYR) {
        this.BYR = BYR;
    }

    public double getBZD() {
        return BZD;
    }

    public void setBZD(double BZD) {
        this.BZD = BZD;
    }

    public double getCAD() {
        return CAD;
    }

    public void setCAD(double CAD) {
        this.CAD = CAD;
    }

    public double getCDF() {
        return CDF;
    }

    public void setCDF(double CDF) {
        this.CDF = CDF;
    }

    public double getCHF() {
        return CHF;
    }

    public void setCHF(double CHF) {
        this.CHF = CHF;
    }

    public double getCLF() {
        return CLF;
    }

    public void setCLF(double CLF) {
        this.CLF = CLF;
    }

    public double getCLP() {
        return CLP;
    }

    public void setCLP(double CLP) {
        this.CLP = CLP;
    }

    public double getCNY() {
        return CNY;
    }

    public void setCNY(double CNY) {
        this.CNY = CNY;
    }

    public double getCOP() {
        return COP;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    public double getCRC() {
        return CRC;
    }

    public void setCRC(double CRC) {
        this.CRC = CRC;
    }

    public double getCUC() {
        return CUC;
    }

    public void setCUC(double CUC) {
        this.CUC = CUC;
    }

    public double getCUP() {
        return CUP;
    }

    public void setCUP(double CUP) {
        this.CUP = CUP;
    }

    public double getCVE() {
        return CVE;
    }

    public void setCVE(double CVE) {
        this.CVE = CVE;
    }

    public double getCZK() {
        return CZK;
    }

    public void setCZK(double CZK) {
        this.CZK = CZK;
    }

    public double getDJF() {
        return DJF;
    }

    public void setDJF(double DJF) {
        this.DJF = DJF;
    }

    public double getDKK() {
        return DKK;
    }

    public void setDKK(double DKK) {
        this.DKK = DKK;
    }

    public double getDOP() {
        return DOP;
    }

    public void setDOP(double DOP) {
        this.DOP = DOP;
    }

    public double getDZD() {
        return DZD;
    }

    public void setDZD(double DZD) {
        this.DZD = DZD;
    }

    public double getEGP() {
        return EGP;
    }

    public void setEGP(double EGP) {
        this.EGP = EGP;
    }

    public double getERN() {
        return ERN;
    }

    public void setERN(double ERN) {
        this.ERN = ERN;
    }

    public double getETB() {
        return ETB;
    }

    public void setETB(double ETB) {
        this.ETB = ETB;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getFJD() {
        return FJD;
    }

    public void setFJD(double FJD) {
        this.FJD = FJD;
    }

    public double getFKP() {
        return FKP;
    }

    public void setFKP(double FKP) {
        this.FKP = FKP;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getGEL() {
        return GEL;
    }

    public void setGEL(double GEL) {
        this.GEL = GEL;
    }

    public double getGGP() {
        return GGP;
    }

    public void setGGP(double GGP) {
        this.GGP = GGP;
    }

    public double getGHS() {
        return GHS;
    }

    public void setGHS(double GHS) {
        this.GHS = GHS;
    }

    public double getGIP() {
        return GIP;
    }

    public void setGIP(double GIP) {
        this.GIP = GIP;
    }

    public double getGMD() {
        return GMD;
    }

    public void setGMD(double GMD) {
        this.GMD = GMD;
    }

    public double getGNF() {
        return GNF;
    }

    public void setGNF(double GNF) {
        this.GNF = GNF;
    }

    public double getGTQ() {
        return GTQ;
    }

    public void setGTQ(double GTQ) {
        this.GTQ = GTQ;
    }

    public double getGYD() {
        return GYD;
    }

    public void setGYD(double GYD) {
        this.GYD = GYD;
    }

    public double getHKD() {
        return HKD;
    }

    public void setHKD(double HKD) {
        this.HKD = HKD;
    }

    public double getHNL() {
        return HNL;
    }

    public void setHNL(double HNL) {
        this.HNL = HNL;
    }

    public double getHRK() {
        return HRK;
    }

    public void setHRK(double HRK) {
        this.HRK = HRK;
    }

    public double getHTG() {
        return HTG;
    }

    public void setHTG(double HTG) {
        this.HTG = HTG;
    }

    public double getHUF() {
        return HUF;
    }

    public void setHUF(double HUF) {
        this.HUF = HUF;
    }

    public double getIDR() {
        return IDR;
    }

    public void setIDR(double IDR) {
        this.IDR = IDR;
    }

    public double getILS() {
        return ILS;
    }

    public void setILS(double ILS) {
        this.ILS = ILS;
    }

    public double getIMP() {
        return IMP;
    }

    public void setIMP(double IMP) {
        this.IMP = IMP;
    }

    public double getINR() {
        return INR;
    }

    public void setINR(double INR) {
        this.INR = INR;
    }

    public double getIQD() {
        return IQD;
    }

    public void setIQD(double IQD) {
        this.IQD = IQD;
    }

    public double getIRR() {
        return IRR;
    }

    public void setIRR(double IRR) {
        this.IRR = IRR;
    }

    public double getISK() {
        return ISK;
    }

    public void setISK(double ISK) {
        this.ISK = ISK;
    }

    public double getJEP() {
        return JEP;
    }

    public void setJEP(double JEP) {
        this.JEP = JEP;
    }

    public double getJMD() {
        return JMD;
    }

    public void setJMD(double JMD) {
        this.JMD = JMD;
    }

    public double getJOD() {
        return JOD;
    }

    public void setJOD(double JOD) {
        this.JOD = JOD;
    }

    public double getJPY() {
        return JPY;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;
    }

    public double getKES() {
        return KES;
    }

    public void setKES(double KES) {
        this.KES = KES;
    }

    public double getKGS() {
        return KGS;
    }

    public void setKGS(double KGS) {
        this.KGS = KGS;
    }

    public double getKHR() {
        return KHR;
    }

    public void setKHR(double KHR) {
        this.KHR = KHR;
    }

    public double getKMF() {
        return KMF;
    }

    public void setKMF(double KMF) {
        this.KMF = KMF;
    }

    public double getKPW() {
        return KPW;
    }

    public void setKPW(double KPW) {
        this.KPW = KPW;
    }

    public double getKRW() {
        return KRW;
    }

    public void setKRW(double KRW) {
        this.KRW = KRW;
    }

    public double getKWD() {
        return KWD;
    }

    public void setKWD(double KWD) {
        this.KWD = KWD;
    }

    public double getKYD() {
        return KYD;
    }

    public void setKYD(double KYD) {
        this.KYD = KYD;
    }

    public double getKZT() {
        return KZT;
    }

    public void setKZT(double KZT) {
        this.KZT = KZT;
    }

    public double getLAK() {
        return LAK;
    }

    public void setLAK(double LAK) {
        this.LAK = LAK;
    }

    public double getLBP() {
        return LBP;
    }

    public void setLBP(double LBP) {
        this.LBP = LBP;
    }

    public double getLKR() {
        return LKR;
    }

    public void setLKR(double LKR) {
        this.LKR = LKR;
    }

    public double getLRD() {
        return LRD;
    }

    public void setLRD(double LRD) {
        this.LRD = LRD;
    }

    public double getLSL() {
        return LSL;
    }

    public void setLSL(double LSL) {
        this.LSL = LSL;
    }

    public double getLTL() {
        return LTL;
    }

    public void setLTL(double LTL) {
        this.LTL = LTL;
    }

    public double getLVL() {
        return LVL;
    }

    public void setLVL(double LVL) {
        this.LVL = LVL;
    }

    public double getLYD() {
        return LYD;
    }

    public void setLYD(double LYD) {
        this.LYD = LYD;
    }

    public double getMAD() {
        return MAD;
    }

    public void setMAD(double MAD) {
        this.MAD = MAD;
    }

    public double getMDL() {
        return MDL;
    }

    public void setMDL(double MDL) {
        this.MDL = MDL;
    }

    public double getMGA() {
        return MGA;
    }

    public void setMGA(double MGA) {
        this.MGA = MGA;
    }

    public double getMKD() {
        return MKD;
    }

    public void setMKD(double MKD) {
        this.MKD = MKD;
    }

    public double getMMK() {
        return MMK;
    }

    public void setMMK(double MMK) {
        this.MMK = MMK;
    }

    public double getMNT() {
        return MNT;
    }

    public void setMNT(double MNT) {
        this.MNT = MNT;
    }

    public double getMOP() {
        return MOP;
    }

    public void setMOP(double MOP) {
        this.MOP = MOP;
    }

    public double getMRO() {
        return MRO;
    }

    public void setMRO(double MRO) {
        this.MRO = MRO;
    }

    public double getMUR() {
        return MUR;
    }

    public void setMUR(double MUR) {
        this.MUR = MUR;
    }

    public double getMVR() {
        return MVR;
    }

    public void setMVR(double MVR) {
        this.MVR = MVR;
    }

    public double getMWK() {
        return MWK;
    }

    public void setMWK(double MWK) {
        this.MWK = MWK;
    }

    public double getMXN() {
        return MXN;
    }

    public void setMXN(double MXN) {
        this.MXN = MXN;
    }

    public double getMYR() {
        return MYR;
    }

    public void setMYR(double MYR) {
        this.MYR = MYR;
    }

    public double getMZN() {
        return MZN;
    }

    public void setMZN(double MZN) {
        this.MZN = MZN;
    }

    public double getNAD() {
        return NAD;
    }

    public void setNAD(double NAD) {
        this.NAD = NAD;
    }

    public double getNGN() {
        return NGN;
    }

    public void setNGN(double NGN) {
        this.NGN = NGN;
    }

    public double getNIO() {
        return NIO;
    }

    public void setNIO(double NIO) {
        this.NIO = NIO;
    }

    public double getNOK() {
        return NOK;
    }

    public void setNOK(double NOK) {
        this.NOK = NOK;
    }

    public double getNPR() {
        return NPR;
    }

    public void setNPR(double NPR) {
        this.NPR = NPR;
    }

    public double getNZD() {
        return NZD;
    }

    public void setNZD(double NZD) {
        this.NZD = NZD;
    }

    public double getOMR() {
        return OMR;
    }

    public void setOMR(double OMR) {
        this.OMR = OMR;
    }

    public double getPAB() {
        return PAB;
    }

    public void setPAB(double PAB) {
        this.PAB = PAB;
    }

    public double getPEN() {
        return PEN;
    }

    public void setPEN(double PEN) {
        this.PEN = PEN;
    }

    public double getPGK() {
        return PGK;
    }

    public void setPGK(double PGK) {
        this.PGK = PGK;
    }

    public double getPHP() {
        return PHP;
    }

    public void setPHP(double PHP) {
        this.PHP = PHP;
    }

    public double getPKR() {
        return PKR;
    }

    public void setPKR(double PKR) {
        this.PKR = PKR;
    }

    public double getPLN() {
        return PLN;
    }

    public void setPLN(double PLN) {
        this.PLN = PLN;
    }

    public double getPYG() {
        return PYG;
    }

    public void setPYG(double PYG) {
        this.PYG = PYG;
    }

    public double getQAR() {
        return QAR;
    }

    public void setQAR(double QAR) {
        this.QAR = QAR;
    }

    public double getRON() {
        return RON;
    }

    public void setRON(double RON) {
        this.RON = RON;
    }

    public double getRSD() {
        return RSD;
    }

    public void setRSD(double RSD) {
        this.RSD = RSD;
    }

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double getRWF() {
        return RWF;
    }

    public void setRWF(double RWF) {
        this.RWF = RWF;
    }

    public double getSAR() {
        return SAR;
    }

    public void setSAR(double SAR) {
        this.SAR = SAR;
    }

    public double getSBD() {
        return SBD;
    }

    public void setSBD(double SBD) {
        this.SBD = SBD;
    }

    public double getSCR() {
        return SCR;
    }

    public void setSCR(double SCR) {
        this.SCR = SCR;
    }

    public double getSDG() {
        return SDG;
    }

    public void setSDG(double SDG) {
        this.SDG = SDG;
    }

    public double getSEK() {
        return SEK;
    }

    public void setSEK(double SEK) {
        this.SEK = SEK;
    }

    public double getSGD() {
        return SGD;
    }

    public void setSGD(double SGD) {
        this.SGD = SGD;
    }

    public double getSHP() {
        return SHP;
    }

    public void setSHP(double SHP) {
        this.SHP = SHP;
    }

    public double getSLL() {
        return SLL;
    }

    public void setSLL(double SLL) {
        this.SLL = SLL;
    }

    public double getSOS() {
        return SOS;
    }

    public void setSOS(double SOS) {
        this.SOS = SOS;
    }

    public double getSRD() {
        return SRD;
    }

    public void setSRD(double SRD) {
        this.SRD = SRD;
    }

    public double getSTD() {
        return STD;
    }

    public void setSTD(double STD) {
        this.STD = STD;
    }

    public double getSVC() {
        return SVC;
    }

    public void setSVC(double SVC) {
        this.SVC = SVC;
    }

    public double getSYP() {
        return SYP;
    }

    public void setSYP(double SYP) {
        this.SYP = SYP;
    }

    public double getSZL() {
        return SZL;
    }

    public void setSZL(double SZL) {
        this.SZL = SZL;
    }

    public double getTHB() {
        return THB;
    }

    public void setTHB(double THB) {
        this.THB = THB;
    }

    public double getTJS() {
        return TJS;
    }

    public void setTJS(double TJS) {
        this.TJS = TJS;
    }

    public double getTMT() {
        return TMT;
    }

    public void setTMT(double TMT) {
        this.TMT = TMT;
    }

    public double getTND() {
        return TND;
    }

    public void setTND(double TND) {
        this.TND = TND;
    }

    public double getTOP() {
        return TOP;
    }

    public void setTOP(double TOP) {
        this.TOP = TOP;
    }

    public double getTRY() {
        return TRY;
    }

    public void setTRY(double TRY) {
        this.TRY = TRY;
    }

    public double getTTD() {
        return TTD;
    }

    public void setTTD(double TTD) {
        this.TTD = TTD;
    }

    public double getTWD() {
        return TWD;
    }

    public void setTWD(double TWD) {
        this.TWD = TWD;
    }

    public double getTZS() {
        return TZS;
    }

    public void setTZS(double TZS) {
        this.TZS = TZS;
    }

    public double getUAH() {
        return UAH;
    }

    public void setUAH(double UAH) {
        this.UAH = UAH;
    }

    public double getUGX() {
        return UGX;
    }

    public void setUGX(double UGX) {
        this.UGX = UGX;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getUYU() {
        return UYU;
    }

    public void setUYU(double UYU) {
        this.UYU = UYU;
    }

    public double getUZS() {
        return UZS;
    }

    public void setUZS(double UZS) {
        this.UZS = UZS;
    }

    public double getVEF() {
        return VEF;
    }

    public void setVEF(double VEF) {
        this.VEF = VEF;
    }

    public double getVND() {
        return VND;
    }

    public void setVND(double VND) {
        this.VND = VND;
    }

    public double getVUV() {
        return VUV;
    }

    public void setVUV(double VUV) {
        this.VUV = VUV;
    }

    public double getWST() {
        return WST;
    }

    public void setWST(double WST) {
        this.WST = WST;
    }

    public double getXAF() {
        return XAF;
    }

    public void setXAF(double XAF) {
        this.XAF = XAF;
    }

    public double getXAG() {
        return XAG;
    }

    public void setXAG(double XAG) {
        this.XAG = XAG;
    }

    public double getXAU() {
        return XAU;
    }

    public void setXAU(double XAU) {
        this.XAU = XAU;
    }

    public double getXCD() {
        return XCD;
    }

    public void setXCD(double XCD) {
        this.XCD = XCD;
    }

    public double getXDR() {
        return XDR;
    }

    public void setXDR(double XDR) {
        this.XDR = XDR;
    }

    public double getXOF() {
        return XOF;
    }

    public void setXOF(double XOF) {
        this.XOF = XOF;
    }

    public double getXPF() {
        return XPF;
    }

    public void setXPF(double XPF) {
        this.XPF = XPF;
    }

    public double getYER() {
        return YER;
    }

    public void setYER(double YER) {
        this.YER = YER;
    }

    public double getZAR() {
        return ZAR;
    }

    public void setZAR(double ZAR) {
        this.ZAR = ZAR;
    }

    public double getZMK() {
        return ZMK;
    }

    public void setZMK(double ZMK) {
        this.ZMK = ZMK;
    }

    public double getZMW() {
        return ZMW;
    }

    public void setZMW(double ZMW) {
        this.ZMW = ZMW;
    }

    public double getZWL() {
        return ZWL;
    }

    public void setZWL(double ZWL) {
        this.ZWL = ZWL;
    }


    /**
     * Gets value by code.
     *
     * @param currency the currency
     * @return the currency value.
     */
    public double getValueByCode(String currency) {

        hashMap();

        if (!currenciesList.isEmpty() && isValidCurrency(currency))
            return currenciesList.get(currency);
        return 0.0;
    }


    private Map<String, Double> toHashMap() throws IllegalAccessException {
        Map<String, Double> myObjectAsDict = new HashMap<>();
        Field[] allFields = Quotes.class.getDeclaredFields();
        for (Field field : allFields) {
            Class<?> targetType = field.getType();
            if (targetType == double.class)
                myObjectAsDict.put(field.getName(), field.getDouble(this));
        }
        return myObjectAsDict;
    }

    /**
     * Is valid currency boolean.
     * check if the currency code is valid and has a value.
     *
     * @param code the code
     * @return the boolean
     */
    public boolean isValidCurrency(String code) {

        hashMap();

        if (currenciesList.containsKey(code))
            return true;
        return false;
    }

    /**
     * Convert base to target string.
     * calculate the target currency via base currency USD value.
     *
     * @param baseCode   the base code
     * @param targetCode the target code
     * @return the string
     */
    public String convertBaseToTarget(String baseCode, String targetCode) {

        hashMap();

        double midValue;
        String result = "1.0";
        if (isValidCurrency(baseCode) && isValidCurrency(targetCode)) {

            if (baseCode.equals(targetCode))
                return result;

            //since the USD is the base the division and conversion based on the USD/Currency
            midValue = 1 / getValueByCode(baseCode);
            result = Double.toString(midValue * getValueByCode(targetCode));
            if (result.length() > 9)
                result = result.substring(0, 9);
        }
        return result;
    }

    private void hashMap() {
        try {
            currenciesList = this.toHashMap();
        } catch (Exception e) {
            Log.e(getClass().getName(), e.getMessage());
            e.printStackTrace();
        }
    }

}

