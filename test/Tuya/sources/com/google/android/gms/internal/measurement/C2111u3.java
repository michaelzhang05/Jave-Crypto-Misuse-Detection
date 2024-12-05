package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2111u3 extends AbstractC2064o3 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2135x3 f15913c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2111u3(AbstractC2135x3 abstractC2135x3, int i8) {
        super(abstractC2135x3.size(), i8);
        this.f15913c = abstractC2135x3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2064o3
    protected final Object b(int i8) {
        return this.f15913c.get(i8);
    }
}
