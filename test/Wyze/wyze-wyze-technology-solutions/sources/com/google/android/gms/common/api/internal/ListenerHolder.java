package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ListenerHolder<L> {
    private volatile L a;

    /* renamed from: b, reason: collision with root package name */
    private final ListenerKey<L> f10604b;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ListenerKey<L> {
        private final L a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10605b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.a == listenerKey.a && this.f10605b.equals(listenerKey.f10605b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.f10605b.hashCode();
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Notifier<L> {
    }

    @KeepForSdk
    public final void a() {
        this.a = null;
    }

    @KeepForSdk
    public final ListenerKey<L> b() {
        return this.f10604b;
    }

    @KeepForSdk
    public final void c(Notifier<? super L> notifier) {
        Preconditions.k(notifier, "Notifier must not be null");
        throw null;
    }
}
