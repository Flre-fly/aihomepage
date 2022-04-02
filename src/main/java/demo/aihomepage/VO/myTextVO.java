package demo.aihomepage.VO;

import lombok.Data;

@Data
public class myTextVO {
    private String text;

    public myTextVO(){

    }

    public myTextVO(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
