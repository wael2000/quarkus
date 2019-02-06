package org.jboss.shamrock.transactions.runtime;

import org.jboss.shamrock.runtime.annotations.ConfigItem;
import org.jboss.shamrock.runtime.annotations.ConfigPhase;
import org.jboss.shamrock.runtime.annotations.ConfigRoot;

/**
 *
 */
@ConfigRoot(phase = ConfigPhase.RUN_TIME_STATIC)
public final class TransactionConfiguration {
    /**
     * The node name used by the transaction manager
     */
    @ConfigItem(defaultValue = "shamrock")
    public String nodeName;
}
