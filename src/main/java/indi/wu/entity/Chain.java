package indi.wu.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuzichao on 2018/3/14.
 */
public class Chain implements Serializable {

    private List<Block> chain;


    public Chain() {}

    public Chain(List<Block> chain) {
        this.chain = chain;
    }


    @Override
    public String toString() {
        return "Chain{" +
                "chain=" + chain +
                '}';
    }


    public List<Block> getChain() {
        return chain;
    }

    public void setChain(List<Block> chain) {
        this.chain = chain;
    }
}
