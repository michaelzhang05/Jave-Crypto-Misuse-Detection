package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w5 implements zzz {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ y5 f12319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5(zzayu zzayuVar, String str, y5 y5Var) {
        this.a = str;
        this.f12319b = y5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzz
    public final void a(zzaf zzafVar) {
        String str = this.a;
        String exc = zzafVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        zzbad.i(sb.toString());
        this.f12319b.a(null);
    }
}
