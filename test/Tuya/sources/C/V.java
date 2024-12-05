package C;

import android.content.Context;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class V implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1113a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1114b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f1115c;

    public V(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f1113a = aVar;
        this.f1114b = aVar2;
        this.f1115c = aVar3;
    }

    public static V a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new V(aVar, aVar2, aVar3);
    }

    public static U c(Context context, String str, int i8) {
        return new U(context, str, i8);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f1113a.get(), (String) this.f1114b.get(), ((Integer) this.f1115c.get()).intValue());
    }
}
