/*
 * The MtGox-Java API is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The MtGox-Java API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with the MtGox-Java API .  If not, see <http://www.gnu.org/licenses/>.
 */
package to.sparks.mtgox;

import java.util.List;
import to.sparks.mtgox.model.Depth;
import to.sparks.mtgox.model.Ticker;
import to.sparks.mtgox.model.Trade;

/**
 *
 * @author SparksG
 */
public interface WebSocketClient {

    List<Depth> getAllDepthSince(long timestamp);

    List<Trade> getAllTradesSince(long timestamp);

    List<Depth> getDepthHistory();

    List<Ticker> getTickerHistory();

    List<Trade> getTradeHistory();
    
}
