package androidx.core.os;

import c.h.j.e;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(e.c(str, "The operation has been canceled."));
    }
}
