package com.xiaojkql;


import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * @author qinyuan
 * @date 2019-11-04-下午3:54
 */
public class FixedDepositDao {
    private static Logger logger = Logger.getLogger(FixedDepositDao.class);

    private HashMap<Long,FixedDepositDetails> fdds = new HashMap<>();

    public FixedDepositDao(){
        logger.info("initializing");
    }

    public boolean createFixedDetails(FixedDepositDetails fdd){
        fdds.put(fdd.getId(),fdd);
        return true;
    }

    public FixedDepositDetails getById(Long id){
        return fdds.get(id);
    }

}
