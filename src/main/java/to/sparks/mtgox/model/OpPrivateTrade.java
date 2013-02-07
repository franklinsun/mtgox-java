package to.sparks.mtgox.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author SparksG
 */
@JsonAutoDetect
public class OpPrivateTrade extends OpPrivate<Trade> {

    private Trade trade;

    public OpPrivateTrade(@JsonProperty("op") String op,
            @JsonProperty("channel") String channel,
            @JsonProperty("private") String messageType,
            @JsonProperty("trade") Trade trade,
            @JsonProperty("origin") String origin) {
        super(op, channel, messageType, origin);
        this.trade = trade;
    }

    public Trade getTrade() {
        return trade;
    }
}
