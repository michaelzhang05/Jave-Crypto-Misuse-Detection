package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public final class PendingResults {

    /* loaded from: classes2.dex */
    private static final class a<R extends Result> extends BasePendingResult<R> {
        private final R q;

        public a(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.q = r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R h(Status status) {
            return this.q;
        }
    }

    @KeepForSdk
    private PendingResults() {
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> a(R r, GoogleApiClient googleApiClient) {
        Preconditions.k(r, "Result must not be null");
        Preconditions.b(!r.getStatus().J(), "Status code must not be SUCCESS");
        a aVar = new a(googleApiClient, r);
        aVar.k(r);
        return aVar;
    }

    @KeepForSdk
    public static PendingResult<Status> b(Status status, GoogleApiClient googleApiClient) {
        Preconditions.k(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.k(status);
        return statusPendingResult;
    }
}
