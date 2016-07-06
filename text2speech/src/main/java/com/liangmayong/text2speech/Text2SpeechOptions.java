package com.liangmayong.text2speech;

/**
 * Text2SpeechOptions
 *
 * @author LiangMaYong
 * @version 1.0
 */
public class Text2SpeechOptions {

    //zh
    public static final String LANGUAGE_ZH = "zh";
    //en
    public static final String LANGUAGE_EN = "en";
    //lang
    private String lang = "";
    //text
    private String text;
    //afterDelete
    private boolean afterDelete = false;
    //spd,readtime,outtime,chunkLength
    private int spd = -1, readtime = 5000, outtime = 5000, chunkLength = -1;

    //is_return_temp
    private boolean is_return_temp = true;

    /**
     * isReturnTemp
     *
     * @return is_return_temp
     */
    public boolean isReturnTemp() {
        return is_return_temp;
    }

    /**
     * setReturnTemp
     *
     * @param is_return_temp is_return_temp
     */
    public void setReturnTemp(boolean is_return_temp) {
        this.is_return_temp = is_return_temp;
    }


    /**
     * setAfterDelete
     *
     * @param afterDelete afterDelete
     */
    public void setAfterDelete(boolean afterDelete) {
        this.afterDelete = afterDelete;
    }

    /**
     * isAfterDelete
     *
     * @return afterDelete
     */
    public boolean isAfterDelete() {
        return afterDelete;
    }

    /**
     * getText
     *
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * setText
     *
     * @param text text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * getSpd
     *
     * @return spd
     */
    public int getSpd() {
        return spd;
    }

    /**
     * setSpd
     *
     * @param spd spd
     */
    public void setSpd(int spd) {
        this.spd = spd;
    }

    /**
     * getReadtime
     *
     * @return readtime
     */
    public int getReadtime() {
        return readtime;
    }

    /**
     * setReadtime
     *
     * @param readtime readtime
     */
    public void setReadtime(int readtime) {
        this.readtime = readtime;
    }

    /**
     * getOuttime
     *
     * @return outtime
     */
    public int getOuttime() {
        return outtime;
    }

    /**
     * setOuttime
     *
     * @param outtime outtime
     */
    public void setOuttime(int outtime) {
        this.outtime = outtime;
    }

    /**
     * getChunkLength
     *
     * @return chunkLength
     */
    public int getChunkLength() {
        return chunkLength;
    }

    /**
     * setChunkLength
     *
     * @param chunkLength chunkLength
     */
    public void setChunkLength(int chunkLength) {
        this.chunkLength = chunkLength;
    }

    /**
     * getLang
     *
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * setLang
     *
     * @param lang lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }
}
