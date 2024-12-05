package v;

import android.content.Context;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4080i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40090a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f40091b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f40092c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4080i(Context context, E.a aVar, E.a aVar2) {
        this.f40090a = context;
        this.f40091b = aVar;
        this.f40092c = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4079h a(String str) {
        return AbstractC4079h.a(this.f40090a, this.f40091b, this.f40092c, str);
    }
}
