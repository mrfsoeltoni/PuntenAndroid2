package id.punten.common.executor;

import io.reactivex.Scheduler;

/**
 * Created by fathan on 04/02/17.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}