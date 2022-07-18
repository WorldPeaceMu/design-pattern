package com.example.designpattern.structure.adapter.objectadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:12
 * @Description:
 */
public class SdCardAdapterTfCard extends SdCardImpl {

    private TfCard tfCard;

    public SdCardAdapterTfCard(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        System.out.println("适配器read方法");
        return tfCard.readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("适配器write方法");
        tfCard.writeTf(msg);
    }
}
