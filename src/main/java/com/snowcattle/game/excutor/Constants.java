package com.snowcattle.game.excutor;

import com.snowcattle.game.excutor.event.EventType;
import com.snowcattle.game.excutor.event.EventTypeEnum;

/**
 * Created by jiangwenping on 17/1/9.
 */
public class Constants {

    /**
     * ⌚事件类型常量
     */
    public static class EventTypeConstans{
        public static EventType createEventType = new EventType(EventTypeEnum.CREATE.ordinal());
        public static EventType updateEventType = new EventType(EventTypeEnum.UPDATE.ordinal());
        public static EventType finishEventType = new EventType(EventTypeEnum.FINISH.ordinal());
    }
}
