package indi.wu.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuzichao on 2018/3/14.
 */
public class Block implements Serializable {

    private Integer height;
    private String hash;
    private String preHash;
    private Long timeStamps;
    private List<Transaction> transactions;

    public Block() {}

    public Block(Integer height, String hash, String preHash, Long timeStamps, List<Transaction> transactions) {
        this.height = height;
        this.hash = hash;
        this.preHash = preHash;
        this.timeStamps = timeStamps;
        this.transactions = transactions;
    }


    public Block initGenesisBlock(Long timeStamps) {
        Block genesis = new Block();
        genesis.setHeight(0);
        genesis.setHash("0");
        setTimeStamps(timeStamps);
        return genesis;
    }


    @Override
    public String toString() {
        return "Block{" +
                "height=" + height +
                ", hash='" + hash + '\'' +
                ", preHash='" + preHash + '\'' +
                ", timeStamps=" + timeStamps +
                ", transactions=" + transactions +
                '}';
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public Long getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(Long timeStamps) {
        this.timeStamps = timeStamps;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
