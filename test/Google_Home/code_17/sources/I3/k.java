package i3;

import android.content.Context;
import h3.m;
import kotlin.jvm.functions.Function0;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class k implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f32953a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f32954b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f32955c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f32956d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f32957e;

    public k(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f32953a = aVar;
        this.f32954b = aVar2;
        this.f32955c = aVar3;
        this.f32956d = aVar4;
        this.f32957e = aVar5;
    }

    public static k a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static j c(Context context, Function0 function0, m mVar, InterfaceC4057d interfaceC4057d, S5.g gVar) {
        return new j(context, function0, mVar, interfaceC4057d, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((Context) this.f32953a.get(), (Function0) this.f32954b.get(), (m) this.f32955c.get(), (InterfaceC4057d) this.f32956d.get(), (S5.g) this.f32957e.get());
    }
}
