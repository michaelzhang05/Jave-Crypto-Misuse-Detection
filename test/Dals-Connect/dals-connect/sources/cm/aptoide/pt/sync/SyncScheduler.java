package cm.aptoide.pt.sync;

/* loaded from: classes.dex */
public interface SyncScheduler {
    void cancel(String str);

    void reschedule(Sync sync);

    void schedule(Sync sync);
}
