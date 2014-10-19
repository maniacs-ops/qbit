package io.advantageous.qbit.queue;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Richard on 9/8/14.
 * @author rhightower
 */
public interface ReceiveQueueManager <T> {

    void manageQueue(ReceiveQueue<T> queue, ReceiveQueueListener<T> listener, int batchSize, AtomicBoolean stop);
}
