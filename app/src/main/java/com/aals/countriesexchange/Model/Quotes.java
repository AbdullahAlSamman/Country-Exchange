package com.aals.countriesexchange.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

@Entity(tableName = "rates")
public class Quotes implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private Date timestamp;
    private String base;
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
    private Double ANG;
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

    public Double getAED() {
        return AED;
    }

    public void setAED(Double AED) {
        this.AED = AED;
    }

    public Double getAFN() {
        return AFN;
    }

    public void setAFN(Double AFN) {
        this.AFN = AFN;
    }

    public Double getALL() {
        return ALL;
    }

    public void setALL(Double ALL) {
        this.ALL = ALL;
    }

    public Double getAMD() {
        return AMD;
    }

    public void setAMD(Double AMD) {
        this.AMD = AMD;
    }

    public Double getANG() {
        return ANG;
    }

    public void setANG(Double ANG) {
        this.ANG = ANG;
    }

    public Double getAOA() {
        return AOA;
    }

    public void setAOA(Double AOA) {
        this.AOA = AOA;
    }

    public Double getARS() {
        return ARS;
    }

    public void setARS(Double ARS) {
        this.ARS = ARS;
    }

    public Double getAUD() {
        return AUD;
    }

    public void setAUD(Double AUD) {
        this.AUD = AUD;
    }

    public Double getAWG() {
        return AWG;
    }

    public void setAWG(Double AWG) {
        this.AWG = AWG;
    }

    public Double getAZN() {
        return AZN;
    }

    public void setAZN(Double AZN) {
        this.AZN = AZN;
    }

    public Double getBAM() {
        return BAM;
    }

    public void setBAM(Double BAM) {
        this.BAM = BAM;
    }

    public Double getBBD() {
        return BBD;
    }

    public void setBBD(Double BBD) {
        this.BBD = BBD;
    }

    public Double getBDT() {
        return BDT;
    }

    public void setBDT(Double BDT) {
        this.BDT = BDT;
    }

    public Double getBGN() {
        return BGN;
    }

    public void setBGN(Double BGN) {
        this.BGN = BGN;
    }

    public Double getBHD() {
        return BHD;
    }

    public void setBHD(Double BHD) {
        this.BHD = BHD;
    }

    public Double getBIF() {
        return BIF;
    }

    public void setBIF(Double BIF) {
        this.BIF = BIF;
    }

    public Double getBMD() {
        return BMD;
    }

    public void setBMD(Double BMD) {
        this.BMD = BMD;
    }

    public Double getBND() {
        return BND;
    }

    public void setBND(Double BND) {
        this.BND = BND;
    }

    public Double getBOB() {
        return BOB;
    }

    public void setBOB(Double BOB) {
        this.BOB = BOB;
    }

    public Double getBRL() {
        return BRL;
    }

    public void setBRL(Double BRL) {
        this.BRL = BRL;
    }

    public Double getBSD() {
        return BSD;
    }

    public void setBSD(Double BSD) {
        this.BSD = BSD;
    }

    public Double getBTC() {
        return BTC;
    }

    public void setBTC(Double BTC) {
        this.BTC = BTC;
    }

    public Double getBTN() {
        return BTN;
    }

    public void setBTN(Double BTN) {
        this.BTN = BTN;
    }

    public Double getBWP() {
        return BWP;
    }

    public void setBWP(Double BWP) {
        this.BWP = BWP;
    }

    public Double getBYN() {
        return BYN;
    }

    public void setBYN(Double BYN) {
        this.BYN = BYN;
    }

    public Double getBYR() {
        return BYR;
    }

    public void setBYR(Double BYR) {
        this.BYR = BYR;
    }

    public Double getBZD() {
        return BZD;
    }

    public void setBZD(Double BZD) {
        this.BZD = BZD;
    }

    public Double getCAD() {
        return CAD;
    }

    public void setCAD(Double CAD) {
        this.CAD = CAD;
    }

    public Double getCDF() {
        return CDF;
    }

    public void setCDF(Double CDF) {
        this.CDF = CDF;
    }

    public Double getCHF() {
        return CHF;
    }

    public void setCHF(Double CHF) {
        this.CHF = CHF;
    }

    public Double getCLF() {
        return CLF;
    }

    public void setCLF(Double CLF) {
        this.CLF = CLF;
    }

    public Double getCLP() {
        return CLP;
    }

    public void setCLP(Double CLP) {
        this.CLP = CLP;
    }

    public Double getCNY() {
        return CNY;
    }

    public void setCNY(Double CNY) {
        this.CNY = CNY;
    }

    public Double getCOP() {
        return COP;
    }

    public void setCOP(Double COP) {
        this.COP = COP;
    }

    public Double getCRC() {
        return CRC;
    }

    public void setCRC(Double CRC) {
        this.CRC = CRC;
    }

    public Double getCUC() {
        return CUC;
    }

    public void setCUC(Double CUC) {
        this.CUC = CUC;
    }

    public Double getCUP() {
        return CUP;
    }

    public void setCUP(Double CUP) {
        this.CUP = CUP;
    }

    public Double getCVE() {
        return CVE;
    }

    public void setCVE(Double CVE) {
        this.CVE = CVE;
    }

    public Double getCZK() {
        return CZK;
    }

    public void setCZK(Double CZK) {
        this.CZK = CZK;
    }

    public Double getDJF() {
        return DJF;
    }

    public void setDJF(Double DJF) {
        this.DJF = DJF;
    }

    public Double getDKK() {
        return DKK;
    }

    public void setDKK(Double DKK) {
        this.DKK = DKK;
    }

    public Double getDOP() {
        return DOP;
    }

    public void setDOP(Double DOP) {
        this.DOP = DOP;
    }

    public Double getDZD() {
        return DZD;
    }

    public void setDZD(Double DZD) {
        this.DZD = DZD;
    }

    public Double getEGP() {
        return EGP;
    }

    public void setEGP(Double EGP) {
        this.EGP = EGP;
    }

    public Double getERN() {
        return ERN;
    }

    public void setERN(Double ERN) {
        this.ERN = ERN;
    }

    public Double getETB() {
        return ETB;
    }

    public void setETB(Double ETB) {
        this.ETB = ETB;
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getFJD() {
        return FJD;
    }

    public void setFJD(Double FJD) {
        this.FJD = FJD;
    }

    public Double getFKP() {
        return FKP;
    }

    public void setFKP(Double FKP) {
        this.FKP = FKP;
    }

    public Double getGBP() {
        return GBP;
    }

    public void setGBP(Double GBP) {
        this.GBP = GBP;
    }

    public Double getGEL() {
        return GEL;
    }

    public void setGEL(Double GEL) {
        this.GEL = GEL;
    }

    public Double getGGP() {
        return GGP;
    }

    public void setGGP(Double GGP) {
        this.GGP = GGP;
    }

    public Double getGHS() {
        return GHS;
    }

    public void setGHS(Double GHS) {
        this.GHS = GHS;
    }

    public Double getGIP() {
        return GIP;
    }

    public void setGIP(Double GIP) {
        this.GIP = GIP;
    }

    public Double getGMD() {
        return GMD;
    }

    public void setGMD(Double GMD) {
        this.GMD = GMD;
    }

    public Double getGNF() {
        return GNF;
    }

    public void setGNF(Double GNF) {
        this.GNF = GNF;
    }

    public Double getGTQ() {
        return GTQ;
    }

    public void setGTQ(Double GTQ) {
        this.GTQ = GTQ;
    }

    public Double getGYD() {
        return GYD;
    }

    public void setGYD(Double GYD) {
        this.GYD = GYD;
    }

    public Double getHKD() {
        return HKD;
    }

    public void setHKD(Double HKD) {
        this.HKD = HKD;
    }

    public Double getHNL() {
        return HNL;
    }

    public void setHNL(Double HNL) {
        this.HNL = HNL;
    }

    public Double getHRK() {
        return HRK;
    }

    public void setHRK(Double HRK) {
        this.HRK = HRK;
    }

    public Double getHTG() {
        return HTG;
    }

    public void setHTG(Double HTG) {
        this.HTG = HTG;
    }

    public Double getHUF() {
        return HUF;
    }

    public void setHUF(Double HUF) {
        this.HUF = HUF;
    }

    public Double getIDR() {
        return IDR;
    }

    public void setIDR(Double IDR) {
        this.IDR = IDR;
    }

    public Double getILS() {
        return ILS;
    }

    public void setILS(Double ILS) {
        this.ILS = ILS;
    }

    public Double getIMP() {
        return IMP;
    }

    public void setIMP(Double IMP) {
        this.IMP = IMP;
    }

    public Double getINR() {
        return INR;
    }

    public void setINR(Double INR) {
        this.INR = INR;
    }

    public Double getIQD() {
        return IQD;
    }

    public void setIQD(Double IQD) {
        this.IQD = IQD;
    }

    public Double getIRR() {
        return IRR;
    }

    public void setIRR(Double IRR) {
        this.IRR = IRR;
    }

    public Double getISK() {
        return ISK;
    }

    public void setISK(Double ISK) {
        this.ISK = ISK;
    }

    public Double getJEP() {
        return JEP;
    }

    public void setJEP(Double JEP) {
        this.JEP = JEP;
    }

    public Double getJMD() {
        return JMD;
    }

    public void setJMD(Double JMD) {
        this.JMD = JMD;
    }

    public Double getJOD() {
        return JOD;
    }

    public void setJOD(Double JOD) {
        this.JOD = JOD;
    }

    public Double getJPY() {
        return JPY;
    }

    public void setJPY(Double JPY) {
        this.JPY = JPY;
    }

    public Double getKES() {
        return KES;
    }

    public void setKES(Double KES) {
        this.KES = KES;
    }

    public Double getKGS() {
        return KGS;
    }

    public void setKGS(Double KGS) {
        this.KGS = KGS;
    }

    public Double getKHR() {
        return KHR;
    }

    public void setKHR(Double KHR) {
        this.KHR = KHR;
    }

    public Double getKMF() {
        return KMF;
    }

    public void setKMF(Double KMF) {
        this.KMF = KMF;
    }

    public Double getKPW() {
        return KPW;
    }

    public void setKPW(Double KPW) {
        this.KPW = KPW;
    }

    public Double getKRW() {
        return KRW;
    }

    public void setKRW(Double KRW) {
        this.KRW = KRW;
    }

    public Double getKWD() {
        return KWD;
    }

    public void setKWD(Double KWD) {
        this.KWD = KWD;
    }

    public Double getKYD() {
        return KYD;
    }

    public void setKYD(Double KYD) {
        this.KYD = KYD;
    }

    public Double getKZT() {
        return KZT;
    }

    public void setKZT(Double KZT) {
        this.KZT = KZT;
    }

    public Double getLAK() {
        return LAK;
    }

    public void setLAK(Double LAK) {
        this.LAK = LAK;
    }

    public Double getLBP() {
        return LBP;
    }

    public void setLBP(Double LBP) {
        this.LBP = LBP;
    }

    public Double getLKR() {
        return LKR;
    }

    public void setLKR(Double LKR) {
        this.LKR = LKR;
    }

    public Double getLRD() {
        return LRD;
    }

    public void setLRD(Double LRD) {
        this.LRD = LRD;
    }

    public Double getLSL() {
        return LSL;
    }

    public void setLSL(Double LSL) {
        this.LSL = LSL;
    }

    public Double getLTL() {
        return LTL;
    }

    public void setLTL(Double LTL) {
        this.LTL = LTL;
    }

    public Double getLVL() {
        return LVL;
    }

    public void setLVL(Double LVL) {
        this.LVL = LVL;
    }

    public Double getLYD() {
        return LYD;
    }

    public void setLYD(Double LYD) {
        this.LYD = LYD;
    }

    public Double getMAD() {
        return MAD;
    }

    public void setMAD(Double MAD) {
        this.MAD = MAD;
    }

    public Double getMDL() {
        return MDL;
    }

    public void setMDL(Double MDL) {
        this.MDL = MDL;
    }

    public Double getMGA() {
        return MGA;
    }

    public void setMGA(Double MGA) {
        this.MGA = MGA;
    }

    public Double getMKD() {
        return MKD;
    }

    public void setMKD(Double MKD) {
        this.MKD = MKD;
    }

    public Double getMMK() {
        return MMK;
    }

    public void setMMK(Double MMK) {
        this.MMK = MMK;
    }

    public Double getMNT() {
        return MNT;
    }

    public void setMNT(Double MNT) {
        this.MNT = MNT;
    }

    public Double getMOP() {
        return MOP;
    }

    public void setMOP(Double MOP) {
        this.MOP = MOP;
    }

    public Double getMRO() {
        return MRO;
    }

    public void setMRO(Double MRO) {
        this.MRO = MRO;
    }

    public Double getMUR() {
        return MUR;
    }

    public void setMUR(Double MUR) {
        this.MUR = MUR;
    }

    public Double getMVR() {
        return MVR;
    }

    public void setMVR(Double MVR) {
        this.MVR = MVR;
    }

    public Double getMWK() {
        return MWK;
    }

    public void setMWK(Double MWK) {
        this.MWK = MWK;
    }

    public Double getMXN() {
        return MXN;
    }

    public void setMXN(Double MXN) {
        this.MXN = MXN;
    }

    public Double getMYR() {
        return MYR;
    }

    public void setMYR(Double MYR) {
        this.MYR = MYR;
    }

    public Double getMZN() {
        return MZN;
    }

    public void setMZN(Double MZN) {
        this.MZN = MZN;
    }

    public Double getNAD() {
        return NAD;
    }

    public void setNAD(Double NAD) {
        this.NAD = NAD;
    }

    public Double getNGN() {
        return NGN;
    }

    public void setNGN(Double NGN) {
        this.NGN = NGN;
    }

    public Double getNIO() {
        return NIO;
    }

    public void setNIO(Double NIO) {
        this.NIO = NIO;
    }

    public Double getNOK() {
        return NOK;
    }

    public void setNOK(Double NOK) {
        this.NOK = NOK;
    }

    public Double getNPR() {
        return NPR;
    }

    public void setNPR(Double NPR) {
        this.NPR = NPR;
    }

    public Double getNZD() {
        return NZD;
    }

    public void setNZD(Double NZD) {
        this.NZD = NZD;
    }

    public Double getOMR() {
        return OMR;
    }

    public void setOMR(Double OMR) {
        this.OMR = OMR;
    }

    public Double getPAB() {
        return PAB;
    }

    public void setPAB(Double PAB) {
        this.PAB = PAB;
    }

    public Double getPEN() {
        return PEN;
    }

    public void setPEN(Double PEN) {
        this.PEN = PEN;
    }

    public Double getPGK() {
        return PGK;
    }

    public void setPGK(Double PGK) {
        this.PGK = PGK;
    }

    public Double getPHP() {
        return PHP;
    }

    public void setPHP(Double PHP) {
        this.PHP = PHP;
    }

    public Double getPKR() {
        return PKR;
    }

    public void setPKR(Double PKR) {
        this.PKR = PKR;
    }

    public Double getPLN() {
        return PLN;
    }

    public void setPLN(Double PLN) {
        this.PLN = PLN;
    }

    public Double getPYG() {
        return PYG;
    }

    public void setPYG(Double PYG) {
        this.PYG = PYG;
    }

    public Double getQAR() {
        return QAR;
    }

    public void setQAR(Double QAR) {
        this.QAR = QAR;
    }

    public Double getRON() {
        return RON;
    }

    public void setRON(Double RON) {
        this.RON = RON;
    }

    public Double getRSD() {
        return RSD;
    }

    public void setRSD(Double RSD) {
        this.RSD = RSD;
    }

    public Double getRUB() {
        return RUB;
    }

    public void setRUB(Double RUB) {
        this.RUB = RUB;
    }

    public Double getRWF() {
        return RWF;
    }

    public void setRWF(Double RWF) {
        this.RWF = RWF;
    }

    public Double getSAR() {
        return SAR;
    }

    public void setSAR(Double SAR) {
        this.SAR = SAR;
    }

    public Double getSBD() {
        return SBD;
    }

    public void setSBD(Double SBD) {
        this.SBD = SBD;
    }

    public Double getSCR() {
        return SCR;
    }

    public void setSCR(Double SCR) {
        this.SCR = SCR;
    }

    public Double getSDG() {
        return SDG;
    }

    public void setSDG(Double SDG) {
        this.SDG = SDG;
    }

    public Double getSEK() {
        return SEK;
    }

    public void setSEK(Double SEK) {
        this.SEK = SEK;
    }

    public Double getSGD() {
        return SGD;
    }

    public void setSGD(Double SGD) {
        this.SGD = SGD;
    }

    public Double getSHP() {
        return SHP;
    }

    public void setSHP(Double SHP) {
        this.SHP = SHP;
    }

    public Double getSLL() {
        return SLL;
    }

    public void setSLL(Double SLL) {
        this.SLL = SLL;
    }

    public Double getSOS() {
        return SOS;
    }

    public void setSOS(Double SOS) {
        this.SOS = SOS;
    }

    public Double getSRD() {
        return SRD;
    }

    public void setSRD(Double SRD) {
        this.SRD = SRD;
    }

    public Double getSTD() {
        return STD;
    }

    public void setSTD(Double STD) {
        this.STD = STD;
    }

    public Double getSVC() {
        return SVC;
    }

    public void setSVC(Double SVC) {
        this.SVC = SVC;
    }

    public Double getSYP() {
        return SYP;
    }

    public void setSYP(Double SYP) {
        this.SYP = SYP;
    }

    public Double getSZL() {
        return SZL;
    }

    public void setSZL(Double SZL) {
        this.SZL = SZL;
    }

    public Double getTHB() {
        return THB;
    }

    public void setTHB(Double THB) {
        this.THB = THB;
    }

    public Double getTJS() {
        return TJS;
    }

    public void setTJS(Double TJS) {
        this.TJS = TJS;
    }

    public Double getTMT() {
        return TMT;
    }

    public void setTMT(Double TMT) {
        this.TMT = TMT;
    }

    public Double getTND() {
        return TND;
    }

    public void setTND(Double TND) {
        this.TND = TND;
    }

    public Double getTOP() {
        return TOP;
    }

    public void setTOP(Double TOP) {
        this.TOP = TOP;
    }

    public Double getTRY() {
        return TRY;
    }

    public void setTRY(Double TRY) {
        this.TRY = TRY;
    }

    public Double getTTD() {
        return TTD;
    }

    public void setTTD(Double TTD) {
        this.TTD = TTD;
    }

    public Double getTWD() {
        return TWD;
    }

    public void setTWD(Double TWD) {
        this.TWD = TWD;
    }

    public Double getTZS() {
        return TZS;
    }

    public void setTZS(Double TZS) {
        this.TZS = TZS;
    }

    public Double getUAH() {
        return UAH;
    }

    public void setUAH(Double UAH) {
        this.UAH = UAH;
    }

    public Double getUGX() {
        return UGX;
    }

    public void setUGX(Double UGX) {
        this.UGX = UGX;
    }

    public Double getUSD() {
        return USD;
    }

    public void setUSD(Double USD) {
        this.USD = USD;
    }

    public Double getUYU() {
        return UYU;
    }

    public void setUYU(Double UYU) {
        this.UYU = UYU;
    }

    public Double getUZS() {
        return UZS;
    }

    public void setUZS(Double UZS) {
        this.UZS = UZS;
    }

    public Double getVEF() {
        return VEF;
    }

    public void setVEF(Double VEF) {
        this.VEF = VEF;
    }

    public Double getVND() {
        return VND;
    }

    public void setVND(Double VND) {
        this.VND = VND;
    }

    public Double getVUV() {
        return VUV;
    }

    public void setVUV(Double VUV) {
        this.VUV = VUV;
    }

    public Double getWST() {
        return WST;
    }

    public void setWST(Double WST) {
        this.WST = WST;
    }

    public Double getXAF() {
        return XAF;
    }

    public void setXAF(Double XAF) {
        this.XAF = XAF;
    }

    public Double getXAG() {
        return XAG;
    }

    public void setXAG(Double XAG) {
        this.XAG = XAG;
    }

    public Double getXAU() {
        return XAU;
    }

    public void setXAU(Double XAU) {
        this.XAU = XAU;
    }

    public Double getXCD() {
        return XCD;
    }

    public void setXCD(Double XCD) {
        this.XCD = XCD;
    }

    public Double getXDR() {
        return XDR;
    }

    public void setXDR(Double XDR) {
        this.XDR = XDR;
    }

    public Double getXOF() {
        return XOF;
    }

    public void setXOF(Double XOF) {
        this.XOF = XOF;
    }

    public Double getXPF() {
        return XPF;
    }

    public void setXPF(Double XPF) {
        this.XPF = XPF;
    }

    public Double getYER() {
        return YER;
    }

    public void setYER(Double YER) {
        this.YER = YER;
    }

    public Double getZAR() {
        return ZAR;
    }

    public void setZAR(Double ZAR) {
        this.ZAR = ZAR;
    }

    public Double getZMK() {
        return ZMK;
    }

    public void setZMK(Double ZMK) {
        this.ZMK = ZMK;
    }

    public Double getZMW() {
        return ZMW;
    }

    public void setZMW(Double ZMW) {
        this.ZMW = ZMW;
    }

    public Double getZWL() {
        return ZWL;
    }

    public void setZWL(Double ZWL) {
        this.ZWL = ZWL;
    }

    public double getCurrencyByName(String currency) {

        return 0.0;
    }

    public boolean checkCurrency(String currency) {
        Field[] fields = getClass().getFields();
        for (Field field : fields) {
            if (field.getName().equals(currency))
                return true;
        }
        return false;
    }
}
