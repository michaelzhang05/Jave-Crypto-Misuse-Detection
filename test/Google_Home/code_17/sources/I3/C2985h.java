package i3;

import android.content.Context;
import h3.m;
import kotlin.jvm.functions.Function0;
import u2.InterfaceC4057d;

/* renamed from: i3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2985h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f32938a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f32939b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f32940c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f32941d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f32942e;

    public C2985h(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f32938a = aVar;
        this.f32939b = aVar2;
        this.f32940c = aVar3;
        this.f32941d = aVar4;
        this.f32942e = aVar5;
    }

    public static C2985h a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new C2985h(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C2984g c(Context context, Function0 function0, m mVar, InterfaceC4057d interfaceC4057d, S5.g gVar) {
        return new C2984g(context, function0, mVar, interfaceC4057d, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2984g get() {
        return c((Context) this.f32938a.get(), (Function0) this.f32939b.get(), (m) this.f32940c.get(), (InterfaceC4057d) this.f32941d.get(), (S5.g) this.f32942e.get());
    }
}
