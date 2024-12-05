package kotlin.reflect.x.internal.l0.j.b;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.i.r.b;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: DeserializedArrayValue.kt */
/* loaded from: classes2.dex */
public final class n extends b {

    /* renamed from: c, reason: collision with root package name */
    private final e0 f21109c;

    /* compiled from: DeserializedArrayValue.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<g0, e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f21110f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0 e0Var) {
            super(1);
            this.f21110f = e0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(g0 g0Var) {
            l.f(g0Var, "it");
            return this.f21110f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List<? extends g<?>> list, e0 e0Var) {
        super(list, new a(e0Var));
        l.f(list, "value");
        l.f(e0Var, "type");
        this.f21109c = e0Var;
    }

    public final e0 c() {
        return this.f21109c;
    }
}
