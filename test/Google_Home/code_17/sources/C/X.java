package C;

import android.content.Context;
import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class X implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f1124a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f1125b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f1126c;

    public X(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f1124a = aVar;
        this.f1125b = aVar2;
        this.f1126c = aVar3;
    }

    public static X a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i8) {
        return new W(context, str, i8);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f1124a.get(), (String) this.f1125b.get(), ((Integer) this.f1126c.get()).intValue());
    }
}
