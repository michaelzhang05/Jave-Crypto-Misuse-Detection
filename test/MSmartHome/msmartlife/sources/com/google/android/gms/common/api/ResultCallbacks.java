package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void a(R r) {
        Status status = r.getStatus();
        if (status.J()) {
            c(r);
            return;
        }
        b(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(r);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("ResultCallbacks", sb.toString(), e2);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r);
}
