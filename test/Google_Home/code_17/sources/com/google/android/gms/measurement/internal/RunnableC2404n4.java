package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2404n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17735a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f17736b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17737c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17738d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2390l4 f17739e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2404n4(C2390l4 c2390l4, boolean z8, Uri uri, String str, String str2) {
        this.f17735a = z8;
        this.f17736b = uri;
        this.f17737c = str;
        this.f17738d = str2;
        this.f17739e = c2390l4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2390l4.a(this.f17739e, this.f17735a, this.f17736b, this.f17737c, this.f17738d);
    }
}
