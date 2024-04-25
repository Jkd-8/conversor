package Carpeta.Principales;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conversor implements Comparable <Conversor>{
    String result;
    String documentation;
    String termsOfUse;
    Long timeLastUpdateUnix;
    Date timeLastUpdateUtc;
    Long timeNextUpdateUnix;
    Date timeNextUpdateUtc;

    String baseCode;
    @SerializedName("conversion_rates")
    JsonObject conversionRates;

    public Conversor(String result, String documentation, String termsOfUse, Long timeLastUpdateUnix, Date timeLastUpdateUtc, Long timeNextUpdateUnix, Date timeNextUpdateUtc, String baseCode) {
        this.result = result;
        this.documentation = documentation;
        this.termsOfUse = termsOfUse;
        this.timeLastUpdateUnix = timeLastUpdateUnix;
        this.timeLastUpdateUtc = timeLastUpdateUtc;
        this.timeNextUpdateUnix = timeNextUpdateUnix;
        this.timeNextUpdateUtc = timeNextUpdateUtc;
        this.baseCode = baseCode;

    }



    public Conversor(ConversorRate conversor){
        this.conversionRates = conversor.conversion_rates();

    }



    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public Long getTimeLastUpdateUnix() {
        return timeLastUpdateUnix;
    }

    public void setTimeLastUpdateUnix(Long timeLastUpdateUnix) {
        this.timeLastUpdateUnix = timeLastUpdateUnix;
    }

    public Date getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(Date timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    public Long getTimeNextUpdateUnix() {
        return timeNextUpdateUnix;
    }

    public void setTimeNextUpdateUnix(Long timeNextUpdateUnix) {
        this.timeNextUpdateUnix = timeNextUpdateUnix;
    }

    public Date getTimeNextUpdateUtc() {
        return timeNextUpdateUtc;
    }

    public void setTimeNextUpdateUtc(Date timeNextUpdateUtc) {
        this.timeNextUpdateUtc = timeNextUpdateUtc;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }




    @Override
    public int compareTo(Conversor conversor){
        return this.getBaseCode().compareTo(conversor.getBaseCode());
    }

    @Override
    public String toString() {
        return "Conversor{" +
                "baseCode='" + baseCode + '\'' +
                ", conversionRates='" + conversionRates + '\'' +
                '}';
    }
}
