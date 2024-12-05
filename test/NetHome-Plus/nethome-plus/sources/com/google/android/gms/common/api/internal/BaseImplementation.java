package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

@KeepForSdk
/* loaded from: classes2.dex */
public class BaseImplementation {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        @KeepForSdk
        private final Api.AnyClientKey<A> q;

        @KeepForSdk
        private final Api<?> r;

        /* JADX INFO: Access modifiers changed from: protected */
        @KeepForSdk
        public ApiMethodImpl(Api<?> api, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.k(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.k(api, "Api must not be null");
            this.q = (Api.AnyClientKey<A>) api.a();
            this.r = api;
        }

        @KeepForSdk
        private void x(RemoteException remoteException) {
            y(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void a(Object obj) {
            super.k((Result) obj);
        }

        @KeepForSdk
        protected abstract void s(A a) throws RemoteException;

        @KeepForSdk
        public final Api<?> t() {
            return this.r;
        }

        @KeepForSdk
        public final Api.AnyClientKey<A> u() {
            return this.q;
        }

        @KeepForSdk
        protected void v(R r) {
        }

        @KeepForSdk
        public final void w(A a) throws DeadObjectException {
            if (a instanceof SimpleClientAdapter) {
                a = ((SimpleClientAdapter) a).k();
            }
            try {
                s(a);
            } catch (DeadObjectException e2) {
                x(e2);
                throw e2;
            } catch (RemoteException e3) {
                x(e3);
            }
        }

        @KeepForSdk
        public final void y(Status status) {
            Preconditions.b(!status.J(), "Failed result must not be success");
            R h2 = h(status);
            k(h2);
            v(h2);
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void a(R r);
    }
}
