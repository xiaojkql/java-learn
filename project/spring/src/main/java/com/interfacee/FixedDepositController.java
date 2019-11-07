package com.xiaojkql;

import org.apache.log4j.Logger;

/**
 * @author qinyuan
 * @date 2019-11-04-下午3:53
 */
public class FixedDepositController {
    private static Logger logger = Logger.getLogger(FixedDepositController.class);

    private FixedDepositService fixedDepositService;

    public FixedDepositController(){
        logger.info("Initializing");
    }

    public void setFixedDepositService(FixedDepositService fixedDepositService) {
        logger.info("setFixedDepositService");
        this.fixedDepositService = fixedDepositService;
    }

    public void submit(){
        fixedDepositService.createDepositDetails(new FixedDepositDetails(1l,"xiaojkql","xiaojkql@163.com"));
    }

    public FixedDepositDetails getById(Long id){
        return fixedDepositService.getById(id);
    }
}
