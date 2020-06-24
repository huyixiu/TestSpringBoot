package com.test.spring.boot.logger.server.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

/**
 * @ClassName:LogbackColorConfig
 * @Description 日志颜色配置
 * @Author: hyx
 * @Date: 2019-04-12 18:10
 * @Version 1.0
 */
public class LogbackColorConfig extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        Level level = event.getLevel();
        switch (level.toInt()) {
            //ERROR等级为红色
            case Level.ERROR_INT:
                return ANSIConstants.RED_FG;
            //WARN等级为黄色
            case Level.WARN_INT:
                return ANSIConstants.YELLOW_FG;
            //INFO等级为蓝色
            case Level.INFO_INT:
                return ANSIConstants.GREEN_FG;
            //DEBUG等级为绿色
            case Level.DEBUG_INT:
                return ANSIConstants.BLUE_FG;
            //其他为默认颜色
            default:
                return ANSIConstants.DEFAULT_FG;
        }
    }
}
