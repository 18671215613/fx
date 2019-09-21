package cn.aptech.global;

import cn.aptech.pojo.TModule;
import cn.aptech.service.TModuleService;
import org.springframework.context.ApplicationEvent;

import java.util.List;


public class MyEvent extends ApplicationEvent {
    private List<TModule> tModuleList;

    public List<TModule> gettModuleList() {
        return tModuleList;
    }

    public void settModuleList(List<TModule> tModuleList) {
        this.tModuleList = tModuleList;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source, List<TModule> tModuleList) {
        super(source);
        this.tModuleList = tModuleList;
    }
}
