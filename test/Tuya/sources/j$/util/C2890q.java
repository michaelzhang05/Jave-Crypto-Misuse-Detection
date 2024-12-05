package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2890q implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f32252a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32252a.accept(new r((Map.Entry) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
