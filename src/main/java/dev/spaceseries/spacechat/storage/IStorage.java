package dev.spaceseries.spacechat.storage;

import dev.spaceseries.spacechat.logging.wrap.LogWrapper;

public interface IStorage {

    /**
     * Logs to the storage medium
     *
     * @param data The data to log
     */
    void log(LogWrapper data);
}
