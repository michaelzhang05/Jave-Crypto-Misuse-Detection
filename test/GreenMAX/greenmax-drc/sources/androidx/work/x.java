package androidx.work;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public enum x {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean d() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
