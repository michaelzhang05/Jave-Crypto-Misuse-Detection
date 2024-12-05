package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzsx;
import com.google.android.gms.internal.measurement.zzsy;

/* loaded from: classes2.dex */
public abstract class zzsy<MessageType extends zzsx<MessageType, BuilderType>, BuilderType extends zzsy<MessageType, BuilderType>> implements zzvw {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzvw
    public final /* synthetic */ zzvw L(zzvv zzvvVar) {
        if (e().getClass().isInstance(zzvvVar)) {
            return g((zzsx) zzvvVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType g(MessageType messagetype);

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
