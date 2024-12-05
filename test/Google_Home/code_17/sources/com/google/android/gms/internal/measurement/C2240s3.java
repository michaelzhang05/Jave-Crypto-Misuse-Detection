package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2240s3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2223q3 f16817a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2240s3(C2223q3 c2223q3, Handler handler) {
        super(null);
        this.f16817a = c2223q3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f16817a.f16771a;
        atomicBoolean.set(true);
    }
}
