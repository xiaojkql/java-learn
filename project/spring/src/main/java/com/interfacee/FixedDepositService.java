package com.xiaojkql;

import org.apache.log4j.Logger;

/**
 * @author qinyuan
 * @date 2019-11-04-下午3:53
 */
public class FixedDepositService {
    private static Logger logger = Logger.getLogger(FixedDepositService.class);
    private FixedDepositDao fixedDepositDao;

    public FixedDepositService(){
        logger.info("initializing");
    }

    public void setFixedDepositDao(FixedDepositDao fixedDepositDao){
        logger.info("Setting fixedDepositDao property");
        this.fixedDepositDao = fixedDepositDao;
    }

    public boolean createDepositDetails(FixedDepositDetails fdd){
        return fixedDepositDao.createFixedDetails(fdd);
    }

    public FixedDepositDetails getById(Long id){
        return fixedDepositDao.getById(id);
    }

}
