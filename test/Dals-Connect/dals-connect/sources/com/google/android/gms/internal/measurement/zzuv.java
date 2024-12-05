package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzuv extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private zzvv f16141f;

    public zzuv(String str) {
        super(str);
        this.f16141f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzuv a() {
        return new zzuv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzuv b() {
        return new zzuv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzuw c() {
        return new zzuw("Protocol message tag had invalid wire type.");
    }
}
