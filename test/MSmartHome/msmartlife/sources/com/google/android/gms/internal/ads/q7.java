package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f12049f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12050g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12051h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7(zzbcd zzbcdVar, String str, String str2) {
        this.f12051h = zzbcdVar;
        this.f12049f = str;
        this.f12050g = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.ads.zzbcd.p(com.google.android.gms.internal.ads.zzbcd):com.google.android.gms.internal.ads.zzbcn
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcd r0 = r3.f12051h
            com.google.android.gms.internal.ads.zzbcn r0 = com.google.android.gms.internal.ads.zzbcd.p(r0)
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzbcd r0 = r3.f12051h
            com.google.android.gms.internal.ads.zzbcn r0 = com.google.android.gms.internal.ads.zzbcd.p(r0)
            java.lang.String r1 = r3.f12049f
            java.lang.String r2 = r3.f12050g
            r0.h(r1, r2)
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q7.run():void");
    }
}
