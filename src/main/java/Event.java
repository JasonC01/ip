public class Event extends Task{
    private String eventTime;
    public Event(String taskContent) {
        super(taskContent.split(" /at ")[0], "E");
        this.eventTime = taskContent.split(" /at ")[1];
    }
    public Event(String taskContent, String eventTime) {
        super(taskContent, "E");
        this.eventTime = eventTime;
    }
    @Override
    public String getTiming() {
        return this.eventTime;
    }
    @Override
    public String toString() {
        if(super.isCompleted()) {
            return "[E][X] " + super.getTaskContent() + " " + "(at: " + this.eventTime + ")";
        }else {
            return "[E][ ] " + super.getTaskContent() + " " + this.eventTime;
        }
    }
}
