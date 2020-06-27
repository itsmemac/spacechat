package com.yakovliam.spacechat.model;

import com.yakovliam.spacechat.model.action.ClickAction;
import com.yakovliam.spacechat.model.action.HoverAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Extra {

    /**
     * The click action
     */
    @Getter
    @Setter
    private ClickAction clickAction;

    /**
     * The hover action
     */
    @Getter
    @Setter
    private HoverAction hoverAction;
}
