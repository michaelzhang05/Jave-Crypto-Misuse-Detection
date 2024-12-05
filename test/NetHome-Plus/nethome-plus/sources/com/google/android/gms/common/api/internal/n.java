package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
final class n extends w {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zaak f10641b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.signin.internal.zaj f10642c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, zabd zabdVar, zaak zaakVar, com.google.android.gms.signin.internal.zaj zajVar) {
        super(zabdVar);
        this.f10641b = zaakVar;
        this.f10642c = zajVar;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void a() {
        this.f10641b.g(this.f10642c);
    }
}
