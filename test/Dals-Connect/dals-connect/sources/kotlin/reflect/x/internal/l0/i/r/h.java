package kotlin.reflect.x.internal.l0.i.r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.b.i;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<g0, e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f20869f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0 e0Var) {
            super(1);
            this.f20869f = e0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(g0 g0Var) {
            l.f(g0Var, "it");
            return this.f20869f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<g0, e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f20870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(1);
            this.f20870f = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(g0 g0Var) {
            l.f(g0Var, "module");
            m0 O = g0Var.o().O(this.f20870f);
            l.e(O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return O;
        }
    }

    private h() {
    }

    private final kotlin.reflect.x.internal.l0.i.r.b a(List<?> list, i iVar) {
        List y0;
        y0 = b0.y0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            g<?> c2 = c(it.next());
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new kotlin.reflect.x.internal.l0.i.r.b(arrayList, new b(iVar));
    }

    public final kotlin.reflect.x.internal.l0.i.r.b b(List<? extends g<?>> list, e0 e0Var) {
        l.f(list, "value");
        l.f(e0Var, "type");
        return new kotlin.reflect.x.internal.l0.i.r.b(list, new a(e0Var));
    }

    public final g<?> c(Object obj) {
        List<Boolean> Z;
        List<Double> T;
        List<Float> U;
        List<Character> S;
        List<Long> W;
        List<Integer> V;
        List<Short> Y;
        List<Byte> R;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof byte[]) {
            R = n.R((byte[]) obj);
            return a(R, i.BYTE);
        }
        if (obj instanceof short[]) {
            Y = n.Y((short[]) obj);
            return a(Y, i.SHORT);
        }
        if (obj instanceof int[]) {
            V = n.V((int[]) obj);
            return a(V, i.INT);
        }
        if (obj instanceof long[]) {
            W = n.W((long[]) obj);
            return a(W, i.LONG);
        }
        if (obj instanceof char[]) {
            S = n.S((char[]) obj);
            return a(S, i.CHAR);
        }
        if (obj instanceof float[]) {
            U = n.U((float[]) obj);
            return a(U, i.FLOAT);
        }
        if (obj instanceof double[]) {
            T = n.T((double[]) obj);
            return a(T, i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            Z = n.Z((boolean[]) obj);
            return a(Z, i.BOOLEAN);
        }
        if (obj == null) {
            return new s();
        }
        return null;
    }
}
