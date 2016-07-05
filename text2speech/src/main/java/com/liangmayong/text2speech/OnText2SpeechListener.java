package com.liangmayong.text2speech;

/**
 * OnText2SpeechListener
 *
 * @author LiangMaYong
 * @version 1.0
 */
public interface OnText2SpeechListener {

    /**
     * play Completion
     */
    public void onCompletion();

    /**
     * play Prepared
     */
    public void onPrepared();

    /**
     * play Error
     *
     * @param e    e
     * @param info info
     */
    public void onError(Exception e, String info);

    /**
     * play Start
     */
    public void onStart();

    /**
     * play Stop
     */
    public void onStop();

    /**
     * play onLoadProgress
     *
     * @param progressLenght progressLenght
     * @param lenght         lenght
     */
    public void onLoadProgress(int progressLenght, int lenght);

    /**
     * play onPlayProgress
     *
     * @param currentPosition currentPosition
     * @param duration        duration
     */
    public void onPlayProgress(int currentPosition, int duration);
}
