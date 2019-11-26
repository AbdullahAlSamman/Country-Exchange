package com.aals.countriesexchange.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "rates")
public class Quotes {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    @SerializedName("USDAED")
    @Expose
    private Double AED;
    @SerializedName("USDAFN")
    @Expose
    private Double AFN;
    @SerializedName("USDALL")
    @Expose
    private Double ALL;
    @SerializedName("USDAMD")
    @Expose
    private Double AMD;
    @SerializedName("USDANG")
    @Expose
    private Double uSDANG;
    @SerializedName("USDAOA")
    @Expose
    private Double AOA;
    @SerializedName("USDARS")
    @Expose
    private Double ARS;
    @SerializedName("USDAUD")
    @Expose
    private Double AUD;
    @SerializedName("USDAWG")
    @Expose
    private Double AWG;
    @SerializedName("USDAZN")
    @Expose
    private Double AZN;
    @SerializedName("USDBAM")
    @Expose
    private Double BAM;
    @SerializedName("USDBBD")
    @Expose
    private Double BBD;
    @SerializedName("USDBDT")
    @Expose
    private Double BDT;
    @SerializedName("USDBGN")
    @Expose
    private Double BGN;
    @SerializedName("USDBHD")
    @Expose
    private Double BHD;
    @SerializedName("USDBIF")
    @Expose
    private Double BIF;
    @SerializedName("USDBMD")
    @Expose
    private Double BMD;
    @SerializedName("USDBND")
    @Expose
    private Double BND;
    @SerializedName("USDBOB")
    @Expose
    private Double BOB;
    @SerializedName("USDBRL")
    @Expose
    private Double BRL;
    @SerializedName("USDBSD")
    @Expose
    private Double BSD;
    @SerializedName("USDBTC")
    @Expose
    private Double BTC;
    @SerializedName("USDBTN")
    @Expose
    private Double BTN;
    @SerializedName("USDBWP")
    @Expose
    private Double BWP;
    @SerializedName("USDBYN")
    @Expose
    private Double BYN;
    @SerializedName("USDBYR")
    @Expose
    private Double BYR;
    @SerializedName("USDBZD")
    @Expose
    private Double BZD;
    @SerializedName("USDCAD")
    @Expose
    private Double CAD;
    @SerializedName("USDCDF")
    @Expose
    private Double CDF;
    @SerializedName("USDCHF")
    @Expose
    private Double CHF;
    @SerializedName("USDCLF")
    @Expose
    private Double CLF;
    @SerializedName("USDCLP")
    @Expose
    private Double CLP;
    @SerializedName("USDCNY")
    @Expose
    private Double CNY;
    @SerializedName("USDCOP")
    @Expose
    private Double COP;
    @SerializedName("USDCRC")
    @Expose
    private Double CRC;
    @SerializedName("USDCUC")
    @Expose
    private Double CUC;
    @SerializedName("USDCUP")
    @Expose
    private Double CUP;
    @SerializedName("USDCVE")
    @Expose
    private Double CVE;
    @SerializedName("USDCZK")
    @Expose
    private Double CZK;
    @SerializedName("USDDJF")
    @Expose
    private Double DJF;
    @SerializedName("USDDKK")
    @Expose
    private Double DKK;
    @SerializedName("USDDOP")
    @Expose
    private Double DOP;
    @SerializedName("USDDZD")
    @Expose
    private Double DZD;
    @SerializedName("USDEGP")
    @Expose
    private Double EGP;
    @SerializedName("USDERN")
    @Expose
    private Double ERN;
    @SerializedName("USDETB")
    @Expose
    private Double ETB;
    @SerializedName("USDEUR")
    @Expose
    private Double EUR;
    @SerializedName("USDFJD")
    @Expose
    private Double FJD;
    @SerializedName("USDFKP")
    @Expose
    private Double FKP;
    @SerializedName("USDGBP")
    @Expose
    private Double GBP;
    @SerializedName("USDGEL")
    @Expose
    private Double GEL;
    @SerializedName("USDGGP")
    @Expose
    private Double GGP;
    @SerializedName("USDGHS")
    @Expose
    private Double GHS;
    @SerializedName("USDGIP")
    @Expose
    private Double GIP;
    @SerializedName("USDGMD")
    @Expose
    private Double GMD;
    @SerializedName("USDGNF")
    @Expose
    private Double GNF;
    @SerializedName("USDGTQ")
    @Expose
    private Double GTQ;
    @SerializedName("USDGYD")
    @Expose
    private Double GYD;
    @SerializedName("USDHKD")
    @Expose
    private Double HKD;
    @SerializedName("USDHNL")
    @Expose
    private Double HNL;
    @SerializedName("USDHRK")
    @Expose
    private Double HRK;
    @SerializedName("USDHTG")
    @Expose
    private Double HTG;
    @SerializedName("USDHUF")
    @Expose
    private Double HUF;
    @SerializedName("USDIDR")
    @Expose
    private Double IDR;
    @SerializedName("USDILS")
    @Expose
    private Double ILS;
    @SerializedName("USDIMP")
    @Expose
    private Double IMP;
    @SerializedName("USDINR")
    @Expose
    private Double INR;
    @SerializedName("USDIQD")
    @Expose
    private Double IQD;
    @SerializedName("USDIRR")
    @Expose
    private Double IRR;
    @SerializedName("USDISK")
    @Expose
    private Double ISK;
    @SerializedName("USDJEP")
    @Expose
    private Double JEP;
    @SerializedName("USDJMD")
    @Expose
    private Double JMD;
    @SerializedName("USDJOD")
    @Expose
    private Double JOD;
    @SerializedName("USDJPY")
    @Expose
    private Double JPY;
    @SerializedName("USDKES")
    @Expose
    private Double KES;
    @SerializedName("USDKGS")
    @Expose
    private Double KGS;
    @SerializedName("USDKHR")
    @Expose
    private Double KHR;
    @SerializedName("USDKMF")
    @Expose
    private Double KMF;
    @SerializedName("USDKPW")
    @Expose
    private Double KPW;
    @SerializedName("USDKRW")
    @Expose
    private Double KRW;
    @SerializedName("USDKWD")
    @Expose
    private Double KWD;
    @SerializedName("USDKYD")
    @Expose
    private Double KYD;
    @SerializedName("USDKZT")
    @Expose
    private Double KZT;
    @SerializedName("USDLAK")
    @Expose
    private Double LAK;
    @SerializedName("USDLBP")
    @Expose
    private Double LBP;
    @SerializedName("USDLKR")
    @Expose
    private Double LKR;
    @SerializedName("USDLRD")
    @Expose
    private Double LRD;
    @SerializedName("USDLSL")
    @Expose
    private Double LSL;
    @SerializedName("USDLTL")
    @Expose
    private Double LTL;
    @SerializedName("USDLVL")
    @Expose
    private Double LVL;
    @SerializedName("USDLYD")
    @Expose
    private Double LYD;
    @SerializedName("USDMAD")
    @Expose
    private Double MAD;
    @SerializedName("USDMDL")
    @Expose
    private Double MDL;
    @SerializedName("USDMGA")
    @Expose
    private Double MGA;
    @SerializedName("USDMKD")
    @Expose
    private Double MKD;
    @SerializedName("USDMMK")
    @Expose
    private Double MMK;
    @SerializedName("USDMNT")
    @Expose
    private Double MNT;
    @SerializedName("USDMOP")
    @Expose
    private Double MOP;
    @SerializedName("USDMRO")
    @Expose
    private Double MRO;
    @SerializedName("USDMUR")
    @Expose
    private Double MUR;
    @SerializedName("USDMVR")
    @Expose
    private Double MVR;
    @SerializedName("USDMWK")
    @Expose
    private Double MWK;
    @SerializedName("USDMXN")
    @Expose
    private Double MXN;
    @SerializedName("USDMYR")
    @Expose
    private Double MYR;
    @SerializedName("USDMZN")
    @Expose
    private Double MZN;
    @SerializedName("USDNAD")
    @Expose
    private Double NAD;
    @SerializedName("USDNGN")
    @Expose
    private Double NGN;
    @SerializedName("USDNIO")
    @Expose
    private Double NIO;
    @SerializedName("USDNOK")
    @Expose
    private Double NOK;
    @SerializedName("USDNPR")
    @Expose
    private Double NPR;
    @SerializedName("USDNZD")
    @Expose
    private Double NZD;
    @SerializedName("USDOMR")
    @Expose
    private Double OMR;
    @SerializedName("USDPAB")
    @Expose
    private Double PAB;
    @SerializedName("USDPEN")
    @Expose
    private Double PEN;
    @SerializedName("USDPGK")
    @Expose
    private Double PGK;
    @SerializedName("USDPHP")
    @Expose
    private Double PHP;
    @SerializedName("USDPKR")
    @Expose
    private Double PKR;
    @SerializedName("USDPLN")
    @Expose
    private Double PLN;
    @SerializedName("USDPYG")
    @Expose
    private Double PYG;
    @SerializedName("USDQAR")
    @Expose
    private Double QAR;
    @SerializedName("USDRON")
    @Expose
    private Double RON;
    @SerializedName("USDRSD")
    @Expose
    private Double RSD;
    @SerializedName("USDRUB")
    @Expose
    private Double RUB;
    @SerializedName("USDRWF")
    @Expose
    private Double RWF;
    @SerializedName("USDSAR")
    @Expose
    private Double SAR;
    @SerializedName("USDSBD")
    @Expose
    private Double SBD;
    @SerializedName("USDSCR")
    @Expose
    private Double SCR;
    @SerializedName("USDSDG")
    @Expose
    private Double SDG;
    @SerializedName("USDSEK")
    @Expose
    private Double SEK;
    @SerializedName("USDSGD")
    @Expose
    private Double SGD;
    @SerializedName("USDSHP")
    @Expose
    private Double SHP;
    @SerializedName("USDSLL")
    @Expose
    private Double SLL;
    @SerializedName("USDSOS")
    @Expose
    private Double SOS;
    @SerializedName("USDSRD")
    @Expose
    private Double SRD;
    @SerializedName("USDSTD")
    @Expose
    private Double STD;
    @SerializedName("USDSVC")
    @Expose
    private Double SVC;
    @SerializedName("USDSYP")
    @Expose
    private Double SYP;
    @SerializedName("USDSZL")
    @Expose
    private Double SZL;
    @SerializedName("USDTHB")
    @Expose
    private Double THB;
    @SerializedName("USDTJS")
    @Expose
    private Double TJS;
    @SerializedName("USDTMT")
    @Expose
    private Double TMT;
    @SerializedName("USDTND")
    @Expose
    private Double TND;
    @SerializedName("USDTOP")
    @Expose
    private Double TOP;
    @SerializedName("USDTRY")
    @Expose
    private Double TRY;
    @SerializedName("USDTTD")
    @Expose
    private Double TTD;
    @SerializedName("USDTWD")
    @Expose
    private Double TWD;
    @SerializedName("USDTZS")
    @Expose
    private Double TZS;
    @SerializedName("USDUAH")
    @Expose
    private Double UAH;
    @SerializedName("USDUGX")
    @Expose
    private Double UGX;
    @SerializedName("USDUSD")
    @Expose
    private Double USD;
    @SerializedName("USDUYU")
    @Expose
    private Double UYU;
    @SerializedName("USDUZS")
    @Expose
    private Double UZS;
    @SerializedName("USDVEF")
    @Expose
    private Double VEF;
    @SerializedName("USDVND")
    @Expose
    private Double VND;
    @SerializedName("USDVUV")
    @Expose
    private Double VUV;
    @SerializedName("USDWST")
    @Expose
    private Double WST;
    @SerializedName("USDXAF")
    @Expose
    private Double XAF;
    @SerializedName("USDXAG")
    @Expose
    private Double XAG;
    @SerializedName("USDXAU")
    @Expose
    private Double XAU;
    @SerializedName("USDXCD")
    @Expose
    private Double XCD;
    @SerializedName("USDXDR")
    @Expose
    private Double XDR;
    @SerializedName("USDXOF")
    @Expose
    private Double XOF;
    @SerializedName("USDXPF")
    @Expose
    private Double XPF;
    @SerializedName("USDYER")
    @Expose
    private Double YER;
    @SerializedName("USDZAR")
    @Expose
    private Double ZAR;
    @SerializedName("USDZMK")
    @Expose
    private Double ZMK;
    @SerializedName("USDZMW")
    @Expose
    private Double ZMW;
    @SerializedName("USDZWL")
    @Expose
    private Double ZWL;

    public Double getUSDAED() {
        return AED;
    }

    public void setUSDAED(Double uSDAED) {
        this.AED = uSDAED;
    }

    public Double getUSDAFN() {
        return AFN;
    }

    public void setUSDAFN(Double uSDAFN) {
        this.AFN = uSDAFN;
    }

    public Double getUSDALL() {
        return ALL;
    }

    public void setUSDALL(Double uSDALL) {
        this.ALL = uSDALL;
    }

    public Double getUSDAMD() {
        return AMD;
    }

    public void setUSDAMD(Double uSDAMD) {
        this.AMD = uSDAMD;
    }

    public Double getUSDANG() {
        return uSDANG;
    }

    public void setUSDANG(Double uSDANG) {
        this.uSDANG = uSDANG;
    }

    public Double getUSDAOA() {
        return AOA;
    }

    public void setUSDAOA(Double uSDAOA) {
        this.AOA = uSDAOA;
    }

    public Double getUSDARS() {
        return ARS;
    }

    public void setUSDARS(Double uSDARS) {
        this.ARS = uSDARS;
    }

    public Double getUSDAUD() {
        return AUD;
    }

    public void setUSDAUD(Double uSDAUD) {
        this.AUD = uSDAUD;
    }

    public Double getUSDAWG() {
        return AWG;
    }

    public void setUSDAWG(Double uSDAWG) {
        this.AWG = uSDAWG;
    }

    public Double getUSDAZN() {
        return AZN;
    }

    public void setUSDAZN(Double uSDAZN) {
        this.AZN = uSDAZN;
    }

    public Double getUSDBAM() {
        return BAM;
    }

    public void setUSDBAM(Double uSDBAM) {
        this.BAM = uSDBAM;
    }

    public Double getUSDBBD() {
        return BBD;
    }

    public void setUSDBBD(Double uSDBBD) {
        this.BBD = uSDBBD;
    }

    public Double getUSDBDT() {
        return BDT;
    }

    public void setUSDBDT(Double uSDBDT) {
        this.BDT = uSDBDT;
    }

    public Double getUSDBGN() {
        return BGN;
    }

    public void setUSDBGN(Double uSDBGN) {
        this.BGN = uSDBGN;
    }

    public Double getUSDBHD() {
        return BHD;
    }

    public void setUSDBHD(Double uSDBHD) {
        this.BHD = uSDBHD;
    }

    public Double getUSDBIF() {
        return BIF;
    }

    public void setUSDBIF(Double uSDBIF) {
        this.BIF = uSDBIF;
    }

    public Double getUSDBMD() {
        return BMD;
    }

    public void setUSDBMD(Double uSDBMD) {
        this.BMD = uSDBMD;
    }

    public Double getUSDBND() {
        return BND;
    }

    public void setUSDBND(Double uSDBND) {
        this.BND = uSDBND;
    }

    public Double getUSDBOB() {
        return BOB;
    }

    public void setUSDBOB(Double uSDBOB) {
        this.BOB = uSDBOB;
    }

    public Double getUSDBRL() {
        return BRL;
    }

    public void setUSDBRL(Double uSDBRL) {
        this.BRL = uSDBRL;
    }

    public Double getUSDBSD() {
        return BSD;
    }

    public void setUSDBSD(Double uSDBSD) {
        this.BSD = uSDBSD;
    }

    public Double getUSDBTC() {
        return BTC;
    }

    public void setUSDBTC(Double uSDBTC) {
        this.BTC = uSDBTC;
    }

    public Double getUSDBTN() {
        return BTN;
    }

    public void setUSDBTN(Double uSDBTN) {
        this.BTN = uSDBTN;
    }

    public Double getUSDBWP() {
        return BWP;
    }

    public void setUSDBWP(Double uSDBWP) {
        this.BWP = uSDBWP;
    }

    public Double getUSDBYN() {
        return BYN;
    }

    public void setUSDBYN(Double uSDBYN) {
        this.BYN = uSDBYN;
    }

    public Double getUSDBYR() {
        return BYR;
    }

    public void setUSDBYR(Double uSDBYR) {
        this.BYR = uSDBYR;
    }

    public Double getUSDBZD() {
        return BZD;
    }

    public void setUSDBZD(Double uSDBZD) {
        this.BZD = uSDBZD;
    }

    public Double getUSDCAD() {
        return CAD;
    }

    public void setUSDCAD(Double uSDCAD) {
        this.CAD = uSDCAD;
    }

    public Double getUSDCDF() {
        return CDF;
    }

    public void setUSDCDF(Double uSDCDF) {
        this.CDF = uSDCDF;
    }

    public Double getUSDCHF() {
        return CHF;
    }

    public void setUSDCHF(Double uSDCHF) {
        this.CHF = uSDCHF;
    }

    public Double getUSDCLF() {
        return CLF;
    }

    public void setUSDCLF(Double uSDCLF) {
        this.CLF = uSDCLF;
    }

    public Double getUSDCLP() {
        return CLP;
    }

    public void setUSDCLP(Double uSDCLP) {
        this.CLP = uSDCLP;
    }

    public Double getUSDCNY() {
        return CNY;
    }

    public void setUSDCNY(Double uSDCNY) {
        this.CNY = uSDCNY;
    }

    public Double getUSDCOP() {
        return COP;
    }

    public void setUSDCOP(Double uSDCOP) {
        this.COP = uSDCOP;
    }

    public Double getUSDCRC() {
        return CRC;
    }

    public void setUSDCRC(Double uSDCRC) {
        this.CRC = uSDCRC;
    }

    public Double getUSDCUC() {
        return CUC;
    }

    public void setUSDCUC(Double uSDCUC) {
        this.CUC = uSDCUC;
    }

    public Double getUSDCUP() {
        return CUP;
    }

    public void setUSDCUP(Double uSDCUP) {
        this.CUP = uSDCUP;
    }

    public Double getUSDCVE() {
        return CVE;
    }

    public void setUSDCVE(Double uSDCVE) {
        this.CVE = uSDCVE;
    }

    public Double getUSDCZK() {
        return CZK;
    }

    public void setUSDCZK(Double uSDCZK) {
        this.CZK = uSDCZK;
    }

    public Double getUSDDJF() {
        return DJF;
    }

    public void setUSDDJF(Double uSDDJF) {
        this.DJF = uSDDJF;
    }

    public Double getUSDDKK() {
        return DKK;
    }

    public void setUSDDKK(Double uSDDKK) {
        this.DKK = uSDDKK;
    }

    public Double getUSDDOP() {
        return DOP;
    }

    public void setUSDDOP(Double uSDDOP) {
        this.DOP = uSDDOP;
    }

    public Double getUSDDZD() {
        return DZD;
    }

    public void setUSDDZD(Double uSDDZD) {
        this.DZD = uSDDZD;
    }

    public Double getUSDEGP() {
        return EGP;
    }

    public void setUSDEGP(Double uSDEGP) {
        this.EGP = uSDEGP;
    }

    public Double getUSDERN() {
        return ERN;
    }

    public void setUSDERN(Double uSDERN) {
        this.ERN = uSDERN;
    }

    public Double getUSDETB() {
        return ETB;
    }

    public void setUSDETB(Double uSDETB) {
        this.ETB = uSDETB;
    }

    public Double getUSDEUR() {
        return EUR;
    }

    public void setUSDEUR(Double uSDEUR) {
        this.EUR = uSDEUR;
    }

    public Double getUSDFJD() {
        return FJD;
    }

    public void setUSDFJD(Double uSDFJD) {
        this.FJD = uSDFJD;
    }

    public Double getUSDFKP() {
        return FKP;
    }

    public void setUSDFKP(Double uSDFKP) {
        this.FKP = uSDFKP;
    }

    public Double getUSDGBP() {
        return GBP;
    }

    public void setUSDGBP(Double uSDGBP) {
        this.GBP = uSDGBP;
    }

    public Double getUSDGEL() {
        return GEL;
    }

    public void setUSDGEL(Double uSDGEL) {
        this.GEL = uSDGEL;
    }

    public Double getUSDGGP() {
        return GGP;
    }

    public void setUSDGGP(Double uSDGGP) {
        this.GGP = uSDGGP;
    }

    public Double getUSDGHS() {
        return GHS;
    }

    public void setUSDGHS(Double uSDGHS) {
        this.GHS = uSDGHS;
    }

    public Double getUSDGIP() {
        return GIP;
    }

    public void setUSDGIP(Double uSDGIP) {
        this.GIP = uSDGIP;
    }

    public Double getUSDGMD() {
        return GMD;
    }

    public void setUSDGMD(Double uSDGMD) {
        this.GMD = uSDGMD;
    }

    public Double getUSDGNF() {
        return GNF;
    }

    public void setUSDGNF(Double uSDGNF) {
        this.GNF = uSDGNF;
    }

    public Double getUSDGTQ() {
        return GTQ;
    }

    public void setUSDGTQ(Double uSDGTQ) {
        this.GTQ = uSDGTQ;
    }

    public Double getUSDGYD() {
        return GYD;
    }

    public void setUSDGYD(Double uSDGYD) {
        this.GYD = uSDGYD;
    }

    public Double getUSDHKD() {
        return HKD;
    }

    public void setUSDHKD(Double uSDHKD) {
        this.HKD = uSDHKD;
    }

    public Double getUSDHNL() {
        return HNL;
    }

    public void setUSDHNL(Double uSDHNL) {
        this.HNL = uSDHNL;
    }

    public Double getUSDHRK() {
        return HRK;
    }

    public void setUSDHRK(Double uSDHRK) {
        this.HRK = uSDHRK;
    }

    public Double getUSDHTG() {
        return HTG;
    }

    public void setUSDHTG(Double uSDHTG) {
        this.HTG = uSDHTG;
    }

    public Double getUSDHUF() {
        return HUF;
    }

    public void setUSDHUF(Double uSDHUF) {
        this.HUF = uSDHUF;
    }

    public Double getUSDIDR() {
        return IDR;
    }

    public void setUSDIDR(Double uSDIDR) {
        this.IDR = uSDIDR;
    }

    public Double getUSDILS() {
        return ILS;
    }

    public void setUSDILS(Double uSDILS) {
        this.ILS = uSDILS;
    }

    public Double getUSDIMP() {
        return IMP;
    }

    public void setUSDIMP(Double uSDIMP) {
        this.IMP = uSDIMP;
    }

    public Double getUSDINR() {
        return INR;
    }

    public void setUSDINR(Double uSDINR) {
        this.INR = uSDINR;
    }

    public Double getUSDIQD() {
        return IQD;
    }

    public void setUSDIQD(Double uSDIQD) {
        this.IQD = uSDIQD;
    }

    public Double getUSDIRR() {
        return IRR;
    }

    public void setUSDIRR(Double uSDIRR) {
        this.IRR = uSDIRR;
    }

    public Double getUSDISK() {
        return ISK;
    }

    public void setUSDISK(Double uSDISK) {
        this.ISK = uSDISK;
    }

    public Double getUSDJEP() {
        return JEP;
    }

    public void setUSDJEP(Double uSDJEP) {
        this.JEP = uSDJEP;
    }

    public Double getUSDJMD() {
        return JMD;
    }

    public void setUSDJMD(Double uSDJMD) {
        this.JMD = uSDJMD;
    }

    public Double getUSDJOD() {
        return JOD;
    }

    public void setUSDJOD(Double uSDJOD) {
        this.JOD = uSDJOD;
    }

    public Double getUSDJPY() {
        return JPY;
    }

    public void setUSDJPY(Double uSDJPY) {
        this.JPY = uSDJPY;
    }

    public Double getUSDKES() {
        return KES;
    }

    public void setUSDKES(Double uSDKES) {
        this.KES = uSDKES;
    }

    public Double getUSDKGS() {
        return KGS;
    }

    public void setUSDKGS(Double uSDKGS) {
        this.KGS = uSDKGS;
    }

    public Double getUSDKHR() {
        return KHR;
    }

    public void setUSDKHR(Double uSDKHR) {
        this.KHR = uSDKHR;
    }

    public Double getUSDKMF() {
        return KMF;
    }

    public void setUSDKMF(Double uSDKMF) {
        this.KMF = uSDKMF;
    }

    public Double getUSDKPW() {
        return KPW;
    }

    public void setUSDKPW(Double uSDKPW) {
        this.KPW = uSDKPW;
    }

    public Double getUSDKRW() {
        return KRW;
    }

    public void setUSDKRW(Double uSDKRW) {
        this.KRW = uSDKRW;
    }

    public Double getUSDKWD() {
        return KWD;
    }

    public void setUSDKWD(Double uSDKWD) {
        this.KWD = uSDKWD;
    }

    public Double getUSDKYD() {
        return KYD;
    }

    public void setUSDKYD(Double uSDKYD) {
        this.KYD = uSDKYD;
    }

    public Double getUSDKZT() {
        return KZT;
    }

    public void setUSDKZT(Double uSDKZT) {
        this.KZT = uSDKZT;
    }

    public Double getUSDLAK() {
        return LAK;
    }

    public void setUSDLAK(Double uSDLAK) {
        this.LAK = uSDLAK;
    }

    public Double getUSDLBP() {
        return LBP;
    }

    public void setUSDLBP(Double uSDLBP) {
        this.LBP = uSDLBP;
    }

    public Double getUSDLKR() {
        return LKR;
    }

    public void setUSDLKR(Double uSDLKR) {
        this.LKR = uSDLKR;
    }

    public Double getUSDLRD() {
        return LRD;
    }

    public void setUSDLRD(Double uSDLRD) {
        this.LRD = uSDLRD;
    }

    public Double getUSDLSL() {
        return LSL;
    }

    public void setUSDLSL(Double uSDLSL) {
        this.LSL = uSDLSL;
    }

    public Double getUSDLTL() {
        return LTL;
    }

    public void setUSDLTL(Double uSDLTL) {
        this.LTL = uSDLTL;
    }

    public Double getUSDLVL() {
        return LVL;
    }

    public void setUSDLVL(Double uSDLVL) {
        this.LVL = uSDLVL;
    }

    public Double getUSDLYD() {
        return LYD;
    }

    public void setUSDLYD(Double uSDLYD) {
        this.LYD = uSDLYD;
    }

    public Double getUSDMAD() {
        return MAD;
    }

    public void setUSDMAD(Double uSDMAD) {
        this.MAD = uSDMAD;
    }

    public Double getUSDMDL() {
        return MDL;
    }

    public void setUSDMDL(Double uSDMDL) {
        this.MDL = uSDMDL;
    }

    public Double getUSDMGA() {
        return MGA;
    }

    public void setUSDMGA(Double uSDMGA) {
        this.MGA = uSDMGA;
    }

    public Double getUSDMKD() {
        return MKD;
    }

    public void setUSDMKD(Double uSDMKD) {
        this.MKD = uSDMKD;
    }

    public Double getUSDMMK() {
        return MMK;
    }

    public void setUSDMMK(Double uSDMMK) {
        this.MMK = uSDMMK;
    }

    public Double getUSDMNT() {
        return MNT;
    }

    public void setUSDMNT(Double uSDMNT) {
        this.MNT = uSDMNT;
    }

    public Double getUSDMOP() {
        return MOP;
    }

    public void setUSDMOP(Double uSDMOP) {
        this.MOP = uSDMOP;
    }

    public Double getUSDMRO() {
        return MRO;
    }

    public void setUSDMRO(Double uSDMRO) {
        this.MRO = uSDMRO;
    }

    public Double getUSDMUR() {
        return MUR;
    }

    public void setUSDMUR(Double uSDMUR) {
        this.MUR = uSDMUR;
    }

    public Double getUSDMVR() {
        return MVR;
    }

    public void setUSDMVR(Double uSDMVR) {
        this.MVR = uSDMVR;
    }

    public Double getUSDMWK() {
        return MWK;
    }

    public void setUSDMWK(Double uSDMWK) {
        this.MWK = uSDMWK;
    }

    public Double getUSDMXN() {
        return MXN;
    }

    public void setUSDMXN(Double uSDMXN) {
        this.MXN = uSDMXN;
    }

    public Double getUSDMYR() {
        return MYR;
    }

    public void setUSDMYR(Double uSDMYR) {
        this.MYR = uSDMYR;
    }

    public Double getUSDMZN() {
        return MZN;
    }

    public void setUSDMZN(Double uSDMZN) {
        this.MZN = uSDMZN;
    }

    public Double getUSDNAD() {
        return NAD;
    }

    public void setUSDNAD(Double uSDNAD) {
        this.NAD = uSDNAD;
    }

    public Double getUSDNGN() {
        return NGN;
    }

    public void setUSDNGN(Double uSDNGN) {
        this.NGN = uSDNGN;
    }

    public Double getUSDNIO() {
        return NIO;
    }

    public void setUSDNIO(Double uSDNIO) {
        this.NIO = uSDNIO;
    }

    public Double getUSDNOK() {
        return NOK;
    }

    public void setUSDNOK(Double uSDNOK) {
        this.NOK = uSDNOK;
    }

    public Double getUSDNPR() {
        return NPR;
    }

    public void setUSDNPR(Double uSDNPR) {
        this.NPR = uSDNPR;
    }

    public Double getUSDNZD() {
        return NZD;
    }

    public void setUSDNZD(Double uSDNZD) {
        this.NZD = uSDNZD;
    }

    public Double getUSDOMR() {
        return OMR;
    }

    public void setUSDOMR(Double uSDOMR) {
        this.OMR = uSDOMR;
    }

    public Double getUSDPAB() {
        return PAB;
    }

    public void setUSDPAB(Double uSDPAB) {
        this.PAB = uSDPAB;
    }

    public Double getUSDPEN() {
        return PEN;
    }

    public void setUSDPEN(Double uSDPEN) {
        this.PEN = uSDPEN;
    }

    public Double getUSDPGK() {
        return PGK;
    }

    public void setUSDPGK(Double uSDPGK) {
        this.PGK = uSDPGK;
    }

    public Double getUSDPHP() {
        return PHP;
    }

    public void setUSDPHP(Double uSDPHP) {
        this.PHP = uSDPHP;
    }

    public Double getUSDPKR() {
        return PKR;
    }

    public void setUSDPKR(Double uSDPKR) {
        this.PKR = uSDPKR;
    }

    public Double getUSDPLN() {
        return PLN;
    }

    public void setUSDPLN(Double uSDPLN) {
        this.PLN = uSDPLN;
    }

    public Double getUSDPYG() {
        return PYG;
    }

    public void setUSDPYG(Double uSDPYG) {
        this.PYG = uSDPYG;
    }

    public Double getUSDQAR() {
        return QAR;
    }

    public void setUSDQAR(Double uSDQAR) {
        this.QAR = uSDQAR;
    }

    public Double getUSDRON() {
        return RON;
    }

    public void setUSDRON(Double uSDRON) {
        this.RON = uSDRON;
    }

    public Double getUSDRSD() {
        return RSD;
    }

    public void setUSDRSD(Double uSDRSD) {
        this.RSD = uSDRSD;
    }

    public Double getUSDRUB() {
        return RUB;
    }

    public void setUSDRUB(Double uSDRUB) {
        this.RUB = uSDRUB;
    }

    public Double getUSDRWF() {
        return RWF;
    }

    public void setUSDRWF(Double uSDRWF) {
        this.RWF = uSDRWF;
    }

    public Double getUSDSAR() {
        return SAR;
    }

    public void setUSDSAR(Double uSDSAR) {
        this.SAR = uSDSAR;
    }

    public Double getUSDSBD() {
        return SBD;
    }

    public void setUSDSBD(Double uSDSBD) {
        this.SBD = uSDSBD;
    }

    public Double getUSDSCR() {
        return SCR;
    }

    public void setUSDSCR(Double uSDSCR) {
        this.SCR = uSDSCR;
    }

    public Double getUSDSDG() {
        return SDG;
    }

    public void setUSDSDG(Double uSDSDG) {
        this.SDG = uSDSDG;
    }

    public Double getUSDSEK() {
        return SEK;
    }

    public void setUSDSEK(Double uSDSEK) {
        this.SEK = uSDSEK;
    }

    public Double getUSDSGD() {
        return SGD;
    }

    public void setUSDSGD(Double uSDSGD) {
        this.SGD = uSDSGD;
    }

    public Double getUSDSHP() {
        return SHP;
    }

    public void setUSDSHP(Double uSDSHP) {
        this.SHP = uSDSHP;
    }

    public Double getUSDSLL() {
        return SLL;
    }

    public void setUSDSLL(Double uSDSLL) {
        this.SLL = uSDSLL;
    }

    public Double getUSDSOS() {
        return SOS;
    }

    public void setUSDSOS(Double uSDSOS) {
        this.SOS = uSDSOS;
    }

    public Double getUSDSRD() {
        return SRD;
    }

    public void setUSDSRD(Double uSDSRD) {
        this.SRD = uSDSRD;
    }

    public Double getUSDSTD() {
        return STD;
    }

    public void setUSDSTD(Double uSDSTD) {
        this.STD = uSDSTD;
    }

    public Double getUSDSVC() {
        return SVC;
    }

    public void setUSDSVC(Double uSDSVC) {
        this.SVC = uSDSVC;
    }

    public Double getUSDSYP() {
        return SYP;
    }

    public void setUSDSYP(Double uSDSYP) {
        this.SYP = uSDSYP;
    }

    public Double getUSDSZL() {
        return SZL;
    }

    public void setUSDSZL(Double uSDSZL) {
        this.SZL = uSDSZL;
    }

    public Double getUSDTHB() {
        return THB;
    }

    public void setUSDTHB(Double uSDTHB) {
        this.THB = uSDTHB;
    }

    public Double getUSDTJS() {
        return TJS;
    }

    public void setUSDTJS(Double uSDTJS) {
        this.TJS = uSDTJS;
    }

    public Double getUSDTMT() {
        return TMT;
    }

    public void setUSDTMT(Double uSDTMT) {
        this.TMT = uSDTMT;
    }

    public Double getUSDTND() {
        return TND;
    }

    public void setUSDTND(Double uSDTND) {
        this.TND = uSDTND;
    }

    public Double getUSDTOP() {
        return TOP;
    }

    public void setUSDTOP(Double uSDTOP) {
        this.TOP = uSDTOP;
    }

    public Double getUSDTRY() {
        return TRY;
    }

    public void setUSDTRY(Double uSDTRY) {
        this.TRY = uSDTRY;
    }

    public Double getUSDTTD() {
        return TTD;
    }

    public void setUSDTTD(Double uSDTTD) {
        this.TTD = uSDTTD;
    }

    public Double getUSDTWD() {
        return TWD;
    }

    public void setUSDTWD(Double uSDTWD) {
        this.TWD = uSDTWD;
    }

    public Double getUSDTZS() {
        return TZS;
    }

    public void setUSDTZS(Double uSDTZS) {
        this.TZS = uSDTZS;
    }

    public Double getUSDUAH() {
        return UAH;
    }

    public void setUSDUAH(Double uSDUAH) {
        this.UAH = uSDUAH;
    }

    public Double getUSDUGX() {
        return UGX;
    }

    public void setUSDUGX(Double uSDUGX) {
        this.UGX = uSDUGX;
    }

    public Double getUSDUSD() {
        return USD;
    }

    public void setUSDUSD(Double uSDUSD) {
        this.USD = uSDUSD;
    }

    public Double getUSDUYU() {
        return UYU;
    }

    public void setUSDUYU(Double uSDUYU) {
        this.UYU = uSDUYU;
    }

    public Double getUSDUZS() {
        return UZS;
    }

    public void setUSDUZS(Double uSDUZS) {
        this.UZS = uSDUZS;
    }

    public Double getUSDVEF() {
        return VEF;
    }

    public void setUSDVEF(Double uSDVEF) {
        this.VEF = uSDVEF;
    }

    public Double getUSDVND() {
        return VND;
    }

    public void setUSDVND(Double uSDVND) {
        this.VND = uSDVND;
    }

    public Double getUSDVUV() {
        return VUV;
    }

    public void setUSDVUV(Double uSDVUV) {
        this.VUV = uSDVUV;
    }

    public Double getUSDWST() {
        return WST;
    }

    public void setUSDWST(Double uSDWST) {
        this.WST = uSDWST;
    }

    public Double getUSDXAF() {
        return XAF;
    }

    public void setUSDXAF(Double uSDXAF) {
        this.XAF = uSDXAF;
    }

    public Double getUSDXAG() {
        return XAG;
    }

    public void setUSDXAG(Double uSDXAG) {
        this.XAG = uSDXAG;
    }

    public Double getUSDXAU() {
        return XAU;
    }

    public void setUSDXAU(Double uSDXAU) {
        this.XAU = uSDXAU;
    }

    public Double getUSDXCD() {
        return XCD;
    }

    public void setUSDXCD(Double uSDXCD) {
        this.XCD = uSDXCD;
    }

    public Double getUSDXDR() {
        return XDR;
    }

    public void setUSDXDR(Double uSDXDR) {
        this.XDR = uSDXDR;
    }

    public Double getUSDXOF() {
        return XOF;
    }

    public void setUSDXOF(Double uSDXOF) {
        this.XOF = uSDXOF;
    }

    public Double getUSDXPF() {
        return XPF;
    }

    public void setUSDXPF(Double uSDXPF) {
        this.XPF = uSDXPF;
    }

    public Double getUSDYER() {
        return YER;
    }

    public void setUSDYER(Double uSDYER) {
        this.YER = uSDYER;
    }

    public Double getUSDZAR() {
        return ZAR;
    }

    public void setUSDZAR(Double uSDZAR) {
        this.ZAR = uSDZAR;
    }

    public Double getUSDZMK() {
        return ZMK;
    }

    public void setUSDZMK(Double uSDZMK) {
        this.ZMK = uSDZMK;
    }

    public Double getUSDZMW() {
        return ZMW;
    }

    public void setUSDZMW(Double uSDZMW) {
        this.ZMW = uSDZMW;
    }

    public Double getUSDZWL() {
        return ZWL;
    }

    public void setUSDZWL(Double uSDZWL) {
        this.ZWL = uSDZWL;
    }

}
