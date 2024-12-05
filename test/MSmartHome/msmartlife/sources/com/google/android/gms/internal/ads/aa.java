package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aa implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11066f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11067g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f11068h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f11069i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f11070j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ int f11071k;
    private final /* synthetic */ int l;
    private final /* synthetic */ zzbft m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(zzbft zzbftVar, String str, String str2, int i2, int i3, boolean z, int i4, int i5) {
        this.m = zzbftVar;
        this.f11066f = str;
        this.f11067g = str2;
        this.f11068h = i2;
        this.f11070j = z;
        this.f11071k = i4;
        this.l = i5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.ads.zzbft.f(com.google.android.gms.internal.ads.zzbft, java.lang.String, java.util.Map):void
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheProgress"
            r0.put(r1, r2)
            java.lang.String r1 = r3.f11066f
            java.lang.String r2 = "src"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f11067g
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
            int r1 = r3.f11068h
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "bytesLoaded"
            r0.put(r2, r1)
            int r1 = r3.f11069i
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "totalBytes"
            r0.put(r2, r1)
            boolean r1 = r3.f11070j
            if (r1 == 0) goto L37
            java.lang.String r1 = "1"
            goto L39
        L37:
            java.lang.String r1 = "0"
        L39:
            java.lang.String r2 = "cacheReady"
            r0.put(r2, r1)
            int r1 = r3.f11071k
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerCount"
            r0.put(r2, r1)
            int r1 = r3.l
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerPreparedCount"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbft r1 = r3.m
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzbft.f(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa.run():void");
    }
}
